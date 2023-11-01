package gui;

import java.awt.Image;
import javax.swing.ImageIcon;

public class TaiKhoan_JPanel extends javax.swing.JPanel {

    public TaiKhoan_JPanel() {
        initComponents();
        setBounds(0, 0, 1020, 720);
        ImageIcon img_btnTimKiem = new ImageIcon("src//pic//buttonTimKiem.png");
        Image scaled_btnTimKiem = img_btnTimKiem.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnTimKiem = new ImageIcon(scaled_btnTimKiem);
        btn_TimKiem.setIcon(img_btnTimKiem);
        ImageIcon img_btnXoa = new ImageIcon("src//pic//buttonXoa.png");
        Image scaled_btnXoa = img_btnXoa.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnXoa = new ImageIcon(scaled_btnXoa);
        btn_Xoa.setIcon(img_btnXoa);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_QuanLyTaiKhoan = new javax.swing.JPanel();
        lbl_QuanLyTaiKhoan = new javax.swing.JLabel();
        panel_ThaoTacTK = new javax.swing.JPanel();
        lbl_NhapTenTK = new javax.swing.JLabel();
        txt_NhapTenTK = new javax.swing.JTextField();
        btn_TimKiem = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        panel_TableTaiKhoan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_DanhSachTK = new javax.swing.JTable();

        setBackground(new java.awt.Color(187, 205, 197));

        panel_QuanLyTaiKhoan.setBackground(new java.awt.Color(187, 205, 197));

        lbl_QuanLyTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_QuanLyTaiKhoan.setText("Quản Lý Tài Khoản");
        panel_QuanLyTaiKhoan.add(lbl_QuanLyTaiKhoan);

        panel_ThaoTacTK.setBackground(new java.awt.Color(187, 205, 197));
        panel_ThaoTacTK.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Các thao tác", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        lbl_NhapTenTK.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_NhapTenTK.setText("Nhập tên tài khoản");

        txt_NhapTenTK.setPreferredSize(new java.awt.Dimension(200, 30));
        txt_NhapTenTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NhapTenTKActionPerformed(evt);
            }
        });

        btn_TimKiem.setBackground(new java.awt.Color(0, 51, 51));
        btn_TimKiem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btn_TimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btn_TimKiem.setText("Tìm kiếm");
        btn_TimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_TimKiem.setPreferredSize(new java.awt.Dimension(123, 30));

        btn_Xoa.setBackground(new java.awt.Color(0, 51, 51));
        btn_Xoa.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btn_Xoa.setForeground(new java.awt.Color(255, 255, 255));
        btn_Xoa.setText("Xoá");
        btn_Xoa.setToolTipText("");
        btn_Xoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Xoa.setPreferredSize(new java.awt.Dimension(123, 30));
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ThaoTacTKLayout = new javax.swing.GroupLayout(panel_ThaoTacTK);
        panel_ThaoTacTK.setLayout(panel_ThaoTacTKLayout);
        panel_ThaoTacTKLayout.setHorizontalGroup(
            panel_ThaoTacTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThaoTacTKLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_NhapTenTK)
                .addGap(18, 18, 18)
                .addComponent(txt_NhapTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(352, Short.MAX_VALUE))
        );
        panel_ThaoTacTKLayout.setVerticalGroup(
            panel_ThaoTacTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThaoTacTKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ThaoTacTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NhapTenTK)
                    .addComponent(txt_NhapTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        panel_TableTaiKhoan.setBackground(new java.awt.Color(187, 205, 197));
        panel_TableTaiKhoan.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Bảng danh sách tài khoản", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        table_DanhSachTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên tài khoản", "Thời gian đăng nhập gần nhất"
            }
        ));
        jScrollPane1.setViewportView(table_DanhSachTK);

        javax.swing.GroupLayout panel_TableTaiKhoanLayout = new javax.swing.GroupLayout(panel_TableTaiKhoan);
        panel_TableTaiKhoan.setLayout(panel_TableTaiKhoanLayout);
        panel_TableTaiKhoanLayout.setHorizontalGroup(
            panel_TableTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TableTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        panel_TableTaiKhoanLayout.setVerticalGroup(
            panel_TableTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TableTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_QuanLyTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_ThaoTacTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_TableTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_QuanLyTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_ThaoTacTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_TableTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NhapTenTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NhapTenTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NhapTenTKActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_XoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_NhapTenTK;
    private javax.swing.JLabel lbl_QuanLyTaiKhoan;
    private javax.swing.JPanel panel_QuanLyTaiKhoan;
    private javax.swing.JPanel panel_TableTaiKhoan;
    private javax.swing.JPanel panel_ThaoTacTK;
    private javax.swing.JTable table_DanhSachTK;
    private javax.swing.JTextField txt_NhapTenTK;
    // End of variables declaration//GEN-END:variables
}
