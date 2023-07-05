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
                        <div class="product-header"><p>thông tin sản phẩm</p></div>
                        <div class="product-main">
                        
                        <form action="admin-them-san-pham" method="POST" >
                        
                            <ul>
                            	
                                <li>tên sản phẩm</li>
                                <li><input type="text" name="updateTenSanPham" value="${product.tenSanPham }"></li>
                                <li>giá tiền</li>
                                <li><input type="text" name="updateGiaSanPham" value="${product.giaSanPham }"></li>
                                <li>hãng</li>
                                
                                
                               <li> <select name="updateidHangSanPham">
                                <c:forEach items="${listCompany}" var="t">
                                	 <option value="${t.idCompany }">${t.tenCongTy } </option>
                                </c:forEach>
                                </select>
                                </li>
                                
                                <li>
                                <input type="file" name="img" id="img">
                                </li>
                                
                                <li>
                                <button type="submit" class="addproduct-btn">them</button>
                                </li>
                            </ul>
                           
                        </form>
                        <div id="preview"></div>
                        <div class="addproduct-btn">
                        	<a href="admin-trang-chu" style="color: black;">thoát</div>
                        
                        </div>
                    </div>
                    
            
                
            </div>
        </div>
    </div>
    <script>
    
    document.getElementById('img').addEventListener('change', function(e) {
  var file = e.target.files[0];

  var reader = new FileReader();
  reader.onload = function (e) {
    var image = new Image();
    image.src = e.target.result;

    image.onload = function() {
      var previewElement = document.getElementById('preview');
      previewElement.innerHTML = '';
      previewElement.appendChild(image);
    };
  };

  reader.readAsDataURL(file);
});
    
    </script>
     <%@ include file="/common/admin/foot.jsp"%>
</body>
</html>