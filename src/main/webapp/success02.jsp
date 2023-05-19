<%--
  Created by IntelliJ IDEA.
  User: xia
  Date: 2023/5/18
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Success</title>
</head>
<body>
<h2 align="center">欢迎老师<%=session.getAttribute("uname")%>登录！您的密码是：<%=session.getAttribute("upwd")%></h2>
</body>
</html>