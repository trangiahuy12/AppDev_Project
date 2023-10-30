/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.sun.jdi.connect.spi.Connection;
import connectDB.ConnectDB;
import entity.GioiTinh;
import entity.KhachHangEntity;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HUY
 */
public class KhachHangDAO implements KhachHangInterface{
    ConnectDB connect = new ConnectDB();
    
    @Override
    public KhachHangEntity findOne(String id) {
        KhachHangEntity khachHang = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
//            statement = ConnectDB.getConnection().prepareStatement("SELECT * FROM KhachHang WHERE maKH = ?");
            statement.setString(1, id);
            rs = statement.executeQuery();
            while (rs.next()) {
                GioiTinh gt = null;
                if (rs.getString("gioiTinh").equals("Nam")) {
                    gt = GioiTinh.NAM;
                }
                else if (rs.getString("gioiTinh").equals("Nu")) {
                    gt = GioiTinh.NU;
                }
                else gt = GioiTinh.KHAC;
                khachHang = new KhachHangEntity(
                       rs.getString("maKH"), 
                       rs.getString("hoTen"), 
                       gt, 
                       rs.getString("soDienThoai"), 
                       rs.getString("diaChi"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return khachHang;
    }

    @Override
    public void update(KhachHangEntity updateKH) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String insert(KhachHangEntity insertKH) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<KhachHangEntity> findAll() {
        ArrayList<KhachHangEntity> listKH = new ArrayList<>();
        try {
            connect.connect();
            PreparedStatement statement = connect.getConnection().prepareStatement("SELECT * FROM KhachHang");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                KhachHangEntity khachHang = null;
                GioiTinh gt = null;
                if (rs.getString("gioiTinh").equals("Nam")) {
                    gt = GioiTinh.NAM;
                }
                else if (rs.getString("gioiTinh").equals("Nu")) {
                    gt = GioiTinh.NU;
                }
                else gt = GioiTinh.KHAC;
                khachHang = new KhachHangEntity(
                rs.getString("maKH"), 
                rs.getString("hoTen"), 
                gt, 
                rs.getString("soDienThoai"), 
                rs.getString("diaChi"));
                if (!listKH.contains(khachHang)) listKH.add(khachHang);
            }
            connect.disconnect();
        }
        catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKH;
    }
    
}
