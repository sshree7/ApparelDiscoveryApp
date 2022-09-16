<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.nagarro.springmvc.domain.TShirt"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css">

<link rel="stylesheet"
	href="https://cdn.datatables.net/1.11.3/css/dataTables.bootstrap4.min.css">

</head>
<body>

	<div class="container mt-5">


		<%
			final List<TShirt> matchedTShirts = (List<TShirt>) request.getAttribute("matchedTShirts");
			if (matchedTShirts.size() > 0) {
		%>

		<header>
			<h2 style="text-align: center;">TShirts Found..</h2>
		</header>

		<div class="container mb-5 mt-5">
			<div class="table-responsive">
				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="col">S. No.</th>
							<th scope="col">ID</th>
							<th scope="col">NAME</th>
							<th scope="col">COLOUR</th>
							<th scope="col">GENDER</th>
							<th scope="col">SIZE</th>
							<th scope="col">PRICE</th>
							<th scope="col">RATING</th>
							<th scope="col">AVAILABILITY</th>
						</tr>
					</thead>
					<tbody>

						<%
							int k = 1;
								for (final TShirt tShirt : matchedTShirts) {
						%>
						<tr>
							<th scope="row"><%=k%></th>
							<td><%=tShirt.getId()%></td>
							<td><%=tShirt.getName()%></td>
							<td><%=tShirt.getColor()%></td>
							<td><%=tShirt.getGender()%></td>
							<td><%=tShirt.getSize()%></td>
							<td><%=tShirt.getPrice()%></td>
							<td><%=tShirt.getRating()%></td>
							<td><%=tShirt.getAvailability()%></td>

						</tr>
						<%
							k++;
								}
						%>
					</tbody>
				</table>
			</div>

			<form action="tryagain" method="post">
				<input type="submit" class="btn btn-success" value="Try Again">
			</form>
		</div>
		<%
			} else {
		%>
		
	<div class="container mt-5"> 	<h1 class="text-muted" text-align>Opps! No matching TShirts found
			:(</h1>

		<br> <br>
		<form action="tryagain" method="post">
			<input type="submit" class="btn btn-success" value="Try Again">
		</form> <br>
		<form action="logout">
				<input type="submit" class="btn btn-success" value="logout">
			</form></div>
		

		<%
			}
		%>
	</div>


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>