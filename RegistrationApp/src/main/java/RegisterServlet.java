import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String uname = req.getParameter("uname");
        String ucity = req.getParameter("ucity");
        String email = req.getParameter("email");
        String upassword = req.getParameter("upassword");

        Database model = new Database();

        model.setEmail(email);
        model.setUcity(ucity);
        model.setUpassword(upassword);
        model.setUname(uname);

        // Create session and store username
        HttpSession session = req.getSession();
        session.setAttribute("name", uname);

        try {

            int rowAffected = model.register();

            if (rowAffected == 0) {
                resp.sendRedirect("/RegistrationApp/failure.jsp");
            } else {
                resp.sendRedirect("/RegistrationApp/success.jsp");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            resp.sendRedirect("/RegistrationApp/failure.jsp");
        }
    }
}