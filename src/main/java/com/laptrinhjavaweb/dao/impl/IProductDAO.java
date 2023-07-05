package com.laptrinhjavaweb.dao.impl;


import java.util.List;

import com.laptrinhjavaweb.model.productModel;

public interface IProductDAO extends GenericDAO<productModel>{

	List<productModel> selectall();
	List<productModel> selectProductOfCompany(String idCongTy);
	List<productModel> selectProductOfMoney(String gia);
	productModel selectProductOfid(String idSanPham);
	List<productModel> selectNameProduct(String idCongTy);
	void updateProductByID(String idSanPham,String tenSanPham, int giaSanPham, String hang, String img);
	void addProduct(String idSanPham,String tenSanPham, int giaSanPham, String img, String hang );
	void deleteProduct(String idSanPham);
	
	
}
