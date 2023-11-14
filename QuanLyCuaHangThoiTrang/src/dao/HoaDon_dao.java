
package dao;

import entity.HoaDonEntity;
import java.util.ArrayList;
import connectDB.ConnectDB;
import entity.ChiTietHoaDonEntity;
import entity.ChuongTrinhKhuyenMaiEntity;
import entity.KhachHangEntity;
import entity.NhanVienEntity;
import java.sql.Date;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class HoaDon_dao implements  Interface.HoaDon_Interface{
    public HoaDon_dao(){
    
}
    
    @Override
    public ArrayList<HoaDonEntity> getallHoaDon() {
        ArrayList<HoaDonEntity> dshd = new ArrayList<HoaDonEntity>();
        try {
            ConnectDB.getInstance().connect();
            Connection con =ConnectDB.getConnection();
            String sql = "Select * from HoaDon";
             Statement statement = con.createStatement();
             ResultSet rs = statement.executeQuery(sql);
             while(rs.next()){
                 String ma = rs.getString("maHD");
                 Date ngayLap = rs.getDate("ngaylapHD");
                 KhachHangEntity kh = new KhachHangEntity(rs.getString("maKH"));
                 NhanVienEntity nv = new NhanVienEntity(rs.getString("maNV"));
                 ChuongTrinhKhuyenMaiEntity ctkm = new ChuongTrinhKhuyenMaiEntity(rs.getString("maCTKM"));
                 double tienKhuyenMai = rs.getDouble("tienKhuyenMai");
                 double tongTien = rs.getDouble("tongTien");
                 double tienThanhToan = rs.getDouble("tienThanhToan");
                 
                 HoaDonEntity hd = new HoaDonEntity(ma, ngayLap, kh, nv, ctkm, tienKhuyenMai, tongTien, tienThanhToan);
                 dshd.add(hd);
             }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dshd;
       
    }

    @Override
    public double getTotalMoney(String maHD) {
        double total = 0;
        String sql = "select tongTien from HoaDon where maHD = ? ";
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            PreparedStatement sta = null;
            sta =  con.prepareStatement(sql);
            sta.setString(1, maHD);
            ResultSet rs = sta.executeQuery();
            while (rs.next()){
                total = rs.getInt("tongTien");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }
    
    // Nguyen Huy Hoang
    @Override
    public boolean themHoaDon(HoaDonEntity hoaDon, ArrayList<ChiTietHoaDonEntity> danhSachCTHD) {
        PreparedStatement statement = null;
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            
            String sql = "Insert into HoaDon(maHD, maKH, maNV, maCTKM, ngayLapHD, tienKhuyenMai, tongTien, tienThanhToan) values (?, ?, ?, ?, ?, ?, ?, ?)";
            statement = con.prepareStatement(sql);
            
            statement.setString(1, hoaDon.getMaHD());
            statement.setString(2, hoaDon.getKhachHang().getMaKH());
            statement.setString(3, hoaDon.getNhanVien().getMaNV());
            statement.setString(4, hoaDon.getChuongTrinhKM().getMaCTKM());
            statement.setDate(5, hoaDon.getNgayLapHD());
            statement.setDouble(6, hoaDon.getTienKhuyenMai());
            statement.setDouble(7, hoaDon.getTongTien());
            statement.setDouble(8, hoaDon.getTienThanhToan());
            
            int ketQua = statement.executeUpdate();
            if(ketQua < 1) {
                return false;
            }
            
            ChiTietHoaDon_dao cthd_dao = new ChiTietHoaDon_dao();
            for (ChiTietHoaDonEntity cthd : danhSachCTHD) {
                if(!cthd_dao.themChiTietHoaDon(cthd)) {
                    return false;
                }
            }
            return true;
        } catch (SQLException e) {
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
