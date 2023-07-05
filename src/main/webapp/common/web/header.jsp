<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="header" class="header">
        <div class="header-crossbar">
            <div class="header-crossbar-logo box-mini"><a href="trang-chu"><img src="./template/web/img/logoDoAnWeb.png" alt=""></a></div>

            <div class="box-mini">
                <form action="san-pham" method="POST">
                    <div class="crossbar-search">
                        <input name="tenSanPhamCanTim" type="text">
                        <button type="submit" class="btn crossbar-search-btn ti-search"></button>
                    </div>
                    
                </form>
            </div>
            <div>
                 
                <div class="box-mini crossbar-search-mini crossbar-search-login"><a href="dang-nhap-home" class="ti-user">logout</a></div>
                
                <div class="box-mini crossbar-search-mini crossbar-search-cart">
                <a href="gio-hang?idUser=${nick.id}" class="ti-shopping-cart-full">giỏ hàng</a>
                </div>
                <div class="box-mini crossbar-search-mini "><a href="danh-sach-hoa-don?idUser=${nick.id }">hóa đơn</a></div>
            </div>
            

        </div>
        
    </div>
    <div id="main" class="main">
        <div id="content" class="content">
           <div class="header-category row-20">
             <ul>
                <li><p>hãng sản phẩm</p></li>
                
                <c:forEach items="${listCompany}" var="t">
                <li><a href="hang-san-xuat?idCategory=${t.idCompany}"><h1>${t.tenCongTy}</h1></a></li>
                
                </c:forEach>
                
             </ul>
             <ul>
                <li><p>giá sản phẩm</p></li>
                <li><a href="gia-tien?gia=1"><h1>dưới 1.000.000</h1></a></li>
                <li><a href="gia-tien?gia=2"><h1>1.000.000-2.000.000</h1></a></li>
                <li><a href="gia-tien?gia=3"><h1>2.000.000-3.000.000</h1></a></li>
                <li><a href="gia-tien?gia=4"><h1>trên 3.000.000</h1></a></li>
             </ul>
            

            </div>