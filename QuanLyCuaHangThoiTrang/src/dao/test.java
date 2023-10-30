/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.KhachHangEntity;
import java.util.ArrayList;

/**
 *
 * @author HUY
 */
public class test {
    public static void main(String[] args) {
        KhachHangDAO kh_dao = new KhachHangDAO();
        ArrayList<KhachHangEntity> listKH = new ArrayList<>();
        listKH = kh_dao.findAll();
        System.out.println(listKH.size());
    }
}
