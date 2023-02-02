package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

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
	void testDoGetHttpServletRequestHttpServletResponse() throws ServletException, IOException {
		userServlet.doGet(request, response);
		// Verify that the response was sent back to the client
		Mockito.verify(response).getWriter();
	}

	@Test
	void testDoPostHttpServletRequestHttpServletResponse() throws ServletException, IOException {
		userServlet.doPost(request, response);
		// Verify that the response was sent back to the client
		Mockito.verify(response).getWriter();
	}

}