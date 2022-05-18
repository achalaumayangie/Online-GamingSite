<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<C:forEach var="us" items="${usDetails}">
	
	
	<tr>
		<td>user ID</td>
		<td>${us.id}</td>
	</tr>
	<tr>
		<td>user Name</td>
		<td>${us.name}</td>
	</tr>
	<tr>
		<td>user Email</td>
		<td>${us.email}</td>
	</tr>
	<tr>
		<td>user Comment</td>
		<td>${us.comment}</td>
	</tr>
	
	</C:forEach>
	</table>



</body>
</html>