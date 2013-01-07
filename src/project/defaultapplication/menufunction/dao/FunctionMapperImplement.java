package project.defaultapplication.menufunction.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.defaultapplication.menufunction.dao.FunctionMapper;
import project.defaultapplication.menufunction.model.Function;

import java.sql.SQLException;
import java.util.List;
import java.util.Collection;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 5, 2012
 * Time: 1:53:25 PM
 * To change this template use File | Settings | File Templates.
 */

public class FunctionMapperImplement extends SqlMapClientDaoSupport implements FunctionMapper {
    @Override
    public void insertFuction(Function function) throws SQLException {
        getSqlMapClientTemplate().insert("insertFunction", function);
    }

    @Override
    public void insertFuction(List<Function> listFunction) throws SQLException {
        for(Function function :listFunction){
            getSqlMapClientTemplate().insert("insertFunction", function);
        }
    }

    @Override
    public void updateFuction(Function function) throws SQLException {
        getSqlMapClientTemplate().update("updateFunction");
    }

    @Override
    public void deleteFuction(String funcId) throws SQLException {
        //set N function
        getSqlMapClientTemplate().update("deleteFunctionById",funcId);
    }

    @Override
    public void deleteFuction(Function function) throws SQLException {
        //set N function
        getSqlMapClientTemplate().update("deleteFunctionByObject", function);
    }

    @Override
    public Collection getSearchFunction(Map criteria) throws SQLException {
        return getSqlMapClientTemplate().queryForList("getSearchFunction", criteria);
    }

    @Override
    public Function getSearchFunctionById(String funcId) throws SQLException {
        return (Function) getSqlMapClientTemplate().queryForList("getFunctionById", funcId);
    }

    @Override
    public Collection<Function> getAllFunction() throws SQLException {
        return getSqlMapClientTemplate().queryForList("getAllFunction");
    }

    @Override
    public String getParentLevel(String parentId) throws SQLException {
        return (String) getSqlMapClientTemplate().queryForObject("getParentLevelFunction", parentId);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Function> getMenuByRoleId(List listOfRoleId) throws SQLException {
        return getSqlMapClientTemplate().queryForList("getMenuByRoleId", listOfRoleId);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getCountMenuByName(Function function) throws SQLException {
        return (Integer) getSqlMapClientTemplate().queryForObject("getCountMenuByName",function);
    }

    @Override
    public List<Function> getMenuByRoleIdMap(Map paramMap) throws SQLException {
        return getSqlMapClientTemplate().queryForList("getMenuByRoleIdMap", paramMap);
    }

    @Override
    public int getCountFunctionId(Map criteria) throws SQLException {
        return (Integer) getSqlMapClientTemplate().queryForObject("getCountFunctionId",criteria);
    }

    @Override
    public int getCountChildFunction(Map criteria) throws SQLException {
        return (Integer) getSqlMapClientTemplate().queryForObject("getCountChildFunction",criteria);   //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getCountMenuId(Map criteria) throws SQLException {
        return (Integer) getSqlMapClientTemplate().queryForObject("getCountMenuId",criteria);
    }

    @Override
    public int getCountFunctionURL(Map criteria) throws SQLException {
        return (Integer) getSqlMapClientTemplate().queryForObject("getCountFunctionURL",criteria);
    }

    @Override
    public String getPrinterNamebyFunctionsURL(Map crit) throws SQLException {
        return (String) getSqlMapClientTemplate().queryForObject("getPrinterNamebyFunctionsURL", crit);
    }
}
