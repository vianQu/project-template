package project.defaultapplication.user.dao;

import project.common.baseDAO.BaseMapperInterface;
import project.defaultapplication.user.model.User;

import java.util.List;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 4, 2012
 * Time: 12:04:31 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserMapper{
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
