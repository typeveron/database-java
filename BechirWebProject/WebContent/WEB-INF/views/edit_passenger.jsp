<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri= "http://www.springframework.org/tags/form" prefix="form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Passenger</title>
</head>
<body>
<div align="center"></div>
<h2>Edit Passenger</h2>
<form:form action="save" method="post" modelAttribute="passenger">
<table border="0" cellPadding="5">
<tr>
<td>ID:</td>
<td>${passenger.id}</td>
<form:hidden path="id"/>
</tr>
<tr>
<td>
Name
</td>
<td><form input path="name"></form>
</tr>
<tr>
<td>
Family
</td>
<td><form input path="family"></form>
</tr>
<tr>
<td>
Birthdate
</td>
<td><form input path="birthdate"></form>
</tr>
<tr>
<td>
Email
</td>
<td><form input path="email"></form>
</tr>
<tr>
<td>
Phone
</td>
<td><form input path="phone"></form>
</tr>
<tr>
<td>
Gender
</td>
<td><form input path="gender"></form>
</tr>
<tr>
<td>
Payment
</td>
<td><form input path="payment"></form>
</tr>
<tr>
<td>
Address
</td>
<td><form input path="address"></form>
</tr>
<tr>
<td>
Flight
</td>
<td><form input path="flightTo"></form>
</tr>
<tr>
<td colspan="2"><input type="submit" value="save"/></td>
</tr>
</table>
</form:form>
</body>
</html>