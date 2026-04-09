/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;       
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Chookie
 */
public class DatabaseConnection { 
    
    //Database Credentials
    private static final String URL = "jdbc:mysql://localhost:3306/useregistration";
    private static final String USER = "root";
    private static final String PASSWORD = "";     
    
    public static Connection getConnection(){
        Connection conn = null;
        
        try (
            conn = DriverManager.getConnection(url:URL, user:USER, password:PASSWORD);
            System.out.println(x: "Database Connected Succesfully!");
          
        } catch (SQLException e) {
           System.out.println(x: "Connection Failed!");
           e.printStackTrace();
        }
        
        return conn;
                
                
    }
    
}
