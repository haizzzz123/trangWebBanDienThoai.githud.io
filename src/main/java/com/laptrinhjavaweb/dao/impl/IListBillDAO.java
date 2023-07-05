package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.model.billModel;
import com.laptrinhjavaweb.model.cartModel;
import com.laptrinhjavaweb.model.listBillModel;

public interface IListBillDAO extends GenericDAO<listBillModel>{
	
	
	List<listBillModel> danhSachBill(String idUser);
}
