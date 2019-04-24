package com.tupperware.bigdata.service

import com.tupperware.bigdata.config.IDEAConfig
import org.apache.spark.sql.functions.sum
import org.apache.spark.sql.{DataFrame, SparkSession}

import scala.collection.mutable.ArrayBuffer

object TestSql extends IDEAConfig {
  def main(args: Array[String]): Unit = {
    loadProperties()

    val spark = SparkSession
      .builder
      .appName(this.getClass.getSimpleName)
      .config("spark.jars", prop.get("spark.jars").toString)
      .config("spark.sql.warehouse.dir", prop.get("spark.sql.warehouse.dir").toString)
      .enableHiveSupport()
      .getOrCreate()
    spark.sql("use tupdw")
    spark.sql("show tables").show()

    val data = spark.sql("select year,month,week from t_datetime_week where year=2019 and month=1").toDF().select("month", "week").toDF()


    areaUnderCurve(spark, predictMostListened(data))

    val f1: (DataFrame => DataFrame) = predictMostListened(data)

    val data3 = spark.sql("select year,month,week from t_datetime_week where year=2019 and month=4").toDF().select("month", "week").toDF()

    f1(data3).show()
  }

  def predictMostListened(data: DataFrame)(data1: DataFrame): DataFrame = {
    data1.join(data, Seq("week"), "left_outer")
  }

  def areaUnderCurve(spark: SparkSession,
                     predictFunction: (DataFrame => DataFrame)): Unit = {
    val data1 = spark.sql("select year,month,week from t_datetime_week where year=2019 and month=2").toDF().select("month", "week").toDF()
    val data2 = spark.sql("select year,month,week from t_datetime_week where year=2019 and month=3").toDF().select("month", "week").toDF()

    predictFunction(data1).show()

    predictFunction(data2).show()
    //
    //+----+-----+-----+
    //|week|month|month|
    //+----+-----+-----+
    //|   6|    2| null|
    //|   7|    2| null|
    //|   8|    2| null|
    //|   9|    2| null|
    //+----+-----+-----+
    //
    //+----+-----+-----+
    //|week|month|month|
    //+----+-----+-----+
    //|  10|    3| null|
    //|  11|    3| null|
    //|  12|    3| null|
    //|  13|    3| null|
    //+----+-----+-----+

  }
}
