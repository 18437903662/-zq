package scalaclass

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object s420 {
  def main(args: Array[String]): Unit = {

    //    var arr=Array[Int](1,2,3,4,5,6,7,8)
    //    for (i <- 0 to arr.length-1){
    //      println(arr(i))
    //    }
    //    for(e <- arr){print(e)}

    //    for(ele <- 1 to 10){
    //      print(ele+" ")
    //    }
    val conf = new SparkConf().setAppName("mappatitionswithindex").setMaster("local[*]")
    val sc = new SparkContext(conf)

    val distinctRdd = sc.parallelize(List(1, 2, 1, 5, 2, 9, 6, 1))
    val res1: RDD[Int] = distinctRdd.distinct(2)
    // distinct 中的参数numTask 表示 数据先对2整除，其他的依次余1，余2，余3 。局部无序，整体有序。
    res1.foreach(println)

    val rdd1: RDD[Int] = sc.makeRDD(1 to 10, 2)
    val rdd2: RDD[String] = rdd1.mapPartitionsWithIndex((x, iter) => {
      var result = List[String]()

      result.::=(x + "|" + iter.toList)
      result.iterator
    })
    val res: Array[String] = rdd2.collect()
    for (x <- res) {
      println(x)

    }


  }
}
