<%--
  Created by IntelliJ IDEA.
  User: VIAN QU
  Date: Nov 11, 2012
  Time: 11:33:52 AM
  Email: vian.qu@gmail.com | vian_qu@yahoo.com
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<html>
  <head>
  <title>Simple jsp page</title>
      <script type='text/javascript' src='${pageContext.request.contextPath}/dwr/engine.js'></script>
      <script type='text/javascript' src='${pageContext.request.contextPath}/dwr/util.js'></script>
      <%--<script type='text/javascript' src='${pageContext.request.contextPath}/media/js/bootstrap.min.js'></script>--%>
      <script type='text/javascript' src='${pageContext.request.contextPath}/media/js/jquery-1.8.2.js'></script>
      <script type='text/javascript' src='${pageContext.request.contextPath}/media/js/jquery-ui-1.9.1.custom.js'></script>

      <%--<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/media/css/bootstrap.min.css" media="screen"/>--%>
      <%--<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/media/css/bootstrap-responsive.min.css"/>--%>
      <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/media/css/smoothness/jquery-ui-1.9.1.custom.css"/>
      <sj:head jqueryui="true" jquerytheme="smoothness"/>



  </head>
  <sb:head/>
  <body>
  <div id="errorDiv" class="alert alert-error">
     <button type="button" class="close" data-dismiss="alert">×</button> <s:actionerror theme="bootstrap"/>
      <s:actionmessage theme="bootstrap"/>
      <s:fielderror theme="bootstrap"/>

  </div>
  <h1>Login Page</h1>

  <div id="loginForm" style="display:inline-block;" align="center">
      <%--<s:form id="login" namespace="/user" action="authorizeLogin" method="POST" theme="bootstrap" cssClass="form-search">--%>
      <%--<sj:textfield name="userName" size="12" tooltip="User Name" placeholder="User Name"/>--%>
      <%--<s:password name="userPassword" tooltip="Password" placeholder="Password"/>--%>
      <%--<sj:datepicker name="datePicker"--%>
      <%--id="datepicker"--%>
      <%--parentTheme="bootstrap"--%>
      <%--label="Datepicker"--%>
      <%--tooltip="Tooltip for Datepicker"--%>
      <%--/>--%>
      <%--<s:submit id="btnKirim" name="btnKirim" value="Login" cssClass="btn"/>--%>
      <%--<s:reset id="btnReset" name="btnReset" value="Reset" cssClass="btn"/>--%>
      <%--</s:form>--%>
     <s:form action="authorizeLogin" namespace="/user" theme="simple" cssClass="well form-search" validate="true"
              method="POST">
          <s:textfield
                  placeholder="Login"
                  name="userName"
                  tooltip="Enter your Name here"/>

          <s:password
                  placeholder="Password"
                  name="userPassword"/>

          <s:submit cssClass="btn-primary" value="Login"/>
          <s:reset cssClass="btn-primary" value="Reset"/>
      </s:form>
  </div>

  </body>
</html>