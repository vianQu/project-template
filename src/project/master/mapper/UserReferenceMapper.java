package project.master.mapper;

import project.master.model.UserReference;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 15, 2012
 * Time: 7:21:10 AM
 * To change this template use File | Settings | File Templates.
 */
public interface UserReferenceMapper {

    public void insertUserReference(UserReference userReference) throws SQLException;
    public void updateUserReference(UserReference userReference) throws SQLException;
    public void deleteUserReference(UserReference userReference) throws SQLException;

    public Collection<UserReference> getAllUserReference()throws SQLException;
    public Collection<UserReference> getAllUserReferenceByGroup(String groupName)throws SQLException;
    public UserReference getUserReferenceByObject(UserReference userReference) throws SQLException;
    public UserReference getUserReferenceById(String idUserReference) throws SQLException;
    public int getCountUserReferenceByObject(UserReference userReference) throws SQLException;
}
