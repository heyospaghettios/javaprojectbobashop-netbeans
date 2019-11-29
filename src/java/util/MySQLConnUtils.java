/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Paul
 */
public class MySQLConnUtils {
    public static Connection getMySQLConnection()
         throws ClassNotFoundException, SQLException {
        
        //connection parameters
     String hostName = "localhost";
     String dbName = "bobashop";
     String userName = "root";
     String password = "sesame";
     return getMySQLConnection(hostName, dbName, userName, password);
    }
    public static Connection getMySQLConnection(String hostName, String dbName,
         String userName, String password) throws SQLException,
         ClassNotFoundException {
        
        Class.forName("com.mysql.jdbc.Driver");
        
        //url connection for MYSQL:
        
        String connectionURL = "jdbc:mysql://localhost:3307bobashop";
        
        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);
        return conn;
    }
}
