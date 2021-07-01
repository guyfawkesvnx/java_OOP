package nhapTamGiac;

public class mainTamGiac {
	public static void main(String agrs[]) {
		tamGiac maintg = new tamGiac();
		maintg.nhap();
		
		System.out.println("Dien tich tam giac la " + maintg.dienTich());
	}
}
