<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		Introduzca el nombre de la persona a la que aplicar un descuento, por favor.
	<form action="http://localhost:8080/negocio" method="POST">
		<input type="text" name="nombre">
		<input type="submit" name="enviar">
	</form>
</body>
</html>