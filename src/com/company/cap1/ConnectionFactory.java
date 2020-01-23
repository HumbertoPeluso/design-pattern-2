package com.company.cap1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection(){
        Connection c = null;
        try {
            c = DriverManager.getConnection("","","");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return c;
    }
}
