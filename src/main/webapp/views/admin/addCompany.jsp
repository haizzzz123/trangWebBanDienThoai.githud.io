<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./template/admin/home.css">
<link rel="stylesheet" href="./template/front/themify-icons-font/themify-icons/themify-icons.css">
<link rel="stylesheet" href="./template/admin/addProduct.css">
</head>
<body>
<%@ include file="/common/admin/header.jsp"%>
    <div id="main" class="main">
        <div id="content" class="content addproduct-main">
           
            <div class="product-body box-mini">
                
                    <div class="product-box">
                        <div class="product-header"><p>thong tin san pham</p></div>
                        <div class="product-main">
                        
                        <form action="admin-them-hang" method="POST">
                        
                            <ul>
                          
                                <li>ten san pham</li>
                                <li><input type="text" name="updateTenCongTy" ></li>
                 
                                
                                <li><button type="submit" class="addproduct-btn">them</button></li>
                            </ul>
                        </form>
                        <div class="addproduct-btn">
                        	<a href="admin-danh-sach-hang" style="color: black;">thoát</div>
                        
                        </div>
                    </div>
                    
            
                
            </div>
        </div>
    </div>
    <%@ include file="/common/admin/foot.jsp"%>
</body>
</html>