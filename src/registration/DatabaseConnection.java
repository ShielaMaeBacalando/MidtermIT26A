package registration; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {
    
    public static Connection ConnectTODB(){
            
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/useregistration","root","");
                return con;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
    }
}
   