package project.defaultapplication.user.dao;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.defaultapplication.user.dao.UserRolesMapper;
import project.defaultapplication.user.model.UserRoles;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 15, 2012
 * Time: 12:35:48 AM
 * To change this template use File | Settings | File Templates.
 */
@Service("userRolesMapper")
@Transactional
public class UserRolesMapperImplement extends SqlMapClientDaoSupport implements UserRolesMapper {

    @Override
    public void deleteUserRoles(UserRoles userRoles) throws SQLException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void insertUserRoles(UserRoles userRoles) throws SQLException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Collection<UserRoles> getUserRolesByUserId(UserRoles userRoles) throws SQLException {
        return getSqlMapClientTemplate().queryForList("getUserRolesByUserId", userRoles);
    }
}
