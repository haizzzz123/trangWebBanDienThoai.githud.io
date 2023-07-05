	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./template/admin/home.css">
<link rel="stylesheet" href="./template/admin/updatenick.css">
<link rel="stylesheet" href="./template/front/themify-icons-font/themify-icons/themify-icons.css">
</head>
<body>

       <%@ include file="/common/admin/header.jsp"%>
     <div class="nick-box" style="background-color: #ccc;
    display: flex;
    justify-content: center;">
                        
                        <div class="nick-main">
                        <p>thông tin hãng sản xuất</p>
                        <form action="admin-update-company" method="POST" >
                            <ul>
                               
                                
                                <li><input type="hidden" name="idComUpdate" value="${comUpdate.idCompany }"></li>
                                <li>tên công ty</li>
                                <li><input type="text" name="tenComUpdate" value="${comUpdate.tenCongTy }"></li>
                                
                                
                                <li><button type="submit" class="login-btn" style="background: #ff9300;height: 28px;line-height: 28px;text-align: center;font-weight: 700;width: 100px;">xac nhan</button></li>
                                
                            </ul>
                          </form>  
                        </div>
                    </div>
</body>
 <%@ include file="/common/admin/foot.jsp"%>
</html>