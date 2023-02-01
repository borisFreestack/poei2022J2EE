<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload</title>
</head>
<body>
<h2>Upload</h2>

<form method="post" action="videoServlet">
    <div>
        url : <input type="url" name="url">
    </div>
    <div>
        title : <input type="text" name="title">
    </div>
    <div>
        <input type="submit" name="submit">
    </div>
</form>

</body>
</html>
