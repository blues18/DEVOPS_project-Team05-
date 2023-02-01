package com.dvops.maven.eclipse;
import static org.mockito.Mockito.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.Test;

class RegisterTest {

	@Test
	void testDoGet() throws ServletException, IOException {
		registerServlet servlet = new registerServlet();
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		when(response.getWriter()).thenReturn(writer);
		servlet.doGet(request, response);
		verify(response).setContentType("text/html");
		if (writer != null) {
			writer.append("Served at: ");
			writer.append(request.getContextPath());
		}
		verify(writer, times(1)).close();
	}

	@Test
	void testDoPost() throws ServletException, IOException {
		registerServlet servlet = new registerServlet();
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		when(request.getParameter("userName")).thenReturn("username");
		when(request.getParameter("passWord")).thenReturn("password");
		when(request.getParameter("email")).thenReturn("email@example.com");
		when(request.getParameter("race")).thenReturn("chinese");
		PrintWriter writer = mock(PrintWriter.class);
		when(response.getWriter()).thenReturn(writer);
		servlet.doPost(request, response);
		verify(request).getParameter("userName");
		verify(request).getParameter("passWord");
		verify(request).getParameter("email");
		verify(request).getParameter("race");
		verify(response).setContentType("text/html");
		if (writer != null) {
			writer.println("<h1>" + " successfully registered an account!" + "</h1>");
		}
		verify(writer, times(1)).close();
	}
}