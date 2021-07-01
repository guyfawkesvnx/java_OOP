package baiTap3;

import java.util.Scanner;

public class mainFraction extends fraction{
	public static void main(String[] agrs) {
		fraction fra = new fraction();
		fraction tongSo1 = new fraction();
		fraction hieuSo1 = new fraction();
		fraction UCLN1 = new fraction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap Phan So :");
		 fra.nhap(sc);
		System.out.println("Nhap Phan So :");
		fra.nhap(sc);
		
		tongSo1 = fra.tongSo(fra);
		hieuSo1 = fra.hieuSo(fra);
		UCLN1 = fra.UCLN(fra);
	}
}
