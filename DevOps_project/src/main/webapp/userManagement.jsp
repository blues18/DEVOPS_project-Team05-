<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" 
href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
crossorigin="anonymous">
</head>
<body>

<div class="row"> 
		<div class="container">
				<h3 class="text-center">List of Users</h3>
				<hr>
				<div class="container text-left">
				
						<a href="<%=request.getContextPath()%>/register_page.jsp" class="btn btn success">Add New User</a>
				</div>
				<br>
				
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
						
						<tbody>
								<c:forEach var="user" items="${listUsers}">
								
										<tr>
												<td>
														<c:out value="${user.name}" />
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
												
												<td>
														<a href="edit?name=<c:out value='${user.name}' />">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; 
														<a href="delete?name=<c:out value='${user.name}' />">Delete</a>
												</td>
										</tr>
								</c:forEach>
						</tbody>
				</table>
		</div>
</div>
</body>
</html>