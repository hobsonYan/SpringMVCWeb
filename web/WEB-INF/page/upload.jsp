<%--
  Created by IntelliJ IDEA.
  User: 78286
  Date: 2019/10/28
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File Upload</title>
</head>
<body>
<form action="/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="picture">
    <input type="submit" value="upload">
</form>
</body>
</html>
