package com.laptrinhjavaweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dao.impl.ICartDAO;
import com.laptrinhjavaweb.mapper.cartMapper;
import com.laptrinhjavaweb.mapper.cartMapper2;
import com.laptrinhjavaweb.mapper.productMapper;
import com.laptrinhjavaweb.model.cartModel;
import com.laptrinhjavaweb.model.productModel;

public class cartDAO extends AbstractDAO<cartModel> implements ICartDAO{

	@Override
	public void themSanPhamVaoGio(String idCart,String idSanPham, String idAcc, int soLuong) {
		String sql = "INSERT INTO cart(idCart,idKhachHang, idSanPham,soLuong) values(?,?,?,?)";
		insert(sql, idCart,idAcc, idSanPham, soLuong);
		
	}

	@Override
	public ArrayList<Integer> soLuongSanPham(String idAcc) {
		String sql = "select soLuong from cart where idKhachHang =?";
		ArrayList<Integer> soLuong = new ArrayList<Integer>();
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(0, idAcc);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				soLuong.add(resultSet.getInt("soLuong"));
			}
			return soLuong;
		} catch (SQLException e) {
			return null;
		}
	}

	@Override
	public List<cartModel> selectProductOfCart(String idKhachHang) {
		String sql =  "SELECT cart.idCart,product.idSanPham,tenSanPham, giaSanPham, img, idHang, cart.soLuong\r\n"
				+ "FROM product\r\n"
				+ "INNER JOIN cart\r\n"
				+ "ON product.idSanPham = cart.idSanPham\r\n"
				+ "where idKhachHang =?";
		return query(sql, new cartMapper(), idKhachHang);
	}

	@Override
	public void deleteProductOfCart(String idCart) {
		String sql = "DELETE FROM cart WHERE idCart=?";
		update(sql, idCart);
		
	}

	@Override
	public List<cartModel> selectProductOfCartbyidBill(String idBill) {
		String sql = "SELECT bill_product.idBill,product.idSanPham,product.tenSanPham, giaSanPham, img, idHang, bill_product.soLuong\r\n"
				+ "				FROM product\r\n"
				+ "				INNER JOIN bill_product\r\n"
				+ "				ON product.idSanPham = bill_product.idSanPham\r\n"
				+ "				where idBill = ?";
		return query(sql, new cartMapper2(), idBill);
	}
	
	

}
