<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./template/login/login.css">
</head>
<body>
	<div class="login">
		<div class="login-box">
			<div class="login-header">
				<p>đăng nhập</p>
				<p>${baoLoi}</p>
			</div>
			<form action="dang-nhap" method="GET">
			<div class="login-main">
				<ul>
					<li>tên đăng nhập</li>
					
					<li><input type="text" name="tenTaiKhoan"></li>
					<li>mật khẩu</li>
					<li><input type="password" name="matKhau"></li>

					<li><button type="submit" class="login-btn">đăng nhập</button></li>
					
				</ul>
			</div>
			</form>
			
			<div class="login-btn" style="text-align: center;">
			   <a href="dang-ki-home" style="color: #fff ;text-decoration: none;">đăng kí</a>
			</div>
			
		</div>


	</div>
</body>
</html>