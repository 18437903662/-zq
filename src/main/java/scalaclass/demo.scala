package scalaclass

import org.apache.spark.SparkConf

import scala.collection.mutable.ArrayBuffer

object demo {
  def main(args: Array[String]): Unit = {
    val arr = Array[Int](1, 2, 3, 4, 5)
    var arr1 = ArrayBuffer[Int]()
    for(ele <- arr){
      arr1 + (ele+"*"+" ")
    }
//    val a1 = arr.map(_ + "*")
//    println(a1.toBuffer)


    new SparkConf().setMaster("local[*]").setAppName("zs")



  }
}
