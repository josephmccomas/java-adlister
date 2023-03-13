<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: josephmccomas
  Date: 3/10/23
  Time: 2:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Ads</title>
</head>
<body>
<c:forEach var="ad" items="${ads}">
    <div class="card">
        <p>${ad.title}</p>
        <p>${ad.description}</p>
    </div>
</c:forEach>
</body>
</html>
