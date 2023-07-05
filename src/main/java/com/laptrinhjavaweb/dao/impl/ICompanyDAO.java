package com.laptrinhjavaweb.dao.impl;

import java.util.List;


import com.laptrinhjavaweb.model.companyModel;

public interface ICompanyDAO {
	List<companyModel> selectAll();
	companyModel selectComByID(String idCompany);
	void updateCom(String idCompany, String tenCongTy);
	void addCom(String idHang,String tenHang);
	void deleteCom(String id);
}
