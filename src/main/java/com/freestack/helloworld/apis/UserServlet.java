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

@WebServlet(value = "/userServlet")
public class UserServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp)
	throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String birthDate = request.getParameter("birthDate");
		String genre = request.getParameter("gender");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User newUser = new User(username, password, firstName, lastName, birthDate, genre);

		try {
			UserApi.register(newUser);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/userInfo.jsp");
			request.setAttribute("user", newUser);
			dispatcher.forward(request, resp);
		} catch (RegisterException e) {
			resp.getWriter().println("Un utilisiteur avec ce pseudonyme existe déjà!");
			resp.getWriter().close();
			resp.setStatus(409);
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
