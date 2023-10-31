
package InsertImageJDBC;
import java.sql.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InsertImageJDBC {
    public static void main(String argd[]) throws FileNotFoundException{
    
    try{Class.forName("com.mysql.cj.jdbc.Driver");
    
    String url= "jdbc:mysql://localhost :3306/student";
    String user = "root";
    String pass = "root";
        try (Connection con = DriverManager.getConnection(url,user,pass)) {
            String q1 = "create table Images(ID int primary key auto_increment,name varchar(20), img blob)";
            PreparedStatement st= con.prepareStatement(q1);
             st.executeUpdate();
            String q2 = "insert into Images(name,img) values(?,?)";
            PreparedStatement st1= con.prepareStatement(q2);
            FileInputStream path = new FileInputStream( "C:\\Users\\SAINATH\\Pictures\\microcontrollerarc.jpg");
            st1.setBinaryStream(2, path);
            st1.setString(1, "microcontroller");
            int cr1 = st1.executeUpdate();
            if(cr1>0){
                System.out.println("image added succesfully");
            }else{
                System.out.println(" image fail to add");
            }
        }
    
    
    }
    catch(ClassNotFoundException | SQLException e){}
    }
}
