package entity;


import java.time.LocalDate;
import java.util.Date;

public class MatHangNhapEntity {
	private NhaCungCapEntity nhaCungCap;
	private SanPhamEntity sanPham;
	private int soLuongNhap;
	private LocalDate ngayNhap;

    public MatHangNhapEntity() {
    }

        
    public MatHangNhapEntity(NhaCungCapEntity nhaCungCap, SanPhamEntity sanPham, int soLuongNhap, LocalDate ngayNhap) {
        this.nhaCungCap = nhaCungCap;
        this.sanPham = sanPham;
        this.soLuongNhap = soLuongNhap;
        this.ngayNhap = ngayNhap;
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

    
	
	
	
}
