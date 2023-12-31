/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import bus.MatHangNhap_bus;
import bus.NhaCungCap_bus;
import bus.SanPham_bus;
import entity.MatHangNhapEntity;
import entity.NhaCungCapEntity;
import entity.SanPhamEntity;
import java.awt.Font;
import java.awt.Image;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import util.GenerateID;

/**
 *
 * @author 84335
 */
public class PhieuNhap_JPanel extends javax.swing.JPanel {

    private MatHangNhap_bus mhn_bus;
    private NhaCungCap_bus ncc_bus;
    private SanPham_bus sp_bus;
    private SanPham_JPanel sp_panel;

    /**
     * Creates new form PhieuNhap_JPanel
     */
    public PhieuNhap_JPanel() {
        initComponents();
        //-------------
        mhn_bus = new MatHangNhap_bus();
        ncc_bus = new NhaCungCap_bus();
        sp_bus = new SanPham_bus();
        sp_panel=new SanPham_JPanel();
        //------------
        setBounds(0, 0, 1020, 720);
        ImageIcon img_btnTimKiem = new ImageIcon("src//pic//icon//buttonTimKiem.png");
        Image scaled_btnTimKiem = img_btnTimKiem.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnTimKiem = new ImageIcon(scaled_btnTimKiem);
        btn_TimKiem.setIcon(img_btnTimKiem);
        ImageIcon img_btnLamMoi = new ImageIcon("src//pic//icon//buttonLamMoi.png");
        Image scaled_btnLamMoi = img_btnLamMoi.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnLamMoi = new ImageIcon(scaled_btnLamMoi);
        btn_LamMoi.setIcon(img_btnLamMoi);
        ImageIcon img_btn_NhapHang = new ImageIcon("src//pic//icon//buttonNhapHang.png");
        Image scaled_btn_NhapHang = img_btn_NhapHang.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btn_NhapHang = new ImageIcon(scaled_btn_NhapHang);
        btn_NhapHang.setIcon(img_btn_NhapHang);
        ImageIcon img_btn_CapNhat = new ImageIcon("src//pic//icon//buttonCapNhat.png");
        Image scaled_btn_CapNhat = img_btn_CapNhat.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btn_CapNhat = new ImageIcon(scaled_btn_CapNhat);
        btn_CapNhat.setIcon(img_btn_CapNhat);
        loadDuLieuTuDataLenTable();
        duaDuLieuVaoComboBox(cbo_MaNhaCungCap, ncc_bus.layDSNCCDangNhap(), "MaNCC");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_TieuDe = new javax.swing.JLabel();
        panel_ThongTin = new javax.swing.JPanel();
        lbl_MaMatHangNhap = new javax.swing.JLabel();
        lbl_MaNhaCungCap = new javax.swing.JLabel();
        txt_MaMatHangNhap = new javax.swing.JTextField();
        lbl_NgayNhap = new javax.swing.JLabel();
        lbl_SoLuong = new javax.swing.JLabel();
        cbo_MaNhaCungCap = new javax.swing.JComboBox<>();
        jdc_NgayNhap = new com.toedter.calendar.JDateChooser();
        spinner_SoLuong = new javax.swing.JSpinner();
        txt_An = new javax.swing.JTextField();
        txt_MaSanPham = new javax.swing.JTextField();
        lbl_MaSanPham = new javax.swing.JLabel();
        panel_ThaoTac = new javax.swing.JPanel();
        lbl_NgayNhap_Search = new javax.swing.JLabel();
        btn_TimKiem = new javax.swing.JButton();
        btn_LamMoi = new javax.swing.JButton();
        btn_NhapHang = new javax.swing.JButton();
        btn_CapNhat = new javax.swing.JButton();
        jdc_NgayNhap_Search = new com.toedter.calendar.JDateChooser();
        panel_DanhSachPhieuNhapHang = new javax.swing.JPanel();
        scroll_TablePhieuNhapHang = new javax.swing.JScrollPane();
        Object[][] data = {};
        String[] columnNames = {"Mã mặt hàng nhập","Mã sản phẩm", "Mã nhà cung cấp", "Số lượng", "Ngày nhập"};
        model=new DefaultTableModel(data, columnNames){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        table_PhieuNhapHang = new javax.swing.JTable();

        setBackground(new java.awt.Color(187, 205, 197));
        setPreferredSize(new java.awt.Dimension(1020, 700));

        lbl_TieuDe.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_TieuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TieuDe.setText("PHIẾU NHẬP HÀNG");
        lbl_TieuDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_TieuDe.setPreferredSize(new java.awt.Dimension(675, 40));

        panel_ThongTin.setBackground(new java.awt.Color(187, 205, 197));
        panel_ThongTin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông tin phiếu nhập hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        panel_ThongTin.setPreferredSize(new java.awt.Dimension(998, 87));
        panel_ThongTin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_MaMatHangNhap.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_MaMatHangNhap.setText("Mã mặt hàng nhập");
        lbl_MaMatHangNhap.setPreferredSize(new java.awt.Dimension(85, 15));
        panel_ThongTin.add(lbl_MaMatHangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 120, 20));

        lbl_MaNhaCungCap.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_MaNhaCungCap.setText("Mã nhà cung cấp");
        lbl_MaNhaCungCap.setPreferredSize(new java.awt.Dimension(85, 15));
        panel_ThongTin.add(lbl_MaNhaCungCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 49, 120, 30));

