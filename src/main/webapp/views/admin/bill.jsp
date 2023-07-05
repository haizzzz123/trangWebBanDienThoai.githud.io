<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./template/web/home.css">
<link rel="stylesheet"
	href="./template/front/themify-icons-font/themify-icons/themify-icons.css">
<link rel="stylesheet" href="./template/web/cart.css">
<link rel="stylesheet" href="./template/web/bill.css">
<link rel="stylesheet" href="./template/admin/home.css">
<link rel="stylesheet" href="./template/admin/product.css">
</head>
<body>
	<%@ include file="/common/admin/header.jsp"%>
	<div class="content-body" style="background-color: #ccc;">
                <div class="information">
                    <div class="row-50 information-title">
                        <p>họ và tên</p>
                        <p>số điện thoại</p>
                        <p>địa chỉ</p>
                        
                    </div>
                    <div class="row-50">
                        <p>${acc.hoVaTen}</p>
                        <p>${acc.sdt}</p>
                        <p>${acc.diaChi}</p>
                        
                    </div>
               </div>
                <table class="cart-table">
                    <tr>
                        <th>hình</th>
                        <th>tên sản phẩm</th>
                        <th>giá</th>
                        <th>số lượng</th>
                        <th>thành tiền</th>
                        
                    </tr>
                    <c:forEach items="${listCart}" var="t">
                    <tr>
                        <td><img src="./template/web/img/${t.img}" alt=""></td>
                        <td>${t.tenSanPham }</td>
                        <td>${t.giaSanPham }</td>
                        <td>${t.soLuong }</td>
                        <c:set var="thanhTien" value="${t.giaSanPham * t.soLuong}" />
                        <td>${thanhTien }</td>
                        <c:set var="tongCong" value="${tongCong + thanhTien}" />
                    </tr>
                    </c:forEach>
                    
                </table>
                <div class="right">
                    <h3>tổng cộng </h3> 
                    <h2>${tongCong}</h2>
                    <a href="admin-danh-sach-hoa-don?idNick=${idUser }" class=" product-btn-buy-a ">xác nhận</a>
                </div>

            </div>
        </div>
    </div>
	<div id="footer" class="footer">
		<div class="footer-img">${i}</div>

	</div>
	 <%@ include file="/common/admin/foot.jsp"%>
</body>
</html>