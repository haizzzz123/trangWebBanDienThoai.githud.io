package com.laptrinhjavaweb.model;

public class cartModel {
	private String idGioHang;
	private String idSanPham;
	private String tenSanPham;
	private int giaSanPham;
	private String img;
	private int soLuong;
	
	public String getIdGioHang() {
		return idGioHang;
	}



	public void setIdGioHang(String idGioHang) {
		this.idGioHang = idGioHang;
	}
	
	public int getSoLuong() {
		return soLuong;
	}



	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}



	public cartModel() {
		super();
	}



	public cartModel(String idGioHang,String idSanPham, String tenSanPham, int giaSanPham,String img, int soLuong) {
		super();
		this.idGioHang = idGioHang;
		this.idSanPham = idSanPham;
		this.tenSanPham = tenSanPham;
		this.giaSanPham = giaSanPham;
		
		this.img = img;
		this.soLuong = soLuong;
	}



	public String getImg() {
		return img;
	}



	public void setImg(String img) {
		this.img = img;
	}



	public String getIdSanPham() {
		return idSanPham;
	}



	public void setIdSanPham(String idSanPham) {
		this.idSanPham = idSanPham;
	}



	public String getTenSanPham() {
		return tenSanPham;
	}



	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}



	public int getGiaSanPham() {
		return giaSanPham;
	}



	public void setGiaSanPham(int giaSanPham) {
		this.giaSanPham = giaSanPham;
	}



	



	@Override
	public String toString() {
		return "productModel [idSanPham=" + idSanPham + ", tenSanPham=" + tenSanPham + ", giaSanPham=" + giaSanPham
				+  "]";
	}
	
	
}
