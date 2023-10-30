/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus;

import Interface.ChuongTrinhKhuyenMai_Interface;
import dao.ChuongTrinhKhuyenMai_dao;
import entity.ChuongTrinhKhuyenMaiEntity;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ChuongTrinhKhuyenMai_bus implements ChuongTrinhKhuyenMai_Interface{
    ChuongTrinhKhuyenMai_dao ctkm_dao = new ChuongTrinhKhuyenMai_dao();
    @Override
    public ArrayList<ChuongTrinhKhuyenMaiEntity> getallCTKM() {
       return ctkm_dao.getallCTKM();
    }
    
}
