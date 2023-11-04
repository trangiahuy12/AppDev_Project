package bus;

import Interface.NhanVienInterface;
import dao.NhanVien_dao;
import entity.NhanVienEntity;
import java.util.ArrayList;

/**
 *
 * @author HUY
 */
public class NhanVien_bus implements NhanVienInterface{
    
    NhanVien_dao NVdao = new NhanVien_dao();

    @Override
    public NhanVienEntity findOne(String id) {
        return NVdao.findOne(id);
    }

    @Override
    public boolean update(NhanVienEntity updateNV) {
        return NVdao.update(updateNV);
    }

    @Override
    public boolean insert(NhanVienEntity insertNV) {
        return NVdao.insert(insertNV);
    }

    @Override
    public ArrayList<NhanVienEntity> findAll() {
        return NVdao.findAll();
    }
    
}
