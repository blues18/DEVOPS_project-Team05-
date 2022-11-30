<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style><%@include file="css_folder/productPage.css"%></style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
</head>
<body>
	<div class="row" style="margin:20px" >
		<c:forEach var="product" items="${listProduct}">
			<div class="card" style="width: 300px;">
				<img class="card-img-top"
					src="https://assets3.razerzone.com/nEsJXUYAls6UuUkdmeD1pO2KJxA=/500x500/https%3A%2F%2Fhybrismediaprod.blob.core.windows.net%2Fsys-master-phoenix-images-container%2Fhe1%2Fh43%2F9451887427614%2Fnaga-v2-pro-500x500.png"
					alt="">
				<div class="card-body">
					<h5 class="card-title">
						<c:out value="${product.product_name}" />
					</h5>
					<row>
					<button type="button" class="btn btn-outline-primary" disabled>
						<c:out value="${product.product_type}" />
					</button>
					<button type="button" class="btn btn-outline-info" disabled>
						<c:out value="${product.product_brand}" />
					</button>
					</row>
					<p></p>
					<h5 class="card-text">
						S$
						<c:out value="${product.product_price}" />
					</h5>
					<p class="card-text">
						"
						<c:out value="${product.product_discription}" />
						"
					</p>
					<row> 
						<a
						href="get_name?product_name=<c:out value='${product.product_name}'/>"
						class="btn btn-success">See Product</a> <a href="#"
						class="btn btn-danger"><i class="fa fa-heart"
						style="font-size: 22px;"></i> 
						</a> 
					</row>
				</div>
			</div>
		</c:forEach>
	</div>
</body>
</html>