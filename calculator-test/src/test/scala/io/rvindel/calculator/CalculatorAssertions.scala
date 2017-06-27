package io.rvindel.calculator

import org.scalatest.FlatSpec

class CalculatorAssertions extends FlatSpec {

  val sut = new Calculator

  "A calculator" should "add two numbers" in {
    val result = this.sut.add(3, 2)
    assert(result == 5)
    assertResult(5)(result)
    assertResult(5) {
      result
    }
  }

  it should "throw exception when dividing one number by 0" in {
    assertThrows[ArithmeticException] {
      this.sut.divide(14, 0)
    }
  }

  it should "throw exception when dividing one number by 0 and intercept it" in {
    val exception = intercept[ArithmeticException] {
      this.sut.divide(14, 0)
    }
    assert(!exception.getMessage.isEmpty)
  }

  ignore should "not work :(" in {
    fail("TT_TT")
  }

  it should "work :)" in {
    succeed
  }

  it should "be always cancelled" in {
    cancel
  }

  it should "be cancelled with condition" in {
    assume(true)
  }
}