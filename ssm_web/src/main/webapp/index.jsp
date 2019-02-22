<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="account/findAll">查询所有</a>

	<form action="account/saveAccount" method="post">
		账户名称：<input type="text" name="name" /><br />
		账户金额：<input type="text" name="money"><br /> 
		<input type="submit" value=" 保存 " />
	</form>

</body>
</html>