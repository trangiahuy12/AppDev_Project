
package Interface;

import entity.HoaDonEntity;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface HoaDon_Interface {
    public ArrayList<HoaDonEntity> getallHoaDon();
    public double getTotalMoney(String maHD);
    
    
}
