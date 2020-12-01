<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/1
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/quick21" method="post" enctype="multipart/form-data">
    名称：<input type="text" name="username"><br/>
    文件:<input type="file" name="upload"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
