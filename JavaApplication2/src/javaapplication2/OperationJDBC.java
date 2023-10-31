/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author SAINATH
 */
import java.sql.*;


public class OperationJDBC {
    public static void main(String args[]){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url= "jdbc:mysql://localhost : 3306/student";
            String user ="root";
            String pass = "root";
            
            

            Connection con =DriverManager.getConnection( url, user,pass);
            String q = "insert into mytable( FIRST_NAME, LAST_NAME) values( 'omm','gaade')";
             PreparedStatement ps = con.prepareStatement(q);
             int i = ps.executeUpdate();
             if(i>0){
                 System.out.println("succes");
             }else{
                 System.out.println("fail");
             }
             String q1 = "select * from mytable";
             Statement smt = con.createStatement();
             ResultSet rs= smt.executeQuery(q1);
             while(rs.next()){
                 System.out.println(rs.getString("FIRST_NAME"));
             }
            
            
        }
    
catch( ClassNotFoundException | SQLException e ){
}
}
}
