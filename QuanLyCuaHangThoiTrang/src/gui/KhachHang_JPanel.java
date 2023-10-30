
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author 84335
 */
public class KhachHang_JPanel extends javax.swing.JPanel {

    /**
     * Creates new form KhachHang_JPanel
     */
    public KhachHang_JPanel() {
        initComponents();
        setBounds(0, 0, 1020, 700);
        
         ImageIcon img_btnTimKiem = new ImageIcon("src//pic//buttonTimKiem.png");
        Image scaled_btnTimKiem = img_btnTimKiem.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnTimKiem = new ImageIcon(scaled_btnTimKiem);
        btn_TimKiem.setIcon(img_btnTimKiem);
        
        ImageIcon img_btnThem = new ImageIcon("src//pic//buttonThem.png");
        Image scaled_btnThem = img_btnThem.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnThem = new ImageIcon(scaled_btnThem);
        btn_Them.setIcon(img_btnThem);
        
        ImageIcon img_btnLamMoi = new ImageIcon("src//pic//buttonLamMoi.png");
        Image scaled_btnLamMoi = img_btnLamMoi.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnLamMoi = new ImageIcon(scaled_btnLamMoi);
        btn_LamMoi.setIcon(img_btnLamMoi);
        
        ImageIcon img_btnCapNhat = new ImageIcon("src//pic//buttonCapNhat.png");
        Image scaled_btnCapNhat = img_btnCapNhat.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnCapNhat = new ImageIcon(scaled_btnCapNhat);
        btn_CapNhat.setIcon(img_btnCapNhat);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_QuanLyKhachHang = new javax.swing.JPanel();
        lbl_QuanLyKhachHang = new javax.swing.JLabel();
        panel_ThongTinKH = new javax.swing.JPanel();
        lbl_MaKH = new javax.swing.JLabel();
        lbl_GioiTinhKH = new javax.swing.JLabel();
        lbl_HoTenKH = new javax.swing.JLabel();
        lbl_SDTKhachHang = new javax.swing.JLabel();
        lbl_DiaChiKH = new javax.swing.JLabel();
        txt_MaKH = new javax.swing.JTextField();
        txt_HoTen = new javax.swing.JTextField();
        txt_DiaChi = new javax.swing.JTextField();
        txt_SDT = new javax.swing.JTextField();
        rad_Nam = new javax.swing.JRadioButton();
        rad_Nu = new javax.swing.JRadioButton();
        rad_Khac = new javax.swing.JRadioButton();
        panel_ThaoTaoKH = new javax.swing.JPanel();
        lbl_NhapSDT = new javax.swing.JLabel();
        txt_NhapSDT = new javax.swing.JTextField();
        btn_TimKiem = new javax.swing.JButton();
        btn_LamMoi = new javax.swing.JButton();
        btn_Them = new javax.swing.JButton();
        btn_CapNhat = new javax.swing.JButton();
        panel_TableKhachHang = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(187, 205, 197));
        setPreferredSize(new java.awt.Dimension(1020, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_QuanLyKhachHang.setBackground(new java.awt.Color(187, 205, 197));
        panel_QuanLyKhachHang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_QuanLyKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_QuanLyKhachHang.setText("QUẢN LÝ KHÁCH HÀNG");
        lbl_QuanLyKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_QuanLyKhachHang.add(lbl_QuanLyKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, 42));

        add(panel_QuanLyKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1000, -1));

