/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Interface.TaiKhoanInterface;
import connectDB.ConnectDB;
import entity.TaiKhoanEntity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author HUY
 */
public class TaiKhoan_dao implements TaiKhoanInterface{
     ConnectDB connect = new ConnectDB();

    public entity.TaiKhoanEntity getTaiKhoan(String taiKhoan, String matKhau) throws SQLException {

        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        try {

            String sql = "SELECT * FROM taikhoan WHERE tenTaiKhoan = ? AND matKhau = ?";
            statement = con.prepareStatement(sql);
            statement.setString(1, taiKhoan);
            statement.setString(2, matKhau);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String tk = rs.getString("tenTaiKhoan");
                String mk = rs.getString("matKhau");

                entity.TaiKhoanEntity taikhoan = new TaiKhoanEntity(tk, mk);
                return taikhoan;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }
        }
        return null;
      
    }
    
    
     public boolean lamMoiMatKhau(TaiKhoanEntity tk) {

        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        int n = 0;
        try {

            statement = con.prepareStatement("update TaiKhoan set matKhau = ? where tenTaiKhoan= ?");
            statement.setString(1, tk.getMatKhau());
            statement.setString(2, tk.getTenTaiKhoan());
            n = statement.executeUpdate();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
           
        

        } finally {
            try {
                statement.close();
            } catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }
        }

        return n > 0;
    }

    @Override
    public boolean insert(TaiKhoanEntity tk) {
        int n = 0;

        try {
            ConnectDB.getInstance().connect();
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoan_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement("INSERT INTO TaiKhoan "
                    + " values(?,?)");
            statement.setString(1, tk.getTenTaiKhoan());
            statement.setString(2, tk.getMatKhau());

            n = statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    @Override
    public boolean update(TaiKhoanEntity tk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(TaiKhoanEntity tk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean findOne(String tenTK) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<TaiKhoanEntity> findAll() {
        ArrayList<TaiKhoanEntity> listTK = new ArrayList<>();
        try {
            connect.connect();
            PreparedStatement statement = connect.getConnection().prepareStatement("SELECT * FROM TaiKhoan");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                TaiKhoanEntity taiKhoan = null;
                taiKhoan = new TaiKhoanEntity(rs.getString("tenTaiKhoan"), rs.getString("matKhau"));
                if (!listTK.contains(taiKhoan)) listTK.add(taiKhoan);
            }
            connect.disconnect();
        }
        catch (SQLException ex) {
            Logger.getLogger(KhachHang_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listTK;
    }
    
}
