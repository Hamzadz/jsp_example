
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>

<meta charset="UTF-8">

<title>Personne List</title>
</head>

<body>
	      
	<h3>Personne List</h3>
	      
	<p style="color: red;">${errorString}</p>
	      
	<table border="1" cellpadding="5" cellspacing="1">

		<tr>
			<th>id</th>
			<th>First name</th>
			<th>Last name</th>
			<th>Adresse</th>
		</tr>

		<c:forEach items="${personneList}" var="personne">
          <tr>
				<td>${personne.idPersonne}</td>
				<td>${personne.firstName}</td>
				<td>${personne.lastName}</td>
				<td>${personne.adress}</td>
			</tr>
       </c:forEach>
	</table>
	     
</body>
</html>