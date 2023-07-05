package com.laptrinhjavaweb.model;

public class listBillModel {
	private String idAcc;
	private String idBill;
	private double tongTien;
	public listBillModel() {
		super();
	}
	public listBillModel(String idAcc, String idBill, double tongTien) {
		super();
		this.idAcc = idAcc;
		this.idBill = idBill;
		this.tongTien = tongTien;
	}
	public String getIdAcc() {
		return idAcc;
	}
	public void setIdAcc(String idAcc) {
		this.idAcc = idAcc;
	}
	public String getIdBill() {
		return idBill;
	}
	public void setIdBill(String idBill) {
		this.idBill = idBill;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
}
