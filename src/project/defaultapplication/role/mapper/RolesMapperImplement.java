package project.defaultapplication.role.mapper;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.defaultapplication.role.mapper.RolesMapper;
import project.defaultapplication.role.model.Roles;
import project.defaultapplication.user.model.User;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 12, 2012
 * Time: 9:49:24 PM
 * To change this template use File | Settings | File Templates.
 */
@Service("rolesMapper")
@Transactional
public class RolesMapperImplement extends SqlMapClientDaoSupport implements RolesMapper{
    @Override
    public void insertRole(Roles roles) throws SQLException {
        //insert role
        getSqlMapClientTemplate().insert("insertRoles", roles);
    }

    @Override
    public void updateRole(Roles roles) throws SQLException {
        //update role
        getSqlMapClientTemplate().update("updateRoles", roles);
    }

    @Override
    public void deteleRole(Roles roles) throws SQLException {
        getSqlMapClientTemplate().update("deleteRoles", roles);
    }

    @Override
    public Collection<Roles> getAllRoles() throws SQLException {
        return getSqlMapClientTemplate().queryForList("getAllRoles");
    }

    @Override
    public Collection<Roles> getListRolesByUserId(String userId) throws SQLException {
        return getSqlMapClientTemplate().queryForList("getListRolesByUserId", userId);
    }

    @Override
    public Collection<Roles> getListUserRolesByObjectUser(User user) throws SQLException {
        return getSqlMapClientTemplate().queryForList("getListUserRolesByObjectUser", user);
    }

    @Override
    public Collection<Roles> getListRolesByListUser(Collection<User> listUser) throws SQLException {
        return getSqlMapClientTemplate().queryForList("getListRolesByListUser", listUser);
    }

    @Override
    public Roles getRoleById(int id) throws SQLException {
        return (Roles) getSqlMapClientTemplate().queryForObject("getRoleById", id);
    }

    @Override
    public Collection<Roles> getSearchRoles(Map mapCriteria) throws SQLException {
        return getSqlMapClientTemplate().queryForList("getSearchRoles", mapCriteria);
    }

    @Override
    public int getCountRolesByName(String roleName) throws SQLException {
        return (Integer) getSqlMapClientTemplate().queryForObject("getCountRolesByName", roleName);
    }
}
