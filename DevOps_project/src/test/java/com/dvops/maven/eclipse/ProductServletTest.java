package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductServletTest {

	private ProductServlet productServlet;

	@BeforeEach
	void setUp() throws Exception {
		productServlet = new ProductServlet();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetConnection() throws SQLException {
		Connection connection = productServlet.getConnection();
		assertNotNull(connection);
	}

	@Test
	void testDoGetHttpServletRequestHttpServletResponse() throws Exception {
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);

		when(request.getServletPath()).thenReturn("/ProductServlet/listDisplay");
		productServlet.doGet(request, response);

		when(request.getServletPath()).thenReturn("/ProductServlet/get_name");
		productServlet.doGet(request, response);
	}
}
