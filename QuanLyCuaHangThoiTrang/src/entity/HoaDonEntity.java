package entity;

import java.time.LocalDate;
import java.util.Objects;

public class HoaDonEntity {
	private String maHD;
	private LocalDate ngayLapHD;
	private KhachHangEntity khachHang;
	private NhanVienEntity nhanVien;
	private ChuongTrinhKhuyenMaiEntity chuongTrinhKM;
	private int thueVAT;
	public HoaDonEntity(String maHD, LocalDate ngayLapHD, KhachHangEntity khachHang, NhanVienEntity nhanVien,
			ChuongTrinhKhuyenMaiEntity chuongTrinhKM, int thueVAT) {
		super();
		this.maHD = maHD;
		this.ngayLapHD = ngayLapHD;
		this.khachHang = khachHang;
		this.nhanVien = nhanVien;
		this.chuongTrinhKM = chuongTrinhKM;
		this.thueVAT = thueVAT;
	}
	public HoaDonEntity(String maHD) {
		super();
		this.maHD = maHD;
	}
	public HoaDonEntity() {
		super();
	}
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public LocalDate getNgayLapHD() {
		return ngayLapHD;
	}
	public void setNgayLapHD(LocalDate ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}
	public KhachHangEntity getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHangEntity khachHang) {
		this.khachHang = khachHang;
	}
	public NhanVienEntity getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVienEntity nhanVien) {
		this.nhanVien = nhanVien;
	}
	public ChuongTrinhKhuyenMaiEntity getChuongTrinhKM() {
		return chuongTrinhKM;
	}
	public void setChuongTrinhKM(ChuongTrinhKhuyenMaiEntity chuongTrinhKM) {
		this.chuongTrinhKM = chuongTrinhKM;
	}
	public int getThueVAT() {
		return thueVAT;
	}
	public void setThueVAT(int thueVAT) {
		this.thueVAT = thueVAT;
	}
	@Override
	public String toString() {
		return "HoaDonEntity [maHD=" + maHD + ", ngayLapHD=" + ngayLapHD + ", khachHang=" + khachHang + ", nhanVien="
				+ nhanVien + ", chuongTrinhKM=" + chuongTrinhKM + ", thueVAT=" + thueVAT + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(maHD);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDonEntity other = (HoaDonEntity) obj;
		return Objects.equals(maHD, other.maHD);
	}
	
//	public double tongTien() {
//		return thueVAT;
		
//	}
}
