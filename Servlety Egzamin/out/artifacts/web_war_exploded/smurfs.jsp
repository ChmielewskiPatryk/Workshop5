<%--
  Created by IntelliJ IDEA.
  User: meblo
  Date: 05.03.2023
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>smurfs</title>
</head>
<body>
<table>
    <c:forEach items="${smurfs}" var="smurfs">
        <tr>
            <td> Name: ${smurfs.name}, Attribute:  ${smurfs.attribute}, Description:  ${smurfs.description} </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
