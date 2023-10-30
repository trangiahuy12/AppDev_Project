/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entity.KhachHangEntity;
import java.util.ArrayList;

/**
 *
 * @author HUY
 */
public interface KhachHangInterface {
    KhachHangEntity findOne(String id   );
    void update(KhachHangEntity updateKH);
    String insert(KhachHangEntity insertKH);
    ArrayList<KhachHangEntity> findAll();
}
