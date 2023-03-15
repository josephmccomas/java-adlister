package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users{

    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public User findByUsername(String username){
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("SELECT * FROM users where name = ?");
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            User user = extractUser(rs);
            return user;
        } catch (SQLException e) {
            throw new RuntimeException("Error finding username", e);
        }
    }
    private User extractUser(ResultSet rs) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );
    }

    @Override
    public Long insert(User user) {
        return null;
    }
}
