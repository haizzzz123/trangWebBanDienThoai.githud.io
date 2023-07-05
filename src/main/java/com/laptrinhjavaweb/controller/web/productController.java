package com.laptrinhjavaweb.controller.web;

import java.io.IOException;
import java.util.List;

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

@WebServlet(urlPatterns = {"/san-pham"})
public class productController extends HttpServlet{
	
	@Inject
	private ICompanyDAO companyDAO;
	
	@Inject
	private IProductDAO productDAO;
	
	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		List<companyModel> listCompany = companyDAO.selectAll();
//		
//		request.setAttribute("listCompany", listCompany);
		
		String idSanPham = request.getParameter("idSanPham");
		
		productModel product = productDAO.selectProductOfid(idSanPham);
		
		request.setAttribute("product", product);
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/product.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tenSanPhamCanTim = request.getParameter("tenSanPhamCanTim");
		
		List<productModel> listProduct = productDAO.selectNameProduct(tenSanPhamCanTim);
		
	
		request.setAttribute("listProduct", listProduct);
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(request, response);
	}
}
