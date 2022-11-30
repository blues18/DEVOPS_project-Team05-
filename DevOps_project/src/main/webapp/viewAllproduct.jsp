<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<link rel="stylesheet" href="CSS_folder/viewAllproduct.css">
</head>
<body>
	<div class="row">
		<c:forEach var="product" items="${listProduct}">
			<div class="card" style="width: 18rem;">
				<div class="imageContainer">
					<img class="card-img-top" src="" alt="images/laptop.JPG">
				</div>
				<div class="card-body">
					<h5 class="card-title">
						<c:out value="${product.product_name}" />
					</h5>
					<p class="card-text">
						<c:out value="${product.product_brand}" />
					</p>
					<h5><c:out value="${product.product_price}" /></h5>
					<p class="card-text">
						<c:out value="${product.product_discription}" />
					</p>
					<p class="card-text">
						<c:out value="${product.product_stocks}" />
					</p>					
					<a href="get_name?product_name=<c:out value='${product.product_name}'/>" class="btn btn-primary">See More</a>
				</div>
			</div>
		</c:forEach>
	</div>

</body>
</html>