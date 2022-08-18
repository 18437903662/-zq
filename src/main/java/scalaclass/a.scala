package scalaclass

object a {
  def main(args: Array[String]): Unit = {

    /**
     * Scala 定义变量
     * var |  val
     * var 表示定义变量，
     * val 表示定义变量，但其值不能发生改变。
     */
    println("hhhh")

    println(Unit)

    var name = "zhangsan"
    name = "lisi"
    println(name)

    /**
     * Unit 类型。
     *
     */
    var s: Unit = println("hello")
    println(s)

    /**
     * 输出类型
     * println()
     * printf()
     * println(s)
     */

    var stuName = "Jack"
    var stuAge = 19;
    var stuPrice = 333.88d;

    // println()
    println("姓名：" + stuName, "年龄" + stuAge, "薪资" + stuPrice)
    println(f"姓名：$stuName", "年龄" + stuAge, "薪资" + stuPrice)
    printf("姓名 %s,年龄%s,薪资 %s", stuName, stuAge, stuPrice)
    //    val student = new Student("李四",22)
    //    println(s"姓名：${student.name}");

    /**
     * if else
     */
    println(if (1 == 1) 10)
    println(if (1 == 2) 10 else 20)
    var flag = println(if (1 == 2) 10 else if (1 == 2) 20)
    println(flag)
    var r1: Any = if (1 == 2) 10 else "sss"
    println(r1)


    for (ele <- 1 to 10)
      print(ele + " ")


    println("\n=======================================")
    for (ele <- 1 until (10))
      print(ele + " ")

    println("\n=======================================")

    var arr = Array(15, 33, 2, 4, 90)
    for (ele <- arr) {
      print(ele + " ")
    }

    println("\n=======================================")
    for (ele <- 0 until (arr.length)) {
      print(arr(ele) + " ")
    }

    println("\n=======================================")
    // 添加守卫。
    for (ele <- 0 until (arr.length) if arr(ele) % 2 == 0) {
      print(arr(ele) + " ")
    }

    //    println("\n=======================================")
    //    // 99 乘法表
    //    for(i <- 1 to 9;j <- 1 to i){
    //      print(j+"*"+i+"="+(i*j)+" ")
    //      if(i==j) {
    //        println("")
    //      }
    //
  }
  }
