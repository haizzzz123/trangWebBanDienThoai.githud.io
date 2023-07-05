package com.laptrinhjavaweb.controller.admin;

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
import com.laptrinhjavaweb.dao.impl.ILoginDAO;
import com.laptrinhjavaweb.dao.impl.IProductDAO;
import com.laptrinhjavaweb.model.accModel;
import com.laptrinhjavaweb.model.cartModel;
import com.laptrinhjavaweb.model.companyModel;
import com.laptrinhjavaweb.model.productModel;

@WebServlet(urlPatterns = {"/admin-hoa-don"})
public class billController extends HttpServlet{
	
	@Inject
	private ILoginDAO accDAO;
	
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
        
		String idUser = request.getParameter("idUser");

		accModel acc= accDAO.selectAccByID(idUser);
		request.setAttribute("acc", acc);
		request.setAttribute("idUser", idUser);
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/bill.jsp");
        rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
