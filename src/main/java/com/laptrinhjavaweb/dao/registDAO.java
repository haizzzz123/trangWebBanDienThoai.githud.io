package com.laptrinhjavaweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.laptrinhjavaweb.dao.impl.IRegistDAO;
import com.laptrinhjavaweb.model.accModel;

public class registDAO extends AbstractDAO<accModel> implements IRegistDAO{
	

	public registDAO() {
		
	}
	@Override
	public String insert(accModel acc) {
		String sql = "INSERT INTO account(id, tenDangNhap, matKhau, hoVaTen, sdt ,diaChi, email , phanQuyen) values (?,?,?,?,?,?,?,?)";
		return insert(sql, acc.getId(), acc.getTenDangNhap(), acc.getMatKhau(), acc.getHoVaTen(), acc.getSdt(), acc.getDiaChi(), acc.getEmail(), acc.isPhanQuyen());
		
	}
	

public static void main(String[] args)  {
	
	System.out.print(new registDAO().getConnection());
}

}
