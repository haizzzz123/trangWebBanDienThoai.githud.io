package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.dao.impl.IBillDAO;
import com.laptrinhjavaweb.dao.impl.ICartDAO;
import com.laptrinhjavaweb.dao.impl.IListBillDAO;
import com.laptrinhjavaweb.mapper.billMapper;
import com.laptrinhjavaweb.mapper.listBillMapper;
import com.laptrinhjavaweb.model.billModel;
import com.laptrinhjavaweb.model.cartModel;
import com.laptrinhjavaweb.model.listBillModel;

public class listBillDAO extends AbstractDAO<listBillModel> implements IListBillDAO{

	@Override
	public List<listBillModel> danhSachBill(String idUser) {
		String sql = "select * from bill where idKhachHang = ?";
		List<listBillModel> list = query(sql,new listBillMapper(), idUser);
		return list;
	}

	

	


	

}
