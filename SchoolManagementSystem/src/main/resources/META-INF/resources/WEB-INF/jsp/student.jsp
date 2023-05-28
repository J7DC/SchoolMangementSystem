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
			<b>Student Profile Form</b>
		</h1>
		<form action="<%= request.getContextPath() %>/student" method="post">
			<table style="with: 80%">
				<%
    String first_name = request.getParameter("firstName");
  String last_name= request.getParameter("lastName");
  String roll_num = request.getParameter("userId");
  String address = request.getParameter("place");
  String age = request.getParameter("age");
        %>
				<tr>
					<td>First Name</td>
					<td>$(student.firstName)</td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td>$student.lastName</td>
				</tr>
				<tr>
					<td>Roll Number</td>
					<td><%= roll_num  %></td>
				</tr>

				<tr>
					<td>Father Name</td>
					<td><input type="text" name="fatherName" /></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><%= age  %></td>
				</tr>
				<tr>
					<td>Sex</td>
					<td><input type="radio" name="sex" value="Male" />Male <input
						type="radio" name="sex" value="FeMale" />Female</td>
				</tr>

				<tr>
					<td>Address</td>
					<td><%= address %></td>
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

			</table>
			<input type="submit" value="Submit" />
			<td><input type="reset" value="Reset" /></td>
		</form>
	</div>
</body>
</html>