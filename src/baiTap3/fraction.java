package baiTap3;

import java.util.Scanner;
import java.util.Scanner;;

public class fraction {
	private int tuSo, mauSo;
	private double tongPS, hieuPS, UCLN;
	protected double BCNN;
	
	public void nhap(Scanner sc) {
	int a, b1;
	do
	{
		
		System.out.println("Nhap tu so :");
		a = sc.nextInt();
		
		System.out.println("Nhap mau so :");
		b1 = sc.nextInt();
		if(b1==0) {
			System.out.println("Mau so khong duoc bang 0");
		}
		else {

		tuSo = a;
		mauSo = b1;
		}
	}
	while(b1==0);
	}
	public fraction tongSo(fraction fra) {
		int a = tuSo*fra.mauSo + fra.tuSo*mauSo;
		int b = mauSo*fra.tuSo + fra.mauSo*tuSo;
		return fra;
	}

	public fraction hieuSo(fraction fra) {
		int a = tuSo*fra.mauSo - fra.tuSo*mauSo;
		int b = mauSo*fra.tuSo - fra.mauSo*tuSo;
		return fra;
	}
	public fraction UCLN(fraction fra) {
		int result = Math.min(this.tuSo, this.mauSo);
		while (result >= 1) {
			if(this.tuSo % result == 0 & this.mauSo % result == 0);		
		return UCLN(fra);
		}
		return fra;
	}
}

	
