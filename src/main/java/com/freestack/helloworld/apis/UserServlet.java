package com.freestack.helloworld.apis;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/userServlet")
public class UserServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp)
	throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String birthDate = request.getParameter("birthDate");
		String genre = request.getParameter("gender");

		User newUser = new User(firstName, lastName, birthDate, genre);

		resp.getWriter().println("User created" + newUser.toString());

	}
}
