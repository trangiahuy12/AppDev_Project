package entity;

import java.util.Objects;

public class ChiTietHoaDonEntity {
	private String maCTHD;
	private SanPhamEntity sanPham;
	private HoaDonEntity hoaDon;
	private int soLuong;
	public ChiTietHoaDonEntity(String maCTHD, SanPhamEntity sanPham, HoaDonEntity hoaDon, int soLuong) {
		super();
		this.maCTHD = maCTHD;
		this.sanPham = sanPham;
		this.hoaDon = hoaDon;
		this.soLuong = soLuong;
	}
	public ChiTietHoaDonEntity(String maCTHD) {
		super();
		this.maCTHD = maCTHD;
	}
	public ChiTietHoaDonEntity() {
		super();
	}
	public String getMaCTHD() {
		return maCTHD;
	}
	public void setMaCTHD(String maCTHD) {
		this.maCTHD = maCTHD;
	}
	public SanPhamEntity getSanPham() {
		return sanPham;
	}
	public void setSanPham(SanPhamEntity sanPham) {
		this.sanPham = sanPham;
	}
	public HoaDonEntity getHoaDon() {
		return hoaDon;
	}
	public void setHoaDon(HoaDonEntity hoaDon) {
		this.hoaDon = hoaDon;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		return "ChiTietHoaDonEntity [maCTHD=" + maCTHD + ", hoaDon=" + hoaDon + ", soLuong=" + soLuong + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(maCTHD);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiTietHoaDonEntity other = (ChiTietHoaDonEntity) obj;
		return Objects.equals(maCTHD, other.maCTHD);
	}
	
	
}
