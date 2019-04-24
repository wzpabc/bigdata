package com.tupperware.bigdata.config

import org.apache.log4j.{Level, Logger}

import java.util.Properties

import java.io.FileInputStream

class IDEAConfig {

  Logger.getLogger("org").setLevel(Level.WARN)


  val logger = Logger.getLogger("IDEAConfig")

  var prop: Properties = null

  def loadProperties(): Unit = {
    loadProperties(null)
  }

  def loadProperties(file: String): Unit = {
    val conf = if (file == null) "spark-conf.properties" else file
    if (prop == null) {
      prop = new Properties()
      val in= this.getClass.getClassLoader.getResourceAsStream(conf)
//      val path = Thread.currentThread().getContextClassLoader.getResource(conf).getPath
      prop.load(in)
      println(s"properties $conf loaded ")
      import scala.collection.JavaConversions._
      for (key <- prop.keySet) {
        println("the value of " + key + " is " + prop.get(key))
      }
    }
  }
}

