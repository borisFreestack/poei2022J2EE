<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Video</title>
</head>
<body>
<h1>
    <%=request.getParameter("title") %>
</h1>
<iframe width="560" height="315" src="<%=request.getParameter("url")%>"
        title="YouTube video player" frameborder="0"
        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
        allowfullscreen>
</iframe>

<a href="${pageContext.request.contextPath}/videoServlet">Retour liste</a>
</body>
</html>
