package project.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 11, 2012
 * Time: 10:53:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class TransactionCommon {

    private static ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-config.xml");

    public static ApplicationContext getContext() {
        return context;
    }

    public static void setContext(ApplicationContext context) {
        TransactionCommon.context = context;
    }
}
