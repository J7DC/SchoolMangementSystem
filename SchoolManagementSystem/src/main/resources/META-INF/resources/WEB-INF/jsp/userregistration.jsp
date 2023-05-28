<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>User Register Form</h1>
		<form action="<%= request.getContextPath() %>/registration"
			method="post">
			<table style="with: 80%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName" /></td>
				</tr>
				<tr>
					<td>Place</td>
					<td><input type="text" name="place" /></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="text" name="age" /></td>
				</tr>
				<tr>
					<td>Date</td>
					<td><input type="text" name="Date" /></td>
				</tr>
				<tr>
					<td>UserId</td>
					<td><input type="text" name="userId" /></td>
				</tr>

				<tr>
					<td>Role</td>
					<td><select>name ="role">
							<option>student</option>
							<option>teacher</option>
							<option>staff</option>
					</select></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input type="password" name="cnfPassword" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit" />
			<td><input type="reset" value="Reset" /></td>
			<h4 class="text-center">
				<a href="${contextPath}/login">Already Registered?</a>
			</h4>
		</form>
	</div>
</body>
</html>