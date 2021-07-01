package baiTap1;

import java.util.Scanner;
public class mainHinhChuNhat{
	public static void main(String []agrs){
		
		hinhChuNhat hcn = new hinhChuNhat(0, 0, 0, 0);
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhap chieu Rong:");
			hcn.chieuRong = sc.nextDouble();
			
			System.out.println("Nhap chieu Dai:");
			hcn.chieuDai = sc.nextDouble();
		}
		System.out.println("Chu vi hinh chu nhat la: " + hcn.chuVi());
		System.out.print("Dien tich hinh chu nhat la:" + hcn.dienTich());
		
	}
}
