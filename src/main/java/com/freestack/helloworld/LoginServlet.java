package com.freestack.helloworld;

import com.freestack.helloworld.youtube.apis.UserApi;
import com.freestack.helloworld.youtube.exceptions.LoginException;
import com.freestack.helloworld.youtube.models.Creator;
import com.freestack.helloworld.youtube.models.User;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        RequestDispatcher dispatcher;
        try {
            User userLogged = UserApi.login(username, password);
            req.getSession().setAttribute("userLogged", userLogged);
            dispatcher = getServletContext().getRequestDispatcher(
                    "/upload.jsp");
        } catch (LoginException e) {
            req.setAttribute("invalidCredentials", true);
            dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
        }
        dispatcher.forward(req, resp);
    }
}
