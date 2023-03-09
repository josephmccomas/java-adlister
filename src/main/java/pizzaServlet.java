import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.datatransfer.DataFlavor;
import java.io.IOException;

@WebServlet(name = "pizzaServlet", urlPatterns = "/Pizza_Order")

public class pizzaServlet extends HttpServlet {
private String [] pizza;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);


    String medium = request.getParameter("medium");
    String large = request.getParameter("large");
    String cheese = request.getParameter("cheese");
    String pepperoni = request.getParameter("pepperoni");
    String bacon = request.getParameter("bacon");
    String address = request.getParameter("address");


request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }
}
