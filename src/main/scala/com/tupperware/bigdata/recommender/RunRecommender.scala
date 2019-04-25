package com.tupperware.bigdata.recommender

import com.tupperware.bigdata.config.IDEAConfig

import scala.collection.Map
import scala.collection.mutable.ArrayBuffer
import scala.util.Random
import org.apache.spark.broadcast.Broadcast
import org.apache.spark.ml.recommendation.{ALS, ALSModel}
import org.apache.spark.sql.{DataFrame, Dataset, SparkSession}
import org.apache.spark.sql.functions._

object RunRecommender extends IDEAConfig {

  def main(args: Array[String]): Unit = {
    loadProperties()
    val spark = SparkSession.builder()
      .appName(this.getClass.getSimpleName.toString)
      .config("spark.jars", prop.get("spark.jars").toString)
      .config("spark.sql.warehouse.dir", prop.get("spark.sql.warehouse.dir").toString)
      .getOrCreate()
    // Optional, but may help avoid errors due to long lineage
    spark.sparkContext.setCheckpointDir("hdfs:///tmp/")

    val base = "/apps/data/c3/"
    val rawUserArtistData = spark.read.textFile(base + "user_artist_data.txt")
    val rawArtistData = spark.read.textFile(base + "artist_data.txt")
    val rawArtistAlias = spark.read.textFile(base + "artist_alias.txt")

    val runRecommender = new RunRecommender(spark)
    runRecommender.preparation(rawUserArtistData, rawArtistData, rawArtistAlias)
    runRecommender.model(rawUserArtistData, rawArtistData, rawArtistAlias)
    runRecommender.evaluate(rawUserArtistData, rawArtistAlias)
    runRecommender.recommend(rawUserArtistData, rawArtistData, rawArtistAlias)

    spark.stop()
  }

}

class RunRecommender(private val spark: SparkSession) {

  import spark.implicits._

  def preparation(
                   rawUserArtistData: Dataset[String],
                   rawArtistData: Dataset[String],
                   rawArtistAlias: Dataset[String]): Unit = {

    rawUserArtistData.take(5).foreach(println)

    val userArtistDF = rawUserArtistData.map { line =>
      val Array(user, artist, _*) = line.split(' ')
      (user.toInt, artist.toInt)
    }.toDF("user", "artist")

    println(Integer.MAX_VALUE)
    userArtistDF.agg(min("user"), max("user"), min("artist"), max("artist")).show()


    val artistByID = buildArtistByID(rawArtistData)
    val artistAlias = buildArtistAlias(rawArtistAlias)

    val (badID, goodID) = artistAlias.head
    artistByID.filter($"id" isin(badID, goodID)).show()
  }

  def model(
             rawUserArtistData: Dataset[String],
             rawArtistData: Dataset[String],
             rawArtistAlias: Dataset[String]): Unit = {

    val bArtistAlias = spark.sparkContext.broadcast(buildArtistAlias(rawArtistAlias))

    val trainData = buildCounts(rawUserArtistData, bArtistAlias).cache()

    val model = new ALS().
      setSeed(Random.nextLong()).
      setImplicitPrefs(true).
      setRank(10).
      setRegParam(0.01).
      setAlpha(1.0).
      setMaxIter(5).
      setUserCol("user").
      setItemCol("artist").
      setRatingCol("count").
      setPredictionCol("prediction").
      fit(trainData)

    trainData.unpersist()

    //    println(s"\n    model.userFactors.columns.toString ${model.userFactors.columns.toString}")

    model.userFactors.select("features").show(truncate = false)

    val userID = 2093760

    val existingArtistIDs = trainData.
      filter($"user" === userID).
      select("artist").as[Int].collect()

    val artistByID = buildArtistByID(rawArtistData)

    artistByID.filter($"id" isin (existingArtistIDs: _*)).show()

    val topRecommendations = makeRecommendations(model, userID, 5)
    topRecommendations.show()

    val recommendedArtistIDs = topRecommendations.select("artist").as[Int].collect()

    artistByID.filter($"id" isin (recommendedArtistIDs: _*)).show()

    model.userFactors.unpersist()
    model.itemFactors.unpersist()
  }

