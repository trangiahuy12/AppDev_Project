
package Interface;

import entity.ChiTietHoaDonEntity;
import entity.SanPhamEntity;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface ChiTietHoaDon_Interface {
    public ArrayList<ChiTietHoaDonEntity> getallCTHD();
    public ArrayList<SanPhamEntity> getSanPhamTheoMaSP(String maSP); 
    public ArrayList<SanPhamEntity> getSanPhamTheoMaHD(String maHD);
}
