package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloservlet") // URL PATTERN URL MAPPING
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int count;

	public HelloWorld() {
		super();

	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Init method..........");
		count = 0;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		count++;
		PrintWriter out = response.getWriter();
		out.println("GET:You are visitor number:" + count);

		String user = request.getParameter("txtusername");
		String pass = request.getParameter("txtpassword");

		out.println(user + " " + pass);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		count++;
		PrintWriter out = response.getWriter();
		out.println("POST:You are visitor number:" + count);

		String user = request.getParameter("txtusername");
		String pass = request.getParameter("txtpassword");

		out.println(user + " " + pass);

	}

	@Override
	public void destroy() {

		super.destroy();
		System.out.println("destroy method..........");
	}

}
