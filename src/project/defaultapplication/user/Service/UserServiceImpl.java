package project.defaultapplication.user.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.defaultapplication.user.dao.UserMapper;
import project.defaultapplication.user.model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: IVAN
 * Date: 1/7/13
 * Time: 11:49 AM
 * To change this template use File | Settings | File Templates.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void saveUser(User user) throws SQLException {
        userMapper.saveUser(user);
    }

    @Override
    public boolean isUserExistModel(User user) throws SQLException {
        return userMapper.isUserExistModel(user);
    }

    @Override
    public boolean isUserExist(String userName) throws SQLException {
        return userMapper.isUserExist(userName);
    }

    @Override
    public List<User> getAllUser() throws SQLException {
        return userMapper.getAllUser();
    }

    @Override
    public User getUserById(int id) throws SQLException {
        return userMapper.getUserById(id);
    }

    @Override
    public User getUserById(User user) throws SQLException {
        return userMapper.getUserById(user);
    }

    @Override
    public User getUserByUserName(String userName) throws SQLException {
        return getUserByUserName(userName);
    }

    @Override
    public User getUserByUserNameUser(User user) throws SQLException {
        return userMapper.getUserByUserNameUser(user);
    }

    @Override
    public void updateUser(User user) throws SQLException {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(User user) throws SQLException {
        userMapper.deleteUser(user);
    }

    @Override
    public int authorizeLogin(User user) throws SQLException {
        return userMapper.authorizeLogin(user);
    }
}
