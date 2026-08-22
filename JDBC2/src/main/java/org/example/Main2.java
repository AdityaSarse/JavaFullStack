package org.example;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class Main2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/college";
        String user ="root";
        String password="Root@123";

        Connection connect = DriverManager.getConnection(url,user,password);

        Statement statement = connect.createStatement();

        String sql ="SELECT * FROM students;";

        ResultSet rs = statement.executeQuery(sql);

        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        }

        rs.close();
        statement.close();
        connect.close();
    }
}
