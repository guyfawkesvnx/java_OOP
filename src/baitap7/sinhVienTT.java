package baitap7;
import java.util.Scanner;

public class sinhVienTT {
	private int maSinhVien;
	private String hoTen;
	private String diaChi;
	private int soDienThoai;
	
	Scanner sc = new Scanner(System.in);
	//tạo contrustor mặc định
	public sinhVienTT() {
		
	}
	//tạo contructor có tham số
	public sinhVienTT(int maSinhVien, String hoTen, String diaChi, int soDienThoai) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}
	
	//tạo getter vs setter

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
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
	
	//kết thúc tạo setter vs getter
	
	
}