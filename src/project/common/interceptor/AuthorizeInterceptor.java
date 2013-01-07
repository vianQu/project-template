package project.common.interceptor;

import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ValidationAware;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 4, 2012
 * Time: 1:49:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class AuthorizeInterceptor extends AbstractInterceptor {

	private static final String USER_KEY = "USER_SESSION";


    public String intercept(ActionInvocation invocation) throws Exception {
//        System.out.print("masuk intercept()");
        Map session = invocation.getInvocationContext().getSession();

        if (session.get(USER_KEY) == null) {
            addActionError(invocation, "You must be authenticated to access this page");
            return Action.LOGIN;
        }

//        System.out.print("invoke intercept()");
        return invocation.invoke();
    }

	private void addActionError(ActionInvocation invocation, String message) {
//        System.out.print("masuk addActionError");
		Object action = invocation.getAction();
		if(action instanceof ValidationAware) {
			((ValidationAware) action).addActionError(message);
		}
	}

}
