package com.authhub.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/authhub_db";
    private static final String USER = "root";
    private static final String PASSWORD= "";

    public static Connection getConnection()
    {
        Connection connection= null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection(URL, USER, PASSWORD);
        }catch(ClassNotFoundException e){
            System.out.println("MYSQL Driver not found");
            e.printStackTrace();
        }catch(SQLException e){
            System.out.println("Database connection Failed");
            e.printStackTrace();
        }


        return connection;
    }
}