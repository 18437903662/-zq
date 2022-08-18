package scalaclass


class Stu(){}
object demo1 {

  def main(args: Array[String]): Unit = {
    new Stu()with TraitInfo{
      override def show(): Unit = {
        print("hello ")
      }
    }.show()
  }
}
trait TraitInfo{
  def show()
}