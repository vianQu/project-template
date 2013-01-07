package project.defaultapplication.user.Service;

import project.defaultapplication.user.model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: IVAN
 * Date: 1/7/13
 * Time: 11:47 AM
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    //add user
    public void saveUser(User user) throws SQLException;

    //count user is exist
    public boolean isUserExistModel(User user) throws SQLException;
    public boolean isUserExist(String userName) throws SQLException;

    //retrieve user
    public List<User> getAllUser() throws SQLException;
    public User getUserById(int id) throws SQLException;
    public User getUserById(User user) throws SQLException;
    public User getUserByUserName(String userName) throws SQLException;
    public User getUserByUserNameUser(User user) throws SQLException;

    //edit user
    public void updateUser(User user) throws SQLException;

    //set flag user= 'N'
    public void deleteUser(User user) throws SQLException;

    public int authorizeLogin(User user) throws SQLException;
}
