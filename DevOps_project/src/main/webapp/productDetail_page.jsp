<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="includes/header.jsp"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>products</title>
</head>
<body>
	<div class="container col-md-6">
		<div class="card">
			<div class="card-body">
			<form>
				<fieldset class="form-group">
					<label>Name</label> 
					<input type="text" value="${Product.product_name}" 
					class="form-control" name="product_name" readonly>
          
				</fieldset>
				<fieldset class="form-group">
					<label>Prices</label> 
					<input type="text" value="${Product.product_price}" 
					class="form-control" name="product_price"readonly>
          
				</fieldset>
				<fieldset class="form-group">
					<label>Description</label> 
					<input type="text" value="${Product.product_description}" 
					class="form-control" name="product_description"readonly>

				</fieldset>
				<fieldset class="form-group">
					<label> Brand</label> 
					<input type="text" value="${Product.product_brand}" 
					class="form-control" name="product_brand"readonly>
          
				</fieldset>
				<button type="submit" class="btn btn-success">Add to Cart</button>
				</form>
			</div>
		</div>
	</div>


</body>
</html>