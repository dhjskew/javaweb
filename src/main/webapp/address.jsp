<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>邮寄地址</title>
</head>
<body>
	<h2>输入邮寄地址</h2>
	<form action="ProcessTwo" method="post">
		<table border="1" width="68%">
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="customer" size="30"></td>
			</tr>
			<tr>
				<td>邮寄地址：</td>
				<td><input type="text" name="address" size="66"></td>
			</tr>
		</table>
		<p>
			<input type="submit" value="下一步">
		</p>
	</form>
</body>
</html>