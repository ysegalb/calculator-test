import org.scalatest.FreeSpec

class CalculatorFreeSpecTest extends FreeSpec {

  val sut = new Calculator

  "A calculator" - {
    "when adding" - {
      "should return the correct value" in {
        val result = this.sut.add(3, 2)
        assert(result == 5)
      }
    }
    "when subtracting" - {
      "should return the correct value" in {
        val result = this.sut.subtract(7, 4)
        assert(result == 3)
      }
    }
    "when multiplying" - {
      "should return the correct value" in {
        val result = this.sut.multiply(2, 2)
        assert(result == 4)
      }
    }
    "when dividing" - {
      "should return the correct value" in {
        val result = this.sut.divide(14, 7)
        assert(result == 2)
      }
      "by 0 should throw ArithmeticException" in {
        assertThrows[ArithmeticException] {
          this.sut.divide(14, 0)
        }
      }
    }
  }
}