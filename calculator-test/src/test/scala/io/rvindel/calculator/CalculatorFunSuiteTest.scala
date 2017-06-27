package io.rvindel.calculator

import org.scalatest.FunSuite

class CalculatorFunSuiteTest extends FunSuite {

  val sut = new Calculator

  test("add") {
    val result = this.sut.add(3, 2)
    assert(result == 5)
  }

  test("subtract") {
    val result = this.sut.subtract(7, 4)
    assert(result == 3)
  }

  test("multiply") {
    val result = this.sut.multiply(2, 2)
    assert(result == 4)
  }

  test("divide") {
    val result = this.sut.divide(14, 7)
    assert(result == 2)
  }
}