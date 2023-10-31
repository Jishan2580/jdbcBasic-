/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author SAINATH
 */
import java.sql.*;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/classicmodels";

            String username= "root";
            String pass= "root";
            Connection con  = DriverManager.getConnection(url,username, pass);
            if(con.isClosed()){
                System.out.println("connection is closed ");
            }else{
                System.out.println("connexction is establiher");
            }

        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
    }
    

