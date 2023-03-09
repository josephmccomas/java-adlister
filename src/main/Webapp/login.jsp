<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.net.http.HttpClient" %>
<%@ page import="java.io.InputStream" %>
<%@ page import="java.net.http.HttpResponse" %>
<%@ page import="org.apache.http.NameValuePair" %>
<%@ page import="org.apache.http.message.BasicNameValuePair" %>
<%@ page import="org.apache.http.client.entity.UrlEncodedFormEntity" %>
<%@ page import="org.apache.http.client.methods.HttpPost" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.http.HttpEntity" %><%--
  Created by IntelliJ IDEA.
  User: josephmccomas
  Date: 3/8/23
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--When a user visits /login.jsp, they should see a form for logging in

This form should have a 'username' and 'password' field.

This form should submit a POST request to /login.jsp

Inside of login.jsp write some code to check the submmitted values.
If the username submitted is "admin", and the password is "password",
redirect the user to the profile page; otherwise, redirect back to the login form.--%>

<%
    String username = request.getParameter("inputUsername");
    String password = request.getParameter("inputPassword");

    if (username.matches("admin") && password.matches("password") && username != null && password != null){
        response.sendRedirect("profile.jsp");
    }
%>

<html>
<jsp:include page="Partials/header.jsp">
</jsp:include>
<jsp:include page="Partials/navbar.jsp">
</jsp:include>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <title>Login</title>
</head>
<body style="background-color: slategrey">
<form method="post" action="login.jsp">
    <div>
        <label form="username">Enter your username:</label>
        <input type="text" id="user" name="inputUsername" required>
    </div>
    <div>
        <label for="pass">Password (8 characters minimum):</label>
        <input type="password" id="pass" name="inputPassword" minlength="8" required>
    </div>
    <input type="submit" value="Sign in">
</form>
<%--<c:set value="String username = request.getParameter(username)" var="username">--%>
<%--    <c:set value="String password = request.getParameter(" pass")" var="password">--%>
<%--    <c:if test="${username} == " admin" && ${password} == "password"">--%>
<%--    <c:redirect url="/profile.jsp"/>--%>
<%--    <c:otherwise>--%>
<%--        <c:redirect url="/login.jsp"/>--%>
<%--    </c:otherwise>--%>



</body>
</html>
