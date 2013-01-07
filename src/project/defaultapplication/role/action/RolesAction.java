package project.defaultapplication.role.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import project.common.TransactionCommon;
import project.common.ProjectUtil;
import project.defaultapplication.role.mapper.RolesMapper;
import project.defaultapplication.role.model.Roles;

import java.util.Collection;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 12, 2012
 * Time: 11:02:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class RolesAction extends ActionSupport{
    //inisiasi LOGGER
    public static transient Logger logger = Logger.getLogger(RolesAction.class);
    //inisiasi mapper menggunakan common project
    @Autowired private RolesMapper rolesMapper;// = (RolesMapper) TransactionCommon.getContext().getBean("rolesMapper");
    //inisiasi object model
    private Roles roles;
    
    //properties untuk alert di JSP
    private String roleId;
    private String message;
    private String errorMessage;
    private String closeWindowsFlag;


    //buat method-method CRUDnya disini
    public String searchRoles(){
        logger.info("[begin] execute method searchModuleName");
        logger.info("[end] execute method searchModuleName");
        return SUCCESS;
    }

    public String saveRoles(){
        logger.info("[begin] execute method saveModuleName");

        //object role get from JSP page
        Roles  objInsertRole = getRoles();

        objInsertRole.setUpdateBy(ProjectUtil.getUserNameFromSession());
        objInsertRole.setCreatedBy(ProjectUtil.getUserNameFromSession());
        objInsertRole.setWorkStation(ProjectUtil.getWorkStationFromSession());
        objInsertRole.setLokasiId(ProjectUtil.getLokasiIdFromSession());

        try {
            rolesMapper.insertRole(objInsertRole);
        }catch (SQLException e){
            logger.info("[error] terjadi kesalah pada saat exekusi query insert, hubungi admin. error karena :"+e.toString());
            addActionError("[error] terjadi kesalah pada saat exekusi query insert, hubungi admin. error karena :"+e.toString());
            return ERROR;
        }

        //set windows close flag = 1. ini digunakan di java script
        setCloseWindowsFlag("1");
        setMessage("Role Berhasil Ditambahkan!");

        logger.info("[end] execute method saveModuleName");
        return SUCCESS;
    }


    public String updateRoles(){
        logger.info("[begin] execute method updateModuleName");
        Roles objRoleUpdate = getRoles();

        try{
           rolesMapper.updateRole(objRoleUpdate);
        } catch (SQLException e){
            logger.info("[error] melakukan perubahan Role karena :"+e.toString());
            addActionError("[error] melakukan perubahan Role karena :"+e.toString());
            return ERROR;
        }

        addActionMessage("Perubahan Role Berhasil...");
        setCloseWindowsFlag("1");
        logger.info("[end] execute method updateModuleName");
        return SUCCESS;
    }      

    public String deleteRoles(){
        logger.info("[begin] execute method deleteModuleName");
        Roles objRoleDelete = getRoles();

        try{
           rolesMapper.deteleRole(objRoleDelete);
        } catch (SQLException e){
            logger.info("[error] melakukan perubahan Role karena :"+e.toString());
            addActionError("[error] melakukan perubahan Role karena :"+e.toString());
            return ERROR;
        }

        addActionMessage("Hapus Role Berhasil...");
        setCloseWindowsFlag("1");
        logger.info("[end] execute method deleteModuleName");
        return SUCCESS;
    }


    public String initRoles(){
        logger.info("[begin] execute method updateModuleName");

        int roleId = Integer.valueOf(getRoleId());

        try{
           rolesMapper.getRoleById(roleId);
        } catch (SQLException e){
            logger.info("[error] melakukan perubahan Role karena :"+e.toString());
            addActionError("[error] melakukan perubahan Role karena :"+e.toString());
            return ERROR;
        }

        addActionMessage("Role Berhasil di hapus");
        setCloseWindowsFlag("1");
        logger.info("[end] execute method updateModuleName");
        return SUCCESS;
    }
    //setter dan getter disini

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public RolesMapper getRolesMapper() {
        return rolesMapper;
    }

    public void setRolesMapper(RolesMapper rolesMapper) {
        this.rolesMapper = rolesMapper;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getCloseWindowsFlag() {
        return closeWindowsFlag;
    }

    public void setCloseWindowsFlag(String closeWindowsFlag) {
        this.closeWindowsFlag = closeWindowsFlag;
    }
}
