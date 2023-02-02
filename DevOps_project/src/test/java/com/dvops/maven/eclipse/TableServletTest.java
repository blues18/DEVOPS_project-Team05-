package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TableServletTest {

	private HttpServletRequest request;
	private HttpServletResponse response;
	private StringWriter stringWriter;
	private tableServlet servlet;

	@BeforeEach
	void setUp() throws Exception {
		servlet = new tableServlet();
		request = Mockito.mock(HttpServletRequest.class);
		response = Mockito.mock(HttpServletResponse.class);
		stringWriter = new StringWriter();
		Mockito.when(response.getWriter()).thenReturn(new PrintWriter(stringWriter));
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDoGet() throws ServletException, IOException {
		servlet.doGet(request, response);
		assertTrue(stringWriter.toString().contains("Served at: "));
	}

	@Test
	void testDoPost() throws ServletException, IOException {
		servlet.doPost(request, response);
		assertTrue(stringWriter.toString().contains("Served at: "));
	}
}