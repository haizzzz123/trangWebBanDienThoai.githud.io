package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.productModel;

public class productMapper implements RowMapper<productModel> {

	@Override
	public productModel mapRow(ResultSet rs) {
		try {
			productModel newProduct = new productModel();
			newProduct.setIdSanPham(rs.getString("idSanPham"));
			newProduct.setTenSanPham(rs.getString("tenSanPham"));
			newProduct.setGiaSanPham(rs.getInt("giaSanPham"));
			newProduct.setNhaSanXuat(rs.getString("idHang"));
			newProduct.setImg(rs.getString("img"));
			
			return newProduct;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}

}
