<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Person</title>
</head>
<body>
<div id="container">
		<div id="leftpanel">
			<h1>New Person</h1>
			<form:form action="/persons/new" method="POST" modelAttribute="person">		  
			    <h2>
			        <form:label Class="label left" path="firstName">First Name:</form:label>
			        <form:input Class="box" path="firstName"/>
			    </h2>
			    <h2>
			        <form:label Class="label left" path="lastName">Last Name:</form:label>
			        <form:input Class="box" path="lastName"/>
			    </h2>
			    <input id="btn" type="submit" value="Create"/>	 
			</form:form>
		</div>
	</div>

</body>
</html>