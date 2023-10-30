
package dao;

import entity.HoaDonEntity;
import java.util.ArrayList;
import connectDB.ConnectDB;
import entity.ChuongTrinhKhuyenMaiEntity;
import entity.KhachHangEntity;
import entity.NhanVienEntity;
import java.sql.*;
import java.time.LocalDate;

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
            ConnectDB.getInstance();
            Connection con =ConnectDB.getConnection();
            String sql = "Select * from HoaDon";
             Statement statement = con.createStatement();
             ResultSet rs = statement.executeQuery(sql);
             while(rs.next()){
                 String ma = rs.getString("maHD");
                 Date ngayLap = rs.getDate("ngaylapHD");
                 KhachHangEntity kh = new KhachHangEntity(rs.getString("maKH"));
                 NhanVienEntity nv = new NhanVienEntity(rs.getString("maNV"));
                 ChuongTrinhKhuyenMaiEntity ctkm = new ChuongTrinhKhuyenMaiEntity(rs.getNString("maCTKM"));
                 int thue = rs.getInt("thueVAT");
                 
                 HoaDonEntity hd = new HoaDonEntity(ma, ngayLap, kh, nv, ctkm, thue);
                 dshd.add(hd);
             }

//            ResultSet rs = statement.executeQuery(sql);
            
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
            ConnectDB.getInstance();
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

    
}
