package com.thinkitive;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class One
 */
@WebServlet("/One")
public class One extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Integer counter = 0;

	public One() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		counter = (Integer) session.getAttribute("count");
		if (counter != null) {
			counter++;
			session.setAttribute("count", counter);
		} else {
			counter = 0;
			counter++;
			session.setAttribute("count", counter);
		}
		response.getWriter().println("SEVLET ONE VISITOR:" + counter);

	}

}
