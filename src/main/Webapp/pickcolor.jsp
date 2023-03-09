 <%--
    Created by IntelliJ IDEA.
    User: josephmccomas
    Date: 3/9/23
    Time: 3:23 PM
    To change this template use File | Settings | File Templates.
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html style="background-color: ${pickedcolor}">
<head>
    <title></title>
</head>
<body>
<label for="colors">Choose a color:</label>
<form method="post" action="/pickcolor">
<select name="colors" id="colors">
  <option value="grey">Grey</option>
  <option value="red">Red</option>
  <option value="green">Green</option>
  <option value="cornFlowerBlue">Corn Flower Blue</option>
</select>
  <button type="submit">Submit</button>
</form>
</body>
</html>
