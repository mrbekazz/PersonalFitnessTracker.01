package fitness;

import org.springframework.web.bind.annotation.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private IUserRepository userRepo;

    public UserController() {
        try {
            Connection conn = DatabaseConnection.getConnection();
            DatabaseInitializer.createTables();
            this.userRepo = new PostgresUserRepository(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepo.getAllUsers();
    }

    @PostMapping
    public String addUser(@RequestBody User user) {
        userRepo.addUser(user);
        return "User added successfully: " + user.getName();
    }
}