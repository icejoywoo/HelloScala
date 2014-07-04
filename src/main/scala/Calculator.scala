/**
 * Created by icejoywoo on 14-7-3.
 */
class Calculator(brand: String) {
  val color: String = if (brand == "TI") {
    "blue"
  } else if (brand == "HP") {
    "black"
  } else {
    "white"
  }

  def add(m: Int, n: Int): Int = m + n
}

object Calculator extends App {
  override def main(args: Array[String]) {
    val calc = new Calculator("HP")
    println(calc)
    println(calc.color)
  }
}
