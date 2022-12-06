package com.dvops.maven.eclipse;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("userName");
		String password = request.getParameter("passWord");
		String storedUsername = "userName";
		String StoredPassword = "passWord";
		
		if(username == storedUsername){
			System.out.println("Okay");
			PrintWriter writer = response.getWriter();
			writer.println("<h1> You have Successfully login </h1>");
			writer.close();
			doGet(request, response);
		}else{
			System.out.println("fail");
			PrintWriter writer = response.getWriter();
			writer.println(
					"<h1> Get OUT 1</h1> "
					+"<div>" + username + " " + password + "</div>" 
					+"<div>" + storedUsername + " " + StoredPassword + "</div>" 
					);
			writer.close();
			doGet(request, response);
		};
		
		
	}

}
