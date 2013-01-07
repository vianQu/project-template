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
  <h1>Login Page</h1>



  </body>
</html>