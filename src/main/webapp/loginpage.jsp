<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log In</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<link href="../style.css" type="text/css" rel="stylesheet">
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="/loginpage.jsp">Login</a> <a
					class="navbar-brand" href="/userguide.jsp">Help</a> <a
					class="navbar-brand" href="/contactus.jsp">Contact Us</a>
			</div>

		</div>
	</nav>
	<div class="container">
		<div>
			<label><strong>LOG IN</strong></label>
		</div>
		<form action="complaint" method="get">
			<div class="form-group">
				<label for="reg_no">Registration Number:</label> <input
					type="number" name="reg_no" data-length="20"
					class="form-control noresize"
					placeholder="Type in your registration number." id="ttl">
			</div>
			<div class="form-group">
				<label for="pass">Password:</label> <input class="form-control"
					data-length="20" name="password"
					placeholder="Type in your password" id="pass" type="password">
			</div>
			<button class="btn btn-primary" type="submit">
				<span class="spinner-border spinner-border-sm"></span>Login
			</button>
		</form>
	</div>
</body>
</html>