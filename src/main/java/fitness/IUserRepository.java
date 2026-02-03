package fitness;

import java.util.List;

public interface IUserRepository {
    void addUser(User user);
    List<User> getAllUsers();
}