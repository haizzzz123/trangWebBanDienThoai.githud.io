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
import com.laptrinhjavaweb.dao.impl.IListBillDAO;
import com.laptrinhjavaweb.dao.impl.IProductDAO;
import com.laptrinhjavaweb.model.cartModel;
import com.laptrinhjavaweb.model.companyModel;
import com.laptrinhjavaweb.model.listBillModel;
import com.laptrinhjavaweb.model.productModel;

@WebServlet(urlPatterns = {"/danh-sach-hoa-don"})
public class listBillController extends HttpServlet{
	
	
	
	
	
	@Inject
	private IListBillDAO listBillDAO;
	
	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idUser= request.getParameter("idUser");
		List<listBillModel> listBill = listBillDAO.danhSachBill(idUser);
		request.setAttribute("listBill", listBill);
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/listBill.jsp");
	    rd.forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
