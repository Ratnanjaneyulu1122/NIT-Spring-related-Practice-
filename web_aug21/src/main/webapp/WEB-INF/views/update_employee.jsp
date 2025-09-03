<%@page import="com.nit.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Existing Employee Form</h1>
	<%
		Employee emp = (Employee)request.getAttribute("emp");
	%>
	<form action="updateEmployee" method="post">
		<input type="hidden" name="emp_id" value="<%=emp.getId() %>" />
		<table border="1">
			<tr>
				<td>Enter Name</td>
				<td><input type="text" value="<%=emp.getName() %>" name="emp_name" /></td>
			</tr>
			<tr>
				<td>Enter Address</td>
				<td><input type="text" name="emp_address" value="<%=emp.getAddress() %>" /></td>
			</tr>
			<tr>
				<td>Enter Salary</td>
				<td><input type="number" name="emp_salary" value="<%=emp.getSalary() %>"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Update Employee" />
				<a href="getAllEmployees">Cancel</a>	
				</td>
			</tr>
		</table>
	</form>
</body>
</html>