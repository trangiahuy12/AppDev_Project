package entity;

import java.time.LocalDate;
import java.util.Objects;

public class NhanVienEntity {
	private String maNV;
	private String hoTen;
	private GioiTinh gioiTinh;
	private LocalDate ngaySinh;
	private String email;
	private String soDienThoai;
	private String diaChi;
	private ChucVu chucVu;
	private TinhTrangNhanVien tinhTrang;
	private CaLamViec caLamViec;
	public NhanVienEntity(String maNV, String hoTen, GioiTinh gioiTinh, LocalDate ngaySinh, String email,
			String soDienThoai, String diaChi, ChucVu chucVu, TinhTrangNhanVien tinhTrang, CaLamViec caLamViec) {
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
	public GioiTinh getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(GioiTinh gioiTinh) {
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
	public ChucVu getChucVu() {
		return chucVu;
	}
	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}
	public TinhTrangNhanVien getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(TinhTrangNhanVien tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public CaLamViec getCaLamViec() {
		return caLamViec;
	}
	public void setCaLamViec(CaLamViec caLamViec) {
		this.caLamViec = caLamViec;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maNV);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVienEntity other = (NhanVienEntity) obj;
		return Objects.equals(maNV, other.maNV);
	}
	
	
}
