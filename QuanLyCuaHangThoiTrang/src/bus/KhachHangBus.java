/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus;

import Interface.KhachHangInterface;
import dao.KhachHangDAO;
import entity.KhachHangEntity;
import java.util.ArrayList;

/**
 *
 * @author HUY
 */
public class KhachHangBus implements KhachHangInterface {
    KhachHangDAO khachHangDAO = new KhachHangDAO();
    
    @Override
    public KhachHangEntity findOne(String id) {
        return khachHangDAO.findOne(id);
    }

    @Override
    public void update(KhachHangEntity updateKH) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean insert(KhachHangEntity insertKH) {
        return khachHangDAO.insert(insertKH);
    }

    @Override
    public ArrayList<KhachHangEntity> findAll() {
        return khachHangDAO.findAll();
    }
    
}
