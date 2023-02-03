package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class RegisterServletTest {
	
	@Test
	void testDoGet() throws ServletException, IOException {
		registerServlet servlet = new registerServlet();
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		when(response.getWriter()).thenReturn(writer);
	}
	
	@Test
	void testDoPost() throws ServletException, IOException {
		registerServlet servlet = new registerServlet();
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		when(request.getParameter("userName")).thenReturn("username");
		when(request.getParameter("passWord")).thenReturn("password");
		when(request.getParameter("email")).thenReturn("email@example.com");
		when(request.getParameter("races")).thenReturn("race");
		when(response.getWriter()).thenReturn(writer);
		servlet.doPost(request, response);
		verify(response).setContentType("text/html");
		verify(writer).println("<h1>" +" successfully registered an account!" + "</h1>");
		verify(writer).close();
	}
}