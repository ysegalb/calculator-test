package io.rvindel.calculator

import io.rvindel.calculator.CustomMatchers._
import org.scalatest.matchers.HavePropertyMatcher
import org.scalatest.{FlatSpec, Matchers}

case class Person(name: String, surname: String, age: Int)

class MatchersExamples extends FlatSpec with Matchers {

  "A number" should "be properly tested" in {
    5 should be(5)
    5 shouldBe 5

    5 shouldBe odd

    "hey!" should be("hey!")
    "hey!" shouldBe "hey!"

    "hey!" should have length 4
    List(1, 2) should have size 2

    "hey!" should include("ey")
    "hey!" should startWith("h")
    "hey!" should endWith("!")

    "hey!" should include regex "h*!"
    "hey!" should startWith regex "he*"
    "hey!" should endWith regex ".y!"

    5 should be < 7
    5 should be > 2

    5 shouldBe a[Integer]
    "hey!" should not be an[Integer]

    5 should be(4 +- 2)

    "" shouldBe empty
    List() shouldBe empty

    List(1) should contain(1)
    List(1, 2, 3, 4, 5) should contain allOf(2, 4)
    List(1, 2, 3, 4, 5) should contain atLeastOneOf(4, 6, 8)
    List(1, 2, 3, 4, 5) should contain oneOf(4, 6, 8)
    List(1, 2, 3, 4, 5) should contain noneOf(6, 8)
    List(1, 2, 3) shouldBe sorted
  }
}