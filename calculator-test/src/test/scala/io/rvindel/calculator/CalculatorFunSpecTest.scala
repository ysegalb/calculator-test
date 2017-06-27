package io.rvindel.calculator

import org.scalamock.scalatest.proxy.MockFactory
import org.scalatest.FunSpec

class CalculatorFunSpecTest extends FunSpec with MockFactory {

  val sut = new Calculator

  describe("A calculator") {
    describe("when adding") {
      it("should return the correct result") {
        val result = this.sut.add(3, 2)
        assert(result == 5)
      }
    }
    describe("when subtracting") {
      it("should return the correct result") {
        val result = this.sut.subtract(7, 4)
        assert(result == 3)
      }
    }
    describe("when multiplying") {
      it("should return the correct result") {
        val result = this.sut.multiply(2, 2)
        assert(result == 4)
      }
    }
    describe("when dividing") {
      it("should return the correct result") {
        val result = this.sut.divide(14, 7)
        assert(result == 2)
      }
      it("by 0 should throw ArithmeticException") {
        assertThrows[ArithmeticException] {
          this.sut.divide(14, 0)
        }
      }
    }
  }
}