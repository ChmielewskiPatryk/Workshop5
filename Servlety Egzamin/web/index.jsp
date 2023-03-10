<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <title></title>
  </head>
  <body>
<form action="receiver" method="GET">
    <a href='<c:url value="/receiver?name=coder&mail=coder@somemail.com&id=2"/>'>Receiver</a>
</form>
<p><a href='<c:url value="/smurfs"/>'>Smurfs</a></p>
<p><a href='<c:url value="/addQuote"/>'>Add Quote</a></p>
<p><a href='<c:url value="/allQuote"/>'>All Quote</a></p>
<p><a href='<c:url value="/randomQuote"/>'>Random Quote</a></p>
<p><a href='<c:url value="/homepage"/>'>Home Page</a></p>
  </body>
</html>