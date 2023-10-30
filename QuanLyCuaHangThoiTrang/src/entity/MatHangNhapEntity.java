package entity;

import java.time.LocalDate;

public class MatHangNhapEntity {
	private NhaCungCapEntity nhaCungCap;
	private SanPhamEntity sanPham;
	private int soLuongNhap;
	private LocalDate ngayNhap;
	public MatHangNhapEntity(NhaCungCapEntity nhaCungCap, SanPhamEntity sanPham, int soLuongNhap, LocalDate ngayNhap) {
		super();
		this.nhaCungCap = nhaCungCap;
		this.sanPham = sanPham;
		this.soLuongNhap = soLuongNhap;
		this.ngayNhap = ngayNhap;
	}
	public MatHangNhapEntity() {
		super();
	}
	public NhaCungCapEntity getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(NhaCungCapEntity nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public SanPhamEntity getSanPham() {
		return sanPham;
	}
	public void setSanPham(SanPhamEntity sanPham) {
		this.sanPham = sanPham;
	}
	public int getSoLuongNhap() {
		return soLuongNhap;
	}
	public void setSoLuongNhap(int soLuongNhap) {
		this.soLuongNhap = soLuongNhap;
	}
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	@Override
	public String toString() {
		return "MatHangNhapEntity [sanPham=" + sanPham + ", soLuongNhap=" + soLuongNhap + ", ngayNhap=" + ngayNhap
				+ "]";
	}
	
	
}
