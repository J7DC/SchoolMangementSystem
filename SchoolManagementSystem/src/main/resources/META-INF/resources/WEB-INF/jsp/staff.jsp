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
		<h1>
			<b>Staff Profile Form</b>
		</h1>
		<form action="<%= request.getContextPath() %>/staff" method="post">
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
					<td>Father Name</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="text" name="age" /></td>
				</tr>
				<tr>
					<td>Sex</td>
					<td><input type="text" name="sex" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>Contact Number</td>
					<td><input type="text" name="contactNumber" /></td>
				</tr>
				<tr>
					<td>Image</td>
					<td><input type="text" name="image" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td>Role</td>
					<td><input type="text" name="role" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit" />
			<td><input type="reset" value="Reset" /></td>
		</form>
	</div>
</body>
</html>