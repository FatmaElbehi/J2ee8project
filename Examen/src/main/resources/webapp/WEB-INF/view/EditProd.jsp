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
<title>Edit Product</title>
	<meta http-equiv="Content-Type" content="text/html; charset=windows-1256"/>
</head>
<body>
	<div class="container">
<div class="card-body"> 
 				Welcome to Products Space!   
  		 <a href="/getProducts" class="nav-link">Back</a>				
  			</div>
  		<div class="card-body">
  		
  		
		<form action="/updateProduct" method="post" enctype="multipart/form-data">
		<h1 align="center"> Update Product </h1>
		   <table>
		    <tr>
		      <td><label class="control-label">ID :</label></td>
		      <td><input type="text" name="id" class="form-control" value="${products.idProd}" readonly></td>
		   </tr>
		   <tr>
		   	  <td><label class="control-label">Name :</label></td>		   
		      <td><input type="text" name="name" class="form-control" value="${products.name_product}"></td>
		   </tr>
		    <tr>
		      <td><label class="control-label">Price :</label></td>		   
		      <td><input type="number" name="price" class="form-control" value="${products.price}"></td>
		   </tr>
		   <tr>
		      <td><label class="control-label">Categorie :</label></td>		
		      		      
		      <td>
 					<div class="form-group">   
		    	 	<select name="categ" class="form-control">
         		 		<c:forEach items="${products.categ}" var="listCateg">        
            				<option value="${listCateg.id_cat}">${listCateg.name_cat}</option>
        	 			</c:forEach>
      		 		</select>
      				 </div>		  
      	     </td>    
		   </tr>
		    <tr>
		      <td><label class="control-label">Description :</label></td>		   
		      <td><textarea rows="6" cols="20" name="desc" class="form-control" value="${products.description}"></textarea></td>
		   </tr>
		   <tr>
		     <td><label class="control-label">Disponibility :</label></td>		   
		      <td><input type="text" name="disp" class="form-control" value="${products.disponibility}"></td>
		   </tr>
		   <tr>
		   	  <td><label class="control-label">Photo :</label></td>		   
		      <td><input type="file" name="photo" size="50" class="form-control" value="${products.Img}"/></td>
		   </tr>
		   </table>		   
		   <input type="submit" value="Update"  class="btn btn-danger" style="margin-left:650px;margin-top:20px;"/>
		</form>
		</div>
		${msg}
		</div>
	
</body>
</html>