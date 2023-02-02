package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.Test;

class TestingJavaTest {

	private testingjava servlet = new testingjava();
	private HttpServletRequest request = mock(HttpServletRequest.class);
	private HttpServletResponse response = mock(HttpServletResponse.class);
	private StringWriter stringWriter = new StringWriter();
	private PrintWriter writer = new PrintWriter(stringWriter);

	@Test
	void testDoGet() throws Exception {
		when(response.getWriter()).thenReturn(writer);

		servlet.doGet(request, response);

		assertEquals("Served at: ", stringWriter.toString());
	}

	@Test
	void testDoPost() throws Exception {
		when(request.getParameter("yourName")).thenReturn("John");
		when(response.getWriter()).thenReturn(writer);

		servlet.doPost(request, response);

		assertEquals("<h1> Hello John </h1>", stringWriter.toString());
	}

}