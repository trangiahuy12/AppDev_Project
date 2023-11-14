package entity;

import java.sql.Date;
import java.util.Objects;

public class HoaDonEntity {
	private String maHD;
	private Date ngayLapHD;
	private KhachHangEntity khachHang;
	private NhanVienEntity nhanVien;
	private ChuongTrinhKhuyenMaiEntity chuongTrinhKM;
	private int thueVAT;
        private double tongTien;
        private double tienKM;
        private double tienTT;

    public double getTienKM() {
        return tienKM;
    }

    public void setTienKM(double tienKM) {
        this.tienKM = tienKM;
    }

    public double getTienTT() {
        return tienTT;
    }

    public void setTienTT(double tienTT) {
        this.tienTT = tienTT;
    }

    public HoaDonEntity(String maHD, Date ngayLapHD, KhachHangEntity khachHang, NhanVienEntity nhanVien, ChuongTrinhKhuyenMaiEntity chuongTrinhKM, int thueVAT, double tongTien, double tienKM, double tienTT) {
        this.maHD = maHD;
        this.ngayLapHD = ngayLapHD;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.chuongTrinhKM = chuongTrinhKM;
        this.thueVAT = thueVAT;
        this.tongTien = tongTien;
        this.tienKM = tienKM;
        this.tienTT = tienTT;
    }
    
        
	public HoaDonEntity(String maHD, Date ngayLapHD, KhachHangEntity khachHang, NhanVienEntity nhanVien,
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
	public Date getNgayLapHD() {
		return ngayLapHD;
	}
	public void setNgayLapHD(Date ngayLapHD) {
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
        
        public void setTongTien(double tongTien) {
            this.tongTien = tongTien;
        }
        
        public double getTongTien() {
            return tongTien;
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
	
}
