package u06lab.code

import org.junit.Test
import org.junit.Assert.*

class CombinerTests {
  @Test
  def testFunctions() = {
    val f: Functions = FunctionsImpl
    assertEquals(60.1, f.sum(List(10.0, 20.0, 30.1)), 0.001) // 60.1
    println((0.0, f.sum(List()))) // 0.0
    println(("abc", f.concat(Seq("a", "b", "c"))))
    println(("", f.concat(Seq())))
    println((3, f.max(List(-10, 3, -5, 0))))
    println((Integer.MIN_VALUE, f.max(List())))
  }
}
