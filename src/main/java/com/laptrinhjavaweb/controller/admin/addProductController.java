package com.laptrinhjavaweb.controller.admin;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.dao.impl.ICompanyDAO;
import com.laptrinhjavaweb.dao.impl.IProductDAO;
import com.laptrinhjavaweb.model.companyModel;
import com.laptrinhjavaweb.model.productModel;

@WebServlet(urlPatterns = {"/admin-them-san-pham"})
public class addProductController extends HttpServlet{
	
	@Inject
	private ICompanyDAO companyDAO;
	
	@Inject
	private IProductDAO productDAO;
	
	
	
	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<companyModel> listCompany= companyDAO.selectAll();
		request.setAttribute("listCompany", listCompany);
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/addProduct.jsp");
	    rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random random = new Random(); // Tạo đối tượng Random
        int randomNumber = random.nextInt(1000)+1; // Tạo số ngẫu nhiên
        String idSanPham = Integer.toString(randomNumber);
		
		String tenSanPham = request.getParameter("updateTenSanPham");
		int giaSanPham = Integer.parseInt(request.getParameter("updateGiaSanPham"));
		String img= request.getParameter("img");
		String idHang = request.getParameter("updateidHangSanPham");
		productDAO.addProduct(idSanPham, tenSanPham, giaSanPham,img, idHang );
		
		
		List<productModel> listProduct = productDAO.selectall();	
		
		request.setAttribute("listProduct", listProduct);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/home.jsp");
	    rd.forward(request, response);
	}
}
