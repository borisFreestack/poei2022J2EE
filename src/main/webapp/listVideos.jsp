<%@ page import="com.freestack.helloworld.youtube.models.Video" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des videos</title>
    <style>
      tr:nth-child(even) {
        background: #CCC
      }

      tr:nth-child(odd) {
        background: #FFF
      }
    </style>
</head>
<body>
<h2>Liste des videos</h2>
<%
    List<Video> videos = (List<Video>) request.getAttribute("videos");
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm dd-MM-yy");
%>
<table>
    <thead>
    <td>Titre</td>
    <td>Date creation</td>
    <td>URL</td>
    <td>Lien</td>
    </thead>
    <% for (Video video : videos) {%>
    <tr>
        <td><%= video.getTitle() %>
        </td>
        <td><%= simpleDateFormat.format(video.getCreationDate()) %>
        </td>
        <td><%= video.getUrl() %>
        </td>
        <td>
            <a href="video.jsp?url=<%= video.getUrl()%>&title=<%= video.getTitle() %>">See</a>
        </td>
    </tr>
    <% } %>
</table>

<a href="${pageContext.request.contextPath}/upload.jsp">Upload another video</a>
</body>
</html>
