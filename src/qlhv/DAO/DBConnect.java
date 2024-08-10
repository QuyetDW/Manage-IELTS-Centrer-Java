
package qlhv.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    
    public static Connection getConnection(){
         try{
            Connection cons = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlhocvien","root","");
            return cons;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         return null;
    }
    
    public static void main(String args[]) throws SQLException{
        Connection c = getConnection();
        System.out.println(c.toString());
        c.close();
    }   
}
