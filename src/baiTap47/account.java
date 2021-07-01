package baiTap47;
import java.text.NumberFormat;
import java.util.Scanner;;

public class account {
	private long soTaiKhoan;
	private String tenTaiKhoan;
	private double soDuTaiKhoan;
	
	Scanner sc = new Scanner(System.in);
	
	//Khởi tạo contructor mặc định
	
	public account() {
		
	}
	//Khởi tạo contructor có tham số
	public account(long soTaiKhoan, String tenTaiKhoan, double soDuTaiKhoan, Scanner sc) {
		super();
		this.soTaiKhoan = soTaiKhoan;
		this.tenTaiKhoan = tenTaiKhoan;
		this.soDuTaiKhoan = soDuTaiKhoan;
	}
	
	//Khởi tạo setter getter
	
	public long getSoTaiKhoan() {
		return soTaiKhoan;
	}
	public void setSoTaiKhoan(long soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}
	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}
	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}
	public double getSoDuTaiKhoan() {
		return soDuTaiKhoan;
	}
	public void setSoDuTaiKhoan(double soDuTaiKhoan) {
		this.soDuTaiKhoan = soDuTaiKhoan;
	}

	//khởi tạo xong setter, getter
	
	//khởi tạo toString
	
@Override
public String toString() {
	return "account [soTaiKhoan=" + soTaiKhoan + ", tenTaiKhoan=" + tenTaiKhoan + ", soDuTaiKhoan=" + soDuTaiKhoan
			+ "]";
	}


//khởi tạo phương thức nạp tiền
public double napTien() {
	double nap;
	System.out.println("Nhập số tiền muốn nạp");
	nap = sc.nextDouble();
	//Số tiền nạp phải lớn hơn 0
	if(nap % 10000 == 0)
	{
		System.out.println("Số tiền nạp hợp lệ");
		soDuTaiKhoan = nap + soDuTaiKhoan;
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance();
		String soTienNap = currencyVN.format(nap);
		System.out.println("Bạn vừa nạp" + soTienNap + "vào tài khoản");
	}
	else{
		System.out.println("Số tiền không hơp lệ");
	}
	return nap;
	}

//khởi tạo rút tiền
public double rutTien() {
	double rut;
	final int phiRut = 10000;
	System.out.println("Nhập số tiền bạn cần rút :");
	rut = sc.nextDouble();
	if(rut <= (soDuTaiKhoan + phiRut))
	{
		System.out.println("Số tiền rút hợp lệ");
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance();
		String soTienRut = currencyVN.format(rut);
		System.out.print("Bạn đã rút "+ soTienRut + "VND");
	}else {
		System.out.println("Số dư tài khoản không hợp lệ");
	}
	return rut;
}

public double daoHan() {
	double laiSuat = 0.035;
	soDuTaiKhoan = soDuTaiKhoan + (soDuTaiKhoan * laiSuat);
	NumberFormat currencyVN = NumberFormat.getCurrencyInstance();
	String tienLaiSuat = currencyVN.format(laiSuat);
	System.out.println("Lãi suất nhận được là "+ tienLaiSuat);
	return laiSuat;
}
void inTaiKhoan() {
	NumberFormat currencyVN = NumberFormat.getCurrencyInstance();
	String sdtkhc = currencyVN.format(soDuTaiKhoan);
	System.out.printf("%-10d %-10s %-10s" , soTaiKhoan, tenTaiKhoan, sdtkhc);
	
}
}