package project.defaultapplication.menufunction.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.directwebremoting.WebContextFactory;
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
public class FunctionActionbACKUP extends ActionSupport{
    protected static transient Logger log = Logger.getLogger(FunctionActionbACKUP.class);
    private FunctionMapper functionMapper;
    private Function function;

    Collection<Function> functionColl;
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config/spring-config.xml");

    public List getUserFunctionAndMenu(){
        log.info("[begin] getUserFunctionAndMenu to get user menu");
        //getMapper using Spring context
        functionMapper = (FunctionMapper) applicationContext.getBean("functionsMapper");

        List listOfDropDownMenu = new ArrayList();
        List<Function> listOfMenu = new ArrayList();

        //bring error message if fail load menu on database
        String errorMessage;

        //get user session
//        boolean isUserLogin = false;
        HttpSession userSession = WebContextFactory.get().getSession();
        User userLogin=null;
        userLogin = (User) userSession.getAttribute("USER_SESSION");

        if (userLogin == null) {
            errorMessage = "Fail to Load Menus";
            listOfDropDownMenu.add(errorMessage);
            return listOfDropDownMenu;
        } else {
            List listOfRoleId = userLogin.getListOfRoles();

            //Map hasMap = new HashMap();
            //hasMap.put("listOfRoleId",listOfRoleId);

            try{
//                listOfMenu = functionMapper.getMenuByRoleId(listOfRoleId);
                listOfMenu = functionMapper.getMenuByRoleId(listOfRoleId);
//                listOfMenu = functionMapper.getMenuByRoleIdMap(hasMap);
            } catch (SQLException e) {
                log.info("Fail to Load Menus cause : "+e.toString());
                errorMessage = "Fail to Load Menus";
                listOfDropDownMenu.add(errorMessage);
                return listOfDropDownMenu;
            }

            if(!listOfMenu.isEmpty() || listOfMenu!=null){
                //get URL application
                String pathApp = WebContextFactory.get().getHttpServletRequest().getContextPath();

                //constract the menu
                for(Function func:listOfMenu){
                    if(func.getParent()==0){
                        if(!isMenuHasMenuItem(func,listOfDropDownMenu)){
                            List itemMenu;
                            if (listOfDropDownMenu.isEmpty()) {
                                itemMenu=addToList(func.getFunctName(),func.getUrl()!= null ? pathApp + func.getUrl() : "",null,null,null,null,"0","0",null,null);
                                //itemMenu="[\"" +  func.getFunctName() + "\",\"\", , , , , \"0\", \"0\", , ]";
                            } else {
                                itemMenu=addToList(func.getFunctName(),func.getUrl()!= null ? pathApp + func.getUrl() : "",null,null,null,null,"0",null,null,null);
                                //itemMenu="[\"" +  func.getFunctName() + "\",\"\", , , , , \"0\", , , ]";
                            }
                            listOfDropDownMenu.add(itemMenu);

                            getDetailMenu(listOfMenu,listOfDropDownMenu,func.getMenu(),pathApp);
                        } else {
                            log.info("[getMenuUser] has more one same item menu." + func);
                        }
                    }
                }
            } else {
                log.error("[getMenuUser] list of menu is empty. ");
                errorMessage = "ERROR";
                listOfDropDownMenu.add(errorMessage);
                return listOfDropDownMenu;
            }
        }

        String menuUlLi;

        //format menu CSS
//        for(int i=0; i<listOfDropDownMenu.size();i++){

            if(!listOfDropDownMenu.get(0).toString().startsWith("|")){
               menuUlLi="<ul>"+
                       listOfDropDownMenu.get(0).toString()
                       +"</ul>";
//            }

        }

        log.info("[end] getUserFunctionAndMenu to get user menu");
        return listOfDropDownMenu;
    }

    /**
     * cek apakan sebuah menu memiliki sub menu jadi, function yang di pilih di lihat di list menu
     * @param function
     * @param listMenu
     * @return
     */
    private boolean isMenuHasMenuItem(Function function,List listMenu){
        boolean isHasSubMenu=false;
        List itemMenu;

        for(int i = 0;i<listMenu.size() && !isHasSubMenu; i++){
            itemMenu = (List) listMenu.get(i);
            if(((String)itemMenu.get(0)).startsWith("|") && ((String)itemMenu.get(1)).equalsIgnoreCase("")){
                if(((String)itemMenu.get(0)).equalsIgnoreCase(function.getFunctName())){
                    isHasSubMenu=true;
                }
            }

        }
        return isHasSubMenu;
    }

