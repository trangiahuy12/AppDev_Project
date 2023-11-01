package entity;

import java.time.LocalDate;
import java.util.Objects;

public class NhanVienEntity {
	private String maNV;
	private String hoTen;
	private GioiTinhEnum gioiTinh;
	private LocalDate ngaySinh;
	private String email;
	private String soDienThoai;
	private String diaChi;
	private ChucVuEnum chucVu;
	private TinhTrangNVEnum tinhTrang;
	private CaLamViecEnum caLamViec;
	public NhanVienEntity(String maNV, String hoTen, GioiTinhEnum gioiTinh, LocalDate ngaySinh, String email,
			String soDienThoai, String diaChi, ChucVuEnum chucVu, TinhTrangNVEnum tinhTrang, CaLamViecEnum caLamViec) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.chucVu = chucVu;
		this.tinhTrang = tinhTrang;
		this.caLamViec = caLamViec;
	}
	public NhanVienEntity(String maNV) {
		super();
		this.maNV = maNV;
	}
	public NhanVienEntity() {
		super();
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public GioiTinhEnum getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(GioiTinhEnum gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public ChucVuEnum getChucVu() {
		return chucVu;
	}
	public void setChucVu(ChucVuEnum chucVu) {
		this.chucVu = chucVu;
	}
	public TinhTrangNVEnum getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(TinhTrangNVEnum tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public CaLamViecEnum getCaLamViec() {
		return caLamViec;
	}
	public void setCaLamViec(CaLamViecEnum caLamViec) {
		this.caLamViec = caLamViec;
	}

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 79 * hash + Objects.hashCode(this.maNV);
            hash = 79 * hash + Objects.hashCode(this.soDienThoai);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final NhanVienEntity other = (NhanVienEntity) obj;
            if (!Objects.equals(this.maNV, other.maNV)) {
                return false;
            }
            return Objects.equals(this.soDienThoai, other.soDienThoai);
        }
	
        
	
	
}
