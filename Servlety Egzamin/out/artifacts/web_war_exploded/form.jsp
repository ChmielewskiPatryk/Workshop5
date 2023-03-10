<%--
  Created by IntelliJ IDEA.
  User: meblo
  Date: 26.02.2023
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>form</title>
</head>
<body>
<form action="receiver" method="post">

    <label> Name:
        <input type="text" value="${name}" name="name">
    </label>
    <label>
        Mail:
        <input type = "text" value="${mail}" name="mail">
    </label>
    <label>
        ID:
        <input type = "text" value="${id}" name="id">
    </label>

    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
