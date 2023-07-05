package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.accModel;
import com.laptrinhjavaweb.model.listBillModel;

public class listBillMapper implements RowMapper<listBillModel> {

	@Override
	public listBillModel mapRow(ResultSet rs) {
		
		try {
			listBillModel newListBill = new listBillModel();
			
			newListBill.setIdAcc(rs.getString("idKhachHang"));
			newListBill.setIdBill(rs.getString("idBill"));
			newListBill.setTongTien(rs.getDouble("tongTien"));
			
			return newListBill;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}

}
