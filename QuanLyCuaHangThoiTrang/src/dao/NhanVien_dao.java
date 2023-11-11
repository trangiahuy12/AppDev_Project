package dao;

import Interface.NhanVienInterface;
import connectDB.ConnectDB;
import entity.CaLamViecEnum;
import entity.ChucVuEnum;
import entity.GioiTinhEnum;
import entity.NhanVienEntity;
import entity.TaiKhoanEntity;
import entity.TinhTrangNVEnum;
import entity.TinhTrangTKEnum;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HUY
 */
public class NhanVien_dao implements NhanVienInterface{
    ConnectDB connect = new ConnectDB();
    @Override
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
    @Override
    public NhanVienEntity getNV( String sdt) throws SQLException {
        NhanVienEntity nv = new NhanVienEntity();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        try {

            String sql = "SELECT * FROM NhanVien WHERE  soDienThoai = ?";
            statement = con.prepareStatement(sql);
            statement.setString(1, sdt);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
               
              GioiTinhEnum gt = null;
                gt = switch (rs.getString("gioiTinh")) {
                    case "Nam" -> GioiTinhEnum.NAM;
                    case "Nữ" -> GioiTinhEnum.NU;
                    default -> GioiTinhEnum.KHAC;
                };
                TinhTrangNVEnum tt = null;
                tt = switch (rs.getString("tinhTrang")) {
                    case "Đang làm việc" -> TinhTrangNVEnum.DANGLAMVIEC;
                    case "Nghỉ việc" -> TinhTrangNVEnum.NGHIVIEC;
                    default -> TinhTrangNVEnum.NGHIPHEP;
                };
                nv = new NhanVienEntity(rs.getString("maNV"), 
                        rs.getString("hoTen"), 
                        gt, LocalDate.parse(rs.getString("ngaySinh")), 
                        rs.getString("email"), 
                        rs.getString("soDienThoai"), 
                        rs.getString("diaChi"), 
                        rs.getString("chucVu").equals(ChucVuEnum.NHANVIEN.toString()) == true ? ChucVuEnum.NHANVIEN : ChucVuEnum.QUANLY, 
                        tt, 
                        rs.getString("caLamViec").equals(CaLamViecEnum.CA1.toString()) == true ? CaLamViecEnum.CA1 : CaLamViecEnum.CA2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nv;
    }
    @Override
    public NhanVienEntity findOne(String id) {
        NhanVienEntity nhanVien = null;
        ResultSet rs = null;
        try {
            connect.connect();
            PreparedStatement statement = connect.getConnection().prepareStatement("SELECT * FROM NhanVien WHERE soDienThoai = ?");
            statement.setString(1, id);
            rs = statement.executeQuery();
            while (rs.next()) {
                GioiTinhEnum gt = null;
                gt = switch (rs.getString("gioiTinh")) {
                    case "Nam" -> GioiTinhEnum.NAM;
                    case "Nữ" -> GioiTinhEnum.NU;
                    default -> GioiTinhEnum.KHAC;
                };
                TinhTrangNVEnum tt = null;
                tt = switch (rs.getString("tinhTrang")) {
                    case "Đang làm việc" -> TinhTrangNVEnum.DANGLAMVIEC;
                    case "Nghỉ việc" -> TinhTrangNVEnum.NGHIVIEC;
                    default -> TinhTrangNVEnum.NGHIPHEP;
                };
                nhanVien = new NhanVienEntity(rs.getString("maNV"), 
                        rs.getString("hoTen"), 
                        gt, LocalDate.parse(rs.getString("ngaySinh")), 
                        rs.getString("email"), 
                        rs.getString("soDienThoai"), 
                        rs.getString("diaChi"), 
                        rs.getString("chucVu").equals(ChucVuEnum.NHANVIEN.name()) == true ? ChucVuEnum.NHANVIEN : ChucVuEnum.QUANLY, 
                        tt, 
                        rs.getString("caLamViec").equals(CaLamViecEnum.CA1.name()) == true ? CaLamViecEnum.CA1 : CaLamViecEnum.CA2);
            }
            
            connect.disconnect();
            
        } catch (SQLException ex) {
            Logger.getLogger(KhachHang_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nhanVien;
    }

    @Override
    public boolean update(NhanVienEntity NewNV) {
        StringBuilder sql = new StringBuilder("UPDATE NhanVien SET hoTen = ?, gioiTinh = ?,");
        sql.append(" ngaySinh = ?, email = ?, soDienThoai = ?, diaChi = ?, chucVu = ?, tinhTrang = ?, caLamViec = ? WHERE maNV = ?");
        int n = 0;
        try {
            connect.connect();
            PreparedStatement statement = connect.getConnection().prepareStatement(sql.toString());
            statement.setString(1, NewNV.getHoTen());
            statement.setString(2, NewNV.getGioiTinh().toString());
            statement.setString(3, NewNV.getNgaySinh().toString());
            statement.setString(4, NewNV.getEmail());
            statement.setString(5, NewNV.getSoDienThoai());
            statement.setString(6, NewNV.getDiaChi());
            statement.setString(7, NewNV.getChucVu().toString());
            statement.setString(8, NewNV.getTinhTrang().toString());
            statement.setString(9, NewNV.getCaLamViec().toString());
            statement.setString(10, NewNV.getMaNV());
            n = statement.executeUpdate();
            connect.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHang_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n > 0;
    }

    @Override
    public boolean insert(NhanVienEntity NV ) {
        TaiKhoan_dao tkDao = new TaiKhoan_dao();
        int n = 0;
        if(tkDao.insert(new TaiKhoanEntity(NV.getSoDienThoai(), "1111", null, TinhTrangTKEnum.DANG_HOAT_DONG))) {
            StringBuilder sql = new StringBuilder("INSERT INTO NhanVien(maNV, hoTen, gioiTinh, ngaySinh, email, soDienThoai, diaChi, chucVu, tinhTrang, caLamViec)");
            sql.append(" VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        try {
            connect.connect();
            PreparedStatement statement = connect.getConnection().prepareStatement(sql.toString());
            statement.setString(1, NV.getMaNV());
            statement.setString(2, NV.getHoTen());
            statement.setString(3, NV.getGioiTinh().toString());
            statement.setString(4, NV.getNgaySinh().toString());
            statement.setString(5, NV.getEmail());
            statement.setString(6, NV.getSoDienThoai());
            statement.setString(7, NV.getDiaChi());
            statement.setString(8, NV.getChucVu().toString());
            statement.setString(9, NV.getTinhTrang().toString());
            statement.setString(10, NV.getCaLamViec().toString());
            n = statement.executeUpdate();
            
            connect.disconnect();
            } catch (SQLException ex) {
                Logger.getLogger(KhachHang_dao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return  n > 0;
    }

    @Override
    public ArrayList<NhanVienEntity> findAll() {
        ArrayList<NhanVienEntity> listKH = new ArrayList<>();
        try {
            connect.connect();
            PreparedStatement statement = ConnectDB.getConnection().prepareStatement("SELECT * FROM NhanVien");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                NhanVienEntity nhanVien = null;
                GioiTinhEnum gt = null;
                gt = switch (rs.getString("gioiTinh")) {
                    case "Nam" -> GioiTinhEnum.NAM;
                    case "Nữ" -> GioiTinhEnum.NU;
                    default -> GioiTinhEnum.KHAC;
                };
                TinhTrangNVEnum tt = null;
                tt = switch (rs.getString("tinhTrang")) {
                    case "Đang làm việc" -> TinhTrangNVEnum.DANGLAMVIEC;
                    case "Nghỉ việc" -> TinhTrangNVEnum.NGHIVIEC;
                    default -> TinhTrangNVEnum.NGHIPHEP;
                };
                nhanVien = new NhanVienEntity(rs.getString("maNV"), 
                        rs.getString("hoTen"), 
                        gt, LocalDate.parse(rs.getString("ngaySinh")), 
                        rs.getString("email"), 
                        rs.getString("soDienThoai"), 
                        rs.getString("diaChi"), 
                        rs.getString("chucVu").equals(ChucVuEnum.NHANVIEN.toString()) == true ? ChucVuEnum.NHANVIEN : ChucVuEnum.QUANLY, 
                        tt, 
                        rs.getString("caLamViec").equals(CaLamViecEnum.CA1.toString()) == true ? CaLamViecEnum.CA1 : CaLamViecEnum.CA2);
                if (!listKH.contains(nhanVien)) listKH.add(nhanVien);
            }
            connect.disconnect();
        }
        catch (SQLException ex) {
            Logger.getLogger(KhachHang_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKH;
    }
}