  def evaluate(
                rawUserArtistData: Dataset[String],
                rawArtistAlias: Dataset[String]): Unit = {

    val bArtistAlias = spark.sparkContext.broadcast(buildArtistAlias(rawArtistAlias))

    val allData = buildCounts(rawUserArtistData, bArtistAlias)
    val Array(trainData, cvData) = allData.randomSplit(Array(0.9, 0.1))
    trainData.cache()
    cvData.cache()

    val allArtistIDs = allData.select("artist").as[Int].distinct().collect()
    val bAllArtistIDs = spark.sparkContext.broadcast(allArtistIDs)

    val mostListenedAUC = areaUnderCurve(cvData, bAllArtistIDs, predictMostListened(trainData))
    println(mostListenedAUC)

    val evaluations =
      for (rank <- Seq(5, 30);
           regParam <- Seq(1.0, 0.0001);
           alpha <- Seq(1.0, 40.0))
        yield {
          val model = new ALS().
            setSeed(Random.nextLong()).
            setImplicitPrefs(true).
            setRank(rank).setRegParam(regParam).
            setAlpha(alpha).setMaxIter(20).
            setUserCol("user").setItemCol("artist").
            setRatingCol("count").setPredictionCol("prediction").
            fit(trainData)

          val auc = areaUnderCurve(cvData, bAllArtistIDs, model.transform)

          model.userFactors.unpersist()
          model.itemFactors.unpersist()

          (auc, (rank, regParam, alpha))
        }

    evaluations.sorted.reverse.foreach(println)

    trainData.unpersist()
    cvData.unpersist()
  }

  def recommend(
                 rawUserArtistData: Dataset[String],
                 rawArtistData: Dataset[String],
                 rawArtistAlias: Dataset[String]): Unit = {

    val bArtistAlias = spark.sparkContext.broadcast(buildArtistAlias(rawArtistAlias))
    val allData = buildCounts(rawUserArtistData, bArtistAlias).cache()
    val model = new ALS().
      setSeed(Random.nextLong()).
      setImplicitPrefs(true).
      setRank(10).setRegParam(1.0).setAlpha(40.0).setMaxIter(20).
      setUserCol("user").setItemCol("artist").
      setRatingCol("count").setPredictionCol("prediction").
      fit(allData)
    allData.unpersist()

    val userID = 2093760
    val topRecommendations = makeRecommendations(model, userID, 5)

    val recommendedArtistIDs = topRecommendations.select("artist").as[Int].collect()
    val artistByID = buildArtistByID(rawArtistData)
    artistByID.join(spark.createDataset(recommendedArtistIDs).toDF("id"), "id").
      select("name").show()

    val result =artistByID.withColumn("user",lit(userID)).join(spark.createDataset(recommendedArtistIDs).toDF("id"), "id").
      select("user","name").show()



    model.userFactors.unpersist()
    model.itemFactors.unpersist()
  }

  def buildArtistByID(rawArtistData: Dataset[String]): DataFrame = {
    rawArtistData.flatMap { line =>
      val (id, name) = line.span(_ != '\t')
      if (name.isEmpty) {
        None
      } else {
        try {
          Some((id.toInt, name.trim))
        } catch {
          case _: NumberFormatException => None
        }
      }
    }.toDF("id", "name")
  }

  def buildArtistAlias(rawArtistAlias: Dataset[String]): Map[Int, Int] = {
    rawArtistAlias.flatMap { line =>
      val Array(artist, alias) = line.split('\t')
      if (artist.isEmpty) {
        None
      } else {
        Some((artist.toInt, alias.toInt))
      }
    }.collect().toMap
  }

  def buildCounts(
                   rawUserArtistData: Dataset[String],
                   bArtistAlias: Broadcast[Map[Int, Int]]): DataFrame = {
    rawUserArtistData.map { line =>
      val Array(userID, artistID, count) = line.split(' ').map(_.toInt)
      val finalArtistID = bArtistAlias.value.getOrElse(artistID, artistID)
      (userID, finalArtistID, count)
    }.toDF("user", "artist", "count")
  }

