package baiTap1;

public class hinhChuNhat{
	public double chieuDai, chieuRong, chuVi, dienTich;
	
	public double chuVi() {
		chuVi = 2 * (chieuDai + chieuRong);
		return chuVi;
	}
	public double dienTich() {
		dienTich = (chieuDai * chieuRong);
		return dienTich;
	}
	public hinhChuNhat(double chieuDai, double chieuRong, double chuVi, double dienTich) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
		this.chuVi = chuVi;
		this.dienTich = dienTich;
	}
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
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
	@Override
	public String toString() {
		return "hinhChuNhat [chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + ", chuVi=" + chuVi + ", dienTich="
				+ dienTich + "]";
	}
	
}
