package mainboard;

public class mainMainboard {
	public static void main(String agrs[]) {
		mainboard m = new mainboard("Asus", "T4020", 4, 4, 4, 8, 290000000);
		mainboard.CPU mc = m.new CPU("Intel" , "i7", 3.5, 100000000);
		mainboard.Ram mr = m.new Ram("Asus", "gaming", 16, 2.3);
		
		
		
		System.out.println("Thong tin mainboard: " + m.nhaSanXuat + "-" + m.model + "-" + m.giaBan + "-" + m.soCongSata + "-" + m.soCongUsb2 + "-" + m.soCongUsb3 + "-" + m.soKheRam);
		
		System.out.println("Thong tin CPU " + mc.model);
		System.out.println("Thong tin Ram " + mr.model);		
	}
}
