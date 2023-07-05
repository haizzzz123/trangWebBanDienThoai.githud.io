<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./template/login/regist.css">
</head>
<body>
	<div class="regist">
        <div class="regist-box">
            <div class="regist-header"><p>${t}</p></div>
            <form action="regist" method="GET">
                <div class="regist-main">
                    <ul>
                        <li>tên đăng nhập</li>
                        <li><input type="text" name="tenDangNhap"></li>
                        <li>mật khẩu</li>
                        <li><input type="text" name="matKhau"></li>
                        <li>họ và tên</li>
                        <li><input type="text" name="hoVaTen"></li>
                        <li>số điện thoại</li>
                        <li><input type="text" name="sdt"></li>
                        <li>địa chỉ</li>
                        <li><input type="text" name="diaChi"></li>
                        <li>email</li>
                        <li><input type="text" name="email"></li>
                        <li><button type="submit" class="regist-btn">đăng kí</button></li>
                    </ul>
                </div>
            </form>
            
        </div>
        

    </div>
</body>
</html>