package baiTap47;
import java.util.Scanner;

public class mainAccount {
	static Scanner sc = new Scanner(System.in);
	static void nhapTaiKhoan(account taikhoan) {
		System.out.println("Nhập số tài khoản :");
		taikhoan.setSoTaiKhoan(sc.nextInt());
		sc.nextInt();
		System.out.println("Nhập tên tài khoan :");
		taikhoan.setTenTaiKhoan(sc.nextLine());
		sc.nextLine();
		
		taikhoan.setSoDuTaiKhoan(50000);
	}
	
	public static void main(String[] agrs) {
		account a[] = null;
		int soKhachHang = 0, luaChon = 0, k = 0;
		long soTKKH, d, c, f;
		boolean flag = true;
		do {
			System.out.println("Nhập lựa chọn :");
			System.out.println("1.Nhập thông tin khách hàng /n"+ "2.Xuất danh sách thông tin khách hàng"+"3.Nạp tiền"+"4.Rút tiền"
			+"5.Đáo hạn"+"6.Chuyển khoản"+"Số khác để thoát");
			
			luaChon = sc.nextInt();
			switch(luaChon) {
				case 1:
					System.out.println("Nhập số lượng khách hàng muốn nhập :");
					soKhachHang = sc.nextInt();
					a = new account[soKhachHang];
					for(int i = 0; i < soKhachHang; i++) {
						System.out.println("Khách hàng số" + (i+1));
						a[i] = new account();
						nhapTaiKhoan(a[i]);
					}
					break;
				case 2:
					 System.out.printf("%-10s %-20s %-20s\n", "Số TK", "Tên TK", "Số tiền trong TK");
	                    for (int i = 0; i < soKhachHang; i++) {
	                        a[i].inTaiKhoan();
	            }
	                    break;
				case 3:
					System.out.println("Nhập số tài khoản khách hàng cần nạp :");
					soTKKH = sc.nextInt();
					for(int i = 0; i < soKhachHang; i++) {
						d = a[i].getSoTaiKhoan();
						if(soTKKH == d) {
							System.out.println("Bạn chọn tài khoản: " + d);
                            a[i].rutTien();
						}
					}
					break;
                case 4:
                    System.out.println("Nhập số tài khoản khách hàng cần rút tiền: ");
                    soTKKH = sc.nextLong();
                    for (int i = 0; i < soKhachHang; i++) {
                        d = a[i].getSoTaiKhoan();
                        if (soKhachHang == d) {
                            System.out.println("Bạn chọn tài khoản: " + d);
                            a[i].rutTien();
                        }
                    }
                    break;
			       case 5:
	                    System.out.println("Nhập số tài khoản khách hàng cần đáo hạn: ");
	                    soTKKH = sc.nextLong();
	                    for (int i = 0; i < soKhachHang; i++) {
	                        d = a[i].getSoTaiKhoan();
	                        if (soKhachHang == d) {
	                            System.out.println("Bạn chọn tài khoản: " + d);
	                            a[i].daoHan();
	                        } else {
	                            System.out.println("");
	                        }
	                    }
	                    break;
	                case 6:
	                    double chuyen,
	                            nhan,
	                            tienChuyen;
	                    System.out.print("Nhập số tài khoản khách hàng chuyển tiền: ");
	                    soTKKH = sc.nextLong();
	                    System.out.print("Nhập số tài khoản khách hàng nhận tiền: ");
	                    c = sc.nextLong();
	                    for (int i = 0; i < soKhachHang; i++) {
	                        d = a[i].getSoTaiKhoan();
	                        if (soTKKH == d) {
	                            chuyen = a[i].getSoDuTaiKhoan();
	                            for (int j = 0; j < soKhachHang; j++) {
	                                f = a[j].getSoTaiKhoan();
	                                if (c == f) {
	                                    nhan = a[j].getSoDuTaiKhoan();
	                                    System.out.println("Nhập số tiền cần chuyển");
	                                    tienChuyen = sc.nextDouble();
	                                    if (tienChuyen <= chuyen) {
	                                        chuyen = chuyen - tienChuyen;
	                                        nhan = nhan + tienChuyen;
	                                        a[i].setSoDuTaiKhoan(chuyen);
	                                        a[j].setSoDuTaiKhoan(nhan);
	                                        System.out.println("Tài khoản số " + d + " vừa chuyển: $" + tienChuyen);
	                                        System.out.println("Tài khoản số " + f + " vừa nhận: $" + tienChuyen);
	                                    } else {
	                                        System.out.println("Số tiền nhập không hợp lệ!");
	                                    }
	                                } else {
	                                    System.out.println("");
	                                }
	                            }
	                        } else {
	                            System.out.println("");
	                        }
	                    }
	                    break;
	                default:
	                    System.out.println("Bye!!");
	                    flag = false;
	                    break;
			}
		}
		while(flag);
	}
}
