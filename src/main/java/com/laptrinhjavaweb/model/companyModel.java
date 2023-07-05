package com.laptrinhjavaweb.model;

public class companyModel {
	private String idCompany;
	private String tenCongTy;
	
	
	public companyModel() {
		super();
	}
	public companyModel(String idCompany, String tenCongTy) {
		super();
		this.idCompany = idCompany;
		this.tenCongTy = tenCongTy;
	}
	public String getIdCompany() {
		return idCompany;
	}
	public void setIdCompany(String idCompany) {
		this.idCompany = idCompany;
	}
	public String getTenCongTy() {
		return tenCongTy;
	}
	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}
	
	
}
