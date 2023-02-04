package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductServletTest {
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	private RequestDispatcher requestDispatcher;
	private ProductServlet productServlet;

	@BeforeEach
	void setUp() throws Exception {
		productServlet = new ProductServlet();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetConnection() throws SQLException, IOException {
		Connection connection = productServlet.getConnection();
		assertNotNull(connection);
	}
	
	@Test
    void testShowProductDetail() throws Exception, IOException {
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        requestDispatcher = mock(RequestDispatcher.class);

        when(request.getParameter("product_name")).thenReturn("product1");
        when(request.getRequestDispatcher("/productDetail_page.jsp")).thenReturn(requestDispatcher);

        productServlet.showProductDetail(request, response);
        products_model product = (products_model) request.getAttribute("Product");
    }
	
	
	@Test
	void testListProduct() throws SQLException, IOException, ServletException {
		productServlet = new ProductServlet();
		request = mock(HttpServletRequest.class);
		response = mock(HttpServletResponse.class);
		requestDispatcher = mock(RequestDispatcher.class);

		when(request.getRequestDispatcher("/viewAllproduct.jsp")).thenReturn(requestDispatcher);
		productServlet.listProduct(request, response);
	}

	@Test
	void testDoGetHttpServletRequestHttpServletResponse() throws Exception, IOException {
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);

		when(response.getWriter()).thenReturn(printWriter);

		when(request.getServletPath()).thenReturn("/ProductServlet/listDisplay");
		productServlet.doGet(request, response);

		when(request.getServletPath()).thenReturn("/ProductServlet/get_name");
		productServlet.doGet(request, response);

		String result = stringWriter.toString();
		assertNotNull(result);
	}
	
	
	
	
}