package com.laptrinhjavaweb.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.model.cartModel;
import com.laptrinhjavaweb.model.productModel;

public interface ICartDAO extends GenericDAO<cartModel>{

	void themSanPhamVaoGio(String idCart,String idSanPham, String idAcc, int soLuong);
	ArrayList<Integer> soLuongSanPham(String idAcc);
	List<cartModel> selectProductOfCart(String idKhachHang);
	void deleteProductOfCart(String idSanPham);
	List<cartModel> selectProductOfCartbyidBill(String idBill);
}
