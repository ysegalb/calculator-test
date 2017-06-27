import org.scalatest.{BeforeAndAfter, BeforeAndAfterEach, FlatSpec}
import org.scalatest.tagobjects.Slow

class CalculatorFlatSpecTest extends FlatSpec with BeforeAndAfter {

  val sut = new Calculator

  "A calculator" should "add two numbers" in {
    val result = this.sut.add(3, 2)
    assert(result == 5)
  }

  it should "subtract two numbers" taggedAs(Slow) in {
    val result = this.sut.subtract(7, 4)
    assert(result == 3)
  }

  it should "multiply two numbers" in {
    val result = this.sut.multiply(2, 2)
    assert(result == 4)
  }

  it should "divide two numbers" in {
    val result = this.sut.divide(14, 7)
    assert(result == 2)
  }
}