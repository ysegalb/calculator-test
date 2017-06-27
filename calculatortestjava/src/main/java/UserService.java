public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public String findById(long id) {
        return this.repository.findById(id);
    }
}