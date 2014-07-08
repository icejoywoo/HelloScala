package basic

/**
 * Created by icejoywoo on 14-7-1.
 */

object Timer {
  var count = 0

  def currentCount(): Long = {
    count += 1
    count
  }
}

class AddOne extends (Int => Int) {
  def apply(m: Int): Int = m + 1
}

object HelloWorld extends App {
  override def main(args: Array[String]) {
    println("hello")

    println(Timer.currentCount())
    println(Timer.currentCount())

    val plusOne = new AddOne()
    println(plusOne(1))
  }
}
