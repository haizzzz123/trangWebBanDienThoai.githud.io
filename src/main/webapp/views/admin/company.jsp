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
        <div id="content" class="content">
           <div class="header-category row-20">
             
             <ul>
                <li><p>tùy chọn</p></li>
                <li><a href="admin-them-hang"><h1>thêm hãng</h1></a></li>
                
             </ul>
             

            </div>
            <div class="content-body box-mini row-80">
            <table class="nick-table">
                <tr>
                    
                    <th>id hãng</th>
                    <th>tên công ty</th>
                    <th>tùy chọn</th>
                    
                </tr>
                <c:forEach items="${listCompany}" var="t">
                <tr>
                    
                    <td>${t.idCompany}</td>
                    <td>${t.tenCongTy}</td>
                    <td>
                    <a href="admin-update-company?idCompany=${t.idCompany}">chỉnh sửa</a>/ 
                    <a href="admin-delete-company?idCompany=${t.idCompany}">xóa</a>/
                    </td>
                </tr>
                </c:forEach>
            </table>
            </div>
    </div>
     <%@ include file="/common/admin/foot.jsp"%>
</body>
</html>