<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h3>Welcome in School Management System Application</h3>
	<table border="1">
		<thead>
			<tr>
				<td>ID</td>
				<td>NAME</rd>
				<td>MOBILE</td>
				<td>COUNTRY</td>
			</tr>
		</thead>
		<c:forEach var="student" items="${students}">
		<tr>
			<td>${student.id}</td>
			<td>${student.name}</td>
			<td>${student.mobile}</td>
			<td>${student.country}</td>
		</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>