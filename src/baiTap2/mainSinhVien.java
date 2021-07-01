package baiTap2;

import java.util.concurrent.Executor;

public class mainSinhVien {
	public static void main(String agrs[]) {
		sinhVien sv1 = new sinhVien(150, "Dao Van Dang", 4, 9);
		sinhVien sv2 = new sinhVien(120, "Hong Hanh", 10, 10);
		sinhVien sv3 = new sinhVien(200, "Tran My Nhan", 10, 9);
		System.out.println("Thong tin sinh vien 1: " + sv1);
		System.out.println("Thong tin sinh vien 2: " + sv2);
		System.out.println("Thong tin sinh vien 3: " + sv3);
		
	}
}
