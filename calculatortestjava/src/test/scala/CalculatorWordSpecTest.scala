import org.scalatest.WordSpec

class CalculatorWordSpecTest extends WordSpec {

  val sut = new Calculator

  "A calculator" when {
    "adding" should {
      "return the correct result" in {
        val result = this.sut.add(3, 2)
        assert(result == 5)
      }
    }
    "subtracting" should {
      "return the correct result" in {
        val result = this.sut.subtract(7, 4)
        assert(result == 3)
      }
    }
    "multiplying" should {
      "return the correct result" in {
        val result = this.sut.multiply(2, 2)
        assert(result == 4)
      }
    }
    "dividing" should {
      "return the correct result" in {
        val result = this.sut.divide(14, 7)
        assert(result == 2)
      }
      "throw ArithmeticException" in {
        assertThrows[ArithmeticException] {
          this.sut.divide(14, 0)
        }
      }
    }
  }
}