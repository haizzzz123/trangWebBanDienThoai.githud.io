package com.laptrinhjavaweb.controller.web;

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
import com.laptrinhjavaweb.dao.impl.IProductDAO;
import com.laptrinhjavaweb.model.companyModel;
import com.laptrinhjavaweb.model.productModel;
import com.laptrinhjavaweb.dao.productDAO;

@WebServlet(urlPatterns = {"/trang-chu"})
public class homeController extends HttpServlet{

	/**
	 * 
	 */
	@Inject
	private ICompanyDAO companyDAO;
	
	@Inject
	private IProductDAO productDAO;
	
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		ServletContext servletContext = getServletContext();
//		List<companyModel> listCompany = companyDAO.selectAll();
//		
//		servletContext.setAttribute("listCompany", listCompany);
		
List<companyModel> listCompany = companyDAO.selectAll();
		
request.setAttribute("listCompany", listCompany);
		
		List<productModel> listProduct = productDAO.selectall();	

		request.setAttribute("listProduct", listProduct);

		
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	public static void main(String[] args)  {
	
		List<productModel> list= new productDAO().selectall();
		
		for(productModel p :list) {
			System.out.print(p.getImg());
		}
	}	


}
