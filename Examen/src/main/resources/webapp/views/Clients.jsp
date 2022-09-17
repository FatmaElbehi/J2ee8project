<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
             <%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Client listing</title>
        <link href="<c:url value="/css/common.css"/>" rel="stylesheet" type="text/css">

</head>
<body>
<%@include file="header.jsp" %>

<c:choose>
	<c:when test="${sessionScope.login !=null }">
	<div class="container">
		<div class="card">
  			<div class="card-header">
 Welcome to Clients Space!                 
  			</div>
  	<div class="card-body">

                <h1 align="center"> Clients List </h1>
				<table class="table table-striped">
					<tr>
						<th>Id</th>
						<th>Client_Name</th>
						<th>Email</th>
						<th>Adresse</th>
						<th>Telephone</th>
						<th>Delete</th>
						<th>Edit</th>
					</tr>
                   <c:forEach var="listC" items="${requestScope.listC}">
						<tr>
								<td>${listC.id_user}</td>
								<td>${listC.name}</td>
								<td>${listC.email_user}</td>
								<td>${listC.adresse_client}</td>
								<td>${listC.tel_client}</td>
								<td><a onclick="return confirm('Are you sure you want to delete this client ?')" href="deleteClient?id_user=<c:out value='${listC.id_user}'/>">Delete</a></td>
								<td><a href="./EditClient.jsp?id_user=<c:out value='${listC.id_user}' />">Edit</a></td>	
						</tr>
					
                  </c:forEach>
                  </table>
                  </div>
                  </div>
                  </div>
                  </c:when>
                  </c:choose>
</body>
</html>