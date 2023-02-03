package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class UserServletTest {

	private UserServlet userServlet;
	private HttpServletRequest request;
	private HttpServletResponse response;

	@BeforeEach
	void setUp() throws Exception {
		userServlet = new UserServlet();
		request = Mockito.mock(HttpServletRequest.class);
		response = Mockito.mock(HttpServletResponse.class);
	}

	@AfterEach
	void tearDown() throws Exception {
		userServlet = null;
		request = null;
		response = null;
	}

	@Test
	void testGetConnection() throws SQLException {
		Connection connection = userServlet.getConnection();
		assertNotNull(connection);
	}
	
	@Test
	void testListUsers() throws SQLException, IOException, ServletException {
		List<User> expectedUsers = new ArrayList<>();
		expectedUsers.add(new User("user1", "password1", "email1", "race1"));
		expectedUsers.add(new User("user2", "password2", "email2", "race2"));
		expectedUsers.add(new User("user3", "password3", "email3", "race3"));

		userServlet.listUsers(request, response);

		List<User> actualUsers = (List<User>) request.getAttribute("listUsers");
		assertEquals(expectedUsers, actualUsers);
	}
	
	@Test
	void testShowEditForm() throws SQLException, ServletException, IOException {
		String username = "testuser";
		User expectedUser = new User("testuser", "password", "email", "race");
		Mockito.when(request.getParameter("username")).thenReturn(username);

		userServlet.showEditForm(request, response);

		User actualUser = (User) request.getAttribute("user");
		assertEquals(expectedUser, actualUser);
		Mockito.verify(request).setAttribute("user", expectedUser);
		Mockito.verify(request).getRequestDispatcher("/userEdit.jsp");
		Mockito.verify(request.getRequestDispatcher("/userEdit.jsp")).forward(request, response);
	}
	
	@Test
	void testUpdateUser() throws SQLException, IOException {
		String oriName = "tester";
		String username = "tester";
		String password = "password";
		String email = "tester@gmail.com";
		String races = "chinese";

		Mockito.when(request.getParameter("oriName")).thenReturn(oriName);
		Mockito.when(request.getParameter("username")).thenReturn(username);
		Mockito.when(request.getParameter("password")).thenReturn(password);
		Mockito.when(request.getParameter("email")).thenReturn(email);
		Mockito.when(request.getParameter("races")).thenReturn(races);
		
		userServlet.updateUser(request, response);
		Mockito.verify(response).sendRedirect("http://localhost:8090/DevOps_project/UserServlet/dashboard");
	}
	
	@Test
	void testDeleteUser() throws SQLException, IOException {
		String username = "username";
		Mockito.when(request.getParameter("username")).thenReturn(username);

		userServlet.deleteUser(request, response);

		Mockito.verify(response).sendRedirect("http://localhost:8090/DevOps_project/UserServlet/dashboard");
	}


	@Test
	void testDoGetHttpServletRequestHttpServletResponse() throws ServletException, IOException {
		userServlet.doGet(request, response);
		Mockito.verify(response).getWriter();
	}

	@Test
	void testDoPostHttpServletRequestHttpServletResponse() throws ServletException, IOException {
		userServlet.doPost(request, response);
		Mockito.verify(response).getWriter();
	}

}