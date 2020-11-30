<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/30
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/quick14" method="post">
    <%--        表明是第一个User对象的username--%>
    <input type="text" name="userList[0].username"/>
    <input type="text" name="userList[0].age"/>
    <input type="text" name="userList[1].username"/>
    <input type="text" name="userList[1].age"/>
    <input type="text" name="userList[2].username"/>
    <input type="text" name="userList[2].age"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
