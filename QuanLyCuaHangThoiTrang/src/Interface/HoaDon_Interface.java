
package Interface;

import entity.ChiTietHoaDonEntity;
import entity.HoaDonEntity;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface HoaDon_Interface {
    public ArrayList<HoaDonEntity> getallHoaDon();
    public double getTotalMoney(String maHD);
    
    // Nguyen Huy Hoang
    public boolean themHoaDon(HoaDonEntity hoaDon, ArrayList<ChiTietHoaDonEntity> danhSachCTHD);
    
}
