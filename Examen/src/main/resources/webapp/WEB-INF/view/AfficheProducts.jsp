<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
             <%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
	<c:url value="/css/main.css" var="jstlCss" />
	<link href="${jstlCss}" rel="stylesheet" />
	<script type="text/javascript" src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta charset="ISO-8859-1">
<title>Products List</title>
	<meta http-equiv="Content-Type" content="text/html; charset=windows-1256"/>
</head>
<body>
<!--  <%@include file="header.jsp" %>-->
<div class="container">
<div class="card">
  <div class="card-header">
    Welcome to Products Space! 
  </div>
  <div class="card-body">
 				   
                  <a href="/addProducts" class="nav-link">Add Product</a>  				
  			</div>
  	<div class="card-body">
                <h1 align="center"> Products List </h1>
				<table class="table table-striped">
					<tr>
						<th>Id</th>
						<th>Product_Name</th>
						<th>Price</th>
						<th>Description</th>
						<th>Disponibility</th>
						<!-- <th>Categorie</th>-->
						<th>Delete<th>
						<th>Edit</th>
					</tr>
					<c:forEach var="listProd" items="${products}">
						<tr>
						
								<td>${listProd.id_prod}</td>
								<td>${listProd.name_product}</td>
								<td>${listProd.price}</td>
								<td>${listProd.description}</td>
								<td>${listProd.disponibility}</td>
								<!-- <td><img src="data:images/${listProd.img}" width="240" height="300"/></td>-->
								<td>${listProd.categ}</td>
								
								<!-- <td>${listProd.img}</td>-->
								<td><a onclick="return confirm('Are you sure you want to delete this Product ?')" href="deleteProduct?id_prod=${listProd.id_prod}">Delete</a></td>
               					<td><a href="updateProduct?id_prod=${listProd.id_prod}">Edit</a></td>						
               			  
               			  </tr>
               			  
               			  </c:forEach>
               		
                  </table>
                  </div>
                  </div>
                  </div>
</body>
</html>