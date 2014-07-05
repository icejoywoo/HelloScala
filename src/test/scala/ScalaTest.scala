/**
 * Created by icejoywoo on 14-7-5.
 */

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.Suite

@RunWith(classOf[JUnitRunner])
class MySuiteTest extends Suite {
  def testAddition() {
    val sum = 1 + 1
    assert(sum === 2)
    assert(sum + 2 === 4)
  }
}
