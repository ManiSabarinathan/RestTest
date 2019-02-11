<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> 
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Employee List </h1>
	
	<table border = "1">
		<tr>
			<th>Name</th>
			<th>Gender</th>			
		</tr>
		<c:forEach items="${employeeList}" var="e">
			<tr>
				<td>${e.name}</td>
				<td>${e.gender}</td>				
			</tr>
		</c:forEach>
	</table>
	<button onclick="window.location.href = 'showAddForm' ">Add Employee</button>
	
</body>
</html>