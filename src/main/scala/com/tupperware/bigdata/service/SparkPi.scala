package com.tupperware.bigdata.service

import com.tupperware.bigdata.config.IDEAConfig
import org.apache.spark.sql.SparkSession

import scala.math.random


/** Computes an approximation to pi */
object SparkPi extends IDEAConfig {

  def main(args: Array[String]) {

    loadProperties()

    val spark = SparkSession
      .builder
      .appName(this.getClass.getSimpleName.toString)
      .config("spark.jars", prop.get("spark.jars").toString)
      .config("spark.sql.warehouse.dir", prop.get("spark.sql.warehouse.dir").toString)
      .enableHiveSupport()
      .getOrCreate()

    val slices = if (args.length > 0) args(0).toInt else 2
    val n = math.min(100000L * slices, Int.MaxValue).toInt // avoid overflow
    val count = spark.sparkContext.parallelize(1 until n, slices).map { i =>
      val x = random * 2 - 1
      val y = random * 2 - 1
      if (x * x + y * y <= 1) 1 else 0
    }.reduce(_ + _)
    println(s"Pi is roughly ${4.0 * count / (n - 1)}")
    spark.stop()
  }

}