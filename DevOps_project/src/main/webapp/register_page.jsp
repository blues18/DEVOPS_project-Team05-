<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<%@include file="includes/header.jsp"%>
<link href="css_folder/register.css" rel="stylesheet" type="text/css">
</head>

<style>
@media (min-width: 1025px) {
.h-custom {
height: 100vh !important;
}
}
</style>
<body>
<section class="h-100 h-custom" style="background-color: #00A6CF;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
          <img src="https://wallpaperaccess.com/full/4525229.jpg"
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
          <div class="card-body p-4 p-md-5">
            <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Registration</h3>
            
            <form class="px-md-2" action="registerServlet" method="post">
              <div class="form-group">
                <input type="email" class="form-control" name="email" aria-describedby="emailHelp"/>
                <label class="form-label" for="form3Example1q">Email</label>
                <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
              </div>
              <div class="row">
                <div class="col-md-6 mb-4">
                  <div class="form-group">
                    <input type="text" class="form-control" name="userName"/>
                    <label for="exampleInputUsername" class="form-label">Username</label>
                  </div>
                </div>
                  <div class="form-group">
                    <input type="password" class="form-control" name="passWord" />
                    <label class="form-label" for="exampleInputPassword1">Password</label>
                  </div>
              </div>
				<div class="row">
                <div class="col-12">
                  <select class="select form-control-lg" name="races">
                    <option value="1" disabled>Choose your Race</option>
                    <option value="Chinese">Chinese</option>
                    <option value="Malay">Malay</option>
                    <option value="Indian">Indian</option>
                    <option value="Eurasian">Eurasian</option>
                  </select>
                </div>
              </div>
              <div class="mt-4 pt-2">
              <button class="btn btn-primary btn-lg" type="submit" value= "call Servlet" name="submit">Submit</button>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
