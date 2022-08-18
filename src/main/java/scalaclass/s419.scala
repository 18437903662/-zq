package scalaclass

import org.apache.spark.SparkConf

object s419 {
  def main(args: Array[String]): Unit = {
    println("hello scala")
    val s: Unit = println("hello scala")
    println(s)
    var name: String = "张三"
    println(name)
    val age: Float = 19
    println(age)

    for (i <- 1 to 9){
      for (j <- 1 to i){
        print(i+"*"+j+"="+i*j+"\t")
      }
      println()
    }




  }

}
