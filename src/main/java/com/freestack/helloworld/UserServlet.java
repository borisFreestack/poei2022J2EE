package com.freestack.helloworld;

import com.freestack.helloworld.youtube.apis.UserApi;
import com.freestack.helloworld.youtube.exceptions.RegisterException;
import com.freestack.helloworld.youtube.models.Creator;
import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String birthDate = req.getParameter("birthdate");
        Creator user = new Creator(username, password);
        user.setBirthDate(LocalDate.parse(birthDate));
        try {
            UserApi.register(user);
            req.setAttribute("user", user);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
            dispatcher.forward(req, resp);
        } catch (RegisterException e) {
            req.setAttribute("message", e.getMessage());
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
