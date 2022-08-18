package scalaclass

object b {
  def main(args: Array[String]): Unit = {
//    def main(args: Array[String]) = {
//      // 输出。
      println("hello scala")
//      // 定义变量。
//      /**
//       * var 定义的变量值可变。
//       * val 定义的变量值不可变，相当于java中的常量。
//       */
//      // 在scala中，也有8中基本数据类型。
     var name: String = "张三"
      println(name)
//
      val age: Float = 19
      println(age)
//      // age = 20  val定义的值，不可变。
//
//      // 空，Unit
//      val res: Unit = println("hello")
//
//    }
//
//    scala 输出
//    // 输出。
//    /**
//     * println
//     * pirntf
//     * println()
//     */
//    var stuName = "zhangsan"
//    var stuAge = 19
//    var stuSex = '男'
//
//    // 输出1
//    println("姓名："+stuName)
//
//    // 输出2
//    printf(f"姓名：${stuName}"+s"年龄：${stuAge}")
//
//    // 输出3
//    printf("姓名：%s,年龄：%s,身高：%s",stuName,stuAge,stuSex)
//
//    var stu = new Student("tom",19)
//    println(stu.name)
//    println(s"姓名：${stu.name}")
//  }
//
//}
//
//// 自定义类
//class Student(var name:String,var age:Integer)
//
//scala 运算符
//// 运算符。
//var a = 10
//var b = 3
//
//// 算数运算符   +  -  *   /  %
//// 在scala中，运算符也是函数。  .+()   .-()
//var c = a + b
//println(c)
//
//var d = a.+(b)
//println(d)
//
//// 在scala中，自增自减运算符。使用+= -=替代++  --
//var i = 10
//i+=1
//println(i)
//
//scala 判断结构
//def main(args: Array[String]): Unit = {
//var a = 15
////  if 判断结构。
//println(if (a == 10) "正确")
//
//// if else 结构
//println(if (a % 2 == 0) "偶数" else "奇数")
//// 支持 if  else if
//var res = if (a % 2 == 0) "偶数" else if (a % 3 == 0) "3的倍数"
//println(res)
//
//// 重点：  在scala中，if判断有返回值。
////         在scala中，返回值不需要return。最后一行是返回值。
//var b = 15
//var res1 = if(b%2==0)
//1
//else {
//100
//10
//}
//println(res1)
//}
//
//scala 循环结构
//def main(args: Array[String]): Unit = {
//// for循环。
//for(ele <- 1 to 10){
//print(ele+" ")
//}
//
//println()
//// until 循环。
//for(ele <- 1 until(10)){
//print(ele +" " )
//}
//
//println()
//// 定义数组
//var arr = Array(1,2,3,4,5,6,7,8,9,10)
//for(ele <- arr)
//print(ele +" ")
//
//println()
//// 使用下标循环数组。
//for(ele <- 0 until(arr.length)){
//print( arr(ele)+" ")
//}
//
//println("输出数组中的偶数")
//
//// 打印出数组中的偶数。
//for(ele <- 0 until(arr.length)){
//if(arr(ele)%2==0)
//print(arr(ele)+" ")
//}
//println("\n输出数组中的偶数，添加守卫")
//// scala中可以对for循环，添加守卫。
//for(ele <- 0 until(arr.length) if(arr(ele)%2==0)){
//print(arr(ele)+" ")
//}
//
//println()
//// 将数组中的偶数，循环添加到新数组中。 yield
//
//var arr2 = for(e <- arr if(e%2==0)) yield e
//
//for(ele <- arr2) print(ele+" ")
//println()
//// 嵌套循环。
////    for(i <- 1 to 10;j <- 1 to 3) println(i+"***"+j+"%%%")
//
//
//// 99 乘法表怎么打印？
//for(i<- 1 to 9;j <- 1 to i) {
//print(i+"*"+j+"="+(i*j)+"\t")
//if(i==j)println
//}
//println()
//// 计算，arr数组的和。
//var sum = 0
//for(ele <- 0 until(arr.length)){
//sum += arr(ele)
//
//}
//
//println("数组的和："+sum)
//
//
//println("================================")
//// 冒泡算法怎么做？
//var arr1 = Array(12,2,44,1,56,14,17,8,22,10)
//
//for(i <- 0 to arr1.length-1) {
//for (ele <- 0 until (arr1.length - 1- i)) {
//var temp = 0
//if (arr1(ele) > arr1(ele + 1)) {
//temp = arr1(ele)
//arr1(ele) = arr1(ele + 1)
//arr1(ele + 1) = temp
//}
//}
//}
//
//for(ele <- arr1)print(ele+" ")
//
//
//}
//
//scala 方法
//
///*
//  scala中，拥有了，方法和函数
//  方法是什么？ method,是对象中的方法。 在scala中，所有的方法均是静态的。
//  def  方法名（参数名：参数类型）：返回值类型 = { 执行体}
// */
//
//def method1(a:Int): Unit ={
//println(a)
//}
//def method2(a:Int)={
//
//}
//def method3()={
//10
//}
//def method4():String ={
//"nihao"
//"zhangsan"
//"world"
//}
//
//def main(args: Array[String]): Unit = {
//// 有参数方法
//method1(10)
//// 有返回值方法
//val res: String = method4()
//println(res)
//// 自动推算返回值的方法。
//val res1: Int = method3()
//}
//
//
//scala 函数
///*
//   scala中的函数  function
//
//   val f1:(Int,Int) => Int ={(x,y)=> x+y}
//
//   val 函数名 ：（函数数据类型） =》 返回值类型 = {（参数名）=> 执行体}
//
//   val f2 = (x:Int,y:Int) => x-y
//
//   val 函数名 = （参数名：参数类型）=》 执行体
//    */
//
//val f1: (Int, Int) => Int = { (x, y) => x + y }
//
////  val f2 = 匿名函数
//val f2 = (x: Int, y: Int) => x - y
//
////  val map1 = 匿名函数
//val map1 = (x:String) => x+"*"
//
//def main(args: Array[String]): Unit = {
//var a = 10
//var b = 5
//val res = f1(a, b)
//println(res)
//
//// 调用f2 方法。
//val res1 = f2(a, b)
//println(res1)
//
//// 使用数组。
//var arrs = Array("1","2","3")
//val strings: Array[String] = arrs.map(a => a+"*")
//val strings1: Array[String] = arrs.map(map1)
//println(strings.toBuffer)
//println(strings1.toBuffer)
//
//}
//
//scala 函数2
//// 方法。
//def method1(x: Int, y: Int) = {
//x + y
//}
//// 函数
//val f1 = (x: Int, y: Int) => x + y
//
//// 函数
//val f2: (Int, Int) => Any = { (x, y) => x + y }
//
//// 终极考验。我要一个方法。参数是函数。
////  这个方法中有三个参数：函数，值，值。
//def method2(f3: (Int, Int) => Int, x: Int, y: Int) = {
//f3(x, y)
//}
//
//val f3 = (x: Int, y: Int) => (x * y)
//
//def main(args: Array[String]): Unit = {
//val res1: Int = method1(10, 5)
//println(res1)
//val res2: Int = f1(10, 5)
//println(res2)
//
//// 调用method2方法。
//val res3: Int = method2((x, y) => x + y, 10, 20)
//println(res3)
//val res4: Int = method2((x, y) => x - y, 10, 20)
//println(res4)
//// 方法中，传递函数
//val res5: Int = method2(f3, 10, 20)
//println(res5)
//
//// 方法可转换成函数。 在方法名后  _
//
//val f9: (Int, Int) => Int = method1 _
//
//val res10: Int = f9(10,7)
//println(res10)
//
//}
//
//scala 数组
//
///**
// * 数组
// * mutable  和  imutable
// *
// * 数组：Array  不可变数组。
// * ArrayBuffer 在mutable包中，表示了可变数组。
// *
// *
// **/
//object ScalaDemo01 {
//
//  // 函数。
//  val f1 = (x: Int) => x * 10
//
//  // 方法。传入数组。将元素乘以10 返回数组。
//  def method(x: Array[Int]) = {
//    var arr = ArrayBuffer[Int]()
//    for (ele <- x) {
//      arr += (ele * 10) //+= 向其内部追加。相当于append
//    }
//    arr.toArray
//  }
//  def main(args: Array[String]): Unit = {
//    // 数组的定义。
//    val arr = Array(14, 21, 3, 7)
//    // 获取数组中的值。
//    println(arr(0))
//    // 使用for循环遍历数组。
//    println("遍历数组")
//    for (ele <- 0 until (arr.length)) {
//      println(arr(ele))
//    }
//
//    // 数组中的方法。map映射方法。映射数组中的每一个元素。
//    val arr1: Array[Int] = arr.map(x => x * 10)
//    println(arr1.toBuffer)
//
//    val arr2: Array[Int] = arr.map(f1(_))
//    println(arr2.toBuffer)
//
//    val arr3: Array[Int] = arr.map(_ * 10)
//    println(arr3.toBuffer)
//
//    // 调用方法。
//    val arr4: Array[Int] = method(arr)
//    println(arr4.toBuffer)
//
//    // 打印所有元素。
//    arr.foreach(println(_))
//
//    val arr5: Array[Int] = arr.sortWith((x, y) => x < y)
//    arr5.foreach(x => print(x + "\t"))
//
//    //    arr.filter()
//
//
//    数组 wordCount
//    def main(args: Array[String]): Unit = {
//      var arr = Array(1, 4, 7, 45, 23, 19, 56, 91)
//      // 属性
//      println(arr.max)
//      println(arr.min)
//      println(arr.sum)
//      println(arr.count(x => x > 0))
//      /**
//       * map 映射每个元素的方法。
//       * flatten  扁平化。压平。
//       * flatmap
//       * groupby
//       * mapValues
//       * toList
//       * sortBy
//       */
//      var strs = Array("hello zhangsan hello scala hello scala", "tom jack hello jack tom scala lucy")
//      val str1: Array[Array[String]] = strs.map(x => x.split(" "))
//      // 将数组中的数组切分压平
//      val flatten: Array[String] = str1.flatten
//      println(flatten.toBuffer)
//      // worldcount 第一步，切分压平。flatMap 就是flatten 和 map的简写。
//      val str2: Array[String] = strs.flatMap(_.split(" "))
//      // 第二步:对单词进行分组。
//      val str3: Map[String, Array[String]] = str2.groupBy(x => x)
//      //scala	ArrayBuffer(scala, scala, scala)  hello	ArrayBuffer(hello, hello, hello, hello)
//      // 第三步：对单词分组后进行计数
//      val str5: Map[String, Int] = str3.mapValues(x => x.length)
//      // 第四步：转换成list集合。
//      val str6: List[(String, Int)] = str5.toList
//      // 第五步：进行排序。
//      val str7: List[(String, Int)] = str6.sortBy(_._2)
//
//      //var strs = Array("hello zhangsan hello scala hello scala", "tom jack hello jack tom scala lucy")
//
//      strs.flatMap(x=>x.split(" ")).groupBy(x=>x).mapValues(_.length).toList.sortBy(_._2).foreach(x=>println(x))

  }
}
