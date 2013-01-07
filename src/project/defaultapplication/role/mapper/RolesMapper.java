package project.defaultapplication.role.mapper;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.Collection;
import java.util.Map;
import java.sql.SQLException;

import project.defaultapplication.role.model.Roles;
import project.defaultapplication.user.model.User;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 12, 2012
 * Time: 8:12:57 PM
 * To change this template use File | Settings | File Templates.
 */
public interface RolesMapper{

    //CRUD Roles
    public void insertRole(Roles roles) throws SQLException;
    public void updateRole(Roles roles) throws SQLException;
    public void deteleRole(Roles roles) throws SQLException;

    public Collection<Roles> getAllRoles() throws SQLException;
    public Collection<Roles> getListRolesByUserId(String userId) throws SQLException;
    public Collection<Roles> getListUserRolesByObjectUser(User user) throws SQLException;

    /**
     * METHOD INI TIDAK DIGUNAKAN KARENA TIDAK MUNGKIN ADA LEBIH DARI 1 USER MENGAMBIL ROLE. YANG ADA, SETIAP USER MENGAMBIL ROLE
     * @param listUser
     * @return
     * @throws SQLException
     */
    public Collection<Roles> getListRolesByListUser(Collection<User> listUser) throws SQLException;

    public Roles getRoleById(int id) throws SQLException;
    public Collection<Roles> getSearchRoles(Map mapCriteria) throws SQLException;
    //if result value 1, it means role is exist
    public int getCountRolesByName(String roleName) throws SQLException;


}
