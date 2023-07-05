package com.laptrinhjavaweb.controller.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.dao.impl.ICartDAO;
import com.laptrinhjavaweb.dao.impl.ICompanyDAO;
import com.laptrinhjavaweb.dao.impl.IProductDAO;
import com.laptrinhjavaweb.model.cartModel;
import com.laptrinhjavaweb.model.companyModel;
import com.laptrinhjavaweb.model.productModel;

@WebServlet(urlPatterns = {"/gio-hang"})
public class cartController extends HttpServlet{
	
	@Inject
	private ICompanyDAO companyDAO;
	
	@Inject
	private IProductDAO productDAO;
	
	@Inject
	private ICartDAO cartDAO;
	
	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String idSanPham = request.getParameter("idSanPham");
		String idUser = request.getParameter("idUser");
		String idSanPhamCanXoa = request.getParameter("idSanPhamCanXoa");
//		int soLuong = Integer.parseInt(request.getParameter("amount"));
//		
//		if(idSanPham!=null) {
//			cartDAO.themSanPhamVaoGio(idSanPham, idUser, soLuong);
//		}
//		//request.setAttribute("user", idUser);	
//		
//		
		if(idSanPhamCanXoa !=null) {
			cartDAO.deleteProductOfCart(idSanPhamCanXoa);
		}
		List<cartModel> listCart = cartDAO.selectProductOfCart(idUser);
		
		request.setAttribute("listCart", listCart);
		
		
//		
//		
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/cart.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random random = new Random(); // Tạo đối tượng Random
        int randomNumber = random.nextInt(); // Tạo số ngẫu nhiên
        String idCart = Integer.toString(randomNumber);
		String idSanPham = request.getParameter("idSanPham");
		String idUser = request.getParameter("idUser");
		int soLuong = Integer.parseInt(request.getParameter("amount"));
		
		if(idSanPham!=null) {
			cartDAO.themSanPhamVaoGio(idCart,idSanPham, idUser, soLuong);
		}
		
		
		
		List<cartModel> listCart = cartDAO.selectProductOfCart(idUser);
		request.setAttribute("listCart", listCart);
		
//		ArrayList<Integer> soLuongSanPhamCuaCart = cartDAO.soLuongSanPham(idUser);
//		request.setAttribute("listSoLuongSP", soLuongSanPhamCuaCart);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/cart.jsp");
        rd.forward(request, response);
	}
}
