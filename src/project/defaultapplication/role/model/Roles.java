package project.defaultapplication.role.model;

import project.common.displaytag.DisplayObject;

import java.util.Date;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 12, 2012
 * Time: 8:03:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class Roles implements Serializable{
    private int roleId;
    private String roleName;
    private String flag;
    private String userName;
    private String workStation;
    private String lokasiId;
    private Date lastUpdate;
    private String updateBy;
    private Date createdDate;
    private String createdBy;
    private DisplayObject displayObjEdit;
    private DisplayObject displayObjDelete;

    @Override
    public String toString() {
        return "Roles{" +
                "roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", flag='" + flag + '\'' +
                ", userName='" + userName + '\'' +
                ", workStation='" + workStation + '\'' +
                ", lokasiId='" + lokasiId + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", updateBy='" + updateBy + '\'' +
                ", createdDate=" + createdDate +
                ", createdBy='" + createdBy + '\'' +
                ", displayObjEdit=" + displayObjEdit +
                ", displayObjDelete=" + displayObjDelete +
                '}';
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getWorkStation() {
        return workStation;
    }

    public void setWorkStation(String workStation) {
        this.workStation = workStation;
    }

    public String getLokasiId() {
        return lokasiId;
    }

    public void setLokasiId(String lokasiId) {
        this.lokasiId = lokasiId;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public DisplayObject getDisplayObjEdit() {
        return displayObjEdit;
    }

    public void setDisplayObjEdit(DisplayObject displayObjEdit) {
        this.displayObjEdit = displayObjEdit;
    }

    public DisplayObject getDisplayObjDelete() {
        return displayObjDelete;
    }

    public void setDisplayObjDelete(DisplayObject displayObjDelete) {
        this.displayObjDelete = displayObjDelete;
    }
}
