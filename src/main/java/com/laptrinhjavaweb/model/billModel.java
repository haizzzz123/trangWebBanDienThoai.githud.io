package com.laptrinhjavaweb.model;

public class billModel {
	private String idAcc;
	private String idBill;
	private String idProduct;
	private String tenSanPham;
	private int soLuong;
	private int thanhTien;
	public billModel() {
		super();
	}
	public billModel(String idAcc, String idBill, String idProduct,String tenSanPham ,int soLuong, int thanhTien) {
		super();
		this.idAcc = idAcc;
		this.idBill = idBill;
		this.idProduct = idProduct;
		this.soLuong = soLuong;
		this.thanhTien = thanhTien;
		this.tenSanPham = tenSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
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
	public String getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(int thanhTien) {
		this.thanhTien = thanhTien;
	}
	
	
	
	
	
}
