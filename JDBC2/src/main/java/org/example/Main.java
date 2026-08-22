package org.example;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() throws ClassNotFoundException, SQLException {

        //Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Estabilesd Connection
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password="Root@123";

        Connection connection = DriverManager.getConnection(url,user,password);

        // Create Statement

        Statement statemnet = connection.createStatement();

        //Execute Query
        //1 . Insertion in database
        // String sql = "INSERT INTO students (id, name, age) VALUES (2, 'Rahul', 22);";
        // int rowsAffected = statemnet.executeUpdate(sql);

        //2. Deletion of record
         String sql = "DELETE FROM students WHERE id = 2;";
         int rowsAffected = statemnet.executeUpdate(sql);

        // 3. Update Record
        // String sql = "UPDATE students SET age = 22 WHERE id = 1;";
        // int rowsAffected = statemnet.executeUpdate(sql);

        //Proceess Result
        if(rowsAffected==0){
            System.out.println("No Data is Updated");
        }
        else{
            System.out.println("Data Updated and rows Affetced"+rowsAffected);
        }

        //Close All resources

        statemnet.close();
        connection.close();
    }
}
