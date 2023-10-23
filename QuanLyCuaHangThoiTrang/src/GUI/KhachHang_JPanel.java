/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

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
          setBounds(0, 0, 1020, 720);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        btn_TimKiem1 = new javax.swing.JButton();
        btn_TimKiem2 = new javax.swing.JButton();
        btn_TimKiem3 = new javax.swing.JButton();
        panel_TableKhachHang = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_DanhSachKH = new javax.swing.JTable();

        panel_QuanLyKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbl_QuanLyKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_QuanLyKhachHang.setText("Quản Lý Khách Hàng");
        lbl_QuanLyKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel_QuanLyKhachHangLayout = new javax.swing.GroupLayout(panel_QuanLyKhachHang);
        panel_QuanLyKhachHang.setLayout(panel_QuanLyKhachHangLayout);
        panel_QuanLyKhachHangLayout.setHorizontalGroup(
            panel_QuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_QuanLyKhachHangLayout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(lbl_QuanLyKhachHang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_QuanLyKhachHangLayout.setVerticalGroup(
            panel_QuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_QuanLyKhachHangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_QuanLyKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_ThongTinKH.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        lbl_MaKH.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_MaKH.setText("Mã khách hàng");

        lbl_GioiTinhKH.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_GioiTinhKH.setText("Giới tính");

        lbl_HoTenKH.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_HoTenKH.setText("Họ tên");

        lbl_SDTKhachHang.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_SDTKhachHang.setText("Số điện thoại");

        lbl_DiaChiKH.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_DiaChiKH.setText("Địa chỉ");

        txt_MaKH.setPreferredSize(new java.awt.Dimension(55, 25));
        txt_MaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaKHActionPerformed(evt);
            }
        });

        txt_HoTen.setPreferredSize(new java.awt.Dimension(55, 25));
        txt_HoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_HoTenActionPerformed(evt);
            }
        });

        txt_DiaChi.setPreferredSize(new java.awt.Dimension(55, 25));
        txt_DiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DiaChiActionPerformed(evt);
            }
        });

        txt_SDT.setPreferredSize(new java.awt.Dimension(55, 25));

        rad_Nam.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        rad_Nam.setText("Nam");

        rad_Nu.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        rad_Nu.setText("Nữ");

        rad_Khac.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        rad_Khac.setText("Khác");

        javax.swing.GroupLayout panel_ThongTinKHLayout = new javax.swing.GroupLayout(panel_ThongTinKH);
        panel_ThongTinKH.setLayout(panel_ThongTinKHLayout);
        panel_ThongTinKHLayout.setHorizontalGroup(
            panel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThongTinKHLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_MaKH)
                    .addComponent(lbl_GioiTinhKH))
                .addGap(28, 28, 28)
                .addGroup(panel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_ThongTinKHLayout.createSequentialGroup()
                        .addComponent(rad_Nam)
                        .addGap(18, 18, 18)
                        .addComponent(rad_Nu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rad_Khac))
                    .addComponent(txt_MaKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(panel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_ThongTinKHLayout.createSequentialGroup()
                        .addComponent(lbl_DiaChiKH)
                        .addGap(28, 28, 28)
                        .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ThongTinKHLayout.createSequentialGroup()
                        .addComponent(lbl_HoTenKH)
                        .addGap(28, 28, 28)
                        .addComponent(txt_HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(lbl_SDTKhachHang)
                .addGap(28, 28, 28)
                .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        panel_ThongTinKHLayout.setVerticalGroup(
            panel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThongTinKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ThongTinKHLayout.createSequentialGroup()
                        .addGroup(panel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_HoTenKH)
                            .addComponent(txt_HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_SDTKhachHang)
                            .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(panel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_DiaChiKH)
                            .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_ThongTinKHLayout.createSequentialGroup()
                        .addGroup(panel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_MaKH))
                        .addGap(35, 35, 35)
                        .addGroup(panel_ThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_GioiTinhKH)
                            .addComponent(rad_Nam)
                            .addComponent(rad_Nu)
                            .addComponent(rad_Khac))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        panel_ThaoTaoKH.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Các thao tác", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        lbl_NhapSDT.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_NhapSDT.setText("Nhập số điện thoại");

        txt_NhapSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NhapSDTActionPerformed(evt);
            }
        });

        btn_TimKiem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btn_TimKiem.setText("Tìm kiếm");
        btn_TimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_TimKiem1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btn_TimKiem1.setText("Làm mới");
        btn_TimKiem1.setToolTipText("");
        btn_TimKiem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_TimKiem2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btn_TimKiem2.setText("Thêm");
        btn_TimKiem2.setToolTipText("");
        btn_TimKiem2.setActionCommand("");
        btn_TimKiem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_TimKiem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiem2ActionPerformed(evt);
            }
        });

        btn_TimKiem3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btn_TimKiem3.setText("Cập nhật");
        btn_TimKiem3.setToolTipText("");
        btn_TimKiem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_ThaoTaoKHLayout = new javax.swing.GroupLayout(panel_ThaoTaoKH);
        panel_ThaoTaoKH.setLayout(panel_ThaoTaoKHLayout);
        panel_ThaoTaoKHLayout.setHorizontalGroup(
            panel_ThaoTaoKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThaoTaoKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_NhapSDT)
                .addGap(28, 28, 28)
                .addComponent(txt_NhapSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_TimKiem)
                .addGap(18, 18, 18)
                .addComponent(btn_TimKiem1)
                .addGap(18, 18, 18)
                .addComponent(btn_TimKiem2)
                .addGap(18, 18, 18)
                .addComponent(btn_TimKiem3)
                .addGap(26, 26, 26))
        );
        panel_ThaoTaoKHLayout.setVerticalGroup(
            panel_ThaoTaoKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThaoTaoKHLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel_ThaoTaoKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NhapSDT)
                    .addComponent(txt_NhapSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TimKiem)
                    .addComponent(btn_TimKiem1)
                    .addComponent(btn_TimKiem2)
                    .addComponent(btn_TimKiem3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_TableKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bảng danh sách khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        table_DanhSachKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Họ tên", "Giới tính", "Số điện thoại", "Địa chỉ"
            }
        ));
        jScrollPane1.setViewportView(table_DanhSachKH);

        javax.swing.GroupLayout panel_TableKhachHangLayout = new javax.swing.GroupLayout(panel_TableKhachHang);
        panel_TableKhachHang.setLayout(panel_TableKhachHangLayout);
        panel_TableKhachHangLayout.setHorizontalGroup(
            panel_TableKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TableKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        panel_TableKhachHangLayout.setVerticalGroup(
            panel_TableKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_TableKhachHangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_TableKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_ThaoTaoKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_ThongTinKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_QuanLyKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_QuanLyKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_ThongTinKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_ThaoTaoKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_TableKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
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

    private void btn_TimKiem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_TimKiem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_TimKiem1;
    private javax.swing.JButton btn_TimKiem2;
    private javax.swing.JButton btn_TimKiem3;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTable table_DanhSachKH;
    private javax.swing.JTextField txt_DiaChi;
    private javax.swing.JTextField txt_HoTen;
    private javax.swing.JTextField txt_MaKH;
    private javax.swing.JTextField txt_NhapSDT;
    private javax.swing.JTextField txt_SDT;
    // End of variables declaration//GEN-END:variables
}
