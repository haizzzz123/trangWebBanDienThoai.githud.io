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
<link rel="stylesheet" href="./template/web/bill.css">
</head>
<body>
	<%@ include file="/common/web/header.jsp"%>
	<div class="content-body box-mini row-80">
                <div class="information">
                    <div class="row-50 information-title">
                        <p>họ và tên</p>
                        <p>số điện thoại</p>
                        <p>địa chỉ</p>
                        
                    </div>
                    <div class="row-50">
                        <p>${nick.hoVaTen}</p>
                        <p>${nick.sdt}</p>
                        <p>${nick.diaChi}</p>
                        
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
                    <h2 style="color= blue;">${tongCong}</h2>
                    <div style="background: #ff9300;height: 28px;line-height: 28px;text-align: center;font-weight: 700;width: 100px;">
                        <a href="danh-sach-hoa-don?idUser=${nick.id }" >
                       xác nhận
                       </a>
                        </div>
                </div>

            </div>
        </div>
    </div>
	<div id="footer" class="footer">
		<div class="footer-img">${i}</div>

	</div>
	 <%@ include file="/common/web/foot.jsp"%>
</body>
</html>