package project.defaultapplication.user.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.ibatis.mapping.SqlMapperException;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import project.common.ProjectUtil;
import project.defaultapplication.user.Service.UserService;
import project.defaultapplication.user.dao.UserMapper;
import project.defaultapplication.user.model.User;
import project.defaultapplication.role.model.Roles;
import project.defaultapplication.role.mapper.RolesMapper;
import project.common.TransactionCommon;

import javax.servlet.http.HttpSession;
import java.util.*;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 4, 2012
 * Time: 1:54:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserAction extends ActionSupport{
    protected static transient Logger log = Logger.getLogger(UserAction.class);

//    private ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-config.xml");

    @Autowired
    private UserService userService;// = (UserMapper) TransactionCommon.getContext().getBean("userMapper");
    //@Autowired
    private RolesMapper rolesMapper;// = (RolesMapper) TransactionCommon.getContext().getBean("rolesMapper");
    private User user;
    private List<User> userAll;
    private String userName;
    private String userPassword;
    private String errorMessage;
    private int validUserCount=0;
    private boolean validUser=false;

    public String doNothing(){

        return SUCCESS;
    }

    //method ini untuk mengecek apakah masih ada session atau tidak
    public String authorizeLogin(){

        HttpSession session = ServletActionContext.getRequest().getSession();

        //GET SESSION IF USER IS EXIST
        if (session.getAttribute("USER_SESSION") == null) {
            return "input";
        } else {
            return doLogin();
        }

    }

    public String doLogin(){
        log.info("[begin] execute method doLogin");

        HttpSession session = ServletActionContext.getRequest().getSession();

        //GET SESSION IF USER IS EXIST
        if (session.getAttribute("USER_SESSION") == null) {
            user = new User();
            user.setUserName(this.getUserName());
            user.setPassword(this.getUserPassword());
        } else {
            user = (User) session.getAttribute("USER_SESSION");
        }


        //login user proccess
        if ((user.getUserName() != null || user.getUserName() != "") && (user.getPassword() != null || user.getPassword() != "")) {

            try {
//                validUserCount = userMapper.authorizeLogin(user);
                validUserCount = userService.authorizeLogin(user);
            } catch (Exception e) {
                log.info("[error] try to validation user from database cause:" + e.toString());
                log.error("Gagal dalam validasi Data User Pada Database, harap hubungi admin aplikasi karena kesalah : " + e.toString());
                setErrorMessage("Gagal dalam validasi Data User Pada Database, harap hubungi admin aplikasi karena kesalah : " + e.toString());
                return ERROR;
            }


            if (validUserCount == 1) {
                validUser = true;
            } else if (validUserCount > 1) {
                //there is more then 1 user in databases
                validUser = false;
            } else {
                validUser = false;
            }

            //authorization login user
            if (validUser) {

                //get user properties to table
                try {
                    user = userService.getUserByUserNameUser(user);
//                    user = userMapper.getUserByUserNameUser(user);
                } catch (Exception e) {
                    log.info("[error] try to get user from database cause:" + e.toString());
                    log.error("Gagal dalam mengambil Data User Pada Database, harap hubungi admin aplikasi karena kesalah : " + e.toString());
                    setErrorMessage("Gagal dalam mengambil Data User Pada Database, harap hubungi admin aplikasi karena kesalah : " + e.toString());
                    return ERROR;
                }
                //try to get user roles from table m_user_roles
                Collection<Roles> listOfRoles;
                try {
                    listOfRoles = rolesMapper.getListUserRolesByObjectUser(user);
                } catch (SQLException e) {
                    log.info("[error] gagal mengambil roles by user karena :" + e.toString());
                    setErrorMessage("[error] gagal mengambil roles by user karena :" + e.toString());
                    return ERROR;
                }

                if (listOfRoles != null && !listOfRoles.isEmpty()) {
                    //add roles id to listRoleUser from user roles
                    List listRoleUser = new ArrayList(listOfRoles.size());

                    //
                    for (Roles role : listOfRoles) {
                        listRoleUser.add(role.getRoleId());
                    }

                    //set list roles_id to user login
                    user.setListOfRoles(listRoleUser);


                } else {
                    log.error("[error] login cause roles user is empty ");
                    addActionError("Login fail, user information not found.");
                    return ERROR;
                }

            } else {
                addFieldError("userName", "User Name Tidak Ditemukan");
                addFieldError("userPassword", "Password Salah");
                addActionError("User Name atau Password salah, silahkan ulangi!");
                setErrorMessage("User Name atau Password salah, silahkan ulangi!");
                //user or password is invalid, please try again
                return ERROR;
            }

        } else {
            addFieldError("userName", "User Name Tidak Ditemukan");
            addFieldError("userPassword", "Password Salah");
            addActionError("User Name atau Password salah, silahkan ulangi!");
            setErrorMessage("User Name atau Password salah, silahkan ulangi!");
            //user or password is invalid, please try again
            return ERROR;
        }


        if (session.getAttribute("USER_SESSION") != null) {
            session.setAttribute("USER_SESSION", user);
        } else {
            session.removeAttribute("USER_SESSION");
            session.setAttribute("USER_SESSION", user);
        }

        // save activity login


        log.info("[end] execute method doLogin");
        return SUCCESS;
    }

    public String doLogout(){
        log.info("[begin] execute method authorizeLogout ");

        HttpSession session = ServletActionContext.getRequest().getSession();

        if(session.getAttribute("USER_SESSION")!=null){
             //add activity log logout

            //remove atribut session
            session.removeAttribute("USER_SESSION");
        }

        //remove all session
        List listNameOfSession=new ArrayList();
        for (Enumeration e=session.getAttributeNames();e.hasMoreElements();) {
            listNameOfSession.add(e.nextElement());
        }

        for(Iterator i=listNameOfSession.iterator();i.hasNext();) {
            session.removeAttribute((String)i.next());
        }

        clearActionErrors();
        clearFieldErrors();
        clearFieldErrors();
        clearErrorsAndMessages();
        log.info("[end] execute method authorizLogout ");

        return SUCCESS;
    }

    public boolean isUserExist(User user){
        boolean isUserExist=true;

//        try{
////            isUserExist = userMapper.isUserExistModel(user);
//        } catch (SQLException e){
//            isUserExist=false;
//        }

        return isUserExist;
    }



    public String searchUser(){

        user.setCreatedBy(ProjectUtil.getUserNameFromSession());
        user.setLokasiId(ProjectUtil.getLokasiIdFromSession());
        user.setWorkStation(ProjectUtil.getWorkStationFromSession());
        //bisinis logic search user
        return SUCCESS;
    }

    public String doAddUser(){

        user.setCreatedBy(ProjectUtil.getUserNameFromSession());
        user.setLokasiId(ProjectUtil.getLokasiIdFromSession());
        user.setWorkStation(ProjectUtil.getWorkStationFromSession());

        if(!user.getPassword().equals(user.getUserPasswordConfirm())){
            addActionError("User Password harus sama dengan password confirmasi!");
            return ERROR;
        }

//        if (!isUserExist(user)) {
            try {
                userService.saveUser(user);
//                userMapper.saveUser(user);
            } catch (SQLException e) {
                addActionError("Error add user cause :" + e.toString());
                log.info("Error add user cause :" + e.toString());
                return ERROR;
            }
            addActionMessage("Add User Successfully!");
//        } else {
//            addActionError("User is exist please enter another user name!");
//            return ERROR;
//        }
        System.out.println(user.getUserId());
        return SUCCESS;
    }

    public String doInitUser(){
        try {
            userService.saveUser(user);
//            userMapper.saveUser(user);
        } catch (SQLException e) {
            addActionError("Error add user cause :" + e.toString());
            log.info("Error add user cause :" + e.toString());
            return ERROR;
        }
        addActionMessage("Add User Successfuly!");
        return SUCCESS;
    }

    public String doUpdateUser(){
        try {
//            userMapper.updateUser(user);
            userService.updateUser(user);
        } catch (SQLException e) {
            addActionError("Error update user cause :" + e.toString());
            log.info("Error update user cause :" + e.toString());
            return ERROR;
        }
        addActionMessage("User updated Successfuly!");
        return SUCCESS;
    }

    public String doDelete(){
        try {
//            userMapper.deleteUser(user);
            userService.deleteUser(user);
        } catch (SQLException e) {
            addActionError("Error delete user cause :" + e.toString());
            log.info("Error add delete cause :" + e.toString());
            return ERROR;
        }
        addActionMessage("User Deleted Successfuly!");
        return SUCCESS;
    }

//    public UserMapper getUserMapper() {
//        return userMapper;
//    }
//
//    public void setUserMapper(UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }

    public RolesMapper getRolesMapper() {
        return rolesMapper;
    }

    public void setRolesMapper(RolesMapper rolesMapper) {
        this.rolesMapper = rolesMapper;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUserAll() {
        return userAll;
    }

    public void setUserAll(List<User> userAll) {
        this.userAll = userAll;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getValidUserCount() {
        return validUserCount;
    }

    public void setValidUserCount(int validUserCount) {
        this.validUserCount = validUserCount;
    }

    public boolean isValidUser() {
        return validUser;
    }

    public void setValidUser(boolean validUser) {
        this.validUser = validUser;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
