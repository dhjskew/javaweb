<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>选择购买书籍</title>
</head>
<body>
	<h2>选择购买书籍</h2>
	<form action="ProcessOne" method="post">
		<table border="1" width="68%">
			<tr>
				<td align="center">书名</td>
				<td align="center">购买</td>
			</tr>
			<tr>
				<td>Android Application Develoment Practice Tutorial</td>
				<td align="center"><input type="checkbox" name="buy"
					value="Android Application Develoment Practice Tutorial"></td>
			</tr>
			<tr>
				<td>Software Project Management</td>
				<td align="center"><input type="checkbox" name="buy"
					value="Software Project Management"></td>
			</tr>
			<tr>
				<td>Agile Software Development</td>
				<td align="center"><input type="checkbox" name="buy"
					value="Agile Software Development"></td>
			</tr>
			<tr>
				<td>Information Technology Project Management</td>
				<td align="center"><input type="checkbox" name="buy"
					value="Information Technology Project Management"></td>
			</tr>
		</table>
		<p><input type="submit" value="下一步"></p>
	</form>
</body>
</html>