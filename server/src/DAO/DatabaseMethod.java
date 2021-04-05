package DAO;
import java.sql.*;

public class DatabaseMethod {
    private static Connection con;
    private static PreparedStatement pStmt;
    private static ResultSet rs;
    public static int login(String ID,String password){

        int identity=-1;
        try {
            con=JDBC.getConnection();
            String sql="select * from login where ID = ? and password = ?";
            pStmt=con.prepareStatement(sql);
            pStmt.setString(1,ID);
            pStmt.setString(2,password);
            rs=pStmt.executeQuery();
            if(rs.next())
                identity=rs.getInt("identity");

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Database Driver Error!\n"+e);
        }finally {
            try {
                JDBC.close(rs,pStmt,con);
            } catch (SQLException e) {
                System.err.println("Database Close Error!");
            }
        }
        return identity;
    }
}