package entity;

import java.util.Objects;

public class ChiTietHoaDonEntity {
	
	private SanPhamEntity sanPham;
	private HoaDonEntity hoaDon;
	private int soLuong;
        private double giaBan;
        private double thanhTien;
        
        public ChiTietHoaDonEntity( SanPhamEntity sanPham, HoaDonEntity hoaDon, int soLuong) {
		super();
		
		this.sanPham = sanPham;
		this.hoaDon = hoaDon;
		this.soLuong = soLuong;
	}
        
	public ChiTietHoaDonEntity( SanPhamEntity sanPham, HoaDonEntity hoaDon, int soLuong, double giaBan, double thanhTien) {
		super();
		
		this.sanPham = sanPham;
		this.hoaDon = hoaDon;
		this.soLuong = soLuong;
                this.giaBan = giaBan;
                this.thanhTien = thanhTien;
	}

	public ChiTietHoaDonEntity() {
		super();
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

        public double getGiaBan() {
            return giaBan;
        }

        public void setGiaBan(double giaBan) {
            this.giaBan = giaBan;
        }

        public double getThanhTien() {
            return thanhTien;
        }

        public void setThanhTien(double thanhTien) {
            this.thanhTien = thanhTien;
        }
    
	@Override
	public String toString() {
		return "ChiTietHoaDonEntity [maCTHD=" + ", hoaDon=" + hoaDon + ", soLuong=" + soLuong + "]";
	}

}
