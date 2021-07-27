<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Welcome</title>
</head>
<body style="text-align: center">
	<h1>歡迎登入!</h1>
	<form action="login.do" method="POST">
		<table border="0"  style="margin: auto">
			<tr>
				<td>username:</td>
				<td><input type="text" name="user"></td>
			</tr>
			<tr>
				<td>password:</td>
				<td><input type="password" name="passwd"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>