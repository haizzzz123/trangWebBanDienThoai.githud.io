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

@WebServlet(urlPatterns = {"/admin-them-hang"})
public class addCompanyController extends HttpServlet{
	
	@Inject
	private ICompanyDAO companyDAO;
	
	
	
	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/addCompany.jsp");
	    rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random random = new Random(); // Tạo đối tượng Random
        int randomNumber = random.nextInt(1000)+1; // Tạo số ngẫu nhiên
        String idHang = Integer.toString(randomNumber);
		String tenHang = request.getParameter("updateTenCongTy");
		
		companyDAO.addCom(idHang, tenHang);
		
		List<companyModel> allCompany = companyDAO.selectAll();
		request.setAttribute("listCompany", allCompany);
	
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/company.jsp");
		rd.forward(request, response);
	}
}
