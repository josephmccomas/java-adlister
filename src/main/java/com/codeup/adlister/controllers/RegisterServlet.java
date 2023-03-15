package com.codeup.adlister.controllers;
import com.codeup.adlister.dao.Users;
import com.mysql.cj.jdbc.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    private Connection connection = null;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        // TODO: show the registration form
        try {
            request.getRequestDispatcher("/WEB_INF/register.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        // TODO: ensure the submitted information is valid
        public boolean isValidRegisterUser(String validationCustomUsername, String password) {
            try {
                PreparedStatement stmt = connection.prepareStatement();
                ResultSet rs = stmt.executeQuery("SELECT * " +
                        " FROM users " +
                        " where name = ? " +
                        " and password = ? ");
                stmt.setString(1, validationCustomUsername);
                stmt.setString(2, password);

                ResultSet rs = stmt.executeQuery();
                if(!rs.next()) {
                    return false;
                }
                if(rs.getInt("count_id") > 0) {
                    return true;
                } else {
                    return false;
                }
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Error retrieving all ads.", e);
            }
        }
        // TODO: create a new user based off of the submitted information

        @Override
        public Long insertUser(Users users) {
            String sql = "SELECT * FROM users";
            try {
                java.sql.PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.executeUpdate(createInsertQuery(users), Statement.RETURN_GENERATED_KEYS);
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                return rs.getLong(1);
            } catch (SQLException e) {
                throw new RuntimeException("Error creating a new user.", e);
            }
        }

        // TODO: if a user was successfully created, send them to their profile

    }
}


