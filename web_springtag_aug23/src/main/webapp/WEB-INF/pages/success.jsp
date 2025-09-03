<%@page import="com.nit.model.Employee"%>
<%@taglib prefix="murty" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Success!!</h1>
	<% Employee emp = (Employee)request.getAttribute("emp"); %>
	<b>ID: </b><%=emp.getId() %><br/>
	<b>NAME: </b><%=emp.getName() %><br/>
	<b>ADDRESS: </b><%=emp.getAddress() %><br/>
	<b>SALARY: </b><%=emp.getSalary() %><br/>
</body>
</html>