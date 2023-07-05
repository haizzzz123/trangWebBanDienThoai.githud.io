package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.model.accModel;

public interface ILoginDAO extends GenericDAO<accModel> {
	accModel kiemTraTaiKhoan(String taiKhoan, String matKhau);
	
	accModel selectAccByID(String idACC);
	List<accModel> selectAcc();
	void deleteAcc(String id);
	void updateAcc(String id, String taiKhoan, String matKhau, String hoVaTen, String email, String diaChi, String sdt, boolean phanQuyen);
}
