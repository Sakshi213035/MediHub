/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.*;
import java.util.Scanner;


/**
 *
 * @author hp
 */
public class demo {
    public static void main(String[] args) throws ClassNotFoundException  {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Sakshi@213035");
//        System.out.println("Connection Establish");
        //user input:
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
        
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Sakshi@213035");
        System.out.println("Connection Establish");
        //user input:
        
        PreparedStatement ps= (PreparedStatement) conn.prepareStatement("INSERT INTO patient values ('"+patientID+"','"+name+"','"+contactno+"','"+age+"','"+gender+"','"+bloodgroup+"','"+address+"','"+majordisease+"')");
        ps.executeUpdate();
        }
        catch(Exception e){
            
        }
}
}
