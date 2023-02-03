<%@ page import="com.freestack.helloworld.apis.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: borissmets
  Date: 03/02/2023
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>User list</title>
</head>
<body>
<% List<User> users = (List<User>) request.getAttribute("users"); %>
<table>
	<% for (User user : users) { %>
	<tr>
		<td>
			<%=user%>
		</td>
	</tr>
	<% } %>
</table>
</body>
</html>
