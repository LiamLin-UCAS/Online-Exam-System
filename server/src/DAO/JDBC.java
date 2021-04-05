package DAO;
import com.mysql.cj.jdbc.*;

import java.sql.*;

public class JDBC {
    private static final String connectionURL = "jdbc:mysql://localhost:3306/onlineexamsystem?"
            + "useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
    private static final String sqlUsername = "root";
    private static final String sqlPassword = "123456";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(connectionURL,sqlUsername,sqlPassword);
    }
    public static boolean close(ResultSet rs,Statement stmt,Connection con) throws SQLException {
        if(rs!=null)
            rs.close();
        if(stmt!=null)
            stmt.close();
        if(con!=null)
            con.close();
        return true;
    }
    public static boolean close(ResultSet rs,PreparedStatement pStmt,Connection con) throws SQLException {
        if(rs!=null)
            rs.close();
        if(pStmt!=null)
            pStmt.close();
        if(con!=null)
            con.close();
        return true;
    }
}
