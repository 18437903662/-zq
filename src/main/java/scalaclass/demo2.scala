package scalaclass

import org.apache.spark.{SparkConf, SparkContext}

object demo2 {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("mappa").setMaster("local[*]")
    val sc = new SparkContext(conf)
    var rdd = sc.parallelize(1 to 10)
    //    val rdd1 = rdd.map(_ * 2)
    val rdd1 = rdd.map((_, 1))
    for (elem <- rdd1.collect()) {
      println(elem)
    }


  }

}
