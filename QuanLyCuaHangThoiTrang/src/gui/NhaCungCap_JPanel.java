/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import bus.NhaCungCap_bus;
import entity.NhaCungCapEntity;
import entity.TinhTrangNCCEnum;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;
import util.GenerateID;

/**
 *
 * @author 84335
 */
public class NhaCungCap_JPanel extends javax.swing.JPanel {

    private NhaCungCap_bus ncc_bus;

    /**
     * Creates new form NhaCungCap_JPanel
     */
    public NhaCungCap_JPanel() {
        initComponents();
        //---------
        ncc_bus = new NhaCungCap_bus();
        //---------
        setBounds(0, 0, 1020, 720);
        ImageIcon img_btnTimKiem = new ImageIcon("src//pic//buttonTimKiem.png");
        Image scaled_btnTimKiem = img_btnTimKiem.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnTimKiem = new ImageIcon(scaled_btnTimKiem);
        btn_TimKiem.setIcon(img_btnTimKiem);
        ImageIcon img_btnLamMoi = new ImageIcon("src//pic//icon//buttonLamMoi.png");
        Image scaled_btnLamMoi = img_btnLamMoi.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnLamMoi = new ImageIcon(scaled_btnLamMoi);
        btn_LamMoi.setIcon(img_btnLamMoi);
        ImageIcon img_btnThem = new ImageIcon("src//pic//icon//buttonThem.png");
        Image scaled_btnThem = img_btnThem.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnThem = new ImageIcon(scaled_btnThem);
        btn_Them.setIcon(img_btnThem);
        ImageIcon img_btnCapNhat = new ImageIcon("src//pic//icon//buttonCapNhat.png");
        Image scaled_btnCapNhat = img_btnCapNhat.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnCapNhat = new ImageIcon(scaled_btnCapNhat);
        btn_CapNhat.setIcon(img_btnCapNhat);
        ImageIcon img_btnLoc = new ImageIcon("src//pic//icon//buttonLoc.png");
        Image scaled_btnLoc = img_btnLoc.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnLoc = new ImageIcon(scaled_btnLoc);
        btn_Loc.setIcon(img_btnLoc);
        loadDuLieuTuDataLenTable();
        txt_TenNhaCungCap.setText("Cty TNHH An Thành");
        txt_SoDienThoai.setText("0345682887");
        txt_DiaChi.setText("Quận Bình Thạnh, TPHCM");

    }

