<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./template/admin/home.css">
<link rel="stylesheet" href="./template/admin/nick.css">
<link rel="stylesheet" href="./template/front/themify-icons-font/themify-icons/themify-icons.css">
</head>
<body>

       <%@ include file="/common/admin/header.jsp"%>
    <div id="main-nick" class="main-nick">
        
            <table class="nick-table">
                <tr>
                    
                    <th>mã id</th>
                    <th>tài khoản</th>
                    <th>mật khẩu</th>
                    <th>họ và tên</th>
                    <th>email</th>
                    <th>địa chỉ</th>
                    <th>số điện thoại</th>
                    <th>quyền truy cập</th>
                    <th>tùy chọn</th>
                </tr>
                <c:forEach items="${listAcc}" var="t">
                <tr>
                    
                    <td>${t.id}</td>
                    <td>${t.tenDangNhap}</td>
                    <td>${t.matKhau}</td>
                    <td>${t.hoVaTen}</td>
                    <td>${t.email}</td>
                    <td>${t.diaChi}</td>
                    <td>${t.sdt}</td>
                    <td>${t.phanQuyen}</td>
                    <td>
                    <a href="admin-update-nick?idNick=${t.id}">chỉnh sửa</a>/ 
                    <a href="admin-delete-nick?idNick=${t.id}">xóa</a>/
                    <a href="admin-danh-sach-hoa-don?idNick=${t.id}">hóa đơn</a>
                    </td>
                </tr>
                </c:forEach>
            </table>
        
    </div>
     <%@ include file="/common/admin/foot.jsp"%>
</body>
</html>