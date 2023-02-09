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
	<title>Creation utilisateur</title>
</head>
<body>
<form method="post" action="userServlet">
	<div>
		<input type="text" name="firstName"> prenom
	</div>
	<div>
		<input type="text" name="lastName"> nom
	</div>
	<div>
		<input type="text" name="username"> identifiant
	</div>
	<div>
		<input type="text" name="password"> mot de passe
	</div>
	<div>
		<input type="date" name="birthDate"> date de naissance
	</div>
	<div>
		<input type="radio" name="gender" value="homme"> homme
	</div>
	<div>
		<input type="radio" name="gender" value="femme"> femme
	</div>
	<div>
		<input type="radio" name="gender" value="autre"> autre
	</div>
	<button type="submit">Envoyer</button>
</form>

<a href="userServlet"> liste des utilisateurs </a>
</body>
</html>
