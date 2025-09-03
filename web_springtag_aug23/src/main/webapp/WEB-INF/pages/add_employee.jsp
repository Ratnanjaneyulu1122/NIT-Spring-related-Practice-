<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="saveEmployee" modelAttribute="emp" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td>NAME:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>ADDRESS:</td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td>SALARY:</td>
				<td><form:input path="salary" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Save Employee" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>