    /**
     * to add list menu based on format
     *
     * @param param1
     * @param param2
     * @param param3
     * @param param4
     * @param param5
     * @param param6
     * @param param7
     * @param param8
     * @param param9
     * @param param10
     * @return
     */
    private List addToList(String param1,
                           String param2,
                           String param3,
                           String param4,
                           String param5,
                           String param6,
                           String param7,
                           String param8,
                           String param9,
                           String param10) {

        List list=new ArrayList(10);
        list.add(param1);
        list.add(param2);
        list.add(param3);
        list.add(param4);
        list.add(param5);
        list.add(param6);
        list.add(param7);
        list.add(param8);
        list.add(param9);
        list.add(param10);

        return list;
    }

    private void getDetailMenu(List listOfMenuDB, List listdownMenuString, int menuId, String contextPath) {
        log.info("begin execute method getDetailMenu ");

        List parentUseThisId=getListRecord(listOfMenuDB,menuId);
        List sFormatMenu;
        Function func;
        for (int i=0;i<parentUseThisId.size();i++) {
            func=(Function)parentUseThisId.get(i);
            if (!isHasMenuURLInListDownMenu(func,listdownMenuString)) {
                getDetailMenu(listOfMenuDB, listdownMenuString, func.getMenu(), contextPath);
            } else {
                log.info("[getDetailMenu] has more one same item menu." + func);
            }

        }
        log.info("end execute method getDetailMenu ");
    }

    /**
     * METHOD MENGAMBIL SUBMENU YANG DIMILIKI OLEH PARENT MENU
     * @param listOfMenuDB
     * @param whereCluse
     * @return
     */
    private List getListRecord(List listOfMenuDB, int whereCluse) {
        List listRecord=new ArrayList();
        Function func;
        for (int i=0;i<listOfMenuDB.size();i++) {
            func=(Function)listOfMenuDB.get(i);
            if (func.getParent()!=0) {
                if (func.getParent()==whereCluse) {
                    listRecord.add(func);
                }
            }
        }

        return listRecord;
    }


    private boolean isHasMenuURLInListDownMenu(Function selectedFunc,List listdownMenu) {
        boolean flag=false;
        List itemMenu;
        for (int i=0;i<listdownMenu.size() && !flag; i++) {
            itemMenu=(List)listdownMenu.get(i);
            if (selectedFunc.getUrl()!=null && !selectedFunc.getUrl().equalsIgnoreCase("")) {
                if (((String)itemMenu.get(1)).equalsIgnoreCase(selectedFunc.getUrl())) {
                    flag=true;
                }
            }
        }
        return flag;
    }

    /**
     * TOO FORMAT MENU
     * @param contextPath
     * @param nameOfMenu
     * @param url
     * @param level
     * @return
     */
    private List formatMenu(String contextPath, String nameOfMenu, String url, String level) {
        //contoh :
        //["|||Jenis Biaya","/simpat-pelindo4/anggaranakuntansi/jenisbiaya/jenisBiaya_input.action", , , , , , , , ],
        //["||Master","", , , , , , , , ],

        log.info("begin execute method formatMenu ");

        List sFormatMenu;
        int iLevel=Integer.parseInt(level);
        String sPad=""; // penambahan tanda '|' sebagai level tree di menu
        for (int i=0;i<iLevel-1;i++) {
            sPad+="|";
        }

        if (url!=null && !url.equalsIgnoreCase("")) {
            sFormatMenu=addToList(sPad + nameOfMenu,contextPath + url,null,null,null,null,null,null,null,null);
            //sFormatMenu="[\"" + sPad + nameOfMenu + "\",\"/" + contextPath + url + "\", , , , , , , , ]";
        } else {
            sFormatMenu=addToList(sPad + nameOfMenu,"",null,null,null,null,null,null,null,null);
            //sFormatMenu="[\"" + sPad + nameOfMenu + "\",\"\", , , , , , , , ]";
        }

        log.info("end execute method formatMenu ");

        return sFormatMenu;
    }

    public String getFunction() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config/spring-config.xml");
        functionMapper = (FunctionMapper) applicationContext.getBean("functionsMapper");

        try {
             functionColl = functionMapper.getAllFunction();
        } catch (SQLException e){
            return ERROR;
        }

        for(Function data: functionColl){
            System.out.println(data);
        }

        return SUCCESS;
    }


    public String getBulletUserMenu(){



        return null;
    }


}