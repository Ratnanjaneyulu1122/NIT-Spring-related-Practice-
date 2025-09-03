<%@page import="com.nareshit.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee List</h1>
	<table border="1" width="100%">
		<%
		List<Employee> employees = (List<Employee>) request.getAttribute("emps");
		for (Employee emp : employees) {
		%>
		<tr>
			<td><%=emp.getId()%></td>
			<td><%=emp.getName()%></td>
			<td><%=emp.getAddress()%></td>
			<td><%=emp.getSalary()%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>