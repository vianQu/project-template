package project.master.mapper;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import project.master.mapper.UserReferenceMapper;
import project.master.model.UserReference;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 15, 2012
 * Time: 7:27:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserReferenceImplement extends SqlMapClientDaoSupport implements UserReferenceMapper {

    @Override
    public void insertUserReference(UserReference userReference) throws SQLException {
        getSqlMapClientTemplate().insert("insertUserReference",userReference);
    }

    @Override
    public void updateUserReference(UserReference userReference) throws SQLException {
        getSqlMapClientTemplate().update("updateUserReference",userReference);
    }

    @Override
    public void deleteUserReference(UserReference userReference) throws SQLException {
        //flaging record to 'N'
        getSqlMapClientTemplate().update("DeleteUserReference",userReference);
    }

    @Override
    public Collection<UserReference> getAllUserReference() throws SQLException {
        return getSqlMapClientTemplate().queryForList("getAllUserReference");
    }

    @Override
    public Collection<UserReference> getAllUserReferenceByGroup(String groupName) throws SQLException {
        return getSqlMapClientTemplate().queryForList("getAllUserReferenceByGroup", groupName);
    }

    @Override
    public UserReference getUserReferenceByObject(UserReference userReference) throws SQLException {
        return (UserReference) getSqlMapClientTemplate().queryForObject("getUserReferenceByObject", userReference);
    }

    @Override
    public UserReference getUserReferenceById(String idUserReference) throws SQLException {
        return (UserReference) getSqlMapClientTemplate().queryForObject("getUserReferenceById", idUserReference);
    }

    @Override
    public int getCountUserReferenceByObject(UserReference userReference) throws SQLException {
        return (Integer) getSqlMapClientTemplate().queryForObject("getCountUserReferenceByObject", userReference);
    }
}
