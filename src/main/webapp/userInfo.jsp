<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %><%--
  Created by IntelliJ IDEA.
  User: borissmets
  Date: 03/02/2023
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>User info after login</title>
</head>
<body>

User <%= request.getSession().getAttribute("authenticatedUser")%>

<a href="userServlet"> liste des utilisateurs </a>
</body>
</html>
