<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>
			<b>WELCOME PAGE</b>
		</h1>
		<form action="<%= request.getContextPath() %>/login/welcome"
			method="get">
			<table style="with: 80%">
				<head></head>
				<body>
					<b>WELCOME TO SCHOOL MANAGEMENT SYSTEM</b>
				</body>
				<!-- <tr><td><a href="/login"><b>Logout</b></a></td></tr>
    <table style="with: 50%">
	<tr><td> -->
				<%-- <% String username = request.getParameter("userName"); %>
<a>Welcome   <% out.println(username); %> 
    <a><b>!!! You have logged in.</b></a>
    </td></tr> --%>
				<tr>
					<td colspan="2">Yet Not Registered!! <a
						href="${contextPath}/registration">Register Here</a></td>
				</tr>
</body>
</html>