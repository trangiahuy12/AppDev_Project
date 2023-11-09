
package dao;

import Interface.ChiTietHoaDon_Interface;
import connectDB.ConnectDB;
import entity.ChatLieuEntity;
import entity.ChiTietHoaDonEntity;
import entity.DanhMucSanPhamEntity;
import entity.HoaDonEntity;
import entity.KichThuocEnum;
import entity.MauSacEnum;
import entity.SanPhamEntity;
import entity.ThuongHieuEntity;
import entity.TinhTrangSPEnum;
import java.util.ArrayList;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class ChiTietHoaDon_dao implements ChiTietHoaDon_Interface{
    public ChiTietHoaDon_dao (){
        
    }

    @Override
    public ArrayList<ChiTietHoaDonEntity> getallCTHD() {
    ArrayList<ChiTietHoaDonEntity> dscthd = new ArrayList<ChiTietHoaDonEntity>();
    Connection con = null; // Khởi tạo biến kết nối
    try {
        ConnectDB.getInstance();
        con = ConnectDB.getConnection(); // Gán kết nối từ ConnectDB
        String sql = "Select * from ChiTietHoaDon";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            String ma = rs.getString("maCTHD");
            SanPhamEntity maSP = new SanPhamEntity(rs.getString("maSP"));
            HoaDonEntity maHD = new HoaDonEntity(rs.getString("maHD"));
            int sl = rs.getInt("soLuong");
            ChiTietHoaDonEntity cthd = new ChiTietHoaDonEntity(ma, maSP, maHD, sl);
            dscthd.add(cthd);
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    return dscthd;
       
    }

    @Override   
    public ArrayList<SanPhamEntity> getSanPhamTheoMaSP(String maSP) {
    ArrayList<SanPhamEntity> dsSP = new ArrayList<SanPhamEntity>();
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        con = ConnectDB.getConnection();
        String sql = "select * from SanPham where maSP = ?";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, maSP);
        rs = stmt.executeQuery();
        
        while (rs.next()) {
            // Xử lý dữ liệu ở đây
            String ma = rs.getString("maSP");
            String ten = rs.getString("tenSP");
            KichThuocEnum kichthuoc = KichThuocEnum.valueOf(rs.getString("kichThuoc"));
            MauSacEnum mausac = MauSacEnum.valueOf(rs.getString("mauSac"));
            double dongia = rs.getDouble("donGia");
            int sl = rs.getInt("soLuong");
            TinhTrangSPEnum tinhtrang = TinhTrangSPEnum.valueOf(rs.getString("tinhTrang"));
            ChatLieuEntity chatlieu = new ChatLieuEntity(rs.getString("maChatLieu"));
            ThuongHieuEntity thuonghieu = new ThuongHieuEntity(rs.getString("maThuongHieu"));
            DanhMucSanPhamEntity danhmuc = new DanhMucSanPhamEntity(rs.getString("maDanhMuc"));
            SanPhamEntity sp=new SanPhamEntity(maSP, ten, kichthuoc, mausac, dongia, sl, tinhtrang, chatlieu, thuonghieu, danhmuc, null);
            dsSP.add(sp);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    return dsSP;
}


    @Override
   public ArrayList<SanPhamEntity> getSanPhamTheoMaHD(String maHD) {
        try {
            ConnectDB.getInstance().connect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ArrayList<SanPhamEntity> dsSP = new ArrayList<SanPhamEntity>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

    try {
        ConnectDB.getInstance();
        con = ConnectDB.getConnection();
        String sql = "select * from SanPham where maSP = (select maSP from ChiTietHoaDon where maHD = ?)";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, maHD);
        rs = stmt.executeQuery();

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
            dsSP.add(sp);
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    return dsSP;
}
   
    // Nguyen Huy Hoang
    @Override
    public boolean themChiTietHoaDon(ChiTietHoaDonEntity cthd) {
        PreparedStatement statement = null;
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            
            String sql = "Insert into ChiTietHoaDon(maCTHD, maSP, maHD, soLuong, giaBan, thanhTien) values (?, ?, ?, ?, ?, ?)";
            statement = con.prepareStatement(sql);
            statement.setString(1, cthd.getMaCTHD());
            statement.setString(2, cthd.getSanPham().getMaSP());
            statement.setString(3, cthd.getHoaDon().getMaHD());
            statement.setInt(4, cthd.getSoLuong());
            statement.setDouble(5, cthd.getGiaBan());
            statement.setDouble(6, cthd.getThanhTien());
            
            int ketQua = statement.executeUpdate();
            System.out.println(ketQua);
            if(ketQua < 1) {
                return false;
            }
            
            return true;
        } catch(SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                statement.close();
                ConnectDB.getInstance().disconnect();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    
}
