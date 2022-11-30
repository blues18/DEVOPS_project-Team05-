<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
crossorigin="anonymous">

</head>
<body>

<div class="row"> 
		<div class="container">
				<h3 class="text-center">List of Users</h3>
				<hr>
				<div class="container text-left">
				
						<!-- Add new user button redirects to the register.jsp page -->
						<a href="<%=request.getContextPath()%>/register_page.jsp" class="btn btnsuccess">Add New User</a>
				</div>
				<br>
				
				<!-- Create a table to list out all current users information -->
				<table class="table">
						<thead>
								<tr>
										<th>UserName</th>
										<th>Password</th>
										<th>Email</th>
										<th>Races</th>
										<th>Actions</th>
								</tr>
						</thead>
						
						<!-- Pass in the list of users receive via the Servlet's response to a loop -->
						<tbody>
								<c:forEach var="user" items="${listUsers}">
								
										<!-- For each user in the database, display their information accordingly -->
										<tr>
												<td>
														<c:out value="${user.username}" />
												</td>
												<td>
														<c:out value="${user.password}" />
												</td>
												<td>
														<c:out value="${user.email}" />
												</td>
												<td>
														<c:out value="${user.races}" />
												</td>
												
												<!-- For each user in the database, Edit/Delete buttons which invokes the edit/delete functions -->
												<td>
														<a href="edit?username=<c:out value='${user.username}' />">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; 
														<a href="delete?username=<c:out value='${user.username}' />">Delete</a>
												</td>
										</tr>
								</c:forEach>
						</tbody>
				</table>
		</div>
</div>

</body>
</html>