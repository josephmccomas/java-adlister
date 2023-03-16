package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.Ads;
import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.ListAdsDao;
import com.codeup.adlister.dao.MySQLAdsDao;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/login").forward(request, response);
    }
    // TODO: find a record in your database that matches the submitted password
    // TODO: make sure we find a user with that username
    // TODO: check the submitted password against what you have in your database
    // TODO: store the logged in user object in the session, instead of just the username
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = false;
        User user = null;
        try{
            user = DaoFactory.getUsersDao().findByUsername(username);
            if (user.getPassword().equals(password)){
                validAttempt = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (validAttempt){
            request.getSession().setAttribute("user", user);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}
