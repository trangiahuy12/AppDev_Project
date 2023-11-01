package entity;

import java.util.Objects;

public class SanPhamEntity {

    private String maSP;
    private String tenSP;
    private KichThuocEnum kichThuoc;
    private MauSacEnum mauSac;
    private double donGia;
    private int soLuongTonKho;
    private TinhTrangSPEnum tinhTrang;
    private ChatLieuEntity chatLieu;
    private ThuongHieuEntity thuongHieu;
    private DanhMucSanPhamEntity danhMucSanPham;
    private byte[] imgUrl;

    public SanPhamEntity() {
        super();
    }

    public SanPhamEntity(String maSP, String tenSP, KichThuocEnum kichThuoc, MauSacEnum mauSac, double donGia, int soLuongTonKho, TinhTrangSPEnum tinhTrang, ChatLieuEntity chatLieu, ThuongHieuEntity thuongHieu, DanhMucSanPhamEntity danhMucSanPham, byte[] imgUrl) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.kichThuoc = kichThuoc;
        this.mauSac = mauSac;
        this.donGia = donGia;
        this.soLuongTonKho = soLuongTonKho;
        this.tinhTrang = tinhTrang;
        this.chatLieu = chatLieu;
        this.thuongHieu = thuongHieu;
        this.danhMucSanPham = danhMucSanPham;
        this.imgUrl = imgUrl;
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

    public KichThuocEnum getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(KichThuocEnum kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public MauSacEnum getMauSac() {
        return mauSac;
    }

    public void setMauSac(MauSacEnum mauSac) {
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

    public TinhTrangSPEnum getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(TinhTrangSPEnum tinhTrang) {
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

    public byte[] getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(byte[] imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "SanPhamEntity{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", kichThuoc=" + kichThuoc + ", mauSac=" + mauSac + ", donGia=" + donGia + ", soLuongTonKho=" + soLuongTonKho + ", tinhTrang=" + tinhTrang + ", chatLieu=" + chatLieu + ", thuongHieu=" + thuongHieu + ", danhMucSanPham=" + danhMucSanPham + ", imgUrl=" + imgUrl + '}';
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(maSP);
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
        SanPhamEntity other = (SanPhamEntity) obj;
        return Objects.equals(maSP, other.maSP);
    }

}
