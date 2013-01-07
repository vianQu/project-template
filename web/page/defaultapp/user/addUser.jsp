<%--
  Created by IntelliJ IDEA.
  User: IVAN
  Date: 12/15/12
  Time: 8:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
</head>
<body>

<s:form namespace="/user" action="addUser">
    <s:textfield name="user.userName" label="user name" />
    <s:password name="user.password" label="password "/>
    <s:password name="user.userPasswordConfirm" label="confirm password"/>
    <s:textfield name="user.address" label="address"/>
    <s:textfield name="user.position" label="jabatan"/>
    <s:textfield name="user.divisi" label="divisi"/>
    <s:submit value="save"/>
    <s:reset value="reset"/>
</s:form>

</body>
</html>