
package javaapplication2;
import java.sql.*;
public class UpdateJDBC {
    public static void main(String args []){
        try{Class.forName("com.mysql.cj.jdbc.Driver");
        String url= "jdbc:mysql://localhost : 3306/student";
        String user = "root";
        String pass = "root";
        Connection con = DriverManager.getConnection(url,user,pass);
        String q1 = "update mytable set FIRST_NAME =? WHERE ID = ?";
        PreparedStatement smt = con.prepareStatement(q1);
        smt.setString(1,"omii");
        smt.setString(2, "111");
        int i = smt.executeUpdate();
         
        String q2 = "select * from mytable where ID = 111";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(q2);
        while(rs.next()){
        System.out.println(rs.getString("FIRST_NAME"));
        }
        }
        catch(ClassNotFoundException | SQLException e){
        
        }
    
    }
    
}
