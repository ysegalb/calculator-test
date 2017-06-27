import org.scalamock.scalatest.MockFactory
import org.scalatest.FunSuite

class UserServiceScalaMockTest extends FunSuite with MockFactory {

  test("should call user repository stub") {
    val repository = stub[UserRepository]
    val sut = new UserService(repository)

    (repository.findById _).when(5l).returns("Jon")

    assert(sut.findById(5L) == "Jon")
  }

  test("should call user repository mock") {
    val repository = mock[UserRepository]
    val sut = new UserService(repository)

    (repository.findById _).expects(5L)

    sut.findById(5L)
  }
}