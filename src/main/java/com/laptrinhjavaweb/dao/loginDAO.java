package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.dao.impl.ILoginDAO;
import com.laptrinhjavaweb.dao.impl.IRegistDAO;
import com.laptrinhjavaweb.mapper.accMapper;
import com.laptrinhjavaweb.model.accModel;

public class loginDAO extends AbstractDAO<accModel> implements ILoginDAO{

	@Override
	public accModel kiemTraTaiKhoan(String taiKhoan, String matKhau) {
		String sql = "SELECT * FROM account\r\n"
				+ "WHERE  tenDangNhap = ? AND matKhau = ?";
		List<accModel> list = query(sql,new accMapper(), taiKhoan, matKhau);
		return list.isEmpty()? null: list.get(0);
	}

	@Override
	public List<accModel> selectAcc() {
		String sql ="select * from account";
		List<accModel> acc = query(sql, new accMapper());
		return acc;
	}

	@Override
	public accModel selectAccByID(String idACC) {
		String sql ="select * from account where id =?";
		List<accModel> list = query(sql,new accMapper(), idACC);
		return list.isEmpty()? null: list.get(0);
	}

	@Override
	public void updateAcc(String id, String taiKhoan, String matKhau, String hoVaTen, String email, String diaChi,
			String sdt, boolean phanQuyen) {
		String sql ="UPDATE account\r\n"
				+ "SET tenDangNhap = ?, matKhau= ?, hoVaTen=?, sdt=?, diaChi=?, email=?, phanQuyen=?\r\n"
				+ "WHERE id =?";
		update(sql, taiKhoan, matKhau, hoVaTen,sdt, diaChi, email, phanQuyen, id);
		
	}

	@Override
	public void deleteAcc(String id) {
		String sql ="DELETE FROM account WHERE id=? ";
		update(sql, id);
		
	}

}
