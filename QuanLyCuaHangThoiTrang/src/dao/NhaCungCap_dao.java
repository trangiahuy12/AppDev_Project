/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Interface.NhaCungCap_Interface;
import connectDB.ConnectDB;
import entity.NhaCungCapEntity;
import entity.TinhTrangNCCEnum;
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
public class NhaCungCap_dao implements NhaCungCap_Interface {

    @Override
    public ArrayList<NhaCungCapEntity> getAllNhaCungCap() {
        ArrayList<NhaCungCapEntity> dsNCC = new ArrayList<NhaCungCapEntity>();
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            PreparedStatement ps = null;
            String sql = "select * from NhaCungCap";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maNCC = rs.getString("maNCC");
                String tenNCC = rs.getString("tenNCC");
                String soDienThoai = rs.getString("soDienThoai");
                String diaChi = rs.getString("diaChi");
                String tinhTrang = rs.getString("tinhTrang");
                TinhTrangNCCEnum tinhTrangEnum = null;
                if (tinhTrang.equals("Đang nhập")) {
                    tinhTrangEnum = TinhTrangNCCEnum.DANGNHAP;
                } else if (tinhTrang.equals("Ngừng nhập")) {
                    tinhTrangEnum = TinhTrangNCCEnum.NGUNGNHAP;
                }
                NhaCungCapEntity ncc = new NhaCungCapEntity(maNCC, tenNCC, diaChi, soDienThoai, tinhTrangEnum);
                dsNCC.add(ncc);
            }
            ps.close();
            rs.close();
            ConnectDB.getInstance().disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCap_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsNCC;
    }

    @Override
    public boolean themNCC(NhaCungCapEntity ncc) {
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            PreparedStatement ps = null;
            String sql = "Insert into NhaCungCap(maNCC,tenNCC,soDienThoai,diaChi,tinhTrang) values(?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, ncc.getMaNCC());
            ps.setString(2, ncc.getTenNCC());
            ps.setString(3, ncc.getSoDienThoai());
            ps.setString(4, ncc.getDiaChi());
            ps.setString(5, ncc.getTinhTrang().toString());
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
    public ArrayList<NhaCungCapEntity> timKiemNCC(String ma) {
        ArrayList<NhaCungCapEntity> dsNCC = new ArrayList<NhaCungCapEntity>();
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            PreparedStatement ps = null;
            String sql = "select * from NhaCungCap where maNCC=?";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, ma);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String maNCC = rs.getString(1);
                    String tenNCC = rs.getString(2);
                    String soDienThoai = rs.getString(3);
                    String diaChi = rs.getString(4);
                    String tinhTrang = rs.getString(5);
                    TinhTrangNCCEnum tinhTrangEnum = null;
                    if (rs.getString("tinhTrang").equals("Đang nhập")) {
                        tinhTrangEnum = TinhTrangNCCEnum.DANGNHAP;
                    } else if (rs.getString("tinhTrang").equals("Ngừng nhập")) {
                        tinhTrangEnum = TinhTrangNCCEnum.NGUNGNHAP;
                    }
                    NhaCungCapEntity ncc = new NhaCungCapEntity(maNCC, tenNCC, diaChi, soDienThoai, tinhTrangEnum);
                    dsNCC.add(ncc);
                }
                ps.close();
                rs.close();
                ConnectDB.getInstance().disconnect();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCap_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsNCC;
    }

    @Override
    public boolean capNhatNhaCungCap(NhaCungCapEntity ncc) {
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            PreparedStatement ps = null;
            String sql = "update NhaCungCap set tenNCC=?, soDienThoai=?, diaChi=?, tinhTrang=? where maNCC=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, ncc.getTenNCC());
            ps.setString(2, ncc.getSoDienThoai());
            ps.setString(3, ncc.getDiaChi());
            ps.setString(4, ncc.getTinhTrang().toString());
            ps.setString(5, ncc.getMaNCC());
            ps.executeUpdate();
            ps.close();
            ConnectDB.getInstance().disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCap_dao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public ArrayList<NhaCungCapEntity> layDSNCCDangNhap() {
        ArrayList<NhaCungCapEntity> dsNCC = new ArrayList<NhaCungCapEntity>();
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            PreparedStatement ps = null;
            String sql = "SELECT * FROM NhaCungCap WHERE tinhTrang =N'Đang nhập'";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maNCC = rs.getString("maNCC");
                String tenNCC = rs.getString("tenNCC");
                String soDienThoai = rs.getString("soDienThoai");
                String diaChi = rs.getString("diaChi");
                NhaCungCapEntity ncc=new NhaCungCapEntity(maNCC, tenNCC, diaChi, soDienThoai, TinhTrangNCCEnum.DANGNHAP);
                dsNCC.add(ncc);
            }
            ps.close();
            rs.close();
            ConnectDB.getInstance().disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCap_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsNCC;
    }
}
