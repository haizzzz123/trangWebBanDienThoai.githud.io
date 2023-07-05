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

import com.laptrinhjavaweb.dao.impl.ILoginDAO;
import com.laptrinhjavaweb.dao.impl.IProductDAO;
import com.laptrinhjavaweb.dao.impl.IRegistDAO;
import com.laptrinhjavaweb.model.accModel;
import com.laptrinhjavaweb.model.productModel;

@WebServlet(urlPatterns = {"/dang-nhap"})
public class loginController extends HttpServlet{

	/**
	 * 
	 */
	@Inject
	private ILoginDAO loginDAO;
	
	@Inject
	private IProductDAO productDAO;
	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String taiKhoan = request.getParameter("tenTaiKhoan");
		String matKhau = request.getParameter("matKhau");
		
		if(loginDAO.kiemTraTaiKhoan(taiKhoan, matKhau)!= null) {
			accModel nick = new accModel();
			nick = loginDAO.kiemTraTaiKhoan(taiKhoan, matKhau);
			
			if(nick.isPhanQuyen()== true) {
				List<productModel> listProduct = productDAO.selectall();	

			    request.setAttribute("listProduct", listProduct);
				RequestDispatcher rd = request.getRequestDispatcher("/views/admin/home.jsp");
		        rd.forward(request, response);
			}else {
				ServletContext servletContext = getServletContext();
			    servletContext.setAttribute("nick", nick);
			
			    List<productModel> listProduct = productDAO.selectall();	

			    request.setAttribute("listProduct", listProduct);
			
			    RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
		        rd.forward(request, response);
			}
			
			
		}else {
			String baoLoi = "loi tai khoan hoac mat khau";
			request.setAttribute("baoLoi", baoLoi);
			RequestDispatcher rd = request.getRequestDispatcher("/views/login/login.jsp");
		    rd.forward(request, response);
		}
		
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
