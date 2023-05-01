package hw_mockito.Test;

import hw_mockito.Dao.UserDaoImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    private UserDaoImpl userDaoImpl;
    private String nameForTest = "Петя";

    public UserDaoTest(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    @Test
    void shouldGetUserByNameReturnUser() {
        Assertions.assertEquals(userDaoImpl.getUserByName("Петя"), nameForTest);
    }

    @Test
    void shouldFindAllUsers() {
        Assertions.assertNull(userDaoImpl.getUserByName("Слава"));
    }
}