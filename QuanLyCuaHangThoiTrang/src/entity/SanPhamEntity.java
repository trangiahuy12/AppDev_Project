package entity;

import java.util.Objects;

public class SanPhamEntity {
	private String maSP;
	private String tenSP, imgUrl;
	private KichThuoc kichThuoc;
	private MauSac mauSac;
	private double donGia;
	private int soLuongTonKho;
	private TinhTrangSanPham tinhTrang;
	private ChatLieuEntity chatLieu;
	private ThuongHieuEntity thuongHieu;
	private DanhMucSanPhamEntity danhMucSanPham;
	public SanPhamEntity(String maSP, String tenSP, String imgUrl, KichThuoc kichThuoc, MauSac mauSac, double donGia,
			int soLuongTonKho, TinhTrangSanPham tinhTrang, ChatLieuEntity chatLieu, ThuongHieuEntity thuongHieu,
			DanhMucSanPhamEntity danhMucSanPham) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.imgUrl = imgUrl;
		this.kichThuoc = kichThuoc;
		this.mauSac = mauSac;
		this.donGia = donGia;
		this.soLuongTonKho = soLuongTonKho;
		this.tinhTrang = tinhTrang;
		this.chatLieu = chatLieu;
		this.thuongHieu = thuongHieu;
		this.danhMucSanPham = danhMucSanPham;
	}
	public SanPhamEntity(String maSP) {
		super();
		this.maSP = maSP;
	}
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public KichThuoc getKichThuoc() {
		return kichThuoc;
	}
	public void setKichThuoc(KichThuoc kichThuoc) {
		this.kichThuoc = kichThuoc;
	}
	public MauSac getMauSac() {
		return mauSac;
	}
	public void setMauSac(MauSac mauSac) {
		this.mauSac = mauSac;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuongTonKho() {
		return soLuongTonKho;
	}
	public void setSoLuongTonKho(int soLuongTonKho) {
		this.soLuongTonKho = soLuongTonKho;
	}
	public TinhTrangSanPham getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(TinhTrangSanPham tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public ChatLieuEntity getChatLieu() {
		return chatLieu;
	}
	public void setChatLieu(ChatLieuEntity chatLieu) {
		this.chatLieu = chatLieu;
	}
	public ThuongHieuEntity getThuongHieu() {
		return thuongHieu;
	}
	public void setThuongHieu(ThuongHieuEntity thuongHieu) {
		this.thuongHieu = thuongHieu;
	}
	public DanhMucSanPhamEntity getDanhMucSanPham() {
		return danhMucSanPham;
	}
	public void setDanhMucSanPham(DanhMucSanPhamEntity danhMucSanPham) {
		this.danhMucSanPham = danhMucSanPham;
	}
	public SanPhamEntity() {
		super();
	}
	@Override
	public String toString() {
		return "SanPhamEntity [maSP=" + maSP + ", tenSP=" + tenSP + ", imgUrl=" + imgUrl + ", kichThuoc=" + kichThuoc
				+ ", mauSac=" + mauSac + ", donGia=" + donGia + ", soLuongTonKho=" + soLuongTonKho + ", tinhTrang="
				+ tinhTrang + ", chatLieu=" + chatLieu + ", thuongHieu=" + thuongHieu + ", danhMucSanPham="
				+ danhMucSanPham + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(maSP);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SanPhamEntity other = (SanPhamEntity) obj;
		return Objects.equals(maSP, other.maSP);
	}
	
	
}
