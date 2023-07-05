package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.dao.impl.ICompanyDAO;
import com.laptrinhjavaweb.mapper.accMapper;
import com.laptrinhjavaweb.mapper.companyMapper;
import com.laptrinhjavaweb.model.accModel;
import com.laptrinhjavaweb.model.companyModel;

public class companyDAO extends AbstractDAO<companyModel> implements ICompanyDAO{

	@Override
	public List<companyModel> selectAll() {
		String sql = "SELECT * FROM company";
		
		return query(sql, new companyMapper());
	}

	@Override
	public companyModel selectComByID(String idCompany) {
		String sql ="select * from company where idCongTy =?";
		List<companyModel> list = query(sql,new companyMapper(), idCompany);
		return list.isEmpty()? null: list.get(0);
	}

	@Override
	public void updateCom(String idCompany, String tenCongTy) {
		String sql ="UPDATE company\r\n"
				+ "SET tenCongTy = ?\r\n"
				+ "WHERE idCongTy =?";
		update(sql, tenCongTy, idCompany);
		
	}

	@Override
	public void addCom(String idHang, String tenHang) {
		String sql = "INSERT INTO company (idCongTy, tenCongTy) VALUES (?, ?)";
		update(sql, idHang,tenHang);
		
	}

	@Override
	public void deleteCom(String id) {
		String sql ="DELETE FROM company WHERE idCongTy=? ";
		update(sql, id);
		
	}
	
}
