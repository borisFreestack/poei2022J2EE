<%@ page import="java.util.Calendar" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>

<title>
	hello world
</title>

<body>
hello world!

<%
	Calendar calendar = Calendar.getInstance();
	int hour = calendar.get(Calendar.HOUR_OF_DAY);
%>

<% if (hour > 12) {%>
Bon après midi
<% } else {%>
Bonne journée
<% }%>

</body>
</html>