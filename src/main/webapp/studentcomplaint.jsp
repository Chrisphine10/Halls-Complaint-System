<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Home</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<link href="../style.css" type="text/css" rel="stylesheet">
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script>
$(document).ready(function(){
  $("form").submit(function(){
    alert("Complaint Submitted");
  });
});
</script>

</head>
<body>
 <div class="view" style="background-image: url('../images/eu.png'); background-repeat: repeat; background-size: cover; background-position: center center;">
		<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a id = "active" class="navbar-brand" href="/complaint">Complaint</a>
				<a class="navbar-brand" href="/studenthistory">History</a>
				<a class="navbar-brand" href="/studentdetail">Details</a>
				<a class="navbar-brand" href="/userguide.jsp">Help</a>
				<a class="navbar-brand" href="/contactus.jsp">Contact Us</a></div >
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-right">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria- ←-haspopup="true"
							aria-expanded="false">User Name<span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">Action</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="logout">Log Out</a></li>
							</ul></li>
					</ul>
					</div >
					<!-- /.navbar-collapse  -->
					</div >
					<!-- /.container-fluid -->
	</nav>
		    <div class = "container">
			<form action = "complaintview" method = "get">
			<div class="form-group">
			  <label for="ttl">Title:</label>
			  <input type="text" name ="title" data-length="20" class="form-control noresize" placeholder="Type in the title of your complaint." id="ttl">
			</div>
			<div class="form-group">
			<label for="bod">Complaint Body:</label>
			<textarea class="form-control" data-length="120" name = "body" rows="10" placeholder="Type in the complaint body" id="bod" style="resize: none;"></textarea>
			</div>
			<button class="btn btn-primary" type = "submit">
			<span class="spinner-border spinner-border-sm" ></span>Submit</button>
			</form>
		</div>	
</div>
</body>
</html>
