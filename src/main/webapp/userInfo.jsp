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
	<title>User info</title>
</head>
<body>

Prénom <%= request.getParameter("firstName")%>
<% if (request.getParameter("gender").equals("homme")) { %>
Monsieur
<%} else if (request.getParameter("gender").equals("femme")) {%>
Madame
<% } %>
<%= request.getParameter("lastName")%>

Date de naissance <%= request.getParameter("birthDate")%>
<%
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date date = sdf.parse(request.getParameter("birthDate"));
	Calendar eighteenYearsAgo = Calendar.getInstance();
	eighteenYearsAgo.add(Calendar.YEAR, -18);
%>
<%if (!eighteenYearsAgo.getTime().after(date)) { %>
Interdit au moins de 18 ans
<% } else { %>
Accès autorisé
<%}%>

</body>
</html>
