package model;

import java.sql.Date;

public class KhachThue {
	private String makhach;
	private String hoten;
	private Date ngaysinh;
	private String tuoi;
	private String gioitinh;
	private String diachi;
	private String sodienthoai;
	private String email;

	public KhachThue() {
	}

	public KhachThue(String makhach, String hoten, Date ngaysinh, String tuoi, String gioitinh, String diachi, String sodienthoai, String email) {
		this.makhach = makhach;
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
		this.sodienthoai = sodienthoai;
		this.email = email;
	}

	public String getMakhach() {
		return makhach;
	}

	public void setMakhach(String makhach) {
		this.makhach = makhach;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getTuoi() {
		return tuoi;
	}

	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSodienthoai() {
		return sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
