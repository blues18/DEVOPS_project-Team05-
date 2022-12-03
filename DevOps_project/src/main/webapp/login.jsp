<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login JSP</title>
<%@include file="includes/header.jsp" %>
<link href="css_folder/login.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
</head>
<body>
<section class="h-100 h-custom" style="background-color: #00A6CF;">
  <div class="global-container">  
    <div class="card login-form">  
    <div class="card-body">  
        <h3 class="card-title text-center"> Login Credentials </h3>  
        <div class="card-text">  
            <form action="LoginServlet" method="post">  
                <div class="form-group">  
                    <label> Enter Username </label>  
                    <input type="text" class="form-control form-control-sm" name="userName">  
                </div>  
                <div class="form-group">  
                    <label>Enter Password </label>  
                    <a href="#" style="float:right;font-size:12px;"> Forgot password? </a>  
                    <input type="text" class="form-control form-control-sm" name="passWord">  
                </div>  
                <button type="submit" class="btn btn-primary btn-block" value="submit values"> Sign in </button>  
                <div class="sign-up">  
                    Don't have an account? <a href="#"> Create One </a>  
                </div>  
            </form>  
        </div>  
    </div>
</div>  
</div>
</section>
</body> 
</html>