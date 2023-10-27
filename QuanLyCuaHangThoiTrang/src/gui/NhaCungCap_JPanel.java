/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 84335
 */
public class NhaCungCap_JPanel extends javax.swing.JPanel {

    /**
     * Creates new form NhaCungCap_JPanel
     */
    public NhaCungCap_JPanel() {
        initComponents();
        setBounds(0, 0, 1020, 720);
        ImageIcon img_btnTimKiem = new ImageIcon("src//pic//buttonTimKiem.png");
        Image scaled_btnTimKiem = img_btnTimKiem.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnTimKiem = new ImageIcon(scaled_btnTimKiem);
        btn_TimKiem.setIcon(img_btnTimKiem);
        ImageIcon img_btnLamMoi = new ImageIcon("src//pic//buttonLamMoi.png");
        Image scaled_btnLamMoi = img_btnLamMoi.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnLamMoi = new ImageIcon(scaled_btnLamMoi);
        btn_LamMoi.setIcon(img_btnLamMoi);
        ImageIcon img_btnThem = new ImageIcon("src//pic//buttonThem.png");
        Image scaled_btnThem = img_btnThem.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnThem = new ImageIcon(scaled_btnThem);
        btn_Them.setIcon(img_btnThem);
        ImageIcon img_btnCapNhat = new ImageIcon("src//pic//buttonCapNhat.png");
        Image scaled_btnCapNhat = img_btnCapNhat.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnCapNhat = new ImageIcon(scaled_btnCapNhat);
        btn_CapNhat.setIcon(img_btnCapNhat);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_ThongTin = new javax.swing.JPanel();
        lbl_MaNhaCungCap = new javax.swing.JLabel();
        lbl_TenNhaCungCap = new javax.swing.JLabel();
        txt_MaNhaCungCap = new javax.swing.JTextField();
        txt_TenNhaCungCap = new javax.swing.JTextField();
        lbl_SoDienThoai = new javax.swing.JLabel();
        lbl_DiaChi = new javax.swing.JLabel();
        txt_SoDienThoai = new javax.swing.JTextField();
        txt_DiaChi = new javax.swing.JTextField();
        lbl_TinhTrang = new javax.swing.JLabel();
        cbo_TinhTrang = new javax.swing.JComboBox<>();
        panel_ThaoTac = new javax.swing.JPanel();
        lbl_MaNhaCungCap_Search = new javax.swing.JLabel();
        txt_MaNhaCungCap_Search = new javax.swing.JTextField();
        btn_TimKiem = new javax.swing.JButton();
        btn_LamMoi = new javax.swing.JButton();
        btn_Them = new javax.swing.JButton();
        btn_CapNhat = new javax.swing.JButton();
        panel_DanhSachNhaCungCap = new javax.swing.JPanel();
        srcoll_TableNhaCungCap = new javax.swing.JScrollPane();
        Object[][] data = {{}};
        String[] columnNames = {"Mã", "Tên", "Số điện thoại", "Địa chỉ", "Tình trạng"};
        model=new DefaultTableModel(data, columnNames){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        table_DanhSachNhaCungCap = new javax.swing.JTable();
        lbl_TieuDe = new javax.swing.JLabel();

        setBackground(new java.awt.Color(187, 205, 197));
        setPreferredSize(new java.awt.Dimension(1020, 700));

        panel_ThongTin.setBackground(new java.awt.Color(187, 205, 197));
        panel_ThongTin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông tin nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        panel_ThongTin.setPreferredSize(new java.awt.Dimension(998, 87));

        lbl_MaNhaCungCap.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_MaNhaCungCap.setText("Mã nhà cung cấp");
        lbl_MaNhaCungCap.setPreferredSize(new java.awt.Dimension(85, 15));

        lbl_TenNhaCungCap.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_TenNhaCungCap.setText("Tên nhà cung cấp");
        lbl_TenNhaCungCap.setPreferredSize(new java.awt.Dimension(85, 15));

        txt_MaNhaCungCap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_MaNhaCungCap.setPreferredSize(new java.awt.Dimension(68, 26));

        txt_TenNhaCungCap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lbl_SoDienThoai.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_SoDienThoai.setText("Số điện thoại");
        lbl_SoDienThoai.setPreferredSize(new java.awt.Dimension(85, 15));

        lbl_DiaChi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_DiaChi.setText("Địa chỉ");
        lbl_DiaChi.setMaximumSize(new java.awt.Dimension(82, 15));
        lbl_DiaChi.setMinimumSize(new java.awt.Dimension(82, 15));
        lbl_DiaChi.setPreferredSize(new java.awt.Dimension(85, 15));

        txt_SoDienThoai.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txt_DiaChi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lbl_TinhTrang.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_TinhTrang.setText("Tình trạng");
        lbl_TinhTrang.setPreferredSize(new java.awt.Dimension(85, 15));

        cbo_TinhTrang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbo_TinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã nhập", "Đang nhập" }));

        javax.swing.GroupLayout panel_ThongTinLayout = new javax.swing.GroupLayout(panel_ThongTin);
        panel_ThongTin.setLayout(panel_ThongTinLayout);
        panel_ThongTinLayout.setHorizontalGroup(
            panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_MaNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(lbl_TenNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_MaNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txt_TenNhaCungCap))
                .addGap(38, 38, 38)
                .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ThongTinLayout.createSequentialGroup()
                        .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ThongTinLayout.createSequentialGroup()
                        .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lbl_TinhTrang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbo_TinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_ThongTinLayout.setVerticalGroup(
            panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThongTinLayout.createSequentialGroup()
                .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_MaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_MaNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_TinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        panel_ThaoTac.setBackground(new java.awt.Color(187, 205, 197));
        panel_ThaoTac.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Các thao tác", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N

        lbl_MaNhaCungCap_Search.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_MaNhaCungCap_Search.setText("Mã nhà cung cấp");

        btn_TimKiem.setBackground(new java.awt.Color(0, 51, 51));
        btn_TimKiem.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_TimKiem.setForeground(java.awt.Color.white);
        btn_TimKiem.setText("Tìm kiếm");
        btn_TimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_TimKiem.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        btn_LamMoi.setBackground(new java.awt.Color(0, 51, 51));
        btn_LamMoi.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_LamMoi.setForeground(java.awt.Color.white);
        btn_LamMoi.setText("Làm mới");
        btn_LamMoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_LamMoi.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_LamMoi.setPreferredSize(new java.awt.Dimension(90, 31));

        btn_Them.setBackground(new java.awt.Color(0, 51, 51));
        btn_Them.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_Them.setForeground(java.awt.Color.white);
        btn_Them.setText("Thêm");
        btn_Them.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Them.setPreferredSize(new java.awt.Dimension(90, 31));

        btn_CapNhat.setBackground(new java.awt.Color(0, 51, 51));
        btn_CapNhat.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_CapNhat.setForeground(java.awt.Color.white);
        btn_CapNhat.setText("Cập nhật");
        btn_CapNhat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_CapNhat.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_CapNhat.setPreferredSize(new java.awt.Dimension(90, 31));

        javax.swing.GroupLayout panel_ThaoTacLayout = new javax.swing.GroupLayout(panel_ThaoTac);
        panel_ThaoTac.setLayout(panel_ThaoTacLayout);
        panel_ThaoTacLayout.setHorizontalGroup(
            panel_ThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThaoTacLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_MaNhaCungCap_Search)
                .addGap(26, 26, 26)
                .addComponent(txt_MaNhaCungCap_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_LamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_ThaoTacLayout.setVerticalGroup(
            panel_ThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_ThaoTacLayout.createSequentialGroup()
                .addGroup(panel_ThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_MaNhaCungCap_Search)
                    .addComponent(txt_MaNhaCungCap_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_LamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        panel_DanhSachNhaCungCap.setBackground(new java.awt.Color(187, 205, 197));
        panel_DanhSachNhaCungCap.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Bảng danh sách nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        panel_DanhSachNhaCungCap.setPreferredSize(new java.awt.Dimension(466, 486));

        table_DanhSachNhaCungCap.setModel(model);
        srcoll_TableNhaCungCap.setViewportView(table_DanhSachNhaCungCap);

        javax.swing.GroupLayout panel_DanhSachNhaCungCapLayout = new javax.swing.GroupLayout(panel_DanhSachNhaCungCap);
        panel_DanhSachNhaCungCap.setLayout(panel_DanhSachNhaCungCapLayout);
        panel_DanhSachNhaCungCapLayout.setHorizontalGroup(
            panel_DanhSachNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(srcoll_TableNhaCungCap)
        );
        panel_DanhSachNhaCungCapLayout.setVerticalGroup(
            panel_DanhSachNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(srcoll_TableNhaCungCap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        lbl_TieuDe.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_TieuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TieuDe.setText("QUẢN LÝ NHÀ CUNG CẤP");
        lbl_TieuDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_ThaoTac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_DanhSachNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
                    .addComponent(panel_ThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE))
                .addGap(5, 5, 5))
            .addComponent(lbl_TieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_ThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_ThaoTac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_DanhSachNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CapNhat;
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JComboBox<String> cbo_TinhTrang;
    private javax.swing.JLabel lbl_DiaChi;
    private javax.swing.JLabel lbl_MaNhaCungCap;
    private javax.swing.JLabel lbl_MaNhaCungCap_Search;
    private javax.swing.JLabel lbl_SoDienThoai;
    private javax.swing.JLabel lbl_TenNhaCungCap;
    private javax.swing.JLabel lbl_TieuDe;
    private javax.swing.JLabel lbl_TinhTrang;
    private javax.swing.JPanel panel_DanhSachNhaCungCap;
    private javax.swing.JPanel panel_ThaoTac;
    private javax.swing.JPanel panel_ThongTin;
    private javax.swing.JScrollPane srcoll_TableNhaCungCap;
    private javax.swing.JTable table_DanhSachNhaCungCap;
    private DefaultTableModel model;
    private javax.swing.JTextField txt_DiaChi;
    private javax.swing.JTextField txt_MaNhaCungCap;
    private javax.swing.JTextField txt_MaNhaCungCap_Search;
    private javax.swing.JTextField txt_SoDienThoai;
    private javax.swing.JTextField txt_TenNhaCungCap;
    // End of variables declaration//GEN-END:variables

}