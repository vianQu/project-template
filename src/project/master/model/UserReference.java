package project.master.model;

import project.common.displaytag.DisplayObject;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 15, 2012
 * Time: 7:21:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserReference implements Serializable{
    private String userRefId;
    private String group;
    private String detailData;
    private String userName;
    private String workStation;
    private String lokasiId;
    private DisplayObject objDisEdit;
    private DisplayObject objDisDelete;
    private DisplayObject objDisView;

    public String getUserRefId() {
        return userRefId;
    }

    public void setUserRefId(String userRefId) {
        this.userRefId = userRefId;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDetailData() {
        return detailData;
    }

    public void setDetailData(String detailData) {
        this.detailData = detailData;
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

    public DisplayObject getObjDisEdit() {
        return objDisEdit;
    }

    public void setObjDisEdit(DisplayObject objDisEdit) {
        this.objDisEdit = objDisEdit;
    }

    public DisplayObject getObjDisDelete() {
        return objDisDelete;
    }

    public void setObjDisDelete(DisplayObject objDisDelete) {
        this.objDisDelete = objDisDelete;
    }

    public DisplayObject getObjDisView() {
        return objDisView;
    }

    public void setObjDisView(DisplayObject objDisView) {
        this.objDisView = objDisView;
    }
}
