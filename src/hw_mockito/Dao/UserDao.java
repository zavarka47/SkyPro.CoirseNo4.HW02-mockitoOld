package hw_mockito.Dao;

import hw_mockito.Model.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String name);

    List<User> findAllUsers();


}
