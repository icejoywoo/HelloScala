package collections

/**
 * Created by wujiabin on 14-7-8.
 */
object Main extends App {
  override def main(args: Array[String]) {
    val numbers = List(1, 2, 3, 4)
    println(numbers)

    val set = Set(1, 1, 2)
    println(set)

    val hostPort = ("localhost", 80, "http")
    println(hostPort, hostPort._1, hostPort._2, hostPort._3, 1 -> 2) // -> 创建tuple的方法

    val map = Map(1 -> "one", 2 -> "two")
    println(map, map.get(1))
    val res1 = map.get(2)
    val result = res1 match {
      case Some(n) => n * 2
      case None => 0
    }
    println(result)

    {
      // Functional Combinators
      val numbers: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
      // map
      println(numbers.map((i: Int) => i * 2))

      def timesTwo(i: Int): Int = i * 2
      println(numbers.map(timesTwo _))

      // foreach 和 map一样, 但是没有返回值, side-effect
      println(numbers.foreach((i: Int) => i * 2))
      println(numbers)

      // filter
      println(numbers.filter((i: Int) => i % 2 == 0))

      // zip
      println(List(1, 2, 3).zip(List("a", "b", "c")))

      // partition
      println(numbers.partition(_ %2 == 0))

      // drop & dropWhile
      println(numbers.drop(5))
      println(numbers.dropWhile(_ % 2 != 0))

      // foldLeft
      println(numbers.foldLeft(0)((m: Int, n: Int) => m + n))
      println(numbers.foldLeft(0)((m: Int, n: Int) => {
        println("m: " + m + ", n: " + n)
        m + n
      }))

      // foldRight
      println(numbers.foldRight(0)((m: Int, n: Int) => {
        println("m: " + m + ", n: " + n)
        m + n
      }))

      // flatten
      println(List(List(1, 2), List(3, 4)).flatten)

      val nestedNumbers = List(List(1, 2), List(3, 4))
      println(nestedNumbers.flatMap(x => x.map(_ * 2)))
      println(nestedNumbers.map((x: List[Int]) => x.map(_ * 2)).flatten)

      def ourMap(numbers: List[Int], fn: Int => Int): List[Int] = {
        numbers.foldRight(List[Int]()) { (x: Int, xs: List[Int]) =>
          fn(x) :: xs  // 插入一个元素到list中
        }
      }
      println(ourMap(numbers, timesTwo(_)))
    }
  }
}
