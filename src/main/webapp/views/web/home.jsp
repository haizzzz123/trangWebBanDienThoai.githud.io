<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./template/web/home.css">
<link rel="stylesheet" href="./template/front/themify-icons-font/themify-icons/themify-icons.css">
</head>
<body>
<%@ include file="/common/web/header.jsp" %>
            <div class="content-body box-mini row-80">
                
                <c:forEach items="${listProduct}" var="t">
                <div class="row-25 collection">
                    <div><img src="./template/web/img/${t.img}" alt=""></div>
                    <div class="content-body-doc">
                        <ul>
                            <li ><a href="san-pham?idSanPham=${t.idSanPham}"><h3 class="collection-name">${t.tenSanPham}</h3></a></li>
                            <li><a href="san-pham?idSanPham=${t.idSanPham}"><h3 class="collection-gia">${t.giaSanPham}</h3></a></li>
                            
                        </ul>
                    </div>
                </div>
                </c:forEach>


            </div>
        </div>
    </div>
    <%@ include file="/common/web/foot.jsp" %>
</body>
</html>