<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
</head>
<body>
	<form action="jersey/register" method="post">
		Name: <input type="text" name="fullName"><br> Username: <input
			type="text" name="username"><br> Password: <input
			type="password" name="password"><br> Mobile No: <input
			type="number" name="mobileNo"><br> EmailId: <input
			type="text" name="emailId"><br> <input type="submit"
			name="Register" value="register">



	</form>
</body>
</html>