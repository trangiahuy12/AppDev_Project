/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Interface.SanPham_Interface;
import connectDB.ConnectDB;
import entity.ChatLieuEntity;
import entity.DanhMucSanPhamEntity;
import entity.KichThuocEnum;
import entity.MauSacEnum;
import entity.SanPhamEntity;
import entity.ThuongHieuEntity;
import entity.TinhTrangSPEnum;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Hien Vinh
 */
public class SanPham_dao implements SanPham_Interface {

    @Override
    public ArrayList<SanPhamEntity> getAllSanPham() {
        ArrayList<SanPhamEntity> dsSanPham = new ArrayList<SanPhamEntity>();
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            PreparedStatement ps = null;
            String sql = "select * from SanPham";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maSP = rs.getString("maSP");
                String tenSP = rs.getString("tenSP");
                String kichThuoc = rs.getString("kichThuoc");
                String mauSac = rs.getString("mauSac");
                int donGia = rs.getInt("donGia");
                String tinhTrang = rs.getString("tinhTrang");
                String chatLieu = rs.getString("maChatLieu");
                String thuongHieu = rs.getString("maThuongHieu");
                String danhMuc = rs.getString("maDanhMuc");
                String imgUrl = rs.getString("imgUrl");
                KichThuocEnum kichThuocEnum = null;
                if (kichThuoc.equals("XS")) {
                    kichThuocEnum = KichThuocEnum.XS;
                } else if (kichThuoc.equals("S")) {
                    kichThuocEnum = KichThuocEnum.S;
                } else if (kichThuoc.equals("M")) {
                    kichThuocEnum = KichThuocEnum.M;
                } else if (kichThuoc.equals("L")) {
                    kichThuocEnum = KichThuocEnum.L;
                } else if (kichThuoc.equals("XL")) {
                    kichThuocEnum = KichThuocEnum.XL;
                } else if (kichThuoc.equals("XXL")) {
                    kichThuocEnum = KichThuocEnum.XXL;
                }
                MauSacEnum mauSacEnum = null;
                if (mauSac.equals("Trắng")) {
                    mauSacEnum = MauSacEnum.TRANG;
                } else if (mauSac.equals("Đen")) {
                    mauSacEnum = MauSacEnum.DEN;
                } else if (mauSac.equals("Xám")) {
                    mauSacEnum = MauSacEnum.XAM;
                }
                TinhTrangSPEnum tinhTrangSPEnum = null;
                if (tinhTrang.equals("Đang bán")) {
                    tinhTrangSPEnum = TinhTrangSPEnum.DANGBAN;
                } else if (tinhTrang.equals("Ngừng bán")) {
                    tinhTrangSPEnum = TinhTrangSPEnum.NGUNGBAN;
                }
                ChatLieuEntity maChatLieu = new ChatLieuEntity(chatLieu);
                ThuongHieuEntity maThuongHieu = new ThuongHieuEntity(thuongHieu);
                DanhMucSanPhamEntity maDanhMuc = new DanhMucSanPhamEntity(danhMuc);
                SanPhamEntity sp = new SanPhamEntity(maSP, tenSP, kichThuocEnum, mauSacEnum, donGia, donGia, tinhTrangSPEnum, maChatLieu, maThuongHieu, maDanhMuc, imgUrl);
                dsSanPham.add(sp);
            }
            ps.close();
            rs.close();
            ConnectDB.getInstance().disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(SanPham_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsSanPham;
    }

    @Override
    public boolean themSP(SanPhamEntity sp) {
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            PreparedStatement ps = null;
            String sql = "Insert into SanPham(maSP,tenSP,kichThuoc,mauSac,donGia,tinhTrang,soLuongTonKho,maChatLieu,maThuongHieu,maDanhMuc,imgUrl) values(?,?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, sp.getMaSP());
            ps.setString(2, sp.getTenSP());
            ps.setString(3, sp.getKichThuoc().toString());
            ps.setString(4, sp.getMauSac().toString());
            ps.setDouble(5, sp.getDonGia());
            ps.setString(6, sp.getTinhTrang().toString());
            ps.setInt(7, sp.getSoLuongTonKho());
            ps.setString(8, sp.getChatLieu().getMaChatLieu());
            ps.setString(9, sp.getThuongHieu().getMaThuongHieu());
            ps.setString(10, sp.getDanhMucSanPham().getMaDanhMuc());
            ps.setString(11, sp.getImgUrl());
            int check = ps.executeUpdate();
            ps.close();
            ConnectDB.getInstance().disconnect();
            return check > 0;
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCap_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public ArrayList<SanPhamEntity> timSanPham(String ma) {
        ArrayList<SanPhamEntity> dsSanPham = new ArrayList<SanPhamEntity>();
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            PreparedStatement ps = null;
            String sql = "Select * from SanPham where maSP=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maSP = rs.getString("maSP");
                String tenSP = rs.getString("tenSP");
                KichThuocEnum kichThuoc = null;
                if (rs.getString("kichThuoc").equals("XS")) {
                    kichThuoc = KichThuocEnum.XS;
                } else if (rs.getString("kichThuoc").equals("S")) {
                    kichThuoc = KichThuocEnum.S;
                } else if (rs.getString("kichThuoc").equals("M")) {
                    kichThuoc = KichThuocEnum.M;
                } else if (rs.getString("kichThuoc").equals("L")) {
                    kichThuoc = KichThuocEnum.L;
                } else if (rs.getString("kichThuoc").equals("XL")) {
                    kichThuoc = KichThuocEnum.XL;
                } else if (rs.getString("kichThuoc").equals("XXL")) {
                    kichThuoc = KichThuocEnum.XXL;
                }
                MauSacEnum mauSac = null;
                if (rs.getString("mauSac").equals("Trắng")) {
                    mauSac = MauSacEnum.TRANG;
                } else if (rs.getString("mauSac").equals("Đen")) {
                    mauSac = MauSacEnum.DEN;
                } else if (rs.getString("mauSac").equals("Xám")) {
                    mauSac = MauSacEnum.XAM;
                }
                double donGia = rs.getDouble("donGia");
                TinhTrangSPEnum tinhTrang = null;
                if (rs.getString("tinhTrang").equals("Đang bán")) {
                    tinhTrang = TinhTrangSPEnum.DANGBAN;
                } else if (rs.getString("tinhTrang").equals("Ngừng bán")) {
                    tinhTrang = TinhTrangSPEnum.NGUNGBAN;
                }
                int soLuongTonKho=rs.getInt("soLuongTonKho");
                ChatLieuEntity chatLieu=new ChatLieuEntity(rs.getString("maChatLieu"));
                ThuongHieuEntity thuongHieu=new ThuongHieuEntity(rs.getString("maThuongHieu"));
                DanhMucSanPhamEntity danhMuc=new DanhMucSanPhamEntity(rs.getString("maDanhMuc"));
                String imgUrl=rs.getString("imgUrl");
                SanPhamEntity sp=new SanPhamEntity(maSP, tenSP, kichThuoc, mauSac, donGia, soLuongTonKho, tinhTrang, chatLieu, thuongHieu, danhMuc, imgUrl);
                dsSanPham.add(sp);
            }
            ps.close();
            rs.close();
            ConnectDB.getInstance().disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(SanPham_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsSanPham;
    }
}
