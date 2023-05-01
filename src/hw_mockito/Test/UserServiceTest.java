package hw_mockito.Test;

import hw_mockito.Dao.UserDaoImpl;
import hw_mockito.Model.User;
import hw_mockito.Service.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserDaoImpl userDaoImpl;

    @InjectMocks
    private UserServiceImpl userServiceImpl;

    private User userForTest = new User("Слава", 54);

    @Test
    void checkUserExistShouldReturnTrue() {
        when(userDaoImpl.getUserList().contains(userForTest)).thenReturn(true);
        Assertions.assertTrue(userServiceImpl.checkUserExist(userForTest));
    }
    @Test
    void checkUserExistShouldReturnFalse() {
        when(userDaoImpl.getUserList().contains(userForTest)).thenReturn(false);
        Assertions.assertTrue(userServiceImpl.checkUserExist(userForTest));
    }
}