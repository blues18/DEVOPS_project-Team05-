<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<link rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<style>
<%@include file="style.css"%>
</style>
</head>
<body>
<div class ="image">
<br><br>
<h1>
Welcome to E-shop!</h1>
<br><br><br><br><br>
<h2><a class="nav-link" href="<%=request.getContextPath()%>/ProductServlet/listDisplay">Click here to view products</a></h2>
</div>

</body>
</html>