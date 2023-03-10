<%--
  Created by IntelliJ IDEA.
  User: meblo
  Date: 09.03.2023
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>randomQuote</title>
</head>
<body>
Author :<c:out value="${quote.author}" />
Quote: <c:out value="${quote.content}" />
<p><a href='<c:url value="/addQuote"/>'>Add Quote</a></p>
<p><a href='<c:url value="/allQuote"/>'>All Quote</a></p>
</body>
</html>
