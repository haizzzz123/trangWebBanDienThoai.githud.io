package com.laptrinhjavaweb.controller.login;

import java.io.IOException;
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
import com.laptrinhjavaweb.dao.impl.IRegistDAO;
import com.laptrinhjavaweb.model.companyModel;

@WebServlet(urlPatterns = {"/dang-nhap-home"})
public class homeLoginController extends HttpServlet{

	/**
	 * 
	 */
	
	@Inject
	private ICompanyDAO companyDAO;
	
	@Inject		
	private IProductDAO productDAO;						
	
	@Inject
	private ILoginDAO loginDAO;
	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext servletContext = getServletContext();
		List<companyModel> listCompany = companyDAO.selectAll();
		
		servletContext.setAttribute("listCompany", listCompany);
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/login/login.jsp");
	    rd.forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
