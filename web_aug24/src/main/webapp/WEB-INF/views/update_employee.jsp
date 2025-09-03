<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Existing Employee Form</h1>
		<form:form action="updateEmployee" method="post" modelAttribute="emp">
			<form:input type="hidden" path="id" />
			<div class="form-floating mb-3">
				<form:input path="name" class="form-control" id="floatingName"
					placeholder="Name" />
				<label for="floatingName">Name</label>
			</div>
			<div class="form-floating">
				<form:input path="address" class="form-control" id="floatingAddress"
					placeholder="Address" />
				<label for="floatingAddress">Address</label>
			</div>
			<div class="form-floating">
				<form:input path="salary" class="form-control" id="floatingSalary"
					placeholder="Salary" />
				<label for="floatingSalary">Salary</label>
			</div>
			<br />
			<div class="form-floating">
				<input class="btn btn-outline-success" type="submit"
					value="Update Employee" /> <a class="btn btn-outline-danger"
					href="getAllEmployees">Cancel</a>
			</div>
		</form:form>
	</div>
</body>
</html>