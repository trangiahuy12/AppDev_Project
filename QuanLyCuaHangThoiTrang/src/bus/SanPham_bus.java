/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus;

import Interface.SanPham_Interface;
import dao.SanPham_dao;
import entity.SanPhamEntity;
import java.util.ArrayList;

/**
 *
 * @author Tran Hien Vinh
 */
public class SanPham_bus implements SanPham_Interface{
    SanPham_dao sp_dao =new SanPham_dao();
    @Override
    public ArrayList<SanPhamEntity> getAllSanPham() {
        return sp_dao.getAllSanPham();
    }

    @Override
    public boolean themSP(SanPhamEntity sp) {
        return sp_dao.themSP(sp);
    }
    
}
