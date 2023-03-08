<%--
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
<html>
<head>
    <link rel="stylesheet" href="src/main/css/stylesheet.css">
    <title>Login</title>
</head>
<body>
<form>
    <div>
    <label for="email">Enter your gmail:</label>
    <input type="email" id="email"
           pattern=".+@gmail\.com" size="30" required>
    </div>
    <div>
        <label for="pass">Password (8 characters minimum):</label>
        <input type="password" id="pass" name="password"
               minlength="8" required>
    </div>
    <input type="submit" value="Sign in">
</form>

</body>
</html>
