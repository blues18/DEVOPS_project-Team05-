<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login JSP</title>
</head>
<body>
	<h1>Login credential</h1>
	<form action="loginServlet" method="post">
		<label>UserName</label><input type="text" name="userName">
		<label>Password</label><input type="text" name="passWord">
		<input type="submit" value="submit values">
	</form>
</body>
</html>