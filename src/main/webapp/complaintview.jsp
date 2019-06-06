<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complaint View</title>
	<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
</head>
<body>
	<%@page import="java.sql.*,java.util.*"%>

	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="/complaint">Complaint</a>
				<a class="navbar-brand" href="/studenthistory">History</a>
				<a id = "active" class="navbar-brand" href="/studentdetail">Details</a>
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
								<li><a href="#">Log Out</a></li>
							</ul></li>
					</ul>
					</div >
					<!-- /.navbar-collapse -->
					</div >
					<!-- /.container-fluid -->
	</nav>		  
      <div class="media">
		    <div class="media-left">
		      <img src="../images/eu.png" class="media-object" style="width:60px">
		    </div>
		    <div class="media-body">
		      <h4 class="media-heading">Complaint Submitted Successfully</h4><br><hr><br>
		      <p>Thank you for submitting your complaint.</p>
		      <p>We will respond as soon as possible. <strong>Goodbye</strong></p>
		    </div>
		  </div>
		  <hr>
      <div class="container-fluid">
	      <ul>
	         <li><p><b>Title:</b>
	         <%= request.getParameter("title") %>
	         </p></li>
	         <li><p><b>Complaint Body:</b>
	         <%= request.getParameter("body") %>
	         </p></li>
	         
	      </ul>
      </div>
</body>
</html>