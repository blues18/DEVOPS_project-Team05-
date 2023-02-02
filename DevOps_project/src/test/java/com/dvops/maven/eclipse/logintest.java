package com.dvops.maven.eclipse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LoginTest {
   private loginServlet servlet;
   private HttpServletRequest request;
   private HttpServletResponse response;
   private StringWriter stringWriter;

   @BeforeEach
   public void setUp() throws Exception {
      servlet = new loginServlet();
      request = Mockito.mock(HttpServletRequest.class);
      response = Mockito.mock(HttpServletResponse.class);
      stringWriter = new StringWriter();
      Mockito.when(response.getWriter()).thenReturn(new PrintWriter(stringWriter));
   }

   @Test
   public void testDoGet() throws ServletException, IOException {
      servlet.doGet(request, response);
      assertTrue(stringWriter.toString().contains("Served at:"));
   }

   @Test
   public void testDoPostSuccess() throws ServletException, IOException {
      Mockito.when(request.getParameter("userName")).thenReturn("blue");
      Mockito.when(request.getParameter("passWord")).thenReturn("ezeikel");
      servlet.doPost(request, response);
      assertTrue(stringWriter.toString().contains("You have Successfully login"));
   }

   @Test
   public void testDoPostFail() throws ServletException, IOException {
      Mockito.when(request.getParameter("userName")).thenReturn("incorrect");
      Mockito.when(request.getParameter("passWord")).thenReturn("incorrect");
      servlet.doPost(request, response);
      assertTrue(stringWriter.toString().contains("Get OUT 1"));
   }
}