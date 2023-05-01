package hw_mockito.Service;

import hw_mockito.Dao.UserDaoImpl;
import hw_mockito.Model.User;

public class UserServiceImpl implements UserService {

    private UserDaoImpl userDaoImpl;

    public UserServiceImpl(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }


    @Override
    public boolean checkUserExist (User user){
        return userDaoImpl.getUserList().contains(user);
    }


}
