package sinhVien;

import java.util.Scanner;

public class sinhVien {
	String maSV, hoTen;
	
	class ngaySinh{
		int ngay, thang, nam;

		public ngaySinh(int ngay, int thang, int nam) {
			super();
			this.ngay = ngay;
			this.thang = thang;
			this.nam = nam;
		}

		public int getNgay() {
			return ngay;
		}

		public void setNgay(int ngay) {
			this.ngay = ngay;
		}

		public int getThang() {
			return thang;
		}

		public void setThang(int thang) {
			this.thang = thang;
		}

		public int getNam() {
			return nam;
		}

		public void setNam(int nam) {
			this.nam = nam;
		}
		
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		hoTen = sc.nextLine();
		
	}
}
