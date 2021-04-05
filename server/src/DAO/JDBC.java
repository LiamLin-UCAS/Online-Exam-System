package DAO;
import com.mysql.cj.jdbc.*;

import java.sql.*;

public class JDBC {
    public static String select(String name){
        try {
            String url="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            con= DriverManager.getConnection(url,"root","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