        panel_ThongTinKH.setBackground(new java.awt.Color(187, 205, 197));
        panel_ThongTinKH.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        panel_ThongTinKH.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_MaKH.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_MaKH.setText("Mã khách hàng");
        panel_ThongTinKH.add(lbl_MaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 32, -1, -1));

        lbl_GioiTinhKH.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_GioiTinhKH.setText("Giới tính");
        panel_ThongTinKH.add(lbl_GioiTinhKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        lbl_HoTenKH.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_HoTenKH.setText("Họ tên");
        panel_ThongTinKH.add(lbl_HoTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 32, -1, -1));

        lbl_SDTKhachHang.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_SDTKhachHang.setText("Số điện thoại");
        panel_ThongTinKH.add(lbl_SDTKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, -1));

        lbl_DiaChiKH.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_DiaChiKH.setText("Địa chỉ");
        panel_ThongTinKH.add(lbl_DiaChiKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 89, -1, -1));

        txt_MaKH.setPreferredSize(new java.awt.Dimension(55, 25));
        txt_MaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaKHActionPerformed(evt);
            }
        });
        panel_ThongTinKH.add(txt_MaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 29, 188, 25));

        txt_HoTen.setPreferredSize(new java.awt.Dimension(55, 25));
        txt_HoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_HoTenActionPerformed(evt);
            }
        });
        panel_ThongTinKH.add(txt_HoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 173, 25));

        txt_DiaChi.setPreferredSize(new java.awt.Dimension(55, 25));
        txt_DiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DiaChiActionPerformed(evt);
            }
        });
        panel_ThongTinKH.add(txt_DiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 173, 25));

        txt_SDT.setPreferredSize(new java.awt.Dimension(55, 25));
        panel_ThongTinKH.add(txt_SDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 173, 25));

        rad_Nam.setBackground(new java.awt.Color(187, 205, 197));
        rad_Nam.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        rad_Nam.setText("Nam");
        panel_ThongTinKH.add(rad_Nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 89, -1, -1));

        rad_Nu.setBackground(new java.awt.Color(187, 205, 197));
        rad_Nu.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        rad_Nu.setText("Nữ");
        panel_ThongTinKH.add(rad_Nu, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 89, -1, -1));

        rad_Khac.setBackground(new java.awt.Color(187, 205, 197));
        rad_Khac.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        rad_Khac.setText("Khác");
        panel_ThongTinKH.add(rad_Khac, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 89, -1, -1));

        add(panel_ThongTinKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, 1000, 124));

        panel_ThaoTaoKH.setBackground(new java.awt.Color(187, 205, 197));
        panel_ThaoTaoKH.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Các thao tác", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        panel_ThaoTaoKH.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_NhapSDT.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_NhapSDT.setText("Nhập số điện thoại");
        panel_ThaoTaoKH.add(lbl_NhapSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txt_NhapSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NhapSDTActionPerformed(evt);
            }
        });
        panel_ThaoTaoKH.add(txt_NhapSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 330, 30));

        btn_TimKiem.setBackground(new java.awt.Color(0, 51, 51));
        btn_TimKiem.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btn_TimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btn_TimKiem.setText("Tìm kiếm");
        btn_TimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_ThaoTaoKH.add(btn_TimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 120, -1));

        btn_LamMoi.setBackground(new java.awt.Color(0, 51, 51));
        btn_LamMoi.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btn_LamMoi.setForeground(new java.awt.Color(255, 255, 255));
        btn_LamMoi.setText("Làm mới");
        btn_LamMoi.setToolTipText("");
        btn_LamMoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamMoiActionPerformed(evt);
            }
        });
        panel_ThaoTaoKH.add(btn_LamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 120, -1));

        btn_Them.setBackground(new java.awt.Color(0, 51, 51));
        btn_Them.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btn_Them.setForeground(new java.awt.Color(255, 255, 255));
        btn_Them.setText("Thêm");
        btn_Them.setToolTipText("");
        btn_Them.setActionCommand("");
        btn_Them.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });
        panel_ThaoTaoKH.add(btn_Them, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 110, -1));

        btn_CapNhat.setBackground(new java.awt.Color(0, 51, 51));
        btn_CapNhat.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btn_CapNhat.setForeground(new java.awt.Color(255, 255, 255));
        btn_CapNhat.setText("Cập nhật");
        btn_CapNhat.setToolTipText("");
        btn_CapNhat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CapNhatActionPerformed(evt);
            }
        });
        panel_ThaoTaoKH.add(btn_CapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 120, -1));

        add(panel_ThaoTaoKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 184, 1000, 83));

        panel_TableKhachHang.setBackground(new java.awt.Color(187, 205, 197));
        panel_TableKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Bảng danh sách khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        panel_TableKhachHang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khách Hàng", "Tên Khách Hàng", "mmm", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panel_TableKhachHang.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 980, 390));

        add(panel_TableKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 273, 1000, 421));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_MaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MaKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MaKHActionPerformed

    private void txt_HoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_HoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_HoTenActionPerformed

    private void txt_DiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DiaChiActionPerformed

    private void txt_NhapSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NhapSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NhapSDTActionPerformed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CapNhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CapNhatActionPerformed

    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_LamMoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CapNhat;
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_DiaChiKH;
    private javax.swing.JLabel lbl_GioiTinhKH;
    private javax.swing.JLabel lbl_HoTenKH;
    private javax.swing.JLabel lbl_MaKH;
    private javax.swing.JLabel lbl_NhapSDT;
    private javax.swing.JLabel lbl_QuanLyKhachHang;
    private javax.swing.JLabel lbl_SDTKhachHang;
    private javax.swing.JPanel panel_QuanLyKhachHang;
    private javax.swing.JPanel panel_TableKhachHang;
    private javax.swing.JPanel panel_ThaoTaoKH;
    private javax.swing.JPanel panel_ThongTinKH;
    private javax.swing.JRadioButton rad_Khac;
    private javax.swing.JRadioButton rad_Nam;
    private javax.swing.JRadioButton rad_Nu;
    private javax.swing.JTextField txt_DiaChi;
    private javax.swing.JTextField txt_HoTen;
    private javax.swing.JTextField txt_MaKH;
    private javax.swing.JTextField txt_NhapSDT;
    private javax.swing.JTextField txt_SDT;
    // End of variables declaration//GEN-END:variables
}
