package tamGiacInterface;

import java.util.Scanner;

import nhapTamGiac.tamGiac.*;

interface hinhHoc2D {
	abstract double chuVi();
	abstract double dienTich();
	abstract Object nhap();

public class tamGiac {
	double canha, canhb, canhc;
	double chuVi, dienTich;
	public tamGiac() {
	}
	

	public tamGiac(double canha, double canhb, double canhc, double chuVi, double dienTich) {
		super();
		this.canha = canha;
		this.canhb = canhb;
		this.canhc = canhc;
		this.chuVi = chuVi;
		this.dienTich = dienTich;
	}
	


	public double getCanha() {
		return canha;
	}


	public void setCanha(double canha) {
		this.canha = canha;
	}


	public double getCanhb() {
		return canhb;
	}


	public void setCanhb(double canhb) {
		this.canhb = canhb;
	}


	public double getCanhc() {
		return canhc;
	}


	public void setCanhc(double canhc) {
		this.canhc = canhc;
	}


	public double getChuVi() {
		return chuVi;
	}


	public void setChuVi(double chuVi) {
		this.chuVi = chuVi;
	}


	public double getDienTich() {
		return dienTich;
	}


	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	double chuVi() {
		return canha + canhb + canhc;
	}
	double dienTich() {
		return canha;
	}


	tamGiac nhap() {
		tamGiac tg = new tamGiac();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap canh a: ");
		canha = sc.nextDouble();
		System.out.println("Nhap canh b: ");
		canhb = sc.nextDouble();
		System.out.println("Nhap canh c: ");
		canhc = sc.nextDouble();

		return tg;
		}
	}
}
