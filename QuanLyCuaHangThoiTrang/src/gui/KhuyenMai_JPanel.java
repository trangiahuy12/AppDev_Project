package gui;

import bus.ChuongTrinhKhuyenMai_bus;
import connectDB.ConnectDB;
import entity.ChuongTrinhKhuyenMaiEntity;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author 84335
 */
public class KhuyenMai_JPanel extends javax.swing.JPanel {

    private final ChuongTrinhKhuyenMai_bus ctkmbus;
    private DefaultTableModel model;

    /**
     * Creates new form KhuyenMai_JPanel
     */
    public KhuyenMai_JPanel() {
        initComponents();
         try {
             ConnectDB.getInstance().connect();
        } catch (Exception e) {
        }
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

        ImageIcon img_btnXoa = new ImageIcon("src//pic//buttonXoa.png");
        Image scaled_btnXoa = img_btnXoa.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        img_btnXoa = new ImageIcon(scaled_btnXoa);
        btn_Xoa.setIcon(img_btnXoa);
        ctkmbus = new ChuongTrinhKhuyenMai_bus();
//             DocDuLieuTuSQLvaoTable();

        DocDuLieuTuSQLvaoTable();
    }

    private void DocDuLieuTuSQLvaoTable() {
        ArrayList<ChuongTrinhKhuyenMaiEntity> listCTKM = ctkmbus.getallCTKM();
        for (ChuongTrinhKhuyenMaiEntity ctkm : listCTKM) {
            addRows(new Object[]{ctkm.getMaCTKM(), ctkm.getTenCTKM(), ctkm.getSoTienToiThieu(), ctkm.getGiamGia(), ctkm.getNgayBatDau(), ctkm.getNgayKetThuc()});
        }
    }

    public void addRows(Object[] row) {
        model = (DefaultTableModel) jTable1.getModel();
        model.addRow(row);
    }

    private void XoahetDuLieuTrenTable() {
        DefaultTableModel md = (DefaultTableModel) jTable1.getModel();
        md.getDataVector().removeAllElements();
    }

    private void LamMoi() {
        txtMaCTKM.setText("");
        txtTenCTKM.setText("");
        txtSoTienGiam.setText("");
        txtGiamGia.setText("");
        dateNgayBatDau.setDate(null);
        dateNgayKetThuc.setDate(null);
        txtTimMaCTKM.setText("");
    }

