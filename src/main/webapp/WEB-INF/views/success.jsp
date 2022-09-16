<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@page import="com.nagarro.springmvc.domain.User"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">

<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Welcome</title>
</head>
<body>




	<div class="container mt-5">

		<header style="text-align: right;">
		
			<p>
			Hi, ${name}
			
		</p>
			<form action="logout">
				<input type="submit" class="btn btn-success" value="logout">
			</form>
		</header>

		<h3 class="text-center">Find your TShirt here..</h3>
		<p class="text-center"></p>

		<form action="tshirtform" method="post">


			<div class="form-group">
				<label for="color">Color</label> <input type="text"
					class="form-control" name="color" id="color"
					placeholder="Enter the color here.." required>
			</div>

			<div class="form-group">
				<label for="size">Size</label> <input type="text"
					class="form-control" name="size" id="size"
					placeholder="Enter the size here.." required>
			</div>

			<div class="form-group">
				<label for="gender">Gender</label> <input type="text"
					class="form-control" name="gender" id="gender"
					placeholder="Enter the gender here" required>
			</div>

			<div class="form-group">
				<label for="sortPreference">Sort Preference</label> <input
					type="text" class="form-control" name="sortPreference"
					id="sortPreference" placeholder="Enter the sort preference here.."
					required>
			</div>

			<div class="container text-center">
				<button type="submit" class="btn btn-success">Enter
					Requirement</button>
			</div>


		</form>
	</div>


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>


</body>
</html>