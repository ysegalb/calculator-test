import org.scalatest.{FeatureSpec, GivenWhenThen}

class CalculatorFeatureSpecTest extends FeatureSpec with GivenWhenThen {

  info("AS a math student")
  info("I WANT TO divide two numbers")
  info("SO THAT I can pass my exam")

  feature("Divide") {
    scenario("The math student divide 14 by 7") {
      Given("a calculator")
      val sut = new Calculator

      When("dividing two numbers")
      val result = sut.divide(14, 7)

      Then("the correct result must be be returned")
      assert(result == 2)
    }
    scenario("The math student divide 14 by 0") {
      Given("a calculator")
      val sut = new Calculator

      When("dividing one number by 0")
      Then("an ArithmeticalException must be thrown")
      assertThrows[ArithmeticException] {
        sut.divide(14, 0)
      }
    }
  }
}