/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

/**
 *
 * @author 84335
 */
public class NhanVien_JPanel extends javax.swing.JPanel {

    /**
     * Creates new form NhanVien_JPanel
     */
    public NhanVien_JPanel() {
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

        panel_QuanLyNV = new javax.swing.JPanel();
        lbl_QuanLyNV = new javax.swing.JLabel();
        panel_ThongTinNV = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_NgaySinhNV = new javax.swing.JLabel();
        lbl_EmailNV = new javax.swing.JLabel();
        txt_HoTenNV = new javax.swing.JLabel();
        lbl_GioiTinhNV = new javax.swing.JLabel();
        lbl_ChucVuNV = new javax.swing.JLabel();
        lbl_SDTNhanVien = new javax.swing.JLabel();
        lbl_DiaChiNV = new javax.swing.JLabel();
        lbl_TinhTrangNV = new javax.swing.JLabel();
        lbl_CaLamViecNV = new javax.swing.JLabel();
        text_emailNV = new javax.swing.JTextField();
        text_HoTenNV = new javax.swing.JTextField();
        text_NgaySinhNV = new javax.swing.JTextField();
        text_SDTNhanVien = new javax.swing.JTextField();
        text_MaNV = new javax.swing.JTextField();
        text_DiaChiNV = new javax.swing.JTextField();
        rad_Nam = new javax.swing.JRadioButton();
        rad_Nu = new javax.swing.JRadioButton();
        rad_Khac = new javax.swing.JRadioButton();
        cbo_ChucVu = new javax.swing.JComboBox<>();
        cbo_TinhTrang = new javax.swing.JComboBox<>();
        cbo_CaLamViec = new javax.swing.JComboBox<>();
        panel_ThaoTaoNV = new javax.swing.JPanel();
        lbl_NhapSDT = new javax.swing.JLabel();
        txt_NhapSDT = new javax.swing.JTextField();
        btn_TimKiem = new javax.swing.JButton();
        btn_TimKiem1 = new javax.swing.JButton();
        btn_TimKiem2 = new javax.swing.JButton();
        btn_TimKiem3 = new javax.swing.JButton();
        panel_TableNhanVien = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_DanhSachNV = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1072, 736));

        panel_QuanLyNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbl_QuanLyNV.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_QuanLyNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_QuanLyNV.setText("Quản Lý Nhân Viên");

        javax.swing.GroupLayout panel_QuanLyNVLayout = new javax.swing.GroupLayout(panel_QuanLyNV);
        panel_QuanLyNV.setLayout(panel_QuanLyNVLayout);
        panel_QuanLyNVLayout.setHorizontalGroup(
            panel_QuanLyNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_QuanLyNVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_QuanLyNV)
                .addGap(445, 445, 445))
        );
        panel_QuanLyNVLayout.setVerticalGroup(
            panel_QuanLyNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_QuanLyNVLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(lbl_QuanLyNV)
                .addContainerGap())
        );

        panel_ThongTinNV.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Mã nhân viên");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        lbl_NgaySinhNV.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_NgaySinhNV.setText("Ngày sinh");

        lbl_EmailNV.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_EmailNV.setText("Email");

        txt_HoTenNV.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txt_HoTenNV.setText("Họ tên");

        lbl_GioiTinhNV.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_GioiTinhNV.setText("Giới tính");

        lbl_ChucVuNV.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_ChucVuNV.setText("Chức vụ");

        lbl_SDTNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_SDTNhanVien.setText("Số điện thoại");

        lbl_DiaChiNV.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_DiaChiNV.setText("Địa chỉ");

        lbl_TinhTrangNV.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_TinhTrangNV.setText("Tình trạng");

        lbl_CaLamViecNV.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_CaLamViecNV.setText("Ca làm việc");

        text_emailNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_emailNVActionPerformed(evt);
            }
        });

        text_HoTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_HoTenNVActionPerformed(evt);
            }
        });

        text_NgaySinhNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_NgaySinhNVActionPerformed(evt);
            }
        });

        text_SDTNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_SDTNhanVienActionPerformed(evt);
            }
        });

        text_MaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_MaNVActionPerformed(evt);
            }
        });

        text_DiaChiNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_DiaChiNVActionPerformed(evt);
            }
        });

        rad_Nam.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        rad_Nam.setText("Nam");

        rad_Nu.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        rad_Nu.setText("Nữ");

        rad_Khac.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        rad_Khac.setText("Khác");

        cbo_ChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_ChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_ChucVuActionPerformed(evt);
            }
        });

        cbo_TinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbo_CaLamViec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panel_ThongTinNVLayout = new javax.swing.GroupLayout(panel_ThongTinNV);
        panel_ThongTinNV.setLayout(panel_ThongTinNVLayout);
        panel_ThongTinNVLayout.setHorizontalGroup(
            panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThongTinNVLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ThongTinNVLayout.createSequentialGroup()
                        .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_ThongTinNVLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(text_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_ThongTinNVLayout.createSequentialGroup()
                                .addComponent(txt_HoTenNV)
                                .addGap(61, 61, 61)
                                .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_ThongTinNVLayout.createSequentialGroup()
                                        .addComponent(rad_Nam)
                                        .addGap(18, 18, 18)
                                        .addComponent(rad_Nu)
                                        .addGap(18, 18, 18)
                                        .addComponent(rad_Khac))
                                    .addComponent(text_HoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_ThongTinNVLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_ChucVuNV)
                                .addGap(18, 18, 18)
                                .addComponent(cbo_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_TinhTrangNV))
                            .addGroup(panel_ThongTinNVLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_NgaySinhNV)
                                    .addComponent(lbl_EmailNV))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_NgaySinhNV, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_emailNV, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panel_ThongTinNVLayout.createSequentialGroup()
                        .addComponent(lbl_GioiTinhNV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ThongTinNVLayout.createSequentialGroup()
                        .addComponent(cbo_TinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lbl_CaLamViecNV)
                        .addGap(18, 18, 18)
                        .addComponent(cbo_CaLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ThongTinNVLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_DiaChiNV)
                            .addComponent(lbl_SDTNhanVien))
                        .addGap(26, 26, 26)
                        .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_SDTNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_DiaChiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addComponent(jLabel2)
                .addGap(315, 315, 315))
        );
        panel_ThongTinNVLayout.setVerticalGroup(
            panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThongTinNVLayout.createSequentialGroup()
                .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ThongTinNVLayout.createSequentialGroup()
                        .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_ThongTinNVLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2))
                            .addGroup(panel_ThongTinNVLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(text_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_HoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_HoTenNV)))
                    .addGroup(panel_ThongTinNVLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_ThongTinNVLayout.createSequentialGroup()
                                .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_SDTNhanVien)
                                    .addComponent(text_SDTNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_DiaChiNV)
                                    .addComponent(text_DiaChiNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_ThongTinNVLayout.createSequentialGroup()
                                .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(text_NgaySinhNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_NgaySinhNV))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_emailNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_EmailNV))))
                        .addGap(31, 31, 31)
                        .addGroup(panel_ThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_CaLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_GioiTinhNV)
                            .addComponent(lbl_ChucVuNV)
                            .addComponent(rad_Nam)
                            .addComponent(rad_Nu)
                            .addComponent(rad_Khac)
                            .addComponent(cbo_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_TinhTrangNV)
                            .addComponent(cbo_TinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_CaLamViecNV))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_ThaoTaoNV.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Các thao tác", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

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

        javax.swing.GroupLayout panel_ThaoTaoNVLayout = new javax.swing.GroupLayout(panel_ThaoTaoNV);
        panel_ThaoTaoNV.setLayout(panel_ThaoTaoNVLayout);
        panel_ThaoTaoNVLayout.setHorizontalGroup(
            panel_ThaoTaoNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThaoTaoNVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_NhapSDT)
                .addGap(28, 28, 28)
                .addComponent(txt_NhapSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btn_TimKiem)
                .addGap(18, 18, 18)
                .addComponent(btn_TimKiem1)
                .addGap(18, 18, 18)
                .addComponent(btn_TimKiem2)
                .addGap(18, 18, 18)
                .addComponent(btn_TimKiem3)
                .addGap(72, 72, 72))
        );
        panel_ThaoTaoNVLayout.setVerticalGroup(
            panel_ThaoTaoNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThaoTaoNVLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel_ThaoTaoNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NhapSDT)
                    .addComponent(txt_NhapSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TimKiem)
                    .addComponent(btn_TimKiem1)
                    .addComponent(btn_TimKiem2)
                    .addComponent(btn_TimKiem3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_TableNhanVien.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bảng danh sách nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        table_DanhSachNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Họ tên", "Giới tính", "Số điện thoại", "Địa chỉ", "Chức vụ", "Tình trạng", "Ca làm việc"
            }
        ));
        jScrollPane1.setViewportView(table_DanhSachNV);

        javax.swing.GroupLayout panel_TableNhanVienLayout = new javax.swing.GroupLayout(panel_TableNhanVien);
        panel_TableNhanVien.setLayout(panel_TableNhanVienLayout);
        panel_TableNhanVienLayout.setHorizontalGroup(
            panel_TableNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_TableNhanVienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        panel_TableNhanVienLayout.setVerticalGroup(
            panel_TableNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_TableNhanVienLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_TableNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panel_ThongTinNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panel_ThaoTaoNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_QuanLyNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_QuanLyNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_ThongTinNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_ThaoTaoNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_TableNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void text_emailNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_emailNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_emailNVActionPerformed

    private void text_HoTenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_HoTenNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_HoTenNVActionPerformed

    private void text_NgaySinhNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_NgaySinhNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_NgaySinhNVActionPerformed

    private void text_SDTNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_SDTNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_SDTNhanVienActionPerformed

    private void text_MaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_MaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_MaNVActionPerformed

    private void text_DiaChiNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_DiaChiNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_DiaChiNVActionPerformed

    private void cbo_ChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_ChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_ChucVuActionPerformed

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
    private javax.swing.JComboBox<String> cbo_CaLamViec;
    private javax.swing.JComboBox<String> cbo_ChucVu;
    private javax.swing.JComboBox<String> cbo_TinhTrang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_CaLamViecNV;
    private javax.swing.JLabel lbl_ChucVuNV;
    private javax.swing.JLabel lbl_DiaChiNV;
    private javax.swing.JLabel lbl_EmailNV;
    private javax.swing.JLabel lbl_GioiTinhNV;
    private javax.swing.JLabel lbl_NgaySinhNV;
    private javax.swing.JLabel lbl_NhapSDT;
    private javax.swing.JLabel lbl_QuanLyNV;
    private javax.swing.JLabel lbl_SDTNhanVien;
    private javax.swing.JLabel lbl_TinhTrangNV;
    private javax.swing.JPanel panel_QuanLyNV;
    private javax.swing.JPanel panel_TableNhanVien;
    private javax.swing.JPanel panel_ThaoTaoNV;
    private javax.swing.JPanel panel_ThongTinNV;
    private javax.swing.JRadioButton rad_Khac;
    private javax.swing.JRadioButton rad_Nam;
    private javax.swing.JRadioButton rad_Nu;
    private javax.swing.JTable table_DanhSachNV;
    private javax.swing.JTextField text_DiaChiNV;
    private javax.swing.JTextField text_HoTenNV;
    private javax.swing.JTextField text_MaNV;
    private javax.swing.JTextField text_NgaySinhNV;
    private javax.swing.JTextField text_SDTNhanVien;
    private javax.swing.JTextField text_emailNV;
    private javax.swing.JLabel txt_HoTenNV;
    private javax.swing.JTextField txt_NhapSDT;
    // End of variables declaration//GEN-END:variables
}
