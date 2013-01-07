a<%--
  Created by IntelliJ IDEA.
  User: VIAN QU
  Date: Nov 5, 2012
  Time: 11:23:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head><title></title></head>
  <body>
  <s:form namespace="/function" action="addFunction">
      <s:textfield name="function.functName" label="Function Name "/>
      <s:label value="Make Menu" cssStyle="display: inline-block;"/> <s:checkbox name="function.menuChecked" value="checked" cssStyle="display: inline-block;"/>
      <s:textfield name="function.url" label="URL "/>
      <s:select list="#{'1':'tes','2':'tes2'}" name="function.menuParentId" label="Menu Parent "/>
      <s:select list="#{'1':'tes','2':'tes2'}" name="function.roleId" label="Role Function "/>
      <s:submit value="save"/>
  </s:form>
  </body>
</html>