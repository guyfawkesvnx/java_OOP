package baitap7;

import java.util.Scanner;

public class mainSinhVien {
	static Scanner sc = new Scanner(System.in);
	static void nhapThongTin(sinhVienTT sv) {
		System.out.println("Nhập mã số sinh viên :");
		sv.setMaSinhVien(sc.nextInt());
		
		sc.nextLine();
		
		System.out.println("Nhập họ tên sinh viên :");
		sv.setHoTen(sc.nextLine());
		System.out.println("Nhập địa chỉ sinh viên :");
		sv.setDiaChi(sc.nextLine());
		System.out.println("Nhập số điện thoại sinh viên :");
		sv.setSoDienThoai(sc.nextInt());
		
		}

	public static void main(String[] args) {
		sinhVienTT svs = new sinhVienTT();
		
		sinhVienTT a[] = null;
		int n = 0;
		System.out.println("Nhập số sinh viên muốn nhập :");
		n = sc.nextInt();
		a = new sinhVienTT[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Sinh viên số :" + (i+1));
			a[i] = new sinhVienTT();
			nhapThongTin(a[i]);
		}
		
		System.out.printf( "",svs.getMaSinhVien(), svs.getHoTen(), svs.getDiaChi(), svs.getSoDienThoai());
	}
}
