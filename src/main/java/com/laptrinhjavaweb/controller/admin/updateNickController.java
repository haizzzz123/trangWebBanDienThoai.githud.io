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

@WebServlet(urlPatterns = {"/admin-update-nick"})
public class updateNickController extends HttpServlet{

	/**
	 * 
	 */
	
	
	@Inject
	private ILoginDAO accDAO;
	
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String nickUpdate = 	request.getParameter("idNick");
       accModel accUpdate = accDAO.selectAccByID(nickUpdate);
       request.setAttribute("accUpdate", accUpdate);
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/updatenick.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("idAccUpdate");
		String taiKhoan = request.getParameter("taiKhoanAccUpdate");
		String matKhau = request.getParameter("matKhauAccUpdate");
		String hoVaTen = request.getParameter("hoVaTenAccUpdate");
		String email = request.getParameter("emailAccUpdate");
		String diaChi = request.getParameter("diaChiAccUpdate");
		String sdt = request.getParameter("sdtAccUpdate");
		boolean phanQuyen = Boolean.parseBoolean(request.getParameter("phanQuyenAccUpdate"));
		
		accDAO.updateAcc(id, taiKhoan, matKhau, hoVaTen, email, diaChi, sdt, phanQuyen);
		
		List<accModel> allAcc = accDAO.selectAcc();
		request.setAttribute("listAcc", allAcc);

		
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/nick.jsp");
		rd.forward(request, response);
		
	}
	
	


}
