/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;


import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author hp
 */
public class ConnectionProvider {
   public static Connection getCon (){
    
    try{
        //Class.forName("com.mysql.cj.jdbc.Driver");
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Sakshi@213035");
        Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Sakshi@213035");
        
        //System.out.println("connection establish");
        return con;
    }
    catch(Exception e){
    }
        //Connection con = null;
    return null;   
        
    //public static void main(String[] args) {
//        Connection conn = null;
//        try {
//            // Load the JDBC driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            
//            // Define the connection URL
//            String url = "jdbc:mysql://localhost:3306/project";
//            
//            // Establish the connection
//            conn = DriverManager.getConnection(url, "root", "Sakshi@213035");
//            
//            // Check if connection is successful
//            if (conn != null) {
//                System.out.println("Database connection successful!");
//                
//                
//                // Do further operations with the database if needed
//            } else {
//                System.out.println("Failed to make database connection!");
//            }
//            
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//            System.out.println("Exception occurred: " + e.getMessage());
//        } finally {
//            // Close the connection in the finally block to ensure it gets closed
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                    System.out.println("Exception occurred while closing connection: " + e.getMessage());
//                }
//            }
//        }
//        return conn;
//        
//}
}
}

    
    


