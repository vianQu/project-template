package project.defaultapplication.user.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.defaultapplication.user.dao.UserMapper;
import project.defaultapplication.user.model.User;

import javax.transaction.TransactionManager;
import java.util.List;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 4, 2012
 * Time: 12:13:40 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository("userMapper")
public class UserMapperImplement implements UserMapper {

    @Autowired private SqlSessionTemplate sqlSessionTemplate;

//    public void setSqlSession(SqlSession sqlSession) {
//        this.sqlSession = sqlSession;
//    }
   @Override
    public void saveUser(User user) throws SQLException {
//        getSqlMapClientTemplate().insert("saveUser",user);
       sqlSessionTemplate.insert("saveUser",user);
//        sqlSession.insert("saveUser",user);
//        sqlSession.commit();
    }

    @Override
    public boolean isUserExistModel(User user) throws SQLException {
        int countUser=0;
//        countUser = (Integer)getSqlMapClientTemplate().queryForObject("countUserByObject",user);

        if (countUser > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isUserExist(String userName) throws SQLException {
        int countUser=0;
        countUser = (Integer) sqlSessionTemplate.selectOne("countUserByUserName",userName);

        if (countUser > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int authorizeLogin(User user) throws SQLException {
        return (Integer) sqlSessionTemplate.selectOne("authorizeLogin",user);
    }

    public List<User> getAllUser() throws SQLException {
        List<User> listUser;
        listUser = sqlSessionTemplate.selectList("getAllUser");
//        listUser = sqlSession.selectList("getAllUser");
        return listUser;
    }

    public User getUserById(int id) throws SQLException {
        User user;
        //get user from database
        user = (User) sqlSessionTemplate.selectOne("getUserById",id);
//        user = (User) sqlSession.selectOne("getUserById",id);
        return user;
    }

    public User getUserById(User user) throws SQLException {
            user = (User) sqlSessionTemplate.selectOne("getUserByObject", user);
        return user;
    }

    public User getUserByUserName(String userName) throws SQLException {
        User user;
            user = (User) sqlSessionTemplate.selectOne("getUserByUserName", userName);
        return user;
    }

    public User getUserByUserNameUser(User user) throws SQLException {
            user = (User) sqlSessionTemplate.selectOne("getUserByUserNameUser", user);
        return user;
    }

    public void updateUser(User user) throws SQLException {
        sqlSessionTemplate.update("updateUser", user);
    }

    //set user flag = 'N'
    public void deleteUser(User user) throws SQLException {
        sqlSessionTemplate.update("deleteUser", user);
    }
}
