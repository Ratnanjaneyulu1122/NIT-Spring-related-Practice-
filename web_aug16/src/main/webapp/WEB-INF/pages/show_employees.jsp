<%@page import="com.nit.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMS-Home</title>
<script type="text/javascript">
	function deleteEmployee(id) {
		document.frm.emp_id.value=id;
		document.frm.action="deleteEmployee";
		document.frm.method="post";
		document.frm.submit();
	}
</script>
</head>
<body>
	<h1>Employee Management System</h1>
	<a href="addEmployee">Add Employee</a>
	<form name="frm">
		<input type="hidden" name="emp_id"/>
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
				<td><input type="button" value="Edit" /></td>
				<td><input type="button" value="Delete"
					onclick="deleteEmployee('<%=emp.getId()%>')" /></td>
			</tr>
			<%
			}
			%>
		</table>
	</form>
</body>
</html>