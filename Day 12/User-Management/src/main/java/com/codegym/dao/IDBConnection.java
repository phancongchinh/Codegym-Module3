package com.codegym.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface IDBConnection {
    String JDBC_URL = "jdbc:mysql://localhost:3306/user_management";
    String USERNAME = "root";
    String PASSWORD = "061220";

    static Connection getConnection () {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
