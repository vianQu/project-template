a<%--
  Created by IntelliJ IDEA.
  User: VIAN QU
  Date: Nov 5, 2012
  Time: 11:23:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
      <title>Function main</title>
      <%--CSS initiation--%>
      

      <%--DWR initiation--%>
      <script type='text/javascript' src='${pageContext.request.contextPath}/dwr/engine.js'></script>
      <script type='text/javascript' src='${pageContext.request.contextPath}/dwr/util.js'></script>
      <script type='text/javascript' src='${pageContext.request.contextPath}/dwr/interface/FunctionsAction.js'></script>

      <script type="text/javascript">
          function dwrTestDrive(){
             dwr.engine.setAsync(true);
              FunctionsAction.getUserFunctionAndMenu(function(data){

              });
          }
      </script>
  </head>
  <body>

     <s:form action="functions_getUserFunctionAndMenu" namespace="/function">
         <%--<s:textfield id="nama" name="textField" onblur="dwrTestDrive()"/>--%>
         <s:submit value="test get list"/>
     </s:form>
  </body>
</html>