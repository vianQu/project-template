package project.defaultapplication.menufunction.model;

import project.common.displaytag.DisplayObject;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 5, 2012
 * Time: 1:42:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Function implements Serializable {
    private int functId;
    private String functName;
    private String parentName;
    private String menuParentId;
    private String url;
    private int menu;
    private String menuChecked;
    private int parent;
    private int roleId;
    private String roleName;
    private String printerId;
    private String printerName;
    private Date lastUpdate;
    private String lokasiId;
    private String workStation;
    private String flag;
    private String createdBy;
    private DisplayObject displayObjEdit;
    private DisplayObject displayObjDelete;

    @Override
    public String toString() {
        return "Function{" +
                "functId=" + functId +
                ", functName='" + functName + '\'' +
                ", parentName='" + parentName + '\'' +
                ", menuParentId='" + menuParentId + '\'' +
                ", url='" + url + '\'' +
                ", menu='" + menu + '\'' +
                ", parent='" + parent + '\'' +
                ", roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", printerId='" + printerId + '\'' +
                ", printerName='" + printerName + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", lokasiId='" + lokasiId + '\'' +
                ", workStation='" + workStation + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }

    public String getMenuChecked() {
        return menuChecked;
    }

    public void setMenuChecked(String menuChecked) {
        this.menuChecked = menuChecked;
    }

    public int getFunctId() {
        return functId;
    }

    public void setFunctId(int functId) {
        this.functId = functId;
    }

    public String getFunctName() {
        return functName;
    }

    public void setFunctName(String functName) {
        this.functName = functName;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getMenuParentId() {
        return menuParentId;
    }

    public void setMenuParentId(String menuParentId) {
        this.menuParentId = menuParentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getMenu() {
        return menu;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
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

    public String getPrinterId() {
        return printerId;
    }

    public void setPrinterId(String printerId) {
        this.printerId = printerId;
    }

    public String getPrinterName() {
        return printerName;
    }

    public void setPrinterName(String printerName) {
        this.printerName = printerName;
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

    public String getWorkStation() {
        return workStation;
    }

    public void setWorkStation(String workStation) {
        this.workStation = workStation;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
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
