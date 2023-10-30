/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Interface.ChuongTrinhKhuyenMai_Interface;
import connectDB.ConnectDB;
import entity.ChuongTrinhKhuyenMaiEntity;
import entity.HoaDonEntity;
import entity.KhachHangEntity;
import entity.NhanVienEntity;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ChuongTrinhKhuyenMai_dao implements ChuongTrinhKhuyenMai_Interface{
    public ChuongTrinhKhuyenMai_dao(){      
    }

   
    public ArrayList<ChuongTrinhKhuyenMaiEntity> getallCTKM() {
         ArrayList<ChuongTrinhKhuyenMaiEntity> dsctkm = new ArrayList<ChuongTrinhKhuyenMaiEntity>();
        try {
            ConnectDB.getInstance();
            Connection con =ConnectDB.getConnection();
            String sql = "Select * from ChuongTrinhKhuyenMai";
             Statement statement = con.createStatement();
             ResultSet rs = statement.executeQuery(sql);
             while(rs.next()){
                 String ma = rs.getString("maCTKM");
                 String ten = rs.getString("tenCTKM");
                 double sotienTT = rs.getDouble("soTienToiThieu");
                 int giamgia= rs.getInt("giamGia");
                 Date ngaybatdau = rs.getDate("ngayBatDau");
                 Date ngayketthuc = rs.getDate("ngayKetThuc");
               
         
                 ChuongTrinhKhuyenMaiEntity ctkm = new ChuongTrinhKhuyenMaiEntity(ma, ten, sotienTT, giamgia, ngaybatdau, ngayketthuc);
                 dsctkm.add(ctkm);
             }

//            ResultSet rs = statement.executeQuery(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsctkm;
    }
    
}