    private void loadDuLieuTuDataLenTable() {
        ArrayList<NhaCungCapEntity> dsNCC = ncc_bus.getAllNhaCungCap();
        for (NhaCungCapEntity ncc : dsNCC) {
            model.addRow(new Object[]{ncc.getMaNCC(), ncc.getTenNCC(), ncc.getSoDienThoai(), ncc.getDiaChi(), ncc.getTinhTrang()});
        }
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
        btn_Loc = new javax.swing.JButton();
        panel_DanhSachNhaCungCap = new javax.swing.JPanel();
        srcoll_TableNhaCungCap = new javax.swing.JScrollPane();
        Object[][] data = {};
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
        txt_MaNhaCungCap.setEditable(false);

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
        cbo_TinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang nhập", "Ngừng nhập" }));

        javax.swing.GroupLayout panel_ThongTinLayout = new javax.swing.GroupLayout(panel_ThongTin);
        panel_ThongTin.setLayout(panel_ThongTinLayout);
        panel_ThongTinLayout.setHorizontalGroup(
            panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThongTinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ThongTinLayout.createSequentialGroup()
                        .addComponent(lbl_MaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_MaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ThongTinLayout.createSequentialGroup()
                        .addComponent(lbl_TenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_TenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(lbl_TinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(cbo_TinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_ThongTinLayout.setVerticalGroup(
            panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThongTinLayout.createSequentialGroup()
                .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ThongTinLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl_MaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ThongTinLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txt_MaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ThongTinLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ThongTinLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_TinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_ThongTinLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cbo_TinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_ThongTinLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txt_TenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ThongTinLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ThongTinLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        panel_ThaoTac.setBackground(new java.awt.Color(187, 205, 197));
        panel_ThaoTac.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Các thao tác", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        panel_ThaoTac.setPreferredSize(new java.awt.Dimension(990, 50));

        lbl_MaNhaCungCap_Search.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_MaNhaCungCap_Search.setText("Mã nhà cung cấp");

        txt_MaNhaCungCap_Search.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

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

        btn_Them.setBackground(new java.awt.Color(0, 51, 51));
        btn_Them.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_Them.setForeground(java.awt.Color.white);
        btn_Them.setText("Thêm");
        btn_Them.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Them.setPreferredSize(new java.awt.Dimension(90, 31));
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
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

        btn_Loc.setBackground(new java.awt.Color(0, 51, 51));
        btn_Loc.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_Loc.setForeground(java.awt.Color.white);
        btn_Loc.setText("Lọc");
        btn_Loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ThaoTacLayout = new javax.swing.GroupLayout(panel_ThaoTac);
        panel_ThaoTac.setLayout(panel_ThaoTacLayout);
        panel_ThaoTacLayout.setHorizontalGroup(
            panel_ThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThaoTacLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbl_MaNhaCungCap_Search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_MaNhaCungCap_Search)
                .addGap(18, 18, 18)
                .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_LamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_ThaoTacLayout.setVerticalGroup(
            panel_ThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThaoTacLayout.createSequentialGroup()
                .addGroup(panel_ThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ThaoTacLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txt_MaNhaCungCap_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ThaoTacLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel_ThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_LamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_ThaoTacLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lbl_MaNhaCungCap_Search)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_DanhSachNhaCungCap.setBackground(new java.awt.Color(187, 205, 197));
        panel_DanhSachNhaCungCap.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Bảng danh sách nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        panel_DanhSachNhaCungCap.setPreferredSize(new java.awt.Dimension(466, 486));

        JTableHeader tableHeader=table_DanhSachNhaCungCap.getTableHeader();
        tableHeader.setFont(new Font("Times New Roman", Font.BOLD, 13));
        table_DanhSachNhaCungCap.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        table_DanhSachNhaCungCap.setModel(model);
        table_DanhSachNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_DanhSachNhaCungCapMouseClicked(evt);
            }
        });
        srcoll_TableNhaCungCap.setViewportView(table_DanhSachNhaCungCap);

        javax.swing.GroupLayout panel_DanhSachNhaCungCapLayout = new javax.swing.GroupLayout(panel_DanhSachNhaCungCap);
        panel_DanhSachNhaCungCap.setLayout(panel_DanhSachNhaCungCapLayout);
        panel_DanhSachNhaCungCapLayout.setHorizontalGroup(
            panel_DanhSachNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(srcoll_TableNhaCungCap)
        );
        panel_DanhSachNhaCungCapLayout.setVerticalGroup(
            panel_DanhSachNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(srcoll_TableNhaCungCap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        lbl_TieuDe.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_TieuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TieuDe.setText("QUẢN LÝ NHÀ CUNG CẤP");
        lbl_TieuDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_TieuDe.setPreferredSize(new java.awt.Dimension(675, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_TieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_ThongTin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                    .addComponent(panel_DanhSachNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                    .addComponent(panel_ThaoTac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(7, 7, 7)
                .addComponent(panel_DanhSachNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        // TODO add your handling code here:
        themNhaCungCap();
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        // TODO add your handling code here:
//        timKiemNhaCungCap();
        String dieuKien = txt_MaNhaCungCap_Search.getText();
        timkiemNhaCungCap(dieuKien);
    }//GEN-LAST:event_btn_TimKiemActionPerformed

    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
        // TODO add your handling code here:
        lamMoi();
    }//GEN-LAST:event_btn_LamMoiActionPerformed

    private void table_DanhSachNhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_DanhSachNhaCungCapMouseClicked
        // TODO add your handling code here:
        int row = table_DanhSachNhaCungCap.getSelectedRow();
        txt_MaNhaCungCap.setText(model.getValueAt(row, 0).toString());
        txt_TenNhaCungCap.setText(model.getValueAt(row, 1).toString());
        txt_SoDienThoai.setText(model.getValueAt(row, 2).toString());
        txt_DiaChi.setText(model.getValueAt(row, 3).toString());
        cbo_TinhTrang.setSelectedItem(model.getValueAt(row, 4).toString());
    }//GEN-LAST:event_table_DanhSachNhaCungCapMouseClicked

    private void btn_LocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LocActionPerformed
        // TODO add your handling code here:
        String tinhTrang = (String) cbo_TinhTrang.getSelectedItem();
        loc(tinhTrang);
    }//GEN-LAST:event_btn_LocActionPerformed

    private void btn_CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CapNhatActionPerformed
        // TODO add your handling code here:
        capNhatNhaCungCap();
    }//GEN-LAST:event_btn_CapNhatActionPerformed
    private void themNhaCungCap() {
        String maNCC = GenerateID.sinhMa("NCC");
        String tenNCC = txt_TenNhaCungCap.getText();
        String soDienThoai = txt_SoDienThoai.getText();
        String diaChi = txt_DiaChi.getText();
        TinhTrangNCCEnum tinhTrang = null;
        if (cbo_TinhTrang.getSelectedItem().equals("Đang nhập")) {
            tinhTrang = TinhTrangNCCEnum.DANGNHAP;
        } else if (cbo_TinhTrang.getSelectedItem().equals("Ngừng nhập")) {
            tinhTrang = TinhTrangNCCEnum.NGUNGNHAP;
        }
        NhaCungCapEntity ncc = new NhaCungCapEntity(maNCC, tenNCC, diaChi, soDienThoai, tinhTrang);
        boolean kiemTra = ncc_bus.themNCC(ncc);
        if (kiemTra) {
            model.addRow(new Object[]{ncc.getMaNCC(), ncc.getTenNCC(), ncc.getSoDienThoai(), ncc.getDiaChi(), ncc.getTinhTrang()});
            lamMoi();
            JOptionPane.showMessageDialog(null, "Thêm thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Thêm không thành công");
        }
    }

    // Hàm tìm kiếm nhà cung cấp và hiển thị kết quả trên bảng
    private void timkiemNhaCungCap(String dieuKien) {
        model.setRowCount(0);
        ArrayList<NhaCungCapEntity> dsNCC = ncc_bus.getAllNhaCungCap();
        for (NhaCungCapEntity ncc : dsNCC) {
            if (ncc.matchesSearchTerm(dieuKien)) {
                model.addRow(new Object[]{ncc.getMaNCC(), ncc.getTenNCC(), ncc.getSoDienThoai(), ncc.getDiaChi(), ncc.getTinhTrang().toString()});
            }
        }
    }

    private void lamMoi() {
        txt_MaNhaCungCap.setText("");
        txt_TenNhaCungCap.setText("");
        txt_SoDienThoai.setText("");
        txt_DiaChi.setText("");
        cbo_TinhTrang.setSelectedItem("Đang nhập");
        txt_MaNhaCungCap_Search.setText("");
        model.setRowCount(0);
        resetLoc();
        loadDuLieuTuDataLenTable();
    }

    private void loc(String ma) {
        DefaultTableModel data = (DefaultTableModel) table_DanhSachNhaCungCap.getModel();
        TableRowSorter<DefaultTableModel> sort = new TableRowSorter<DefaultTableModel>(data);
        table_DanhSachNhaCungCap.setRowSorter(sort);
        sort.setRowFilter(RowFilter.regexFilter(ma));
    }

    private void resetLoc() {
        DefaultTableModel data = (DefaultTableModel) table_DanhSachNhaCungCap.getModel();
        TableRowSorter<DefaultTableModel> sort = (TableRowSorter<DefaultTableModel>) table_DanhSachNhaCungCap.getRowSorter();
        if (sort != null) {
            sort.setRowFilter(null); // Xóa bộ lọc
            table_DanhSachNhaCungCap.setRowSorter(null); // Loại bỏ RowSorter
        }
    }

    private void capNhatNhaCungCap() {
        int row = table_DanhSachNhaCungCap.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Chưa chọn nhà cung cấp để cập nhật");
        } else {
            if (table_DanhSachNhaCungCap.getSelectedRowCount() == 1) {
                if (JOptionPane.showConfirmDialog(null, "Bạn có chắc chắc cập nhật nhà cung cấp có mã " + table_DanhSachNhaCungCap.getValueAt(row, 0) + " này không?", "Cảnh báo cập nhật", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    String maNCC = txt_MaNhaCungCap.getText();
                    String tenNCC = txt_TenNhaCungCap.getText();
                    String soDienThoai = txt_SoDienThoai.getText();
                    String diaChi = txt_DiaChi.getText();
                    TinhTrangNCCEnum tinhTrang = null;
                    if (cbo_TinhTrang.getSelectedIndex() == 0) {
                        tinhTrang = TinhTrangNCCEnum.DANGNHAP;
                    } else if (cbo_TinhTrang.getSelectedIndex() == 1) {
                        tinhTrang = TinhTrangNCCEnum.NGUNGNHAP;
                    }
                    NhaCungCapEntity ncc = new NhaCungCapEntity(maNCC, tenNCC, diaChi, soDienThoai, tinhTrang);
                    boolean kq=ncc_bus.capNhatNhaCungCap(ncc);
                    if(kq){
                        JOptionPane.showMessageDialog(null, "Cập nhật thành công");
                        lamMoi();
                    }else{
                        JOptionPane.showMessageDialog(null, "Cập nhật không thành công");
                    }
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CapNhat;
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_Loc;
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
