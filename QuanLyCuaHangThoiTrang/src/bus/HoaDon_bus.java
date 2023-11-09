
package bus;

import Interface.HoaDon_Interface;
import dao.HoaDon_dao;
import entity.ChiTietHoaDonEntity;
import entity.HoaDonEntity;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class HoaDon_bus implements HoaDon_Interface{
    HoaDon_dao hd_dao = new HoaDon_dao();
    @Override
    public ArrayList<HoaDonEntity> getallHoaDon() {
       return hd_dao.getallHoaDon();
    }

    @Override
    public double getTotalMoney(String maHD) {
        return hd_dao.getTotalMoney(maHD);
    }

    @Override
    public boolean themHoaDon(HoaDonEntity hoaDon, ArrayList<ChiTietHoaDonEntity> danhSachCTHD) {
        return hd_dao.themHoaDon(hoaDon, danhSachCTHD);
    }
    
}
