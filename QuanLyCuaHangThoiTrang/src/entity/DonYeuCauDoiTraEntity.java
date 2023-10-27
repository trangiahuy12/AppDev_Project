package entity;

import java.time.LocalDate;
import java.util.Objects;

public class DonYeuCauDoiTraEntity {
	private String maDYCDT;
	private LocalDate thoiGianDoiTra;
	private NhanVienEntity nhanVien;
	private ChiTietHoaDonEntity chiTietHoaDon;
	private HinhThucDoiTra hinhThucDoiTra;
	public DonYeuCauDoiTraEntity(String maDYCDT, LocalDate thoiGianDoiTra, NhanVienEntity nhanVien,
			ChiTietHoaDonEntity chiTietHoaDon, HinhThucDoiTra hinhThucDoiTra) {
		super();
		this.maDYCDT = maDYCDT;
		this.thoiGianDoiTra = thoiGianDoiTra;
		this.nhanVien = nhanVien;
		this.chiTietHoaDon = chiTietHoaDon;
		this.hinhThucDoiTra = hinhThucDoiTra;
	}
	public DonYeuCauDoiTraEntity(String maDYCDT) {
		super();
		this.maDYCDT = maDYCDT;
	}
	public DonYeuCauDoiTraEntity() {
		super();
	}
	public String getMaDYCDT() {
		return maDYCDT;
	}
	public void setMaDYCDT(String maDYCDT) {
		this.maDYCDT = maDYCDT;
	}
	public LocalDate getThoiGianDoiTra() {
		return thoiGianDoiTra;
	}
	public void setThoiGianDoiTra(LocalDate thoiGianDoiTra) {
		this.thoiGianDoiTra = thoiGianDoiTra;
	}
	public NhanVienEntity getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVienEntity nhanVien) {
		this.nhanVien = nhanVien;
	}
	public ChiTietHoaDonEntity getChiTietHoaDon() {
		return chiTietHoaDon;
	}
	public void setChiTietHoaDon(ChiTietHoaDonEntity chiTietHoaDon) {
		this.chiTietHoaDon = chiTietHoaDon;
	}
	public HinhThucDoiTra getHinhThucDoiTra() {
		return hinhThucDoiTra;
	}
	public void setHinhThucDoiTra(HinhThucDoiTra hinhThucDoiTra) {
		this.hinhThucDoiTra = hinhThucDoiTra;
	}
	@Override
	public String toString() {
		return "DonYeuCauDoiTraEntity [maDYCDT=" + maDYCDT + ", thoiGianDoiTra=" + thoiGianDoiTra + ", nhanVien="
				+ nhanVien + ", chiTietHoaDon=" + chiTietHoaDon + ", hinhThucDoiTra=" + hinhThucDoiTra + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(maDYCDT);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DonYeuCauDoiTraEntity other = (DonYeuCauDoiTraEntity) obj;
		return Objects.equals(maDYCDT, other.maDYCDT);
	}
	
	
}
