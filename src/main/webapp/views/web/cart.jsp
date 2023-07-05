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
<link rel="stylesheet" href="./template/web/product.css">
</head>
<body>
	<%@ include file="/common/web/header.jsp"%>
	<div class="content-body box-mini row-80">
	
		<table class="cart-table">
			<tr>
				<th>hình</th>
				<th>tên sản phẩm</th>
				<th>giá</th>
				<th>số lượng</th>
				<th>thành tiền</th>
				<th>thao tác</th>
			</tr>
			<c:forEach items="${listCart}" var="t">
				<tr>
					<td><img src="./template/web/img/${t.img}" alt=""></td>
					<td>${t.tenSanPham }</td>
					<td>${t.giaSanPham }</td>
					<td>${t.soLuong }</td>
				
					<c:set var="thanhTien" value="${t.giaSanPham * t.soLuong}" />
					<td>${thanhTien }</td>
					<td><a href="gio-hang?idSanPhamCanXoa=${t.idGioHang }&idUser=${nick.id}">xoa</a></td>
					<c:set var="tongCong" value="${tongCong + thanhTien}" />
				</tr>
			</c:forEach>

		</table>
		
		<c:set var="idAcc" value="${nick.id}" />
		<c:set var="tongTien" value="${tongCong}" />
		
		<div class="right">
			<h3>tổng cộng</h3>
			
			<form action="hoa-don" method="POST" >
			<input type="hidden" name="iduser" value="${idAcc}" />
            <input type="hidden" name="tongTIenHoaDon" value="${tongTien}" />
			<h2>${tongCong}</h2>
			<button type="submit" class=" product-btn-buy ti-shopping-cart-full">mua ngay</button>
			</form>
			
		</div>

	</div>
	</div>
	</div>
	<%@ include file="/common/web/foot.jsp"%>
	
</body>
</html>