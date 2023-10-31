import java.sql.*;


public class FirstJDBC{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306//classicmodels";

            String username= "root";
            String pass= "root";
            Connection    con  = DriverManager.getConnection(url,username, pass);
            if(con.isClosed()){
                System.out.println("connection is closed ");
            }else{
                System.out.println("connexction is establiher");
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }
}