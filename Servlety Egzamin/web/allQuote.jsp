<%--
  Created by IntelliJ IDEA.
  User: meblo
  Date: 09.03.2023
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>allQuote</title>
</head>
<body>
<table>
    <c:forEach items="${quote}" var="quote">
        <tr>
            <td> Author: ${quote.author}, Quote:  ${quote.content}</td>
        </tr>
    </c:forEach>
</table>
<p><a href='<c:url value="/addQuote"/>'>Add Quote</a></p>
<p><a href='<c:url value="/randomQuote"/>'>Random Quote</a></p>
</body>
</html>
