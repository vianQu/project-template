package project.defaultapplication.menufunction.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;
import org.directwebremoting.WebContextFactory;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import project.common.ProjectUtil;
import project.common.TransactionCommon;
import project.defaultapplication.menufunction.dao.FunctionMapper;
import project.defaultapplication.menufunction.model.Function;
import project.defaultapplication.user.model.User;

import javax.servlet.http.HttpSession;
import java.util.*;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 5, 2012
 * Time: 11:14:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class FunctionAction extends ActionSupport{
    protected static transient Logger log = Logger.getLogger(FunctionAction.class);
    @Autowired
    private FunctionMapper functionMapper;// = (FunctionMapper) TransactionCommon.getContext().getBean("functionMapper");
    private Function function;

    private StringBuilder sbMenu;
    private String id;

    private List listOfDropDownMenu = new ArrayList();

    public String doAddFunction(){
        log.info("[begin] execute function doAddFunction");

        //if menu checked set menu=id
        if(function.getMenuChecked().equalsIgnoreCase("checked")){

        }

        function.setCreatedBy(ProjectUtil.getUserNameFromSession());
        function.setLokasiId(ProjectUtil.getLokasiIdFromSession());
        function.setWorkStation(ProjectUtil.getWorkStationFromSession());

        try{
            functionMapper.insertFuction(function);
        } catch (SQLException e){
            addActionError("failed to insert Function Cause :"+e.toString());
            log.info("[error] execute function doAddFunction cause : " + e.toString());
            return ERROR;
        }

        addActionMessage("Function successfully insert!");
        return SUCCESS;
    }

    public String doInit(){
        log.info("[begin] execute method doInit ");

        //get function by id
        try {
           function = functionMapper.getSearchFunctionById(id);
        } catch (SQLException e) {
            addActionError("Failed to get Function cause :"+e.toString());
            log.info("[error] Failed to get Function cause :"+e.toString());
            return ERROR;
        }

        log.info("[end] execute method doInit ");
        return SUCCESS;
    }

    public String doEdit(){

        return SUCCESS;
    }

    public String doDelete(){

        return SUCCESS;
    }

    public Boolean isFunctionMenuExist(Function funct){
        boolean result=false;
        int countFunction=0;

        try{
            countFunction = functionMapper.getCountMenuByName(funct);
        } catch (SQLException e){
            result=true;
        }

        if(countFunction>0){
            result = true;
        }else{
            result = false;
        }

        return result;
    }

    public String getUserFunctionAndMenu(){
        log.info("[begin] getUserFunctionAndMenu to get user menu");
        List<Function> listOfMenu = new ArrayList();

        //bring error message if fail load menu on database
        String errorMessage;

        //get user session
//        boolean isUserLogin = false;
        HttpSession userSession = WebContextFactory.get().getSession();
        User userLogin=null;
        userLogin = (User) userSession.getAttribute("USER_SESSION");

        if (userLogin == null) {
            return "error";
        } else {
            List listOfRoleId = userLogin.getListOfRoles();

            try{
                listOfMenu = functionMapper.getMenuByRoleId(listOfRoleId);
            } catch (SQLException e) {
                log.info("Fail to Load Menus cause : "+e.toString());
                errorMessage = "Fail to Load Menus";
                listOfDropDownMenu.add(errorMessage);
                return sbMenu.toString();
            }

            if(!listOfMenu.isEmpty() || listOfMenu!=null){
                //get URL application
                String pathApp = WebContextFactory.get().getHttpServletRequest().getContextPath();

                //instance string builder to create menu items in html.
                sbMenu = new StringBuilder();
                sbMenu.append("<ul id=\"nav\" class=\"dropdown dropdown-horizontal\">");//add root node UL to menu
                //constract the menu
                for(Function func:listOfMenu){
                    if (!isMenuExist(func)) {
                        if (isMenuHasMenuItem(func, listOfMenu)) {
                            constructMenu(pathApp, func, listOfMenu);
                        }

                        else {
                            if (func.getUrl() != null) {
                                sbMenu.append("<li> <a href=\"" + pathApp + func.getUrl() + "\">" + func.getFunctName() + "</a></li>");
                            } else {
                                sbMenu.append("<li> <a href=\"#\">" + func.getFunctName() + "</a></li>");
                            }
                        }

                    }
                }

                sbMenu.append("</ul>");//add close tag root node UL to menu
                
            } else {
                log.error("[getMenuUser] list of menu is empty. ");
                errorMessage = "ERROR";
                listOfDropDownMenu.add(errorMessage);
                return sbMenu.toString();
            }
        }

        log.info("[end] getUserFunctionAndMenu to get user menu");
        return sbMenu.toString();
    }

    public void constructMenu(String pathApp, Function function, List<Function> listOfMenu){

        List<Function> listSubMenuPerParent= new ArrayList();
        Function itemMenu;
        if (listOfMenu.size() > 0) {
            for (int i = 0; i < listOfMenu.size(); i++) {
                itemMenu = (Function) listOfMenu.get(i);
                if (function.getFunctId() == itemMenu.getParent()) {
                    listSubMenuPerParent.add(itemMenu);
                }

            }
        }


            //constract the menu from list itemSubMenu
            if (listSubMenuPerParent.size() > 0) {
                sbMenu.append("<li> <span class=\"dir\" >");
                //jika dia memiliki URL
                if(function.getUrl() != null || function.getUrl() != "") {
                    sbMenu.append("<a href=\"" + pathApp + function.getUrl() + "\">" + function.getFunctName() + "</a> </span> <ul>");
                    listOfDropDownMenu.add(function);
                } else {
                    sbMenu.append(function.getFunctName() + "<ul>");
                    listOfDropDownMenu.add(function);
                }

                //looping sub menu dan cek apakah sub menu punya subMenu lg?
                Function itemSubMenu = null;
                for (int i = 0; i < listSubMenuPerParent.size(); i++) {
                    itemSubMenu = (Function) listSubMenuPerParent.get(i);
                    if (isMenuHasMenuItem(itemSubMenu, listOfMenu)) {
                        if (!isMenuExist(itemSubMenu)) {
                            constructMenu(pathApp, itemSubMenu, listOfMenu);
                        }
                    }
                    else {
                        if (itemSubMenu.getUrl().isEmpty() || itemSubMenu.getUrl() == null) {
                            sbMenu.append("<li> <a href=\"#\">" + itemSubMenu.getFunctName() + "</a></li>");
                            listOfDropDownMenu.add(itemSubMenu);
                        } else {
                            sbMenu.append("<li> <a href=\"" +pathApp+ itemSubMenu.getUrl() + "\">" + itemSubMenu.getFunctName() + "</a></li>");
                            listOfDropDownMenu.add(itemSubMenu);
                        }
                    }
                }

                sbMenu.append("</ul>");
                sbMenu.append("</li>");
            }
    }

    private boolean isMenuExist(Function function){
        boolean isMenuExist=false;
        boolean hasMenu=false;
        Function item;

        for(int i=0; i<listOfDropDownMenu.size() && !hasMenu;i++){
            item = (Function) listOfDropDownMenu.get(i);
            if(function.getFunctId()==item.getFunctId()){
                isMenuExist=true;
                hasMenu=true;
            }
        }

        return isMenuExist;
    }

    /**
     * cek apakan sebuah menu memiliki sub menu jadi, function yang di pilih di lihat di list menu
     * @param function
     * @param listMenu
     * @return
     */
    private boolean isMenuHasMenuItem(Function function,List listMenu){
        boolean isHasSubMenu=false;
        Function itemMenu;

        for(int i = 0;i<listMenu.size() && !isHasSubMenu; i++){
            itemMenu = (Function) listMenu.get(i);
            if(function.getFunctId()== itemMenu.getParent()){
               isHasSubMenu=true;
            }

        }
        return isHasSubMenu;
    }

    public String getBulletUserMenu(){

        

        return null;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List getListOfDropDownMenu() {
        return listOfDropDownMenu;
    }

    public void setListOfDropDownMenu(List listOfDropDownMenu) {
        this.listOfDropDownMenu = listOfDropDownMenu;
    }
}
