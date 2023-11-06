/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import entity.KhachHangEntity;
import java.util.ArrayList;

/**
 *
 * @author HUY
 */ 
public interface KhachHangInterface {
    KhachHangEntity findOne(String id   );
    boolean update(KhachHangEntity updateKH);
    boolean insert(KhachHangEntity insertKH);
    ArrayList<KhachHangEntity> findAll();
//    int count(String id);
}
