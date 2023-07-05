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

import com.laptrinhjavaweb.dao.impl.IBillDAO;
import com.laptrinhjavaweb.dao.impl.ICartDAO;
import com.laptrinhjavaweb.dao.impl.ICompanyDAO;
import com.laptrinhjavaweb.dao.impl.IProductDAO;
import com.laptrinhjavaweb.model.cartModel;
import com.laptrinhjavaweb.model.companyModel;
import com.laptrinhjavaweb.model.productModel;

@WebServlet(urlPatterns = {"/hoa-don"})
public class billController extends HttpServlet{
	
	
	
	@Inject
	private IProductDAO productDAO;
	
	@Inject
	private ICartDAO cartDAO;
	
	@Inject
	private IBillDAO billDAO;
	
	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idBill = request.getParameter("idBill");
		List<cartModel> list = cartDAO.selectProductOfCartbyidBill(idBill);
        request.setAttribute("listCart", list);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/bill.jsp");
        rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random random = new Random(); // Tạo đối tượng Random
        int randomNumber = random.nextInt(1000)+1; // Tạo số ngẫu nhiên
        String idBill = Integer.toString(randomNumber);
		
		String idUser = request.getParameter("iduser");
		double tongTienHoaDon = Double.parseDouble(request.getParameter("tongTIenHoaDon"));
		int thanhTien;		
		 
		List<cartModel> list = cartDAO.selectProductOfCart(idUser);
		
		if(list!=null) {
			billDAO.taoBill(idUser, idBill, tongTienHoaDon);
			for(cartModel product : list) {
				thanhTien= product.getGiaSanPham()* product.getSoLuong();
				billDAO.taoBillProduct(idBill, product.getIdSanPham(), product.getTenSanPham(), product.getSoLuong(), thanhTien);
			}
			
		}
		
		request.setAttribute("listCart", list);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/bill.jsp");
        rd.forward(request, response);
	}
}
