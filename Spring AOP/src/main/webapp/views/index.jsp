<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Curso Udemy - Seção Spring MVC
	<form action="addProgrammer" method="post">
		Entre com o seu id: <input type="text" name="pid"><br>
		Entre com o seu nome: <input type="text" name="pname"><br>
		<input type="submit">
	</form>
	<hr>
	<form action="getProgrammer" method="get">
		Enter your id: <input type="text" name="pid"><br>
		<input type="submit">
	</form>
	<hr>
	<form action="getProgrammerByName" method="get">
		Enter your name: <input type="text" name="pname"><br>
		<input type="submit">
	</form>
</body>
</html>