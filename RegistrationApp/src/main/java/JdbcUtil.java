import java.sql.*;

public class JdbcUtil {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Driver is register");
    }

    public static Connection getDBConnetion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/registe";
        String user = "root";
        String password = "Root@123";

        return DriverManager.getConnection(url,user,password);
    }
    public static void closeResource(Connection connect , Statement stmt) throws SQLException {
        if(connect!=null){
            connect.close();
        }
        if(stmt!=null){
            stmt.close();
        }
    }
}
