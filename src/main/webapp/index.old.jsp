<%@ page language="java"
         contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ page import="java.util.* " %>

<html>


<head>

</head>

<a href="${pageContext.request.contextPath}/index.jsp">createUser2</a>


<h1>Hello JSP and Servlet!</h1>

<%
    Calendar calendar = Calendar.getInstance();
    int hour = calendar.get(Calendar.HOUR_OF_DAY);
    int minutes = calendar.get(Calendar.MINUTE);
    int secondes = calendar.get(Calendar.SECOND);
%>




<%= hour %> : <%= minutes %> : <%= secondes %>

<% if (hour < 12) { %>
Bonjour
<% } else { %>
Bon après midi
<% } %>
</html>