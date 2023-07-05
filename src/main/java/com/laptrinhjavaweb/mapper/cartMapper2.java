package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.cartModel;
import com.laptrinhjavaweb.model.productModel;

public class cartMapper2 implements RowMapper<cartModel> {

	@Override
	public cartModel mapRow(ResultSet rs) {
		try {
			cartModel newCart = new cartModel();
			newCart.setIdGioHang(rs.getString("idBill"));
			newCart.setIdSanPham(rs.getString("idSanPham"));
			newCart.setTenSanPham(rs.getString("tenSanPham"));
			newCart.setGiaSanPham(rs.getInt("giaSanPham"));
			newCart.setImg(rs.getString("img"));
			newCart.setSoLuong(rs.getInt("soLuong"));
			
			return newCart;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}

}
