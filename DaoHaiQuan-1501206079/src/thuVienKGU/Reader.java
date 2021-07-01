package thuVienKGU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Reader {
	public static String maSo, hoTen, tenKhoa;
	public static GregorianCalendar ngaySinh, thangSinh, namSinh;
	public static String[] danhSach = {maSo, hoTen, tenKhoa};
	
	
	public Reader(GregorianCalendar ngaySinh, GregorianCalendar thangSinh, GregorianCalendar namSinh) {
		super();
		this.ngaySinh = ngaySinh;
		this.thangSinh = thangSinh;
		this.namSinh = namSinh;
	}
	
	

	public static String getMaSo() {
		return maSo;
	}



	public static void setMaSo(String maSo) {
		Reader.maSo = maSo;
	}



	public static String getHoTen() {
		return hoTen;
	}



	public static void setHoTen(String hoTen) {
		Reader.hoTen = hoTen;
	}



	public static String getTenKhoa() {
		return tenKhoa;
	}



	public static void setTenKhoa(String tenKhoa) {
		Reader.tenKhoa = tenKhoa;
	}



	public GregorianCalendar getNgaySinh() {
		return ngaySinh;
	}



	public void setNgaySinh(GregorianCalendar ngaySinh) {
		this.ngaySinh = ngaySinh;
	}



	public GregorianCalendar getThangSinh() {
		return thangSinh;
	}



	public void setThangSinh(GregorianCalendar thangSinh) {
		this.thangSinh = thangSinh;
	}



	public GregorianCalendar getNamSinh() {
		return namSinh;
	}



	public void setNamSinh(GregorianCalendar namSinh) {
		this.namSinh = namSinh;
	}



	public static String[] getDanhSach() {
		return danhSach;
	}



	public static void setDanhSach(String[] danhSach) {
		Reader.danhSach = danhSach;
	}
	



	@Override
	public String toString() {
		return "Reader [ngaySinh=" + ngaySinh + ", thangSinh=" + thangSinh + ", namSinh=" + namSinh + "]";
	}



	public void nhapMang() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Length: ");
		int length = sc.nextInt();
		sc.hasNextLine();
		
		danhSach = new String[length];
		
		for(int i = 0; i < length; i++) {
			System.out.printf("Phần tử thứ %d, %n", i);
			danhSach[i] = sc.nextLine();
			}
		sc.close();
		}

	public static void timKiemMaSo() {
		String maSo1;
		Scanner sc = new Scanner(System.in);
		maSo1 = sc.nextLine();
		
		if(maSo1 == danhSach[0]) {
			for(int i = 0; i < danhSach.length; i++) {
				System.out.printf("Thông tin bạn đọc là: " + danhSach[i]);
			};
		}else
		{
			System.out.printf("Không có");
		}
		
	}
	public static void timKiemKhoa() {
		
		String ten = "Khoa";
		if (danhSach[1] == ten) {
			for(int i = 0; i < danhSach.length; i++) {
				System.out.printf("Danh sách bạn đọc có tên Khoa" + danhSach[i]);
			}
		}
	}
	
}
