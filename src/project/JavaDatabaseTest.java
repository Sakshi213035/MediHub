/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author hp
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JavaDatabaseTest {
    
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Define the connection URL
            String url = "jdbc:mysql://localhost:3306/project";
            
            // Establish the connection
            conn = DriverManager.getConnection(url, "root", "Sakshi@213035");
            
            // Check if connection is successful
            if (conn != null) {
                System.out.println("Database connection successful!");
                Scanner sc=new Scanner(System.in);
        //Department table columns inputs:
        
        System.out.println("Enter id");

        String patientID=sc.nextLine();
        
        System.out.println("Enter  name");
        String name=sc.nextLine();
        

        System.out.println("Enter  contactno");
        String contactno=sc.nextLine();
        
        System.out.println("Enter  age");
        String age=sc.nextLine();
        
        System.out.println("Enter  gender");
        String gender=sc.nextLine();
        
        System.out.println("Enter  bloodgroup");
        String bloodgroup=sc.nextLine();
        
        System.out.println("Enter  address");
        String address=sc.nextLine();
        

        System.out.println("Enter Disease");
        String majordisease=sc.nextLine();
        PreparedStatement ps= (PreparedStatement) conn.prepareStatement("INSERT INTO patient values ('"+patientID+"','"+name+"','"+contactno+"','"+age+"','"+gender+"','"+bloodgroup+"','"+address+"','"+majordisease+"')");
        ps.executeUpdate();
                // Do further operations with the database if needed
            } else {
                System.out.println("Failed to make database connection!");
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            // Close the connection in the finally block to ensure it gets closed
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("Exception occurred while closing connection: " + e.getMessage());
                }
            }
        }
    }
}
