package project.defaultapplication.user.model;

import project.common.displaytag.DisplayObject;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 4, 2012
 * Time: 11:51:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class User implements Serializable{

    private int userId;
    private String userName;
    private String password;
    private String userPasswordConfirm;
    private String userPasswordBaru;
    private String address;
    private String position;
    private String namaPosisi;
    private String divisi;
    private String namaDivisi;
    private String flag;
    private String workStation;
    private String strLastUpdate;
    private Date lastUpdate;
    private String lokasiId;
    private String updateBy;
    private Date createdDate;
    private String createdBy;
    private DisplayObject displayObjEdit;
    private DisplayObject displayObjDelete;
    private DisplayObject displayObjSelect;
    private int parentId;//untuk atasan tiap user
    private List listOfRoles;


    private String encryptedPassword;
    private String cabangName;
    private String roleId;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userPasswordConfirm='" + userPasswordConfirm + '\'' +
                ", userPasswordBaru='" + userPasswordBaru + '\'' +
                ", address='" + address + '\'' +
                ", position='" + position + '\'' +
                ", namaPosisi='" + namaPosisi + '\'' +
                ", divisi='" + divisi + '\'' +
                ", namaDivisi='" + namaDivisi + '\'' +
                ", flag='" + flag + '\'' +
                ", workStation='" + workStation + '\'' +
                ", strLastUpdate='" + strLastUpdate + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", lokasiId='" + lokasiId + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", createdDate=" + createdDate +
                ", createdBy='" + createdBy + '\'' +
                ", displayObjEdit=" + displayObjEdit +
                ", displayObjDelete=" + displayObjDelete +
                ", displayObjSelect=" + displayObjSelect +
                ", parentId='" + parentId + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserPasswordConfirm() {
        return userPasswordConfirm;
    }

    public void setUserPasswordConfirm(String userPasswordConfirm) {
        this.userPasswordConfirm = userPasswordConfirm;
    }

    public String getUserPasswordBaru() {
        return userPasswordBaru;
    }

    public void setUserPasswordBaru(String userPasswordBaru) {
        this.userPasswordBaru = userPasswordBaru;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNamaPosisi() {
        return namaPosisi;
    }

    public void setNamaPosisi(String namaPosisi) {
        this.namaPosisi = namaPosisi;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getWorkStation() {
        return workStation;
    }

    public void setWorkStation(String workStation) {
        this.workStation = workStation;
    }

    public String getStrLastUpdate() {
        return strLastUpdate;
    }

    public void setStrLastUpdate(String strLastUpdate) {
        this.strLastUpdate = strLastUpdate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getLokasiId() {
        return lokasiId;
    }

    public void setLokasiId(String lokasiId) {
        this.lokasiId = lokasiId;
    }

    public String getCabangName() {
        return cabangName;
    }

    public void setCabangName(String cabangName) {
        this.cabangName = cabangName;
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

    public DisplayObject getDisplayObjSelect() {
        return displayObjSelect;
    }

    public void setDisplayObjSelect(DisplayObject displayObjSelect) {
        this.displayObjSelect = displayObjSelect;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public List getListOfRoles() {
        return listOfRoles;
    }

    public void setListOfRoles(List listOfRoles) {
        this.listOfRoles = listOfRoles;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
