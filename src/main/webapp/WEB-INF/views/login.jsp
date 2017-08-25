<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 25.08.17
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="/resources/css/reset.css">
    <link rel="stylesheet" type="text/css" href="/resources/css/structure.css">
    <title>Title</title>
</head>
<body>
<form:form method="post" commandName="user" action="check-user"
           class="box login">
    <fieldset class="boxBody">
        <form:label path="name">Name:</form:label>
        <form:input path="name"/>

        <form:label path="password">Password:</form:label>
        <form:password path="password"/>

    </fieldset>

    <footer>
        <label><input type="checkbox" tabindex="3">Keep me loggin in</label>
        <input type="submit" class="btnLogin" value="Login" tabindex="4">
    </footer>
</form:form>


</fieldset>


</form>
</body>
</html>
