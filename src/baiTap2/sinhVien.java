package baiTap2;

import java.util.Scanner;

public class sinhVien {
	private int maSV;
	private String hoTen;
	private float diemLyThuyet, diemThucHanh;
	public void nhap() {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhap ma so sinh vien: ");
			maSV = sc.nextInt();
			System.out.println("Nhap ho ten sinh vien: ");
			hoTen = sc.nextLine();
			System.out.println("Nhap diem l thuyet: ");
			diemLyThuyet = sc.nextFloat();
			System.out.println("Nhap diem thuc hanh: ");
			diemThucHanh = sc.nextFloat();
		}
		
	}
	public sinhVien(int maSV, String hoTen, float diemLyThuyet, float diemThucHanh) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemLyThuyet = diemLyThuyet;
		this.diemThucHanh = diemThucHanh;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getDiemLyThuyet() {
		return diemLyThuyet;
	}
	public void setDiemLyThuyet(float diemLyThuyet) {
		this.diemLyThuyet = diemLyThuyet;
	}
	public float getDiemThucHanh() {
		return diemThucHanh;
	}
	public void setDiemThucHanh(float diemThucHanh) {
		this.diemThucHanh = diemThucHanh;
	}
	@Override
	public String toString() {
		return "sinhVien [maSV=" + maSV + ", hoTen=" + hoTen + ", diemLyThuyet=" + diemLyThuyet + ", diemThucHanh="
				+ diemThucHanh + "]";
	}
	
}
