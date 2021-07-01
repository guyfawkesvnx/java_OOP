package mainboard;

public class mainboard {
	String nhaSanXuat, model;
	int soCongUsb2, soCongUsb3, soCongSata, soKheRam, giaBan;
	
	class CPU {
		String nhaSanXuat, model;
		double tocDo;
		int giaBan;
		public CPU(String nhaSanXuat, String model, double tocDo, int giaBan) {
			super();
			this.nhaSanXuat = nhaSanXuat;
			this.model = model;
			this.tocDo = tocDo;
			this.giaBan = giaBan;
		}
		public String getNhaSanXuat() {
			return nhaSanXuat;
		}
		public void setNhaSanXuat(String nhaSanXuat) {
			this.nhaSanXuat = nhaSanXuat;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public double getTocDo() {
			return tocDo;
		}
		public void setTocDo(double tocDo) {
			this.tocDo = tocDo;
		}
		public int getGiaBan() {
			return giaBan;
		}
		public void setGiaBan(int giaBan) {
			this.giaBan = giaBan;
		}
		
		
	}
	class Ram{
		String nhaSanXuat, model;
		int dungLuong;
		double tocDo;
		public Ram(String nhaSanXuat, String model, int dungLuong, double tocDo) {
			super();
			this.nhaSanXuat = nhaSanXuat;
			this.model = model;
			this.dungLuong = dungLuong;
			this.tocDo = tocDo;
		}
		public String getNhaSanXuat() {
			return nhaSanXuat;
		}
		public void setNhaSanXuat(String nhaSanXuat) {
			this.nhaSanXuat = nhaSanXuat;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public int getDungLuong() {
			return dungLuong;
		}
		public void setDungLuong(int dungLuong) {
			this.dungLuong = dungLuong;
		}
		public double getTocDo() {
			return tocDo;
		}
		public void setTocDo(double tocDo) {
			this.tocDo = tocDo;
		}
	}
	public mainboard(String nhaSanXuat, String model, int soCongUsb2, int soCongUsb3, int soCongSata, int soKheRam,
			int giaBan) {
		super();
		this.nhaSanXuat = nhaSanXuat;
		this.model = model;
		this.soCongUsb2 = soCongUsb2;
		this.soCongUsb3 = soCongUsb3;
		this.soCongSata = soCongSata;
		this.soKheRam = soKheRam;
		this.giaBan = giaBan;
	}
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSoCongUsb2() {
		return soCongUsb2;
	}
	public void setSoCongUsb2(int soCongUsb2) {
		this.soCongUsb2 = soCongUsb2;
	}
	public int getSoCongUsb3() {
		return soCongUsb3;
	}
	public void setSoCongUsb3(int soCongUsb3) {
		this.soCongUsb3 = soCongUsb3;
	}
	public int getSoCongSata() {
		return soCongSata;
	}
	public void setSoCongSata(int soCongSata) {
		this.soCongSata = soCongSata;
	}
	public int getSoKheRam() {
		return soKheRam;
	}
	public void setSoKheRam(int soKheRam) {
		this.soKheRam = soKheRam;
	}
	public int getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}
	
	
	
}
