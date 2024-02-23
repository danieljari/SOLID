package dip;

/**
 * The UserController now depends on the UserRepository interface
 * rather than the concrete DatabaseService
 * */
/**
public class Solve {

    // Abstraction for data access
    public interface UserRepository {
        User getUser(String username);
    }

    // Low-level module implementing the abstraction
    public class DatabaseService implements UserRepository {
        @Override
        public User getUser(String username) {
            // Logic to fetch user from database
            return null;
        }
    }

    // High-level module depending on abstraction
    public class UserController {
        private UserRepository userRepository;

        public UserController(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        public boolean authenticate(String username, String password) {
            User user = userRepository.getUser(username);
            if (user != null && user.getPassword().equals(password)) {
                return true;
            }
            return false;
        }
    }
}
*/