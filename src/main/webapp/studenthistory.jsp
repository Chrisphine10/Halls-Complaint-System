<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>History</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.8.1/bootstrap-table.css">
<!-- Latest compiled and minified JavaScript -->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.8.1/bootstrap-table.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="/studentcomplaint.jsp">Complaint</a>
				<a id = "active" class="navbar-brand" href="/studenthistory.jsp">History</a>
				<a class="navbar-brand" href="/studentdetail.jsp">Details</a>
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
	<div>
            <button class="btn-primary btn" onclick="load();" >Load Table</button>
            <button class="btn-primary btn" onclick="reload();">Update Table</button>
        </div>
        <table class="table" id="table">
            <thead>
                <tr>
                    <th data-field="id">Date</th>
                    <th data-field="name">Title</th>
                    <th data-field="price">Complaint</th>
                    <th data-field="price">Hall</th>
                    <th data-field="price">Block</th>
                    <th data-field="price">Status</th>
                </tr>
            </thead>
        </table>
        <script>
            $('#table').bootstrapTable({});
            function load(){
                var data = [{
                        id: 1,
                        name: 'Item 1',
                        price: '$1'
                    }, {
                        id: 2,
                        name: 'Item 2',
                        price: '$4'
                    }]; 
                $('#table').bootstrapTable("load", data);
            }
            function reload(){
                var data = [{
                        id: 3,
                        name: 'Item 3',
                        price: '$2'
                    }, {
                        id: 4,
                        name: 'Item 4',
                        price: '$6'
                    }]; 
                    $('#table').bootstrapTable("load", data);
            }
        </script>
</body>
</html>