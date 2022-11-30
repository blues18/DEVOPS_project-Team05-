package com.dvops.maven.eclipse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserServlet() {
        super();
    }
    
    private String jdbcURL = "jdbc:mysql://localhost:3306/userdetails_storage";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Ezeikel888=";
    
	private static final String INSERT_USERS_SQL = "INSERT INTO UserDetails_Storage" + " (username, password, email, races) VALUES " +" (?, ?, ?);";
	private static final String SELECT_USER_BY_ID = "select username,password,email,races from UserDetails_Storage where username =?";
	private static final String SELECT_ALL_USERS = "select * from UserDetails_Storage ";
	private static final String DELETE_USERS_SQL = "delete from UserDetails_Storage where username = ?;";
	private static final String UPDATE_USERS_SQL = "update UserDetails_Storage set username = ?,password= ?,email =?,races =? where username = ?;";
	
	protected Connection getConnection() {
 		 Connection connection = null;
 		 try {
 			 Class.forName("com.mysql.jdbc.Driver");
 			 connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
 		 } catch (SQLException e) {
 			 e.printStackTrace();
 		 } catch (ClassNotFoundException e) {
 			 e.printStackTrace();
 		 }
 		 return connection;
 	 }
	
	private void listUsers(HttpServletRequest request, HttpServletResponse response)
		  	 throws SQLException, IOException, ServletException 
		  	 {
		  			 List <User> users = new ArrayList <>();
		  			  try (Connection connection = getConnection();
		  					  
		  					PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
		  				  
		  				  	ResultSet rs = preparedStatement.executeQuery();
		  				  	
		  				  while (rs.next()) {
	  						  String username = rs.getString("username");
	  						  String password = rs.getString("password");
	  						  String email = rs.getString("email");
	  						  String races = rs.getString("races");
	  						  users.add(new User(username, password, email, races));
	  						  
		  				}
	  			  } catch (SQLException e) {
	  				  System.out.println(e.getMessage());
	  			  }
		  			  
		request.setAttribute("listUsers", users);
		request.getRequestDispatcher("/userManagement.jsp").forward(request, response);
		}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String action = request.getServletPath();
	 	try {
	 		switch (action) {
	 			case "/insert":	 	
 					break;
	 			case "/delete":
	 				break;
	 			case "/edit":
	 				break;
	 			case "/update":
	 				break;
 				default:
 					listUsers(request,response);
 					break;
	 		}
	 	} catch (SQLException ex) {
	 		throw new ServletException(ex);
	 	}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
