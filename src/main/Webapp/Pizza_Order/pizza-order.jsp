<%--
  Created by IntelliJ IDEA.
  User: josephmccomas
  Date: 3/9/23
  Time: 10:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String order = request.getParameter( );
%>
<html>
    <head>
    <jsp:include page="../Pizza_Order/Partials/header.jsp">
    </head>
    <body>
        <div>
            <h2>Crust Size</h2>
            <form method="post" action="../pizzaServlet.java">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
                        <label class="form-check-label" for="defaultCheck1">
                        Medium
                        </label>
                </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="" id="defaultCheck2">
                    <label class="form-check-label" for="defaultCheck2">
                    Large
                    </label>
            </div>
            <h2>Toppings</h2>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="" id="defaultCheck3">
                    <label class="form-check-label" for="defaultCheck2">
                    Cheese
                    </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="" id="defaultCheck4">
                    <label class="form-check-label" for="defaultCheck2">
                    Pepperoni
                    </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="" id="defaultCheck5">
                    <label class="form-check-label" for="defaultCheck2">
                    Bacon
                    </label>
            </div>
                <label for="inputAddress" class="form-label">Address</label>
                    <input type="text" id="inputAddress" class="form-control" aria-describedby="addressHelpBlock">
                    <div id="addressHelpBlock" class="form-text">
                    Enter your address like this: number, street, zip code.
                    </div>
            </form>
        </div>
    </body>
</html>
