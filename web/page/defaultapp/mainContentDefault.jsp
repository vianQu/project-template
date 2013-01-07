<%--
  Created by IntelliJ IDEA.
  User: VIAN QU
  Date: Nov 11, 2012
  Time: 11:53:22 AM
  Email: vian.qu@gmail.com | vian_qu@yahoo.com
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="dataTable" uri="http://github.com/datatables4j" %>
<html>
  <head>
  <title>Simple jsp page</title>




      <%--<style type="text/css">--%>
          <%--#menu1 {--%>
              <%--background-color: #6692F1;--%>
              <%--width: 88%;--%>
              <%--float: left;--%>
              <%--top: 65px;--%>
          <%--}--%>
      <%--</style>--%>

  </head>
  <%--<jsp:include page="mainHeaderDefault.jsp" flush="false"/>--%>
  <body>
  <%--<jsp:include value="mainHeaderDefault.jsp"/>--%>
  <div id="table" width="900px" style="position:absolute;" export="true" >
  <%--<dataTable:table id="dataUser" data="${userAll}" cssStyle="table" autoWidth="true">--%>
      <%--<dataTable:column title="id" property="userId" sortable="true"/>--%>
      <%--<dataTable:column title="nama user" property="userName" sortable="true"/>--%>
      <%--<dataTable:column title="alamat" property="address"/>--%>
  <%--</dataTable:table>--%>
  </div>
  <s:form namespace="/user" action="authorizeLogout">
  <s:textfield name="testing" id="testing"/>
  <s:submit name="btnSubmit" id="test" value="logOut"/>
  </s:form>

      ini adalah content


      <div id="menu2">
          <textarea type="textarea" id="textarea" name="textarea" onblur="getMenuUser()"></textarea>
      </div>

  </body>
</html>