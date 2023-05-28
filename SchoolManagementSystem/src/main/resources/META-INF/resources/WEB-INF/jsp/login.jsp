<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

</html>
<body>
	<font color="red">${errorMessage}</font>
	<form method="post">
		<!--  Role : <input type="text" name="role" /> -->
		UserName : <input type="text" name="userName" /> Password : <input
			type="password" name="password" /> <input type="submit"
			value="login" />
		<td><input type="reset" value="Reset" /></td>
		<%--   <h4 class="text-center"><a href="${contextPath}/registration">Create an account</a></h4> --%>
		<tr>
			<td colspan="2">Yet Not Registered!! <a
				href="${contextPath}/registration">Register Here</a></td>
		</tr>
	</form>
</body>
<html>