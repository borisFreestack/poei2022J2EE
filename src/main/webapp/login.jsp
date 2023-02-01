<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Login</h2>
<form method="post" action="loginServlet">
    <div>
        username : <input type="text" name="username">
    </div>
    <div>
        password : <input type="password" name="password">
    </div>
    <div>

        <input type="submit" value="connection">
    </div>
    <div>
        <% Object invalidCredentials = request.getAttribute(
                "invalidCredentials");
            if (invalidCredentials != null) {%>
        <span>mauvais mot de passe ou identifiant</span>
        <% } %>
    </div>

</form>

</body>
</html>
