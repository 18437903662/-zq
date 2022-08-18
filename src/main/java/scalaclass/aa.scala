package scalaclass

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object aa {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("cogroup").setMaster("local[*]")
    val sc = new SparkContext(conf)

    val rdd = sc.parallelize(List(990,12,23,3,4,5,6,7,8,9,10))

    var rdd11 = rdd.sample(true,0.4,2)

    val rdd12 = rdd11.collect()

    for (elem <- rdd12) {
      println(elem)
    }


    print("=============================")

    val rdd1: RDD[(String, Int)] = sc.makeRDD(Array(("a",90),("a",80),("b",46)
      ,("b",58),("b",29),("c",58),("c",90),("d",91),("a",76)))
    //             key   value和  累加器和
    val rdd3: RDD[(String, (Int, Int))] = rdd1.combineByKey(
      v => (v, 1), //  （90,1）
      (c: (Int, Int), v) => (c._1 + v, c._2 + 1),
      (c1: (Int, Int), c2: (Int, Int)) => (c1._1 + c2._1, c1._2 + c2._2)
    )
    //rdd3.map(x=>(x._1+"平均值"+(x._2._1/x._2._2))).collect().foreach(println)
    rdd3.map{case(x:String,(y:Int,z:Int))=>(x,(y/z))}.collect().foreach(println)



  }

}
