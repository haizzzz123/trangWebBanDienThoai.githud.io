package com.laptrinhjavaweb.model;

public class accModel {
	private String id;
	private String tenDangNhap;
	private String matKhau;
	private String hoVaTen;
	private String sdt;
	private String diaChi;
	private String email;
	private boolean phanQuyen;
	
	
	
	public accModel() {
		super();
	}



	public accModel(String id, String tenDangNhap, String matKhau, String hoVaTen, String sdt, String diaChi,
			String email,boolean phanQuyen) {
		super();
		this.id = id;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.hoVaTen = hoVaTen;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.email = email;
		this.phanQuyen = phanQuyen;
	}



	public boolean isPhanQuyen() {
		return phanQuyen;
	}



	public void setPhanQuyen(boolean phanQuyen) {
		this.phanQuyen = phanQuyen;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getTenDangNhap() {
		return tenDangNhap;
	}



	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}



	public String getMatKhau() {
		return matKhau;
	}



	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}



	public String getHoVaTen() {
		return hoVaTen;
	}



	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}



	public String getSdt() {
		return sdt;
	}



	public void setSdt(String sdt) {
		this.sdt = sdt;
	}



	public String getDiaChi() {
		return diaChi;
	}



	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
