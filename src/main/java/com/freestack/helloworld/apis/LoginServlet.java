package com.freestack.helloworld.apis;

import com.freestack.helloworld.apis.exception.RegisterException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/loginServlet")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp)
	throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		try {

			User authenticatedUser = UserApi.authenticate(username, password);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/userInfo.jsp");
			request.getSession().setAttribute("authenticatedUser", authenticatedUser);
			dispatcher.forward(request, resp);

		} catch (Exception e) {

			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
			request.setAttribute("errorMessage", e.getMessage());
			dispatcher.forward(request, resp);

		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<User> users = UserApi.getUsers();
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/userList.jsp");
		req.setAttribute("users", users);
		dispatcher.forward(req, resp);

	}
}