  def makeRecommendations(model: ALSModel, userID: Int, howMany: Int): DataFrame = {
    model.itemFactors.show(4)
    //+---+--------------------+
    //| id|            features|
    //+---+--------------------+
    //| 30|[0.08603873, 0.00...|
    //| 40|[0.028781489, 0.0...|
    //| 50|[-2.6488724E-5, -...|
    //| 70|[0.03681191, -0.0...|
    //+---+--------------------+
    //only showing top 4 rows
    val toRecommend = model.itemFactors.
      select($"id".as("artist")).
      withColumn("user", lit(userID))
    toRecommend.limit(3).show()
    //+------+-------+
    //|artist|   user|
    //+------+-------+
    //|    30|2093760|
    //|    40|2093760|
    //|    50|2093760|
    //+------+-------+

    model.transform(toRecommend).show(4)
    //+------+-------+------------+
    //|artist|   user|  prediction|
    //+------+-------+------------+
    //|   463|2093760| 0.012307029|
    //|   496|2093760|0.0031306883|
    //|   833|2093760| 0.010124677|
    //|  1088|2093760| 3.520387E-4|
    //+------+-------+------------+
    //only showing top 4 rows

    model.transform(toRecommend).
      select("artist", "prediction").
      orderBy($"prediction".desc).
      limit(howMany)


  }

  def areaUnderCurve(
                      positiveData: DataFrame,
                      bAllArtistIDs: Broadcast[Array[Int]],
                      predictFunction: (DataFrame => DataFrame)): Double = {

    // What this actually computes is AUC, per user. The result is actually something
    // that might be called "mean AUC".

    // Take held-out data as the "positive".
    // Make predictions for each of them, including a numeric score
    val positivePredictions = predictFunction(positiveData.select("user", "artist")).
      withColumnRenamed("prediction", "positivePrediction")

    // BinaryClassificationMetrics.areaUnderROC is not used here since there are really lots of
    // small AUC problems, and it would be inefficient, when a direct computation is available.

    // Create a set of "negative" products for each user. These are randomly chosen
    // from among all of the other artists, excluding those that are "positive" for the user.
    val negativeData = positiveData.select("user", "artist").as[(Int, Int)].
      groupByKey { case (user, _) => user }.
      flatMapGroups {
        case (userID, userIDAndPosArtistIDs) =>
          val random = new Random()
          val posItemIDSet = userIDAndPosArtistIDs.map { case (_, artist) => artist }.toSet
          val negative = new ArrayBuffer[Int]()
          val allArtistIDs = bAllArtistIDs.value
          var i = 0
          // Make at most one pass over all artists to avoid an infinite loop.
          // Also stop when number of negative equals positive set size
          while (i < allArtistIDs.length && negative.size < posItemIDSet.size) {
            val artistID = allArtistIDs(random.nextInt(allArtistIDs.length))
            // Only add new distinct IDs
            if (!posItemIDSet.contains(artistID)) {
              negative += artistID
            }
            i += 1
          }
          // Return the set with user ID added back
          negative.map(artistID => (userID, artistID))
      }.toDF("user", "artist")

    // Make predictions on the rest:
    val negativePredictions = predictFunction(negativeData).
      withColumnRenamed("prediction", "negativePrediction")

    // Join positive predictions to negative predictions by user, only.
    // This will result in a row for every possible pairing of positive and negative
    // predictions within each user.
    val joinedPredictions = positivePredictions.join(negativePredictions, "user").
      select("user", "positivePrediction", "negativePrediction").cache()

    // Count the number of pairs per user
    val allCounts = joinedPredictions.
      groupBy("user").agg(count(lit("1")).as("total")).
      select("user", "total")
    // Count the number of correctly ordered pairs per user
    val correctCounts = joinedPredictions.
      filter($"positivePrediction" > $"negativePrediction").
      groupBy("user").agg(count("user").as("correct")).
      select("user", "correct")

    // Combine these, compute their ratio, and average over all users
    val meanAUC = allCounts.join(correctCounts, Seq("user"), "left_outer").
      select($"user", (coalesce($"correct", lit(0)) / $"total").as("auc")).
      agg(mean("auc")).
      as[Double].first()

    allCounts.join(correctCounts, Seq("user"), "left_outer").
      select($"user", (coalesce($"correct", lit(0)) / $"total").as("auc")).show(10)

    joinedPredictions.unpersist()

    meanAUC
  }

  def predictMostListened(train: DataFrame)(allData: DataFrame): DataFrame = {
    val listenCounts = train.groupBy("artist").
      agg(sum("count").as("prediction")).
      select("artist", "prediction")

    allData.
      join(listenCounts, Seq("artist"), "left_outer").
      select("user", "artist", "prediction")
  }

}