    private void Tim() {
        try {
            String maTim = txtTimMaCTKM.getText();
            if (maTim.equals("")) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập vào ô tìm kiếm");

            } else {
                ArrayList<ChuongTrinhKhuyenMaiEntity> listCTKM = null;
                listCTKM = ctkmbus.getCTKMTheoMaCTKM(maTim);
                if (!listCTKM.isEmpty()) {
                    XoahetDuLieuTrenTable();
                    for (ChuongTrinhKhuyenMaiEntity ctkm : listCTKM) {
                        addRows(new Object[]{ctkm.getMaCTKM(), ctkm.getTenCTKM(), ctkm.getSoTienToiThieu(), ctkm.getGiamGia(), ctkm.getNgayBatDau(), ctkm.getNgayKetThuc()});
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void DocDuLieuTrenTable() {
        int row = jTable1.getSelectedRow();
        txtMaCTKM.setText(jTable1.getValueAt(row, 0).toString());
        txtTenCTKM.setText(jTable1.getValueAt(row, 1).toString());
        txtSoTienGiam.setText(jTable1.getValueAt(row, 2).toString());
        txtGiamGia.setText(jTable1.getValueAt(row, 3).toString());
        try {
            dateNgayBatDau.setDate((Date) jTable1.getValueAt(row, 4));
            dateNgayKetThuc.setDate((Date) jTable1.getValueAt(row, 5));

        } catch (Exception e) {
            String dateStringBD = jTable1.getValueAt(row, 4).toString();
            String dateStringKT = jTable1.getValueAt(row, 4).toString();
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-đd");
            try {
                java.util.Date utilDateBD = outputFormat.parse(dateStringBD);
                java.util.Date utilDateKT = outputFormat.parse(dateStringKT);
                java.sql.Date sqlDateBD = new java.sql.Date(utilDateBD.getTime());
                java.sql.Date sqlDateKT = new java.sql.Date(utilDateKT.getTime());
                dateNgayBatDau.setDate(sqlDateBD);
                dateNgayKetThuc.setDate(sqlDateKT);
            } catch (ParseException e1) {
                e1.printStackTrace();

            }
        }
    }

    private void ThemMoi() {
        String ma = PhatSinhMaCTKM();
        String ten = txtTenCTKM.getText();
        double sotien = Double.parseDouble(txtGiamGia.getText());
        int giamgia = Integer.parseInt(txtGiamGia.getText());
        java.sql.Date ngayBD = new java.sql.Date(dateNgayBatDau.getDate().getTime());
        java.sql.Date ngayKT = new java.sql.Date(dateNgayKetThuc.getDate().getTime());
        ChuongTrinhKhuyenMaiEntity ctkm = new ChuongTrinhKhuyenMaiEntity(ma, ten, sotien, giamgia, ngayBD, ngayKT);
        try {
            ctkmbus.create(ctkm);
            addRows(new Object[]{ctkm.getMaCTKM(), ctkm.getTenCTKM(), ctkm.getSoTienToiThieu(), ctkm.getGiamGia(), ctkm.getNgayBatDau(), ctkm.getNgayKetThuc()});

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Trùng mã");
            e.printStackTrace();
        }
    }

    private void Xoa() {
        int row = jTable1.getSelectedRow();
        String ma = txtMaCTKM.getText();
        ChuongTrinhKhuyenMaiEntity ctkm = new ChuongTrinhKhuyenMaiEntity(ma);
        try {
            System.out.println(row);
            if (row > 0) {
                int yn = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xoá ?", "Chú Ý !", JOptionPane.YES_NO_OPTION);
                if (yn == JOptionPane.YES_OPTION) {
                    ctkmbus.delete(ctkm);
                    XoaRows(row);
                    JOptionPane.showMessageDialog(null, "Xoá thành công !");
                } else {
                    JOptionPane.showMessageDialog(null, "Xoá thất bại !");
                }
            }
            JOptionPane.showMessageDialog(null, "Chưa chọn dữ liệu cần xoá !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Chưa chọn dữ liệu cần xoá !");
            e.printStackTrace();
        }
        LamMoi();

    }

    private void XoaRows(int row) {
        model.removeRow(row);
    }

    private String PhatSinhMaCTKM() {

        Date datenow = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyHHmmss");
        String formattedDate = dateFormat.format(datenow);
        String maPhatSinhCTKM = "KM" + formattedDate;
        return maPhatSinhCTKM;

    }

    private void CapNhat() {
        try {
            String ma = txtMaCTKM.getText();
            String ten = txtTenCTKM.getText();
            Double sotienTT = Double.parseDouble(txtSoTienGiam.getText());
            int giam = Integer.parseInt(txtGiamGia.getText());
            java.sql.Date ngayBD = new java.sql.Date(dateNgayBatDau.getDate().getTime());
            java.sql.Date ngayKT = new java.sql.Date(dateNgayKetThuc.getDate().getTime());
            ChuongTrinhKhuyenMaiEntity ctkm = new ChuongTrinhKhuyenMaiEntity(ma, ten, sotienTT, giam, ngayBD, ngayKT);
            if (ctkmbus.update(ctkm)) {
                JOptionPane.showMessageDialog(null, "Cập nhật thành công !");
                XoahetDuLieuTrenTable();
                DocDuLieuTuSQLvaoTable();

            } else {
                JOptionPane.showMessageDialog(null, "Cập nhật thất bại !");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JPanel_ThongTinCTKM = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTenCTKM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtGiamGia = new javax.swing.JTextField();
        txtMaCTKM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateNgayKetThuc = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtSoTienGiam = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dateNgayBatDau = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        JPanel_ThaoTac = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTimMaCTKM = new javax.swing.JTextField();
        btn_Xoa = new javax.swing.JButton();
        btn_TimKiem = new javax.swing.JButton();
        btn_LamMoi = new javax.swing.JButton();
        btn_Them = new javax.swing.JButton();
        btn_CapNhat = new javax.swing.JButton();
        JPanel_Table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(187, 205, 197));
        setPreferredSize(new java.awt.Dimension(1020, 700));

        jPanel1.setBackground(new java.awt.Color(187, 205, 197));

        jLabel2.setBackground(new java.awt.Color(187, 205, 197));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QUẢN LÝ CHƯƠNG TRÌNH KHUYẾN MÃI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        JPanel_ThongTinCTKM.setBackground(new java.awt.Color(187, 205, 197));
        JPanel_ThongTinCTKM.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông tin chương trình khuyến mãi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        JPanel_ThongTinCTKM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Tên Chương Trình");
        JPanel_ThongTinCTKM.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 55, 120, 30));

        txtTenCTKM.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtTenCTKM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTenCTKM.setBorder(null);
        JPanel_ThongTinCTKM.add(txtTenCTKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 55, 170, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Ngày Kết Thúc");
        jLabel3.setPreferredSize(new java.awt.Dimension(109, 30));
        JPanel_ThongTinCTKM.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 55, 100, 30));

        txtGiamGia.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtGiamGia.setBorder(null);
        JPanel_ThongTinCTKM.add(txtGiamGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 55, 170, 30));

        txtMaCTKM.setEditable(false);
        txtMaCTKM.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtMaCTKM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMaCTKM.setBorder(null);
        JPanel_ThongTinCTKM.add(txtMaCTKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 15, 170, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Giảm Giá");
        jLabel5.setPreferredSize(new java.awt.Dimension(109, 30));
        JPanel_ThongTinCTKM.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 55, 160, 30));
        JPanel_ThongTinCTKM.add(dateNgayKetThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 55, 180, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Số Tiền Giảm Tối Thiểu");
        jLabel6.setPreferredSize(new java.awt.Dimension(109, 30));
        JPanel_ThongTinCTKM.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 15, 160, 30));

