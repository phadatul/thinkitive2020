package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user = request.getParameter("txtusername");
		String pass = request.getParameter("txtpassword");
		if (user.equals("admin") && pass.equals("admin")) {
			HttpSession session = request.getSession(); // OPEN SESSION IF EXISTS ELSE CREATE NEW
			session.setAttribute("sessionkey", "!234567");  //you can share any data using session also
			response.sendRedirect("ProfileServlet");

		} else {
			out.println("Invalid username/password.....");
		}
	}

}
