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
                        <th>mã hóa đơn</th>
                        <th>thời gian</th>
                        <th>tổng tiền</th>
                        <th>thao tác</th>
                    </tr>
                    <c:forEach items="${listBill}" var="t">
                    <tr>
                        
                        <td>${t.idBill}</td>
                        <td>21h15</td>
                        <td>${t.tongTien}</td>
                        <td><a href="hoa-don?idBill=${t.idBill}">xem</a></td>
                    </tr>
                    </c:forEach>
                    
                </table>
                

            </div>
        </div>
	</div>
	<div id="footer" class="footer">
		<div class="footer-img">${i}</div>

	</div>
</body>
</html>