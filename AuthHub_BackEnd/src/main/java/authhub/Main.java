package authhub;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
       System.out.println("AuthHUb Backend Started");
       
       String jdbcURL="jdbc:mysql://localhost:3306/authhub_db";
       String username="root";
       String password="";

       try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(jdbcURL, username, password);
        System.out.println("Connected to Database Successfully");

        con.close();
       }catch(ClassNotFoundException e){
        System.out.println("MySQL Driver not Found!");
        e.printStackTrace();
       }
        catch (SQLException e) 
       {
        System.out.println("Database Connection Failed!");
        e.printStackTrace();
       }
    }
}
