package io.rvindel.calculator

import org.scalatest.FlatSpec

class CalculatorFlatSpecTest extends FlatSpec {

  val sut = new Calculator

  "A calculator" should "add two numbers" in {
    val result = this.sut.add(3, 2)
    assert(result == 5)
  }

  it should "subtract two numbers" in {
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