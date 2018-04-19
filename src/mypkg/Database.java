/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JABA002
 */
public class Database {
    
    
    private Connection conn;
    public Database()
    {
        conn = null;
    }
    public Connection getDBConnection()
    {
        return conn;
    }
    public boolean closeConnection()
    {
        try
        {
            conn.close();
            System.out.println("Connection closed successfully");
            return true;
        }
        catch(SQLException e)
        {
            System.out.println("Connection closed error");
            return false;
        }
    }
    public Connection CreateDBConnection()
    {
        System.out.println("-------- Mysql JDBC Connection Testing ------");
	try 
        {
            Class.forName("com.mysql.jdbc.Driver");
	} 
        catch (ClassNotFoundException e) 
        {
            System.out.println("Where is your Mysql JDBC Driver?");
            e.printStackTrace();
            
            return null;
            
	}
	System.out.println("Mysql JDBC Driver Registered!");
	try 
        {
          //conn = DriverManager.getConnection("jdbc:mysql://192.168.2.29:3306/ams", "mahabub", "12345");
           conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/AMS", "root", "");
            System.out.println("You made it, take control your database now!");
            return conn;
        } 
        catch (SQLException e)
        {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return null;
	}
   }
    
    
    
}
