import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "pizzaServlet", urlPatterns = "/pizza-order")

public class pizzaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest  request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pizza_order.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    String medium = request.getParameter("medium");
    String large = request.getParameter("large");
    String cheese = request.getParameter("cheese");
    String pepperoni = request.getParameter("pepperoni");
    String bacon = request.getParameter("bacon");
    String address = request.getParameter("address");

        ArrayList<String> order = new ArrayList<>();

        if (medium != null){
            order.add("medium");
        }
        if (large != null){
            order.add("large");
        }
        if (cheese != null){
            order.add("cheese");
        }
        if (pepperoni != null){
            order.add("pepperoni");
        }
        if (bacon != null){
            order.add("bacon");
        }
        if (address != null){
            order.add(address);
        }

        System.out.println(order);
request.setAttribute("order", order);
request.getRequestDispatcher("/pizza_order.jsp").forward(request, response);
    }
}
