/**
 * Created by icejoywoo on 14-7-5.
 */
class Foo {
  var a = 10
}

// object factory
object FooMaker {
  def apply() = new Foo
}

class Bar {
  def apply() = 0
}

class Car(_foo: String) {
  var foo = _foo
}

object Car {
  def apply(foo: String) = new Car(foo)
}

object Main extends App {
  override def main(args: Array[String]) {
    val foo = FooMaker()
    println(foo)
    println(foo.a)

    val bar = new Bar()
    println(bar())

    val car = new Car("test")
    println(car, car.foo)
  }
}