        txt_MaMatHangNhap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_MaMatHangNhap.setPreferredSize(new java.awt.Dimension(68, 26));
        txt_MaMatHangNhap.setEditable(false);
        panel_ThongTin.add(txt_MaMatHangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 200, 25));

        lbl_NgayNhap.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_NgayNhap.setText("Ngày nhập");
        lbl_NgayNhap.setPreferredSize(new java.awt.Dimension(85, 15));
        panel_ThongTin.add(lbl_NgayNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, 20));

        lbl_SoLuong.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_SoLuong.setText("Số lượng");
        lbl_SoLuong.setMaximumSize(new java.awt.Dimension(82, 15));
        lbl_SoLuong.setMinimumSize(new java.awt.Dimension(82, 15));
        lbl_SoLuong.setPreferredSize(new java.awt.Dimension(85, 15));
        panel_ThongTin.add(lbl_SoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 70, 26));

        cbo_MaNhaCungCap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panel_ThongTin.add(cbo_MaNhaCungCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 200, 25));

        jdc_NgayNhap.setDate(new Date());
        panel_ThongTin.add(jdc_NgayNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 200, 25));

        spinner_SoLuong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panel_ThongTin.add(spinner_SoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 108, 25));

        txt_An.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_An.setText("jTextField1");
        panel_ThongTin.add(txt_An, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 200, 25));

        txt_MaSanPham.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panel_ThongTin.add(txt_MaSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 200, 25));

        lbl_MaSanPham.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_MaSanPham.setText("Mã sản phẩm");
        panel_ThongTin.add(lbl_MaSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        panel_ThaoTac.setBackground(new java.awt.Color(187, 205, 197));
        panel_ThaoTac.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Các thao tác", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        panel_ThaoTac.setPreferredSize(new java.awt.Dimension(990, 50));

        lbl_NgayNhap_Search.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_NgayNhap_Search.setText("Ngày nhập");

        btn_TimKiem.setBackground(new java.awt.Color(0, 51, 51));
        btn_TimKiem.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_TimKiem.setForeground(java.awt.Color.white);
        btn_TimKiem.setText("Tìm kiếm");
        btn_TimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_TimKiem.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        btn_LamMoi.setBackground(new java.awt.Color(0, 51, 51));
        btn_LamMoi.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_LamMoi.setForeground(java.awt.Color.white);
        btn_LamMoi.setText("Làm mới");
        btn_LamMoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_LamMoi.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_LamMoi.setPreferredSize(new java.awt.Dimension(90, 31));
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamMoiActionPerformed(evt);
            }
        });

        btn_NhapHang.setBackground(new java.awt.Color(0, 51, 51));
        btn_NhapHang.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_NhapHang.setForeground(java.awt.Color.white);
        btn_NhapHang.setText("Nhập hàng");
        btn_NhapHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_NhapHang.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_NhapHang.setPreferredSize(new java.awt.Dimension(90, 31));
        btn_NhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NhapHangActionPerformed(evt);
            }
        });

        btn_CapNhat.setBackground(new java.awt.Color(0, 51, 51));
        btn_CapNhat.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_CapNhat.setForeground(java.awt.Color.white);
        btn_CapNhat.setText("Cập nhật");
        btn_CapNhat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_CapNhat.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_CapNhat.setPreferredSize(new java.awt.Dimension(90, 31));
        btn_CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CapNhatActionPerformed(evt);
            }
        });

        jdc_NgayNhap_Search.setDate(new Date());

        javax.swing.GroupLayout panel_ThaoTacLayout = new javax.swing.GroupLayout(panel_ThaoTac);
        panel_ThaoTac.setLayout(panel_ThaoTacLayout);
        panel_ThaoTacLayout.setHorizontalGroup(
            panel_ThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThaoTacLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbl_NgayNhap_Search)
                .addGap(69, 69, 69)
                .addComponent(jdc_NgayNhap_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_LamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_NhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_ThaoTacLayout.setVerticalGroup(
            panel_ThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThaoTacLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(panel_ThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jdc_NgayNhap_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_NgayNhap_Search))
                    .addComponent(btn_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_ThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_NhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_LamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_DanhSachPhieuNhapHang.setBackground(new java.awt.Color(187, 205, 197));
        panel_DanhSachPhieuNhapHang.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Danh sách phiếu nhập hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N

        JTableHeader tableHeader=table_PhieuNhapHang.getTableHeader();
        tableHeader.setFont(new Font("Times New Roman", Font.BOLD, 13));
        table_PhieuNhapHang.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        table_PhieuNhapHang.setModel(model);
        table_PhieuNhapHang.getColumnModel().getColumn(2).setPreferredWidth(5);
        table_PhieuNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_PhieuNhapHangMouseClicked(evt);
            }
        });
        scroll_TablePhieuNhapHang.setViewportView(table_PhieuNhapHang);

        javax.swing.GroupLayout panel_DanhSachPhieuNhapHangLayout = new javax.swing.GroupLayout(panel_DanhSachPhieuNhapHang);
        panel_DanhSachPhieuNhapHang.setLayout(panel_DanhSachPhieuNhapHangLayout);
        panel_DanhSachPhieuNhapHangLayout.setHorizontalGroup(
            panel_DanhSachPhieuNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll_TablePhieuNhapHang, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panel_DanhSachPhieuNhapHangLayout.setVerticalGroup(
            panel_DanhSachPhieuNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll_TablePhieuNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_TieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_ThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
                    .addComponent(panel_ThaoTac, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
                    .addComponent(panel_DanhSachPhieuNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_ThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_ThaoTac, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_DanhSachPhieuNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
     private void loadDuLieuTuDataLenTable() {
        ArrayList<MatHangNhapEntity> dsMHN = mhn_bus.getAllMatHangNhap();
        for (MatHangNhapEntity mhn : dsMHN) {
            model.addRow(new Object[]{mhn.getMaMHN(), mhn.getSanPham().getMaSP(), mhn.getNhaCungCap().getMaNCC(), mhn.getSoLuongNhap(), mhn.getNgayNhap()});
        }
    }

    //Hàm đưa dữ liệu vào combobox
    private void duaDuLieuVaoComboBox(JComboBox comboBox, ArrayList<?> data, String thuocTinh) {
        DefaultComboBoxModel<Object> model = new DefaultComboBoxModel<>();
        for (Object item : data) {
            try {
                Object propertyValue = item.getClass().getMethod("get" + thuocTinh).invoke(item);
                model.addElement(propertyValue);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        comboBox.setModel(model);
    }
    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        // TODO add your handling code here:
        Date date = jdc_NgayNhap_Search.getDate();
        LocalDate ngayTim = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        timKiemTheoNgay(ngayTim);

    }//GEN-LAST:event_btn_TimKiemActionPerformed

    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
        // TODO add your handling code here:
        lamMoi();
    }//GEN-LAST:event_btn_LamMoiActionPerformed

    private void btn_NhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhapHangActionPerformed
        // TODO add your handling code here:
        nhapHang();
    }//GEN-LAST:event_btn_NhapHangActionPerformed

    private void btn_CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CapNhatActionPerformed
        // TODO add your handling code here:
        capNhatMatHangNhap();
    }//GEN-LAST:event_btn_CapNhatActionPerformed

    private void table_PhieuNhapHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_PhieuNhapHangMouseClicked
        // TODO add your handling code here:
        int row = table_PhieuNhapHang.getSelectedRow();
        txt_MaMatHangNhap.setText(model.getValueAt(row, 0).toString());
        txt_MaMatHangNhap.setEditable(false);
        cbo_MaNhaCungCap.setSelectedItem(model.getValueAt(row, 2).toString());
        txt_MaSanPham.setText(model.getValueAt(row, 1).toString());
        txt_MaSanPham.setEditable(false);
        spinner_SoLuong.setValue(model.getValueAt(row, 3));
        LocalDate ngayNhap = (LocalDate) model.getValueAt(row, 4);
        Date chuyenDoi = Date.from(ngayNhap.atStartOfDay(ZoneId.systemDefault()).toInstant());
        jdc_NgayNhap.setDate(chuyenDoi);
        cbo_MaNhaCungCap.setEnabled(false);
        panel_ThaoTac.remove(cbo_MaNhaCungCap);
        txt_An.setText(model.getValueAt(row, 2).toString());
        txt_An.setEditable(false);
    }//GEN-LAST:event_table_PhieuNhapHangMouseClicked

    private void nhapHang() {
        String maMHN = GenerateID.sinhMa("MHN");
        String maSP = txt_MaSanPham.getText().trim();
        String maNCC = cbo_MaNhaCungCap.getSelectedItem().toString();
        int soLuongNhap = (int) spinner_SoLuong.getValue();
        Date ngayNhap_Date = jdc_NgayNhap.getDate();
        LocalDate ngayNhap_LocalDate = ngayNhap_Date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        SanPhamEntity sp = new SanPhamEntity(maSP);
        NhaCungCapEntity ncc = new NhaCungCapEntity(maNCC);
        MatHangNhapEntity mhn = new MatHangNhapEntity(maMHN, ncc, sp, soLuongNhap, ngayNhap_LocalDate);
        boolean kiemTra = mhn_bus.nhapHang(mhn);
        if (kiemTra) {
            int soLuongHienTai = sp_bus.laySoLuongTonKhoTheoMaSP(maSP);
            int soLuongMoi = soLuongHienTai + soLuongNhap;
            sp_bus.capNhatSoLuong(maSP, soLuongMoi);
            model.addRow(new Object[]{mhn.getSanPham().getMaSP(), mhn.getNhaCungCap().getMaNCC(), mhn.getSoLuongNhap(), mhn.getNgayNhap()});
            lamMoi();
            JOptionPane.showMessageDialog(null, "Thêm thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Thêm không thành công");
        }
    }

    private void timKiemTheoNgay(LocalDate ngayTimKiem) {
        model.setRowCount(0);
        ArrayList<MatHangNhapEntity> dsMHN = mhn_bus.timKiemMHN(ngayTimKiem);
        if (dsMHN.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không có phiếu đặt hàng");
            loadDuLieuTuDataLenTable();
        } else {
            for (MatHangNhapEntity mhn : dsMHN) {
                model.addRow(new Object[]{mhn.getMaMHN(), mhn.getSanPham().getMaSP(), mhn.getNhaCungCap().getMaNCC(), mhn.getSoLuongNhap(), mhn.getNgayNhap()});
            }
        }
    }

    private void lamMoi() {
        txt_MaMatHangNhap.setText("");
        cbo_MaNhaCungCap.setSelectedIndex(0);
        txt_MaSanPham.setText("");
        txt_MaSanPham.setEditable(true);
        spinner_SoLuong.setValue(0);
        jdc_NgayNhap.setDate(new Date());
        jdc_NgayNhap_Search.setDate(new Date());
        model.setRowCount(0);
        loadDuLieuTuDataLenTable();
        cbo_MaNhaCungCap.setEnabled(true);
    }

    public int laySoLuongNhapBanDau(String maMHN) {
        ArrayList<MatHangNhapEntity> dsMHN = mhn_bus.getAllMatHangNhap();
        for (MatHangNhapEntity mhn : dsMHN) {
            if (mhn.getMaMHN().equals(maMHN)) {
                return mhn.getSoLuongNhap();
            }
        }
        return -1;
    }

    private void capNhatMatHangNhap() {
        int row = table_PhieuNhapHang.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Chưa chọn phiếu nhập hàng để cập nhật");
        } else {
            if (table_PhieuNhapHang.getSelectedRowCount() == 1) {
                if (JOptionPane.showConfirmDialog(null, "Bạn có chắc chắc cập nhật phiếu nhập hàng có mã sản phẩm" + table_PhieuNhapHang.getValueAt(row, 0) + " này không?", "Cảnh báo cập nhật", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    String maMHN = txt_MaMatHangNhap.getText();
                    int soLuongNhapMoi = (int) spinner_SoLuong.getValue();
                    int soLuongNhapBanDau = laySoLuongNhapBanDau(maMHN);
                    if (soLuongNhapBanDau != -1) {
                        String maSP = txt_MaSanPham.getText().trim();
                        String maNCC = cbo_MaNhaCungCap.getSelectedItem().toString();
                        int soLuongHT=sp_bus.laySoLuongTonKhoTheoMaSP(txt_MaSanPham.getText().trim()); 
                        int soLuongThayDoi=soLuongNhapBanDau-soLuongNhapMoi;
                        int soLuongMoiCapNhat = soLuongHT - soLuongThayDoi;
                        Date ngayNhap_Date = jdc_NgayNhap.getDate();
                        LocalDate ngayNhap_LocalDate = ngayNhap_Date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                        SanPhamEntity sp = new SanPhamEntity(maSP);
                        NhaCungCapEntity ncc = new NhaCungCapEntity(maNCC);
                        MatHangNhapEntity mhn = new MatHangNhapEntity(maMHN, ncc, sp, soLuongNhapMoi, ngayNhap_LocalDate);
                        boolean kq = mhn_bus.capNhapMatHangNhap(mhn);
                        if (kq) {
                            JOptionPane.showMessageDialog(null, "Cập nhật thành công");
                            sp_bus.capNhatSoLuong(maSP, soLuongMoiCapNhat);
                            lamMoi();
                        } else {
                            JOptionPane.showMessageDialog(null, "Cập nhật không thành công");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Không tìm thấy đơn hàng nhập với mã " + maMHN);
                    }
//                    String maSP = txt_MaMatHangNhap.getText();
//                    String maNCC = cbo_MaNhaCungCap.getSelectedItem().toString();
//                    int soLuongNhap = (int) spinner_SoLuong.getValue();
//                    Date ngayNhap_Date = jdc_NgayNhap.getDate();
//                    LocalDate ngayNhap_LocalDate = ngayNhap_Date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//                    SanPhamEntity sp = new SanPhamEntity(maSP);
//                    NhaCungCapEntity ncc = new NhaCungCapEntity(maNCC);
//                    MatHangNhapEntity mhn = new MatHangNhapEntity(maMHN, ncc, sp, soLuongNhap, ngayNhap_LocalDate);
//                    boolean kq = mhn_bus.capNhapMatHangNhap(mhn);
//                    if (kq) {
//                        JOptionPane.showMessageDialog(null, "Cập nhật thành công");
//                        lamMoi();
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Cập nhật không thành công");
//                    }
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CapNhat;
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_NhapHang;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JComboBox<String> cbo_MaNhaCungCap;
    private com.toedter.calendar.JDateChooser jdc_NgayNhap;
    private com.toedter.calendar.JDateChooser jdc_NgayNhap_Search;
    private javax.swing.JLabel lbl_MaMatHangNhap;
    private javax.swing.JLabel lbl_MaNhaCungCap;
    private javax.swing.JLabel lbl_MaSanPham;
    private javax.swing.JLabel lbl_NgayNhap;
    private javax.swing.JLabel lbl_NgayNhap_Search;
    private javax.swing.JLabel lbl_SoLuong;
    private javax.swing.JLabel lbl_TieuDe;
    private javax.swing.JPanel panel_DanhSachPhieuNhapHang;
    private javax.swing.JPanel panel_ThaoTac;
    private javax.swing.JPanel panel_ThongTin;
    private javax.swing.JScrollPane scroll_TablePhieuNhapHang;
    private javax.swing.JSpinner spinner_SoLuong;
    private javax.swing.JTable table_PhieuNhapHang;
    private DefaultTableModel model;
    private javax.swing.JTextField txt_An;
    private javax.swing.JTextField txt_MaMatHangNhap;
    private javax.swing.JTextField txt_MaSanPham;
    // End of variables declaration//GEN-END:variables
}
