<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Existing Employee Form</h1>
	<form:form action="updateEmployee" method="post" modelAttribute="emp">
		<form:input type="hidden" path="id" />
		<table border="1">
			<tr>
				<td>Enter Name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Enter Address</td>
				<td><form:input path="address"/></td>
			</tr>
			<tr>
				<td>Enter Salary</td>
				<td><form:input type="number" path="salary"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Update Employee" />
				<a href="getAllEmployees">Cancel</a>	
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>