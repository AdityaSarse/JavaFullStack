package org.example;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        System.out.println("Control in First Servlet");


        String name=req.getParameter("uname");
        String city=req.getParameter("ucity");

        RequestDispatcher reqDispatch =
                req.getRequestDispatcher("/SecondServlet");

        HttpSession session = req.getSession();
        session.setAttribute("name",name);
        session.setMaxInactiveInterval(10000);

        reqDispatch.forward(req, resp);
    }
}