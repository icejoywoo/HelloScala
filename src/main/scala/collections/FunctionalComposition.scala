/**
 * Created by wujiabin on 14-7-8.
 */

object FunctionalComposition extends App {

  override def main(args: Array[String]) {
    def f(s: String) = "f(" + s + ")"
    def g(s: String) = "g(" + s + ")"

    val fComposeG = f _ compose g _
    println(fComposeG("xxx"))

    val fAndThenG = f _ andThen g _
    println(fAndThenG("yyy"))

    // PartialFunction
    {
      val one: PartialFunction[Int, String] = { case 1 => "one"}

      println(one.isDefinedAt(1), one.isDefinedAt(2))

      val two: PartialFunction[Int, String] = { case 2 => "two" }
      val three: PartialFunction[Int, String] = { case 3 => "three" }
      val wildcard: PartialFunction[Int, String] = { case _ => "something else" }
      val partial = one orElse two orElse three orElse wildcard

      println(partial(1), partial(5))

      println(Seq(1, 2).size)
    }
  }

}
