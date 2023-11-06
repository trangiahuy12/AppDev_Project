package Interface;

import entity.NhanVienEntity;
import java.util.ArrayList;

/**
 *
 * @author HUY
 */
public interface NhanVienInterface {
    NhanVienEntity findOne(String id);
    boolean update(NhanVienEntity updateNV);
    boolean insert(NhanVienEntity insertNV);
    ArrayList<NhanVienEntity> findAll();
//    int count(String id);
}
