package scalaclass

object zq7181 {
  def main(args: Array[String]): Unit = {

    print("hellow")

    /**
    Scala 定义变量
    var |  val
    var 表示定义变量，
    val 表示定义变量，但其值不能发生改变。
     */
    var name = "张三"
    println(name)
    val age1 = 18
    // age = 19 错误，val定义值不能发生改变。
    name = "李四"
    println("姓名："+name,age1);

    val age: Float = 19
    println(age)
    // age = 20  val定义的值，不可变。

    // 空，Unit
    val res: Unit = println("hello")


    /**
     * println
     * pirntf
     * println()
     */
    var stuName = "zhangsan"
    var stuAge = 19
    var stuSex = '男'

    // 输出1
    println("姓名："+stuName)

    // 输出2
    printf(f"姓名：${stuName}"+s"年龄：${stuAge}")

    // 输出3
    printf("姓名：%s,年龄：%s,身高：%s",stuName,stuAge,stuSex)

    var stu = new Student("tom",19)
    println(stu.name)
    println(s"姓名：${stu.name}")


    // 运算符。
    var a = 10
    var b = 3

    // 算数运算符   +  -  *   /  %
    // 在scala中，运算符也是函数。  .+()   .-()
    var c = a + b
    println(c)

    var d = a.+(b)
    println(d)

    // 在scala中，自增自减运算符。使用+= -=替代++  --
    var i = 10
    i+=1
    println(i)




    //  if 判断结构。
    println(if (a == 10) "正确")

    // if else 结构
    println(if (a % 2 == 0) "偶数" else "奇数")
    // 支持 if  else if
    var re = if (a % 2 == 0) "偶数" else if (a % 3 == 0) "3的倍数"
    println(re)

    // 重点：  在scala中，if判断有返回值。
    //         在scala中，返回值不需要return。最后一行是返回值。
    var res1 = if(b%2==0)
      1
    else {
      100
      10
    }
    println(res1)



    // for循环。
    for(ele <- 1 to 10){
      print(ele+" ")
    }

    println()
    // until 循环。
    for(ele <- 1 until(10)){
      print(ele +" " )
    }

    println()
    // 定义数组
    var arr = Array(1,2,3,4,5,6,7,8,9,10)
    for(ele <- arr)
      print(ele +" ")

    println()
    // 使用下标循环数组。
    for(ele <- 0 until(arr.length)){
      print( arr(ele)+" ")
    }

    println("输出数组中的偶数")

    // 打印出数组中的偶数。
    for(ele <- 0 until(arr.length)){
      if(arr(ele)%2==0)
        print(arr(ele)+" ")
    }
    println("\n输出数组中的偶数，添加守卫")
    // scala中可以对for循环，添加守卫。
    for(ele <- 0 until(arr.length) if(arr(ele)%2==0)){
      print(arr(ele)+" ")
    }

    println()
    // 将数组中的偶数，循环添加到新数组中。 yield

    var arr2 = for(e <- arr if(e%2==0)) yield e

    for(ele <- arr2) print(ele+" ")
    println()
    // 嵌套循环。
    //    for(i <- 1 to 10;j <- 1 to 3) println(i+"***"+j+"%%%")


    // 99 乘法表怎么打印？
    for(i<- 1 to 9;j <- 1 to i) {
      print(i+"*"+j+"="+(i*j)+"\t")
      if(i==j)println
    }
    println()
    // 计算，arr数组的和。
    var sum = 0
    for(ele <- 0 until(arr.length)){
      sum += arr(ele)

    }

    println("数组的和："+sum)


    println("================================")
    // 冒泡算法怎么做？
    var arr1 = Array(12,2,44,1,56,14,17,8,22,10)

    for(i <- 0 to arr1.length-1) {
      for (ele <- 0 until (arr1.length - 1- i)) {
        var temp = 0
        if (arr1(ele) > arr1(ele + 1)) {
          temp = arr1(ele)
          arr1(ele) = arr1(ele + 1)
          arr1(ele + 1) = temp
        }
      }
    }

    for(ele <- arr1)print(ele+" ")


    //从1到10 加2        13579
    for (i <- 1 to 10 by 2){
      print(i)
    }
    //从10到1 －2        10 8 6 4 2
    //by后不能是0
    for (i <- 10 to 1 by -2){
      print(i)
    }









  }

}
class Student(var name:String,var age:Integer)