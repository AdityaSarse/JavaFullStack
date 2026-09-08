package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        System.out.println("Control From Register Servlet");

        String name = req.getParameter("name");
        String city = req.getParameter("city");
        String email = req.getParameter("email");

        int phno;
        try {
            phno = Integer.parseInt(req.getParameter("phno"));
        } catch (NumberFormatException e) {
            resp.getWriter().println("Invalid phone number.");
            return;
        }

        String url = "jdbc:mysql://localhost:3306/STUDENT?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "Root@123";

        String sql = "INSERT INTO STUDENT (name, city, email, phno) VALUES (?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new ServletException("MySQL JDBC Driver not found", e);
        }

        try (Connection connect = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = connect.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setString(3, email);
            pstmt.setInt(4, phno);

            int rowAffected = pstmt.executeUpdate();

            PrintWriter writer = resp.getWriter();
            if (rowAffected != 0) {
                writer.println("Registration Successful ...!");
            } else {
                writer.println("Registration Failed ...!");
            }

        } catch (SQLException e) {
            throw new ServletException("Database error during registration", e);
        }
    }
}