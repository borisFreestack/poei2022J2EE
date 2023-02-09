<%--
  Created by IntelliJ IDEA.
  User: borissmets
  Date: 03/02/2023
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
	<title>Login utilisateur</title>
</head>
<body>

<%
	if(request.getAttribute("errorMessage") != null) {
		out.println(request.getAttribute("errorMessage").toString());
	}
%>
<form method="post" action="loginServlet">
	<div>
		<input type="text" name="username"> identifiant
	</div>
	<div>
		<input type="password" name="password"> mot de passe
	</div>
	<button type="submit">Se connecter</button>
</form>

</body>
</html>
