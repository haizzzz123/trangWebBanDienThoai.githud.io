package com.laptrinhjavaweb.controller.admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.dao.impl.ICompanyDAO;
import com.laptrinhjavaweb.dao.impl.ILoginDAO;
import com.laptrinhjavaweb.dao.impl.IProductDAO;
import com.laptrinhjavaweb.model.accModel;
import com.laptrinhjavaweb.model.companyModel;
import com.laptrinhjavaweb.model.productModel;
import com.laptrinhjavaweb.dao.productDAO;

@WebServlet(urlPatterns = {"/admin-update-company"})
public class updateCompanyController extends HttpServlet{

	/**
	 * 
	 */
	
	
	@Inject
	private ICompanyDAO companyDAO;
	
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String companyUpdate = 	request.getParameter("idCompany");
       companyModel comUpdate = companyDAO.selectComByID(companyUpdate);
       request.setAttribute("comUpdate", comUpdate);
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/updateCompany.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("idComUpdate");
		String taiKhoan = request.getParameter("tenComUpdate");
		
		
		
		companyDAO.updateCom(id, taiKhoan);
		
		List<companyModel> allCompany = companyDAO.selectAll();
		request.setAttribute("listCompany", allCompany);

		
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/company.jsp");
		rd.forward(request, response);
		
	}
	
	


}
