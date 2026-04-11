/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it26adatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Chookie
 */
public class databaseconnection {
     public static Connection getConnection() {
        Connection conn = null;
        try {
        String URL = "jdbc:mysql://localhost:3306/useregistration";
        String USER = "root";
        String PASSWORD = "";    
       
            // Register the driver (optional in newer JDBC versions but good for troubleshooting)
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected Successfully!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }
        return conn;
    }

    static Connection connectDB() {
    return getConnection(); // This calls the working logic above
}
}    
    

