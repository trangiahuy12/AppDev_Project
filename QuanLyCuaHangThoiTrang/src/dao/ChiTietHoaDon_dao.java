
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
    public ArrayList<String> getMaSPTheoMaCTHD(String maHD) {
        ArrayList<String> dsMa = new ArrayList<String>();
        
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            String sql = "Select maSP from ChiTietHoaDon where maHD = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, maHD);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                String ma = rs.getString("maSP");
                dsMa.add(ma);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsMa;
                
    }
    
}
