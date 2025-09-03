<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Form</h1>
	<form action="saveEmployee" method="post">
		<table border="1">
			<tr>
				<td>Enter Name</td>
				<td><input type="text" name="emp_name" /></td>
			</tr>
			<tr>
				<td>Enter Address</td>
				<td><input type="text" name="emp_address" /></td>
			</tr>
			<tr>
				<td>Enter Salary</td>
				<td><input type="number" name="emp_salary" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Save Employee" />
				<a href="getAllEmployees">Cancel</a>	
				</td>
			</tr>
		</table>
	</form>
</body>
</html>