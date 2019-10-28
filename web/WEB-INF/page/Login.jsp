<%--
  Created by IntelliJ IDEA.
  User: 78286
  Date: 2019/10/28
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>SpringMVC Login</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/login" role="form">
        username: <input type="text" name="userName"><br/>
        password: <input type="text" name="password"><br/>
        <input type="submit" value="submit">
    </form>
</body>
</html>
