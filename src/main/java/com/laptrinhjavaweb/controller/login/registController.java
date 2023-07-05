package com.laptrinhjavaweb.controller.login;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.dao.registDAO;
import com.laptrinhjavaweb.dao.impl.IRegistDAO;
import com.laptrinhjavaweb.model.accModel;
import com.laptrinhjavaweb.service.IRegistService;

import java.util.Random;

@WebServlet(urlPatterns = {"/regist"})
public class registController extends HttpServlet{
	
	@Inject
	private IRegistDAO registDAO;
	
	
	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random random = new Random(); // Tạo đối tượng Random
        int randomNumber = random.nextInt(1000)+1; // Tạo số ngẫu nhiên
        String id = Integer.toString(randomNumber);
		
		
		String hoVaTen = request.getParameter("hoVaTen");
		String tenDangNhap = request.getParameter("tenDangNhap");
		String matKhau = request.getParameter("matKhau");
		String email = request.getParameter("email");
		String sdt = request.getParameter("sdt");
		String diaChi = request.getParameter("diaChi");
		boolean phanQuyen = false;
		
		String test ="hello";
		request.setAttribute("t", hoVaTen);
		accModel newAcc = new accModel(id,  tenDangNhap, matKhau, hoVaTen,email, sdt, diaChi, phanQuyen);
		
		
		registDAO.insert(newAcc);
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/login/login.jsp");
		rd.forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		Random random = new Random();
//        Long min = 1000L;
//        Long max = 2000L;
//        Long id = min + random.nextLong(max - min);
//		
//		
//		String hoVaTen = request.getParameter("hoVaTen");
//		String tenDangNhap = request.getParameter("tenDangNhap");
//		String matKhau = request.getParameter("matKhau");
//		String email = request.getParameter("email");
//		String sdt = request.getParameter("sdt");
//		String diaChi = request.getParameter("diaChi");
//		
//		String test ="hello";
//		request.setAttribute("t", test);
//		accModel newAcc = new accModel(id, hoVaTen, tenDangNhap, matKhau, email, sdt, diaChi);
//		
//		 RequestDispatcher dispatcher = request.getRequestDispatcher("/views/login/regist.jsp");
//		    dispatcher.forward(request, response);
	}
	
//	public static void main(String[] args)  {
//		Random random = new Random();
//        Long min = 1000L;
//        Long max = 2000L;
//        Long id = min + random.nextLong(max - min);
//		
//		
//		String hoVaTen = "1";
//		String tenDangNhap = "2";
//		String matKhau = "3";
//		String email = "4";
//		String sdt = "5";
//		String diaChi = "5";
//		
//		accModel newAcc = new accModel(id, hoVaTen, tenDangNhap, matKhau, email, sdt, diaChi);
//		
//		
//		new registDAO().insert(newAcc);
//		System.out.print(new registDAO().i);
//	}
}
