package com.dvops.maven.eclipse;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class tableServlet
 */
@WebServlet("/tableServlet")
public class tableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public tableServlet(String username, String password, String email, String races) {
		super();
		// TODO Auto-generated constructor stub
		this.username = username;
		this.password = password;
		this.email = email;
		this.races = races;

		this.username = "2";
		this.password = "2";
		this.email = "2";
		this.races = "2";

	}

	protected String username;
	protected String password;
	protected String email;
	protected String races;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
