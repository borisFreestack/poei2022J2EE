<html>

<title>
    formulaire creation creator
</title>

<body>
<h2>formulaire creation creator</h2>
<form method=post action="userServlet">
    <div>
        username
        <input type=text name="username">
    </div>
    <div>
        password
        <input type=password name="password">
    </div>
    <div>
        birthdate
        <input type=date name="birthdate">
    </div>
    <div>
        <input type=submit value="creer utilisateur">
    </div>
</form>

<% if (request.getAttribute("message") != null) { %>
<span style="color: red">
    <%= request.getAttribute("message")%>
</span>
<% } %>
</body>
</html>