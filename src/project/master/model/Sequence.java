package project.master.model;

import project.common.displaytag.DisplayObject;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 15, 2012
 * Time: 7:37:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class Sequence implements Serializable{
    private String seqName;
    private String seqValue;
    private String userName;
    private String lokasiId;
    private DisplayObject objDisEdit;
    private DisplayObject objDisDelete;
    private DisplayObject objDisView;

    public String getSeqName() {
        return seqName;
    }

    public void setSeqName(String seqName) {
        this.seqName = seqName;
    }

    public String getSeqValue() {
        return seqValue;
    }

    public void setSeqValue(String seqValue) {
        this.seqValue = seqValue;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
