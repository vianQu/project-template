package project.defaultapplication.user.dao;

import project.defaultapplication.user.model.UserRoles;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 15, 2012
 * Time: 12:31:04 AM
 * To change this template use File | Settings | File Templates.
 */
public interface UserRolesMapper {
    public void insertUserRoles(UserRoles userRoles) throws SQLException;
    public void deleteUserRoles(UserRoles userRoles) throws SQLException;
    public Collection<UserRoles> getUserRolesByUserId(UserRoles userRoles) throws SQLException;
}
