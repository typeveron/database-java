<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Result</title>
</head>
<body>
<div align="center">
<h1>Search Result</h1>
<table border="1" padding="5">
<tr>
<th>Id</th>
<th>First Name</th>
<th>Family Name</th>
<th>Birthdate</th>
<th>Email</th>
<th>Phone</th>
<th>Gender</th>
<th>PaymentCard</th>
<th>Address</th>
<th>Flight Location</th>
<th>Action</th>
<th></th>
</tr>
<c:forEach items="${result}" var="passenger">
<tr>
<td>${passenger.id}</td>
<td>${passenger.name}</td>
<td>${passenger.birthdate}</td>
<td>${passenger.email}</td>
<td>${passenger.phone}</td>
<td>${passenger.gender}</td>
<td>${passenger.paymentCard}</td>
<td>${passenger.address}</td>
<td>${passenger.flightLoc}</td>
<td>
<a href="edit?id=${passenger.id}">Edit</a>&nbsp;&nbsp;&nbsp;
<a href="delete?id=${passenger.id}">Delete</a>
</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>