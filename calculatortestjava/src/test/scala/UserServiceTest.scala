import org.scalatest.FunSuite
import org.scalatest.mockito.MockitoSugar
import org.mockito.Mockito._

class UserServiceTest extends FunSuite with MockitoSugar {

  test("should call user repository") {
    val repository: UserRepository = mock[UserRepository]
    val sut: UserService = new UserService(repository)

    when(repository.findById(5L)).thenReturn("holi")

    assert(sut.findById(5L) == "holi")
  }
}