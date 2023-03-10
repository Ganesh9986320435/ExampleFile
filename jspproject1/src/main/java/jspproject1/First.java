package jspproject1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class First extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstname=req.getParameter("firstname");
		req.setAttribute("fname", firstname);
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("home.jsp");
		requestDispatcher.forward(req, resp);
	}
}
