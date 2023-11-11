package gui;

import bus.TaiKhoan_bus;
import entity.TaiKhoanEntity;
import entity.TinhTrangTKEnum;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TaiKhoan_JPanel extends javax.swing.JPanel {
    private TaiKhoan_bus bus = new TaiKhoan_bus();
    private DefaultTableModel tableModel = new DefaultTableModel();
    public TaiKhoan_JPanel() {
        initComponents();
        setBounds(0, 0, 1020, 720);
        ImageIcon img_btnTimKiem = new ImageIcon("src//pic//icon//buttonTimKiem.png");
        Image scaled_btnTimKiem = img_btnTimKiem.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnTimKiem = new ImageIcon(scaled_btnTimKiem);
        btn_TimKiem.setIcon(img_btnTimKiem);
        ImageIcon img_btnXoa = new ImageIcon("src//pic//icon//buttonXoa.png");
        Image scaled_btnXoa = img_btnXoa.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnXoa = new ImageIcon(scaled_btnXoa);
        btn_CapNhat.setIcon(img_btnXoa);
        
        tableModel = (DefaultTableModel) table_DanhSachTK.getModel();
        table_DanhSachTK.setModel(tableModel);
        
        loadData();
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
        btn_CapNhat = new javax.swing.JButton();
        cbo_TinhTrang = new javax.swing.JComboBox<>();
        lbl_TinhTrang = new javax.swing.JLabel();
        panel_TableTaiKhoan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_DanhSachTK = new javax.swing.JTable();

        setBackground(new java.awt.Color(187, 205, 197));
        setPreferredSize(new java.awt.Dimension(1020, 700));

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
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        btn_CapNhat.setBackground(new java.awt.Color(0, 51, 51));
        btn_CapNhat.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btn_CapNhat.setForeground(new java.awt.Color(255, 255, 255));
        btn_CapNhat.setText("Cập nhật");
        btn_CapNhat.setToolTipText("");
        btn_CapNhat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_CapNhat.setPreferredSize(new java.awt.Dimension(123, 30));
        btn_CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CapNhatActionPerformed(evt);
            }
        });

        cbo_TinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Đang hoạt động", "Ngưng hoạt động"}));
        cbo_TinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Đang hoạt động", "Ngưng hoạt động"}));
        cbo_TinhTrang.setPreferredSize(new java.awt.Dimension(200, 30));

        lbl_TinhTrang.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_TinhTrang.setText("Tình trạng tài khoản");

        javax.swing.GroupLayout panel_ThaoTacTKLayout = new javax.swing.GroupLayout(panel_ThaoTacTK);
        panel_ThaoTacTK.setLayout(panel_ThaoTacTKLayout);
        panel_ThaoTacTKLayout.setHorizontalGroup(
            panel_ThaoTacTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThaoTacTKLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbl_NhapTenTK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_NhapTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_TinhTrang)
                .addGap(18, 18, 18)
                .addComponent(cbo_TinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panel_ThaoTacTKLayout.setVerticalGroup(
            panel_ThaoTacTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThaoTacTKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ThaoTacTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NhapTenTK)
                    .addComponent(txt_NhapTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_TinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TinhTrang))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        panel_TableTaiKhoan.setBackground(new java.awt.Color(187, 205, 197));
        panel_TableTaiKhoan.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Bảng danh sách tài khoản", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        table_DanhSachTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chủ sỡ hữu", "Tên tài khoản", "Thời gian đăng nhập", "Tình trạng"
            }
        ));
        table_DanhSachTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_DanhSachTKMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_DanhSachTK);

        javax.swing.GroupLayout panel_TableTaiKhoanLayout = new javax.swing.GroupLayout(panel_TableTaiKhoan);
        panel_TableTaiKhoan.setLayout(panel_TableTaiKhoanLayout);
        panel_TableTaiKhoanLayout.setHorizontalGroup(
            panel_TableTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TableTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panel_TableTaiKhoanLayout.setVerticalGroup(
            panel_TableTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TableTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_ThaoTacTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_TableTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 13, Short.MAX_VALUE)))
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

    private void btn_CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CapNhatActionPerformed
        int rowSelected = table_DanhSachTK.getSelectedRow();
        String tenTaiKhoan = (String) tableModel.getValueAt(rowSelected, 1);
        TaiKhoanEntity tk = bus.findOne(tenTaiKhoan);
        tk.setTinhTrang(cbo_TinhTrang.getSelectedItem().equals("Đang hoạt động") == true ? TinhTrangTKEnum.DANG_HOAT_DONG : TinhTrangTKEnum.NGUNG_HOAT_DONG);
        if (bus.update(tk)) {
            JOptionPane.showMessageDialog(this, "Cập nhật tình trạng tài khoản thành công!");
    }
        else JOptionPane.showConfirmDialog(this, "Cập nhật nhật tình trạng tài khoản thất bại!");
        
        
        refresh();
    }//GEN-LAST:event_btn_CapNhatActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        String id = txt_NhapTenTK.getText();
        if (id.isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tài khoản của nhân viên!");
            return;
        }
        TaiKhoanEntity tk = bus.findOne(id);
        if (tk == null) {
            JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại!");
            return;
        }
       tableModel.setRowCount(0);
       tableModel.addRow(new Object[] {tk.getNhanVien().getHoTen(), tk.getTenTaiKhoan(), tk.getThoiGianDNGN(), tk.getTinhTrang().toString()});
    }//GEN-LAST:event_btn_TimKiemActionPerformed

    private void table_DanhSachTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_DanhSachTKMouseClicked
        int selectedRow = table_DanhSachTK.getSelectedRow();
        cbo_TinhTrang.setSelectedItem(tableModel.getValueAt(selectedRow, 3));
    }//GEN-LAST:event_table_DanhSachTKMouseClicked

     private void loadData() {
        ArrayList<TaiKhoanEntity> listTK = new ArrayList<>();
        listTK = bus.findAll();
        for (TaiKhoanEntity tk : listTK) {
            tableModel.addRow(new Object[]{tk.getNhanVien().getHoTen(), tk.getTenTaiKhoan(), tk.getThoiGianDNGN(), tk.getTinhTrang().toString()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CapNhat;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JComboBox<String> cbo_TinhTrang;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_NhapTenTK;
    private javax.swing.JLabel lbl_QuanLyTaiKhoan;
    private javax.swing.JLabel lbl_TinhTrang;
    private javax.swing.JPanel panel_QuanLyTaiKhoan;
    private javax.swing.JPanel panel_TableTaiKhoan;
    private javax.swing.JPanel panel_ThaoTacTK;
    private javax.swing.JTable table_DanhSachTK;
    private javax.swing.JTextField txt_NhapTenTK;
    // End of variables declaration//GEN-END:variables
    
    public void refresh() {
        txt_NhapTenTK.setText("");
        tableModel.setRowCount(0);
        cbo_TinhTrang.setSelectedIndex(-1);
        loadData();
    }
}
