import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database {

    private String uname;
    private String upassword;
    private String email;
    private String ucity ;
    private PreparedStatement ptsmt =null;
    private Connection connect =null;
    private int row;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUcity() {
        return ucity;
    }

    public void setUcity(String ucity) {
        this.ucity = ucity;
    }


    public int register() throws SQLException {

        try {
            connect = JdbcUtil.getDBConnetion();

            String sql = "INSERT INTO STUDENT (uname, ucity, email, upassword) VALUES (?, ?, ?, ?)";

            ptsmt = connect.prepareStatement(sql);

            ptsmt.setString(1, uname);
            ptsmt.setString(2, ucity);
            ptsmt.setString(3, email);
            ptsmt.setString(4, upassword);

            row = ptsmt.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                JdbcUtil.closeResource(connect,ptsmt);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return row;
    }
}
