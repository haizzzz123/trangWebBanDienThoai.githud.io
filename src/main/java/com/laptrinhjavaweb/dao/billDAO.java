package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.dao.impl.IBillDAO;
import com.laptrinhjavaweb.dao.impl.ICartDAO;
import com.laptrinhjavaweb.mapper.billMapper;
import com.laptrinhjavaweb.model.billModel;
import com.laptrinhjavaweb.model.cartModel;

public class billDAO extends AbstractDAO<billModel> implements IBillDAO{

	@Override
	public void taoBill(String idAcc, String idBill, double tongTien) {
		String sql= "INSERT INTO bill(idKhachHang,idBill, tongTien) values(?,?,?)";
		insert(sql, idAcc,idBill, tongTien);
		
		
	}



	@Override
	public void taoBillProduct(String idBill, String idSanPham, String tenSanPham, int soLuong, int thanhTien) {
		String sql2= "INSERT INTO bill_product(idBill,idSanPham, tenSanPham, soLuong, thanhTien) values(?,?,?,?,?)";
		insert(sql2, idBill,idSanPham, tenSanPham, soLuong, thanhTien);
		
	}



	

	

}
