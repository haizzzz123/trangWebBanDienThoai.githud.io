package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.accModel;
import com.laptrinhjavaweb.model.billModel;

public class billMapper implements RowMapper<billModel> {

	@Override
	public billModel mapRow(ResultSet rs) {
		
		try {
			billModel newBill = new billModel();
			
			newBill.setIdAcc(rs.getString("idKhachHang"));
			newBill.setIdBill(rs.getString("idBill"));
			newBill.setIdProduct(rs.getString("idSanPham"));
			newBill.setTenSanPham(rs.getString("tenSanPham"));
			newBill.setSoLuong(rs.getInt("soLuong"));
			newBill.setThanhTien(rs.getInt("thanhTien"));
			return newBill;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}

}
