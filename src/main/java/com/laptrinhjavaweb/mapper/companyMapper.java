package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.companyModel;

public class companyMapper implements RowMapper<companyModel> {

	@Override
	public companyModel mapRow(ResultSet rs) {
		try {
			companyModel newCompany = new companyModel();
			
			newCompany.setIdCompany(rs.getString("idCongTy"));
			newCompany.setTenCongTy(rs.getString("tenCongTy"));
			
			return newCompany;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}

}
