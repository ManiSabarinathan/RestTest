<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Add Employee </h1>
	
	<form:form action="saveEmployee" modelAttribute="employeeObj">
		Enter name    : <form:input path="name"/> <br>
		Select Gender: <form:radiobutton path="gender" value = "Male"/>Male&nbsp;
					   <form:radiobutton path="gender" value = "Female"/>Female&nbsp;<br/>
						
						
		<button type="submit"> Save </button>
	</form:form>
	
	
</body>
</html>