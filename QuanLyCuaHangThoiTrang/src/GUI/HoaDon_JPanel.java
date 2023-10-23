
package GUI;


import javax.swing.BorderFactory;


public class HoaDon_JPanel extends javax.swing.JPanel {
    
    private ChiTietHoaDon_GUI chitiethoadon;

    /**
     * Creates new form HoaDon_JPanel
     */
    public HoaDon_JPanel() {
        initComponents();
          setBounds(0, 0, 1020, 700);
          Jpanel_ThaoTac.setBorder(BorderFactory.createTitledBorder("Thao tác"));
        Jpanel_Table.setBorder(BorderFactory.createTitledBorder("Bảng danh sách"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel_TieuDeHoaDon = new javax.swing.JPanel();
        lbl_TieuDeHoaDon = new javax.swing.JLabel();
        Jpanel_ThaoTac = new javax.swing.JPanel();
        lbl_MaHoaDon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_MaHoaDon = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btn_TimKiem = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_XemChiTiet = new javax.swing.JButton();
        Jpanel_Table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(187, 205, 197));
        setMinimumSize(new java.awt.Dimension(1020, 700));
        setPreferredSize(new java.awt.Dimension(1020, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jpanel_TieuDeHoaDon.setBackground(new java.awt.Color(187, 205, 197));
        Jpanel_TieuDeHoaDon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_TieuDeHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_TieuDeHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TieuDeHoaDon.setText("QUẢN LÝ HÓA ĐƠN");
        Jpanel_TieuDeHoaDon.add(lbl_TieuDeHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 10, 330, 30));

        add(Jpanel_TieuDeHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 50));

        Jpanel_ThaoTac.setBackground(new java.awt.Color(187, 205, 197));
        Jpanel_ThaoTac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_MaHoaDon.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_MaHoaDon.setText("Mã Hóa Đơn");
        Jpanel_ThaoTac.add(lbl_MaHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 120, 20));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Ngày Lập Hóa Đơn");
        Jpanel_ThaoTac.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 60, 150, 20));

        txt_MaHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaHoaDonActionPerformed(evt);
            }
        });
        Jpanel_ThaoTac.add(txt_MaHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 200, 25));
        Jpanel_ThaoTac.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 200, 25));

        btn_TimKiem.setBackground(new java.awt.Color(51, 255, 255));
        btn_TimKiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_TimKiem.setText("Tìm Kiếm");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });
        Jpanel_ThaoTac.add(btn_TimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 120, 30));

        btn_Xoa.setBackground(new java.awt.Color(204, 0, 0));
        btn_Xoa.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_Xoa.setForeground(new java.awt.Color(255, 255, 255));
        btn_Xoa.setText("Xóa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });
        Jpanel_ThaoTac.add(btn_Xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 120, 30));

        btn_XemChiTiet.setBackground(new java.awt.Color(0, 255, 255));
        btn_XemChiTiet.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_XemChiTiet.setText("Xem Chi Tiết");
        btn_XemChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XemChiTietActionPerformed(evt);
            }
        });
        Jpanel_ThaoTac.add(btn_XemChiTiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 150, 30));

        add(Jpanel_ThaoTac, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1020, 100));

        Jpanel_Table.setBackground(new java.awt.Color(187, 205, 197));
        Jpanel_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jpanel_Table.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "Mã Khách Hàng", "Mã Nhân Viên", "Mã CTKM", "Thuế VAT", "Tổng tiền", "Ngày Lập Hóa Đơn"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Jpanel_Table.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1000, 510));

        add(Jpanel_Table, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 1020, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_MaHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MaHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MaHoaDonActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_XemChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XemChiTietActionPerformed
        // TODO add your handling code here:
        chitiethoadon = new ChiTietHoaDon_GUI();
        chitiethoadon.setVisible(true);
        
    }//GEN-LAST:event_btn_XemChiTietActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_TimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel_Table;
    private javax.swing.JPanel Jpanel_ThaoTac;
    private javax.swing.JPanel Jpanel_TieuDeHoaDon;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_XemChiTiet;
    private javax.swing.JButton btn_Xoa;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_MaHoaDon;
    private javax.swing.JLabel lbl_TieuDeHoaDon;
    private javax.swing.JTextField txt_MaHoaDon;
    // End of variables declaration//GEN-END:variables
}
