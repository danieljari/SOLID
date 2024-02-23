package dip;

/**
public class Violates {

    // Low-level module
    public class DatabaseService {
        public User getUser(String username) {
            // Logic to fetch user from database
            return null;
        }
    }

    // High-level module
    public class UserController {
        private DatabaseService databaseService;

        public UserController() {
            this.databaseService = new DatabaseService();
        }

        public boolean authenticate(String username, String password) {
            User user = databaseService.getUser(username);
            if (user != null && user.getPassword().equals(password)) {
                return true;
            }
            return false;
        }
    }
}
*/