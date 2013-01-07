<%--
  Created by IntelliJ IDEA.
  User: VIAN QU
  Date: Nov 4, 2012
  Time: 1:58:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head><title>Simple jsp page</title></head>
  <body>
     <s:form action="user_doManythings" namespace="/user">
         <s:submit value="testDebug"/>
     </s:form>
  </body>
</html>