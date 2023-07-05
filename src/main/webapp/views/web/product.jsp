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
<link rel="stylesheet" href="./template/web/product.css">
</head>
<body>
<%@ include file="/common/web/header.jsp" %>
            <div class="content-body box-mini row-80">
                <div class="collection-product">
                    <div class="collection-product-img row-50"><img src="./template/web/img/${ product.img}" alt="" ></div>
                    <div class="collection-product-doc row-50">
                    
                  <form action="gio-hang" method="POST" >
                    <div class="product-doc-header">
                            <p>${ product.tenSanPham}</p>
                            <ul>
                                <li><h3>Mã sản phẩm: </h3> <h2>${ product.idSanPham}</h2></li>
                                 
                         
                                 
                                <li><h3>Thương hiệu:  </h3> <h2>${ product.nhaSanXuat}</h2></li>
                                <li><h3>Giá: </h3> <h2>${ product.giaSanPham}</h2></li>
                                <li>
                                    <h3>Số lượng: </h3> 
                                    <button type="button" onclick="handleMinus()">-</button>
                                    <input type="text" name="amount" id="amount" value="1">
                                    <button type="button" onclick="handleplus()">+</button>
                                    <input type="hidden" name="inputAmount" value="${amount}" />
                                </li>
                                
                                
                                
                            </ul>              
                            
                            
                            <input type="hidden" name="idSanPham" value="${product.idSanPham}" />
                            <input type="hidden" name="idUser" value="${nick.id}" />
                            <input type="hidden" name="amount" value="${amount}" />
                            <button type="submit" class=" product-btn-addcart ti-shopping-cart-full">thêm vào giỏ hàng</button>
                           
                    </div>
                     </form>
                    
                
                    </div>
                </div>
                

            </div>
        </div>
    </div>
    <div id="footer" class="footer">
        <div class="footer-img"><img src="./img/download-logo-vector-shopee-mien-phi.jpg" alt=""></div>
    </div>
    
    <script>
        let amountElement = document.getElementById("amount")
        let amount = amountElement.value

        let render = (amount) =>{
            amountElement.value = amount
            
        }

        let handleplus = () =>{
            amount++
            render(amount);
        }

        let handleMinus = () =>{
            
            if(amount>1){
            	amount--
            	render(amount);
            }
            
        }
    </script>
    <%@ include file="/common/web/foot.jsp"%>
</body>
</html>