package org.example;

import jdk.dynalink.beans.StaticClass;

import java.sql.SQLDataException;

public class Main4 {

    public static void getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/college";
            String user = "root";
            String password = "Root@123";
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
