/**
 * Created by icejoywoo on 14-7-5.
 */
class Foo {}

// object factory
object FooMaker {
  def apply() = new Foo
}

object Main extends App {
  override def main(args: Array[String]) {
    val foo = FooMaker()
    println(foo)
  }
}