        txtSoTienGiam.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtSoTienGiam.setBorder(null);
        JPanel_ThongTinCTKM.add(txtSoTienGiam, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 15, 170, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Ngày Bắt Đầu");
        jLabel7.setPreferredSize(new java.awt.Dimension(109, 30));
        JPanel_ThongTinCTKM.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 15, 100, 30));
        JPanel_ThongTinCTKM.add(dateNgayBatDau, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 15, 180, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Mã Chương Trình");
        jLabel8.setPreferredSize(new java.awt.Dimension(109, 30));
        JPanel_ThongTinCTKM.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 15, 120, 30));

        JPanel_ThaoTac.setBackground(new java.awt.Color(187, 205, 197));
        JPanel_ThaoTac.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thao tác", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        JPanel_ThaoTac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Mã Chương Trình");
        jLabel4.setPreferredSize(new java.awt.Dimension(109, 30));
        JPanel_ThaoTac.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 20, 120, 30));

        txtTimMaCTKM.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtTimMaCTKM.setBorder(null);
        JPanel_ThaoTac.add(txtTimMaCTKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 170, 30));

        btn_Xoa.setBackground(new java.awt.Color(255, 51, 51));
        btn_Xoa.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_Xoa.setForeground(new java.awt.Color(255, 255, 255));
        btn_Xoa.setText("Xóa");
        btn_Xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_XoaMouseClicked(evt);
            }
        });
        JPanel_ThaoTac.add(btn_Xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 110, 30));

        btn_TimKiem.setBackground(new java.awt.Color(0, 51, 51));
        btn_TimKiem.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_TimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btn_TimKiem.setText("Tìm Kiếm");
        btn_TimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_TimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_TimKiemMouseClicked(evt);
            }
        });
        JPanel_ThaoTac.add(btn_TimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 120, 30));

        btn_LamMoi.setBackground(new java.awt.Color(0, 51, 51));
        btn_LamMoi.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_LamMoi.setForeground(new java.awt.Color(255, 255, 255));
        btn_LamMoi.setText("Làm Mới");
        btn_LamMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LamMoiMouseClicked(evt);
            }
        });
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamMoiActionPerformed(evt);
            }
        });
        JPanel_ThaoTac.add(btn_LamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 120, 30));

        btn_Them.setBackground(new java.awt.Color(0, 51, 51));
        btn_Them.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_Them.setForeground(new java.awt.Color(255, 255, 255));
        btn_Them.setText("Thêm");
        btn_Them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ThemMouseClicked(evt);
            }
        });
        JPanel_ThaoTac.add(btn_Them, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 110, 30));

        btn_CapNhat.setBackground(new java.awt.Color(0, 51, 51));
        btn_CapNhat.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btn_CapNhat.setForeground(new java.awt.Color(255, 255, 255));
        btn_CapNhat.setText("Cập Nhật");
        btn_CapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CapNhatMouseClicked(evt);
            }
        });
        JPanel_ThaoTac.add(btn_CapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 120, 30));

        JPanel_Table.setBackground(new java.awt.Color(187, 205, 197));
        JPanel_Table.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Danh sách bảng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Chương Trình", "Tên Chương Trình", "Số tiền tối thiểu", "Giảm Giá", "Ngày Bắt Đầu", "Ngày Kết Thúc"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout JPanel_TableLayout = new javax.swing.GroupLayout(JPanel_Table);
        JPanel_Table.setLayout(JPanel_TableLayout);
        JPanel_TableLayout.setHorizontalGroup(
            JPanel_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_TableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPanel_TableLayout.setVerticalGroup(
            JPanel_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_TableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanel_ThongTinCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPanel_ThaoTac, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPanel_Table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(JPanel_ThongTinCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(JPanel_ThaoTac, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(JPanel_Table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_LamMoiActionPerformed

    private void btn_TimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TimKiemMouseClicked
        // TODO add your handling code here:
        Tim();
    }//GEN-LAST:event_btn_TimKiemMouseClicked

    private void btn_LamMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LamMoiMouseClicked
        // TODO add your handling code here:
        LamMoi();
        XoahetDuLieuTrenTable();
        DocDuLieuTuSQLvaoTable();
    }//GEN-LAST:event_btn_LamMoiMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DocDuLieuTrenTable();
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_ThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThemMouseClicked
        // TODO add your handling code here:
        ThemMoi();
    }//GEN-LAST:event_btn_ThemMouseClicked

    private void btn_XoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_XoaMouseClicked
        // TODO add your handling code here:
        Xoa();
    }//GEN-LAST:event_btn_XoaMouseClicked

    private void btn_CapNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CapNhatMouseClicked
        // TODO add your handling code here:
        CapNhat();
    }//GEN-LAST:event_btn_CapNhatMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel_Table;
    private javax.swing.JPanel JPanel_ThaoTac;
    private javax.swing.JPanel JPanel_ThongTinCTKM;
    private javax.swing.JButton btn_CapNhat;
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_Xoa;
    private com.toedter.calendar.JDateChooser dateNgayBatDau;
    private com.toedter.calendar.JDateChooser dateNgayKetThuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtGiamGia;
    private javax.swing.JTextField txtMaCTKM;
    private javax.swing.JTextField txtSoTienGiam;
    private javax.swing.JTextField txtTenCTKM;
    private javax.swing.JTextField txtTimMaCTKM;
    // End of variables declaration//GEN-END:variables
}
