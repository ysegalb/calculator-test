package io.rvindel.calculator

import org.scalamock.scalatest.proxy.MockFactory
import org.scalatest.FunSuite

class UserServiceTest extends FunSuite with MockFactory {

  test("should call user repository") {
    val repository = stub[UserRepository]
    val sut = new UserService(repository)

    repository.when('findById)(5L).returns("Jon")

    assert(sut.findById(5L) == "Jon")
  }
}