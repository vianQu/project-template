<%--
  Created by IntelliJ IDEA.
  User: VIAN QU
  Date: Nov 24, 2012
  Time: 11:31:20 PM
  Email: vian.qu@gmail.com | vian_qu@yahoo.com
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
  <title>Sample Project</title>
      <script type='text/javascript' src='${pageContext.request.contextPath}/dwr/engine.js'></script>
      <script type='text/javascript' src='${pageContext.request.contextPath}/dwr/util.js'></script>
      <script type='text/javascript' src='${pageContext.request.contextPath}/dwr/interface/FunctionsAction.js'></script>
      <script type='text/javascript' src='${pageContext.request.contextPath}/media/js/jquery-1.8.2.js'></script>
      <script type='text/javascript' src='${pageContext.request.contextPath}/media/js/jquery-ui-1.9.1.custom.js'></script>
      <script type='text/javascript' src='${pageContext.request.contextPath}/media/js/jquery.dataTables.js'></script>
      <script type='text/javascript' src='${pageContext.request.contextPath}/media/js/bootstrap.min.js'></script>
      <script type='text/javascript' src='${pageContext.request.contextPath}/media/js/TableTools.js'></script>
      <script type='text/javascript' src='${pageContext.request.contextPath}/media/js/ZeroClipboard.js'></script>

      <%--DWR initiation--%>
      <script type='text/javascript' src='${pageContext.request.contextPath}/dwr/engine.js'></script>
      <script type='text/javascript' src='${pageContext.request.contextPath}/dwr/util.js'></script>
      <script type='text/javascript' src='${pageContext.request.contextPath}/dwr/interface/FunctionsAction.js'></script>

      <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/media/css/jquery.dataTables.css"/>
      <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/media/css/bootstrap.min.css"/>
      <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/media/css/TableTools.min.css"/>
      <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/media/css/smoothness/jquery-ui-1.9.1.custom.css"/>
      <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/media/css/content.css"/>
      <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/media/css/paging.css"/>

      <link href="${pageContext.request.contextPath}/media/css/dropdown/dropdown.css" media="screen" rel="stylesheet" type="text/css"/>
      <link href="${pageContext.request.contextPath}/media/css/dropdown/dropdown.vertical.rtl.css" media="screen" rel="stylesheet" type="text/css"/>
      <link href="${pageContext.request.contextPath}/media/css/dropdown/themes/default/default.ultimate.css" media="screen" rel="stylesheet" type="text/css"/>

      <script type="text/javascript">

          function getMenuUser() {
              dwr.engine.setAsync(false);
              FunctionsAction.getUserFunctionAndMenu(function (listdata) {

                  if (listdata != "error") {
                      document.getElementById("menu1").innerHTML = listdata;
                      $('#loginForm').hide();
                  }else{
                      $('#loginForm').show();
                  }
              });
          }

          $(document).ready(function(){
              $("#menu1").menu();
          })

      </script>

  </head>
  <body onload="getMenuUser()">
  <div class="wrapper">
      <div class="container">
          <div class="top">
              <div class="menu"> main menu
                  <div id="menu1"></div>
              </div>
              <div class="search">search decorator</div>
              <div id="loginForm" style="display:inline-block;" align="center">
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
          </div>

          <%--<div id="errorDiv" class="alert alert-error">--%>
              <%--<button type="button" class="close" data-dismiss="alert">×</button>--%>
              <s:actionerror theme="bootstrap" id="actionerror"/>
              <s:actionmessage theme="bootstrap" id="actionmessage" />
              <s:fielderror theme="bootstrap" id="fielderror"/>
          <%--</div>--%>
          <div class="holder">
                 <decorator:body/>
          </div>

          <div class="footer">
              ini footer
          </div>
      </div>
  </div>
  <decorator:head/>
  </body>
</html>