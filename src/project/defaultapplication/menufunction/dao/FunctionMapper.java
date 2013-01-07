package project.defaultapplication.menufunction.dao;

import project.defaultapplication.menufunction.model.Function;

import java.sql.SQLException;
import java.util.List;
import java.util.Collection;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 5, 2012
 * Time: 1:52:52 PM
 * To change this template use File | Settings | File Templates.
 */
public interface FunctionMapper {

    public void insertFuction(Function function)throws SQLException;
    public void insertFuction(List<Function> listFunction)throws SQLException;
    public void updateFuction(Function function)throws SQLException;
    public void deleteFuction(String funcId)throws SQLException;
    public void deleteFuction(Function function)throws SQLException;

    public Collection getSearchFunction(Map criteria) throws SQLException;
    public Function getSearchFunctionById(String funcId) throws SQLException;
    public Collection<Function> getAllFunction() throws SQLException;
    public String getParentLevel(String parentId) throws SQLException;

    //digunain untuk retrieve menu
    public List<Function> getMenuByRoleId(List listOfRoleId) throws SQLException;
    public List<Function> getMenuByRoleIdMap(Map paramMap) throws SQLException;

    //count
    public int getCountFunctionId(Map criteria) throws SQLException;
    public int getCountChildFunction(Map criteria) throws SQLException;
    public int getCountMenuByName(Function function) throws SQLException;
    public int getCountMenuId(Map criteria) throws SQLException;
    public int getCountFunctionURL(Map criteria) throws SQLException;

    //for printer
    public String getPrinterNamebyFunctionsURL(Map crit) throws SQLException;
}
