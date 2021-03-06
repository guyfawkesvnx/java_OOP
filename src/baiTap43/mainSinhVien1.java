package baiTap43;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class mainSinhVien1 {

	
		static void nhapsv(sinhVien1 sv1) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so sinh vien :");
		sv1.setMaSinhVien(sc.nextLine());
		
		System.out.println("Nhap ho ten sinh vien :");
		sv1.setHoTen(sc.nextLine());
		
		System.out.println("Nhap dia chi sinh vien :");
		sv1.setDiaChi(sc.nextLine());
		
		System.out.println("Nhap so dien thoai :");
		sv1.setSoDienThoai(sc.nextInt());
		
	}
		
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int sosv = 0;
		sinhVien1 sva[] = null;

		System.out.println("Nhap so sinh vien :");
		sosv = sc.nextInt();
		sva = new sinhVien1[sosv];
		
		for(int i = 0; i < sosv; i++) {
			System.out.println("Sinh vien so : " + (i + 1));
			sva[i] = new sinhVien1();
			nhapsv(sva[i]);
		}
		
		try {
			FileOutputStream datasv = new FileOutputStream("C:\\test\\data.dat");
			ObjectOutputStream dataout = new ObjectOutputStream(datasv);
			
			dataout.writeObject(sva);
			
			datasv.close();
			dataout.close();
			
		}catch (IOException ex) {
		    ex.printStackTrace();
		}
	}
}
