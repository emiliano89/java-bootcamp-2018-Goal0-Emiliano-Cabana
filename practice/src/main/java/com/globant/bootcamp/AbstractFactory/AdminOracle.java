package AbstractFactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdminOracle extends ConnectionType{
     private Connection conn;
    @Override
    public void getConnection(String urlConnection, String user, String pass){
       urlConnection = "jdbc:oracle://localhost";
       user = "AdminO";
       pass = "AdminO123";
       
       try
        {
            Class.forName("com.example.jdbc.ServerDriver");
            conn = DriverManager.getConnection(urlConnection/*[Emi on dbo]*/, user, pass );
            System.out.println("Connecting to MySQL...");
        }
        catch(Exception e)
        {
            System.out.println("Error when connecting to the database. Cause: " + e.getMessage());
        }
   }
}
