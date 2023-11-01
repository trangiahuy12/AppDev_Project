/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class NhanVien_dao {
    public Boolean checkNV(String email, String sdt) throws SQLException {

        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        try {

            String sql = "SELECT * FROM NhanVien WHERE email = ? AND soDienThoai = ?";
            statement = con.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, sdt);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
               return true;
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
        return false;
      
    }
}
