<%--
  Created by IntelliJ IDEA.
  User: josephmccomas
  Date: 3/9/23
  Time: 10:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <jsp:include page="Partials/pizza_header.jsp" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    </head>
    <body>
        <div>
            <h2>Crust Size</h2>
            <form method="post" action="pizza-order">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="defaultCheck1" name="medium">
                        <label class="form-check-label" for="defaultCheck1">
                        Medium
                        </label>
                </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="" id="defaultCheck2" name="large">
                    <label class="form-check-label" for="defaultCheck2">
                    Large
                    </label>
            </div>
            <h2>Toppings</h2>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="" id="defaultCheck3" name="cheese">
                    <label class="form-check-label" for="defaultCheck2">
                    Cheese
                    </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="" id="defaultCheck4" name="pepperoni">
                    <label class="form-check-label" for="defaultCheck2">
                    Pepperoni
                    </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="" id="defaultCheck5" name="bacon">
                    <label class="form-check-label" for="defaultCheck2">
                    Bacon
                    </label>
            </div>
                <label for="inputAddress" class="form-label">Address</label>
                    <input type="text" id="inputAddress" class="form-control" aria-describedby="addressHelpBlock" name="address">
                    <div id="addressHelpBlock" class="form-text">
                    Enter your address like this: number, street, zip code.
                    </div>
            <div>
                <button class="btn btn-primary" type="submit">Submit</button>
            </div>
            </form>
        </div>
    </body>
</html>