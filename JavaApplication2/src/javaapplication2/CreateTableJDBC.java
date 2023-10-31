
package javaapplication2;
import java.sql.*;
public class CreateTableJDBC {
    public static void main(String args[]) throws SQLException
    {
     try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url= "jdbc:mysql://localhost : 3306/student";
        String user = "root";
        String pass = "root";
        
        
        
        Connection con = DriverManager.getConnection(url,user,pass);
        String q1= "create table faculty(ID int Primary key auto_increment,name varchar(12), depart varchar(10))";
        PreparedStatement ps = con.prepareStatement(q1);
        int i1 = ps.executeUpdate();
        if(i1>0){
        System.out.println("success");
        }
        else{System.out.println("fail");}
        
     }
    
     catch(ClassNotFoundException e){
     }
    
    }    
}
