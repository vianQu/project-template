package project.common;

import org.apache.struts2.ServletActionContext;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpSession;

import project.defaultapplication.user.model.User;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 13, 2012
 * Time: 10:26:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class ProjectUtil {
    public static transient Logger logger = Logger.getLogger(ProjectUtil.class);
    /**
     * used to get username from session
     *
     * @return
     */
    public static String getUserNameFromSession() {

        logger.info("begin execute method getUserNameFromSession ");

        String userName="";
        HttpSession session = ServletActionContext.getRequest().getSession();
        if (session.getAttribute("USER_SESSION")!=null) {
            User userLogin=(User)session.getAttribute("USER_SESSION");
            userName=userLogin.getUserName();
        }

        logger.info("end execute method getUserNameFromSession ");

        return userName;
    }

    /**
     * used to get cabang id from session
     *
     * @return
     */
    public static String getLokasiIdFromSession() {

        logger.info("begin execute method getCabangIdFromSession ");

        String cabangId="";
        HttpSession session = ServletActionContext.getRequest().getSession();
        if (session.getAttribute("USER_SESSION")!=null) {
            User userLogin=(User)session.getAttribute("USER_SESSION");
            cabangId=userLogin.getLokasiId();
        }

        logger.info("end execute method getCabangIdFromSession ");

        return cabangId;
    }

    /**
     * used to get workstation name from session (worktstation same as cabang_name)
     *
     * @return
     */
    public static String getWorkStationFromSession() {

        logger.info("begin execute method getWorkStationFromSession ");

        String cabangName="";
        HttpSession session = ServletActionContext.getRequest().getSession();
        if (session.getAttribute("USER_SESSION")!=null) {
            User userLogin=(User)session.getAttribute("USER_SESSION");
            cabangName=userLogin.getCabangName();
        }

        logger.info("end execute method getWorkStationFromSession ");

        return cabangName;
    }

    /**
     * used to get userId from session
     *
     * @return
     */
    public static String getUserIdFromSession() {

        logger.info("begin execute method getUserIdFromSession ");

        String userId="";
        HttpSession session = ServletActionContext.getRequest().getSession();
        if (session.getAttribute("USER_SESSION")!=null) {
            User userLogin=(User)session.getAttribute("USER_SESSION");
            userId=String.valueOf(userLogin.getUserId());
        }

        logger.info("end execute method getUserIdFromSession ");

        return userId;
    }



    /**
     * used to get userId from session
     *
     * @return
     */
    public static int getUserIdFromSessionReturnInt() {

        logger.info("begin execute method getUserIdFromSession ");

        int userId=0;
        HttpSession session = ServletActionContext.getRequest().getSession();
        if (session.getAttribute("USER_SESSION")!=null) {
            User userLogin=(User)session.getAttribute("USER_SESSION");
            userId=userLogin.getUserId();
        }

        logger.info("end execute method getUserIdFromSession ");

        return userId;
    }
}
