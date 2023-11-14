package entity;

import java.sql.Date;
import java.util.Objects;

public class HoaDonEntity {
	private String maHD;
	private Date ngayLapHD;
	private KhachHangEntity khachHang;
	private NhanVienEntity nhanVien;
	private ChuongTrinhKhuyenMaiEntity chuongTrinhKM;
	private double tienKhuyenMai;
        private double tongTien;
<<<<<<< HEAD
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
=======
        private double tienThanhToan;
>>>>>>> 451ca90c62f4208417236484cdc553a0e9c159cc
        
	public HoaDonEntity(String maHD) {
		this.maHD = maHD;
	}

        public HoaDonEntity(String maHD, Date ngayLapHD, KhachHangEntity khachHang, NhanVienEntity nhanVien, ChuongTrinhKhuyenMaiEntity chuongTrinhKM, double tienKhuyenMai, double tongTien, double tienThanhToan) {
            this.maHD = maHD;
            this.ngayLapHD = ngayLapHD;
            this.khachHang = khachHang;
            this.nhanVien = nhanVien;
            this.chuongTrinhKM = chuongTrinhKM;
            this.tienKhuyenMai = tienKhuyenMai;
            this.tongTien = tongTien;
            this.tienThanhToan = tienThanhToan;
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
        
        public void setTongTien(double tongTien) {
            this.tongTien = tongTien;
        }
        
        public double getTongTien() {
            return tongTien;
        }

        public void setTienKhuyenMai() {
            this.tienKhuyenMai = tongTien * (chuongTrinhKM.getGiamGia()*0.01);
        }

        public void setTienThanhToan() {
            this.tienThanhToan = tongTien - tienKhuyenMai;
        }
        
        public double getTienKhuyenMai() {
            return tienKhuyenMai;
        }

        public double getTienThanhToan() {
            return tienThanhToan;
        }

        @Override
        public String toString() {
            return "HoaDonEntity{" + "maHD=" + maHD + ", ngayLapHD=" + ngayLapHD + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien + ", chuongTrinhKM=" + chuongTrinhKM + ", tienKhuyenMai=" + tienKhuyenMai + ", tienThanhToan=" + tienThanhToan + ", tongTien=" + tongTien + '}';
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
