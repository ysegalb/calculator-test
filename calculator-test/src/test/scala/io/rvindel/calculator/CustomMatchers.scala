package io.rvindel.calculator

import org.scalatest.matchers.{BeMatcher, MatchResult}

trait CustomMatchers {

  class OddMatcher extends BeMatcher[Int] {
    override def apply(left: Int): MatchResult =
      MatchResult(left % 2 != 0, s"$left was even", s"$left was odd")
  }

  val odd = new OddMatcher
}

object CustomMatchers extends CustomMatchers