package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "viewcolor-servlet", urlPatterns = "viewcolor")
public class viewcolor_servlet extends HttpServlet {
    String color = "";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String grey = request.getParameter("Grey");
        String red = request.getParameter("Red");
        String green = request.getParameter("Green");
        String cfBlue = request.getParameter("Corn Flower Blue");

        if (grey != null){
            color = "#696969FF";
        }
        if (red != null) {
            color = "#8B0000FF";
        }
        if (green != null){
            color = "#006400FF";
        }
        if (cfBlue != null){
            color = "6495EDFF";
        }
        request.setAttribute("pickedcolor", color);
        request.getRequestDispatcher("/viewcolor.jsp").forward(request, response);
    }
}
