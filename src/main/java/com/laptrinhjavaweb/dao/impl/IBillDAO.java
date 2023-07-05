package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.model.billModel;
import com.laptrinhjavaweb.model.cartModel;

public interface IBillDAO extends GenericDAO<billModel>{
	
	void taoBill(String idAcc,String idBill, double tongTien);
	void taoBillProduct(String idBill,String idSanPham, String tenSanPham ,int soLuong, int thanhTien);
	
}
