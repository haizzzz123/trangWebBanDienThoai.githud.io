package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.accModel;

public class accMapper implements RowMapper<accModel> {

	@Override
	public accModel mapRow(ResultSet rs) {
		
		try {
			accModel newAcc = new accModel();
			
			newAcc.setId(rs.getString("id"));
			newAcc.setHoVaTen(rs.getString("hoVaTen"));
			newAcc.setTenDangNhap(rs.getString("tenDangNhap"));
			newAcc.setMatKhau(rs.getString("matKhau"));
			newAcc.setEmail(rs.getString("email"));
			newAcc.setSdt(rs.getString("sdt"));
			newAcc.setDiaChi(rs.getString("diaChi"));
			newAcc.setPhanQuyen(rs.getBoolean("phanQuyen"));
			return newAcc;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}

}
