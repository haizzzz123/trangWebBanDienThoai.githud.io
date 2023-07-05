package com.laptrinhjavaweb.model;

public class productModel {
	private String idSanPham;
	private String tenSanPham;
	private int giaSanPham;
	private String nhaSanXuat;
	private String img;
	
	
	
	public productModel() {
		super();
	}



	public productModel(String idSanPham, String tenSanPham, int giaSanPham, String nhaSanXuat,String img ) {
		super();
		this.idSanPham = idSanPham;
		this.tenSanPham = tenSanPham;
		this.giaSanPham = giaSanPham;
		this.nhaSanXuat = nhaSanXuat;
		this.img = img;
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



	public String getNhaSanXuat() {
		return nhaSanXuat;
	}



	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}



	@Override
	public String toString() {
		return "productModel [idSanPham=" + idSanPham + ", tenSanPham=" + tenSanPham + ", giaSanPham=" + giaSanPham
				+ ", nhaSanXuat=" + nhaSanXuat + "]";
	}



	



	
	
}
