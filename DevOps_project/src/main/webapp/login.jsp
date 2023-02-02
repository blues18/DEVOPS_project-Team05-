<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login JSP</title>
<%@include file="includes/header.jsp" %>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
</head>
<style>  
html {   
    height: 100%;   
}  
body {   
    height: 100%;   
}  
.global-container {  
    height: 100%;  
    display: flex;  
    align-items: center;  
    justify-content: center;  
    background-color: #f5f5f5;  
}  
form {  
    padding-top: 10px;  
    font-size: 14px;  
    margin-top: 30px;  
}  
.card-title {   
font-weight: 300;  
 }  
.btn {  
    font-size: 14px;  
    margin-top: 20px;  
}  
.login-form {   
    width: 330px;  
    margin: 20px;  
}  
.sign-up {  
    text-align: center;  
    padding: 20px 0 0;  
}  
.alert {  
    margin-bottom: -30px;  
    font-size: 13px;  
    margin-top: 20px;  
}  
</style>  
<body style='background-color: lightblue;'>  
  <div class="global-container">  
    <div class="card login-form">  
    <div class="card-body">  
        <h3 class="card-title text-center"> Login Credentials </h3>  
        <div class="card-text">  
            <form action="loginServlet" method="post">  
                <div class="form-group">  
                    <label> Enter Username </label>  
                    <input type="text" class="form-control form-control-sm" name="userName">  
                </div>  
                <div class="form-group">  
                    <label>Enter Password </label>  
                    <a href="#" style="float:right;font-size:12px;"> Forgot password? </a>  
                    <input type="text" class="form-control form-control-sm" name="passWord">  
                </div>  
                <button type="submit" class="btn btn-primary btn-block" value="submit values" id="submit" name="submit"> Sign in </button>  
                <div class="sign-up">  
                    Don't have an account? <a href="<%=request.getContextPath()%>/register_page.jsp"> Create One </a>
                </div>  
            </form>  
        </div>  
    </div>
</div>  
</div>  
</body> 
</html>