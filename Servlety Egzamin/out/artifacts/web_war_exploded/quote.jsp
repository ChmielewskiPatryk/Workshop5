<%--
  Created by IntelliJ IDEA.
  User: meblo
  Date: 09.03.2023
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>quote</title>
</head>
<body>
<form action="addQuote" method="POST">
    <label>
        Quote :
        <input type="text" name="quote">
    </label>
    <label>
        Author :
        <input type="text" name="author">
    </label>
    <input type="submit">
</form>
</body>
</html>
