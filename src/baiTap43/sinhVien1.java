package baiTap43;

public class sinhVien1 {
	private String maSinhVien;
	private String hoTen;
	private String diaChi;
	private int soDienThoai;
	
	public sinhVien1() {
	}
	
	public sinhVien1(String maSinhVien, String hoTen, String diaChi, int soDienThoai) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	@Override
	public String toString() {
		return "sinhVien [maSinhVien=" + maSinhVien + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", soDienThoai="
				+ soDienThoai + "]";
	}
	
	
}
