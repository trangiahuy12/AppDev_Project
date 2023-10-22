
package GUI;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class TrangChu_GUI extends javax.swing.JFrame {

    public TrangChu_GUI() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
    TrangChu_Panel = new TrangChu_JPanel();
    BanHang_Panel = new BanHang_JPanel();  
   SanPham_Panel = new SanPham_JPanel();
   HoaDon_Panel = new HoaDon_JPanel();
   DoiTra_Panel = new DoiTra_JPanel();
   ThongKe_Panel = new ThongKe_JPanel();
   KhachHang_Panel = new KhachHang_JPanel();
   NhanVien_Panel = new NhanVien_JPanel();
   KhuyenMai_Panel = new KhuyenMai_JPanel();
   PhieuNhap_Panel = new PhieuNhap_JPanel();
   TaiKhoan_Panel = new TaiKhoan_JPanel();
   NhaCungCap_Panel = new NhaCungCap_JPanel();
    
    
    ImageIcon img_home = new ImageIcon("src\\pic\\home.png");
    Image scaled_home = img_home.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    img_home = new ImageIcon(scaled_home);
    lbl_IconTrangChu.setIcon(img_home);
    
    ImageIcon img_SanPham = new ImageIcon("src\\pic\\productbox.png");
    Image scaled_SanPham = img_SanPham.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    img_SanPham = new ImageIcon(scaled_SanPham);
    lbl_IconSanPham.setIcon(img_SanPham);
//    
    ImageIcon img_BanHang = new ImageIcon("src\\pic\\clothers.png");
    Image scaled_BanHang = img_BanHang.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    img_BanHang = new ImageIcon(scaled_BanHang);
    lbl_IconBanHang.setIcon(img_BanHang);
//    
//     ImageIcon img_Exits = new ImageIcon("src\\pic\\close.png");
//    Image scaled_Exits = img_Exits.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
//    img_Exits = new ImageIcon(scaled_Exits);
//    lbl_IconExit.setIcon(img_Exits);

    ImageIcon img_User = new ImageIcon("src\\pic\\users.png");
    Image scaled_Users = img_User.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    img_User = new ImageIcon(scaled_Users);
    lbl_Users.setIcon(img_User);
    
    ImageIcon img_Settings = new ImageIcon("src\\pic\\settings.png");
    Image scaled_Settings = img_Settings.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
    img_Settings = new ImageIcon(scaled_Settings);
    lbl_Settings.setIcon(img_Settings);
    
     ImageIcon img_HoaDon = new ImageIcon("src\\pic\\hoadon.png");
    Image scaled_HoaDon = img_HoaDon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    img_HoaDon = new ImageIcon(scaled_HoaDon);
    lbl_IconHoaDon.setIcon(img_HoaDon);
    
     ImageIcon img_DoiTra = new ImageIcon("src\\pic\\return.png");
    Image scaled_DoiTra = img_DoiTra.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    img_DoiTra = new ImageIcon(scaled_DoiTra);
    lbl_IconDoiTra.setIcon(img_DoiTra);
    
    ImageIcon img_KhachHang = new ImageIcon("src\\pic\\customer.png");
    Image scaled_KhachHang = img_KhachHang.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    img_KhachHang = new ImageIcon(scaled_KhachHang);
    lbl_IconKhachHang.setIcon(img_KhachHang);
    
    ImageIcon img_NhanVien = new ImageIcon("src\\pic\\nhanvien.png");
    Image scaled_NhanVien = img_NhanVien.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    img_NhanVien = new ImageIcon(scaled_NhanVien);
    lbl_IconNhanVien.setIcon(img_NhanVien);
    
    ImageIcon img_ThongKe = new ImageIcon("src\\pic\\thongke.png");
    Image scaled_ThongKe = img_ThongKe.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    img_ThongKe = new ImageIcon(scaled_ThongKe);
    lbl_IconThongKe.setIcon(img_ThongKe);
    
    ImageIcon img_NhaCungCap = new ImageIcon("src\\pic\\nhacungcap.png");
    Image scaled_NhaCungCap = img_NhaCungCap.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    img_NhaCungCap = new ImageIcon(scaled_NhaCungCap);
    lbl_IconNhaCungCap.setIcon(img_NhaCungCap);
    
    ImageIcon img_PhieuNhap = new ImageIcon("src\\pic\\phieunhap.png");
    Image scaled_PhieuNhap = img_PhieuNhap.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    img_PhieuNhap = new ImageIcon(scaled_PhieuNhap);
    lbl_IconPhieuNhap.setIcon(img_PhieuNhap);
    
    ImageIcon img_KhuyenMai = new ImageIcon("src\\pic\\discount.png");
    Image scaled_KhuyenMai = img_KhuyenMai.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    img_KhuyenMai = new ImageIcon(scaled_KhuyenMai);
    lbl_IconKhuyenMai.setIcon(img_KhuyenMai);
    
     ImageIcon img_TaiKhoan = new ImageIcon("src\\pic\\taikhoan.png");
    Image scaled_TaiKhoan = img_TaiKhoan.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    img_TaiKhoan = new ImageIcon(scaled_TaiKhoan);
    lbl_IconTaiKhoan.setIcon(img_TaiKhoan);
    
        // Thêm Panel và Main
        
    Jpanel_Main.add(TrangChu_Panel);
    Jpanel_Main.add(BanHang_Panel);
    Jpanel_Main.add(SanPham_Panel);
    Jpanel_Main.add(HoaDon_Panel);
    Jpanel_Main.add(DoiTra_Panel);
    Jpanel_Main.add(ThongKe_Panel);
    Jpanel_Main.add(KhachHang_Panel);
    Jpanel_Main.add(NhanVien_Panel);
    Jpanel_Main.add(NhaCungCap_Panel);
    Jpanel_Main.add(PhieuNhap_Panel);
    Jpanel_Main.add(KhuyenMai_Panel);
    Jpanel_Main.add(TaiKhoan_Panel);
    
    
    // Gán sự kiện click Jpanel
    Jpanel_TrangChu.addMouseListener(new PanelButtonMouseAdapter(Jpanel_TrangChu){
        @Override
        public void mouseClicked(MouseEvent e){
            menuClicked(TrangChu_Panel);
        }
    });
    
    Jpanel_BanHang.addMouseListener(new PanelButtonMouseAdapter(Jpanel_BanHang){
        @Override
        public void mouseClicked(MouseEvent e){
            menuClicked(BanHang_Panel);
        }
    });
    Jpanel_DoiTra.addMouseListener(new PanelButtonMouseAdapter(Jpanel_DoiTra){
    @Override
        public void mouseClicked(MouseEvent e){
            menuClicked(DoiTra_Panel);
        }
    });
    Jpanel_KhachHang.addMouseListener(new PanelButtonMouseAdapter(Jpanel_KhachHang){
        @Override
        public void mouseClicked(MouseEvent e){
            menuClicked(KhachHang_Panel);
        }
    });
    Jpanel_KhuyenMai.addMouseListener(new PanelButtonMouseAdapter(Jpanel_KhuyenMai){
        @Override
        public void mouseClicked(MouseEvent e){
            menuClicked(KhuyenMai_Panel);
        }
    });
    Jpanel_NhaCungCap.addMouseListener(new PanelButtonMouseAdapter(Jpanel_NhaCungCap){
        @Override
        public void mouseClicked(MouseEvent e){
            menuClicked(NhaCungCap_Panel);
        }
    });
    Jpanel_NhanVien.addMouseListener(new PanelButtonMouseAdapter(Jpanel_NhanVien){
        @Override
        public void mouseClicked(MouseEvent e){
            menuClicked(NhanVien_Panel);
        }
    });
    Jpanel_PhieuNhap.addMouseListener(new PanelButtonMouseAdapter(Jpanel_PhieuNhap){
        @Override
        public void mouseClicked(MouseEvent e){
            menuClicked(PhieuNhap_Panel);
        }
    });
    Jpanel_SanPham.addMouseListener(new PanelButtonMouseAdapter(Jpanel_SanPham){
        @Override
        public void mouseClicked(MouseEvent e){
            menuClicked(SanPham_Panel);
        }
     });
    Jpanel_TaiKhoan.addMouseListener(new PanelButtonMouseAdapter(Jpanel_TaiKhoan){
        @Override
        public void mouseClicked(MouseEvent e){
            menuClicked(TaiKhoan_Panel);
        }
    });
    Jpanel_ThongKe.addMouseListener(new PanelButtonMouseAdapter(Jpanel_ThongKe){
        @Override
        public void mouseClicked(MouseEvent e){
            menuClicked(ThongKe_Panel);
        }
    });
    Jpanel_HoaDon.addMouseListener(new PanelButtonMouseAdapter(Jpanel_HoaDon){
        @Override
        public void mouseClicked(MouseEvent e){
            menuClicked(HoaDon_Panel);
        }
    });
    // ẩn MenuSettings
    menu_Settings.setVisible(false);
    lbl_Settings.addMouseListener(new MouseAdapter() {
     
        public void MouseClicked(){
            if(isMenuSettingsIsVesible){
            menu_Settings.setVisible(true);
            isMenuSettingsIsVesible = true;
        }
            menu_Settings.setVisible(false);
             isMenuSettingsIsVesible = false;
        }
    });

   
        menuClicked(TrangChu_Panel);
    
    }
            public void menuClicked(JPanel panel) {
		
		TrangChu_Panel.setVisible(false);
		BanHang_Panel.setVisible(false);
                SanPham_Panel.setVisible( false);
                HoaDon_Panel.setVisible( false);
                KhachHang_Panel.setVisible( false);
                DoiTra_Panel.setVisible( false);
                ThongKe_Panel.setVisible( false);
                NhanVien_Panel.setVisible( false);
                NhaCungCap_Panel.setVisible( false);
                PhieuNhap_Panel.setVisible( false);
                KhuyenMai_Panel.setVisible( false);
                TaiKhoan_Panel.setVisible( false);
		
		
		panel.setVisible(true);
	}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel_Menu = new javax.swing.JPanel();
        Jpanel_Users = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_Users = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Jpanel_TaiKhoan = new javax.swing.JPanel();
        lbl_TaiKhoan = new javax.swing.JLabel();
        lbl_IconTaiKhoan = new javax.swing.JLabel();
        Jpanel_KhuyenMai = new javax.swing.JPanel();
        lbl_KhuyenMai = new javax.swing.JLabel();
        lbl_IconKhuyenMai = new javax.swing.JLabel();
        Jpanel_PhieuNhap = new javax.swing.JPanel();
        lbl_PhieuNhap = new javax.swing.JLabel();
        lbl_IconPhieuNhap = new javax.swing.JLabel();
        Jpanel_NhaCungCap = new javax.swing.JPanel();
        lbl_NhaCungCap = new javax.swing.JLabel();
        lbl_IconNhaCungCap = new javax.swing.JLabel();
        Jpanel_NhanVien = new javax.swing.JPanel();
        lbl_NhanVien = new javax.swing.JLabel();
        lbl_IconNhanVien = new javax.swing.JLabel();
        Jpanel_ThongKe = new javax.swing.JPanel();
        lbl_ThongKe = new javax.swing.JLabel();
        lbl_IconThongKe = new javax.swing.JLabel();
        Jpanel_DoiTra = new javax.swing.JPanel();
        lbl_DoiTra = new javax.swing.JLabel();
        lbl_IconDoiTra = new javax.swing.JLabel();
        Jpanel_SanPham = new javax.swing.JPanel();
        lbl_SanPham = new javax.swing.JLabel();
        lbl_IconSanPham = new javax.swing.JLabel();
        Jpanel_BanHang = new javax.swing.JPanel();
        lbl_BanHang = new javax.swing.JLabel();
        lbl_IconBanHang = new javax.swing.JLabel();
        Jpanel_TrangChu = new javax.swing.JPanel();
        lbl_TrangChu = new javax.swing.JLabel();
        lbl_IconTrangChu = new javax.swing.JLabel();
        lbl_Settings = new javax.swing.JLabel();
        Jpanel_HoaDon = new javax.swing.JPanel();
        lbl_IconHoaDon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Jpanel_KhachHang = new javax.swing.JPanel();
        lbl_IconKhachHang = new javax.swing.JLabel();
        lbl_KhachHang = new javax.swing.JLabel();
        menu_Settings = new javax.swing.JPanel();
        Jpanel_Main = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jpanel_Menu.setBackground(new java.awt.Color(0, 51, 51));
        Jpanel_Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jpanel_Users.setBackground(new java.awt.Color(0, 51, 51));
        Jpanel_Users.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        Jpanel_Users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đinh Nguyên Chung");
        Jpanel_Users.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, 30));
        Jpanel_Users.add(lbl_Users, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NV21127891");
        Jpanel_Users.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, 30));

        Jpanel_Menu.add(Jpanel_Users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 80));

        Jpanel_TaiKhoan.setBackground(new java.awt.Color(0, 51, 51));
        Jpanel_TaiKhoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_TaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_TaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        lbl_TaiKhoan.setText("Tài Khoản");
        Jpanel_TaiKhoan.add(lbl_TaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, 29));
        Jpanel_TaiKhoan.add(lbl_IconTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        Jpanel_Menu.add(Jpanel_TaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 180, 50));

        Jpanel_KhuyenMai.setBackground(new java.awt.Color(0, 51, 51));
        Jpanel_KhuyenMai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_KhuyenMai.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_KhuyenMai.setForeground(new java.awt.Color(255, 255, 255));
        lbl_KhuyenMai.setText("Khuyến Mãi");
        Jpanel_KhuyenMai.add(lbl_KhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, 29));
        Jpanel_KhuyenMai.add(lbl_IconKhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        Jpanel_Menu.add(Jpanel_KhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 180, 50));

        Jpanel_PhieuNhap.setBackground(new java.awt.Color(0, 51, 51));
        Jpanel_PhieuNhap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_PhieuNhap.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_PhieuNhap.setForeground(new java.awt.Color(255, 255, 255));
        lbl_PhieuNhap.setText("Phiếu Nhập");
        Jpanel_PhieuNhap.add(lbl_PhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, 29));
        Jpanel_PhieuNhap.add(lbl_IconPhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        Jpanel_Menu.add(Jpanel_PhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 180, 50));

        Jpanel_NhaCungCap.setBackground(new java.awt.Color(0, 51, 51));
        Jpanel_NhaCungCap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_NhaCungCap.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_NhaCungCap.setForeground(new java.awt.Color(255, 255, 255));
        lbl_NhaCungCap.setText("Nhà Cung Cấp");
        Jpanel_NhaCungCap.add(lbl_NhaCungCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, 29));
        Jpanel_NhaCungCap.add(lbl_IconNhaCungCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        Jpanel_Menu.add(Jpanel_NhaCungCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 180, 50));

        Jpanel_NhanVien.setBackground(new java.awt.Color(0, 51, 51));
        Jpanel_NhanVien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_NhanVien.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_NhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lbl_NhanVien.setText("Nhân Viên");
        Jpanel_NhanVien.add(lbl_NhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, 29));
        Jpanel_NhanVien.add(lbl_IconNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        Jpanel_Menu.add(Jpanel_NhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 180, 50));

        Jpanel_ThongKe.setBackground(new java.awt.Color(0, 51, 51));
        Jpanel_ThongKe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ThongKe.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_ThongKe.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ThongKe.setText("Thống Kê");
        Jpanel_ThongKe.add(lbl_ThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, 29));
        Jpanel_ThongKe.add(lbl_IconThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        Jpanel_Menu.add(Jpanel_ThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 180, 50));

        Jpanel_DoiTra.setBackground(new java.awt.Color(0, 51, 51));
        Jpanel_DoiTra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_DoiTra.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_DoiTra.setForeground(new java.awt.Color(255, 255, 255));
        lbl_DoiTra.setText("Đổi Trả");
        Jpanel_DoiTra.add(lbl_DoiTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, 29));
        Jpanel_DoiTra.add(lbl_IconDoiTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        Jpanel_Menu.add(Jpanel_DoiTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 180, 50));

        Jpanel_SanPham.setBackground(new java.awt.Color(0, 51, 51));
        Jpanel_SanPham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_SanPham.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_SanPham.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SanPham.setText("Sản Phẩm");
        Jpanel_SanPham.add(lbl_SanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, 29));
        Jpanel_SanPham.add(lbl_IconSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        Jpanel_Menu.add(Jpanel_SanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 180, 50));

        Jpanel_BanHang.setBackground(new java.awt.Color(0, 51, 51));
        Jpanel_BanHang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_BanHang.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_BanHang.setForeground(new java.awt.Color(255, 255, 255));
        lbl_BanHang.setText("Bán Hàng");
        Jpanel_BanHang.add(lbl_BanHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, 29));
        Jpanel_BanHang.add(lbl_IconBanHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        Jpanel_Menu.add(Jpanel_BanHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 180, 50));

        Jpanel_TrangChu.setBackground(new java.awt.Color(0, 51, 51));
        Jpanel_TrangChu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_TrangChu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_TrangChu.setForeground(new java.awt.Color(255, 255, 255));
        lbl_TrangChu.setText("Trang Chủ");
        Jpanel_TrangChu.add(lbl_TrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, 29));
        Jpanel_TrangChu.add(lbl_IconTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        Jpanel_Menu.add(Jpanel_TrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 180, 50));

        lbl_Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_SettingsMouseClicked(evt);
            }
        });
        Jpanel_Menu.add(lbl_Settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, 20, 20));

        Jpanel_HoaDon.setBackground(new java.awt.Color(0, 51, 51));
        Jpanel_HoaDon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Jpanel_HoaDon.add(lbl_IconHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hóa Đơn");
        Jpanel_HoaDon.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, 29));

        Jpanel_Menu.add(Jpanel_HoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 180, 50));

        Jpanel_KhachHang.setBackground(new java.awt.Color(0, 51, 51));
        Jpanel_KhachHang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Jpanel_KhachHang.add(lbl_IconKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        lbl_KhachHang.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_KhachHang.setForeground(new java.awt.Color(255, 255, 255));
        lbl_KhachHang.setText("Khách Hàng");
        Jpanel_KhachHang.add(lbl_KhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, 29));

        Jpanel_Menu.add(Jpanel_KhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 180, 50));

        javax.swing.GroupLayout menu_SettingsLayout = new javax.swing.GroupLayout(menu_Settings);
        menu_Settings.setLayout(menu_SettingsLayout);
        menu_SettingsLayout.setHorizontalGroup(
            menu_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        menu_SettingsLayout.setVerticalGroup(
            menu_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Jpanel_Menu.add(menu_Settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 685, -1, 30));

        getContentPane().add(Jpanel_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 720));

        Jpanel_Main.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout Jpanel_MainLayout = new javax.swing.GroupLayout(Jpanel_Main);
        Jpanel_Main.setLayout(Jpanel_MainLayout);
        Jpanel_MainLayout.setHorizontalGroup(
            Jpanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        Jpanel_MainLayout.setVerticalGroup(
            Jpanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        getContentPane().add(Jpanel_Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1020, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean isMenuSettingsIsVesible = false;
    private void lbl_SettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SettingsMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_lbl_SettingsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu_GUI().setVisible(true);
            }
        });
    }
    	private class PanelButtonMouseAdapter extends MouseAdapter{
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		@Override
		public void mouseEntered(MouseEvent e) {
//			panel.setBackground(new Color(112,128,144));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(0,51,51));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(60,179,113));
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(112,128,144));
		}
	}
        //

    private TrangChu_JPanel TrangChu_Panel ;
    private BanHang_JPanel BanHang_Panel;
    private SanPham_JPanel SanPham_Panel;
    private HoaDon_JPanel HoaDon_Panel;
    private DoiTra_JPanel DoiTra_Panel;
    private KhachHang_JPanel KhachHang_Panel;
    private ThongKe_JPanel ThongKe_Panel;
    private NhanVien_JPanel NhanVien_Panel;
    private NhaCungCap_JPanel NhaCungCap_Panel;
    private KhuyenMai_JPanel KhuyenMai_Panel;
    private PhieuNhap_JPanel PhieuNhap_Panel;
    private TaiKhoan_JPanel TaiKhoan_Panel;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel_BanHang;
    private javax.swing.JPanel Jpanel_DoiTra;
    private javax.swing.JPanel Jpanel_HoaDon;
    private javax.swing.JPanel Jpanel_KhachHang;
    private javax.swing.JPanel Jpanel_KhuyenMai;
    private javax.swing.JPanel Jpanel_Main;
    private javax.swing.JPanel Jpanel_Menu;
    private javax.swing.JPanel Jpanel_NhaCungCap;
    private javax.swing.JPanel Jpanel_NhanVien;
    private javax.swing.JPanel Jpanel_PhieuNhap;
    private javax.swing.JPanel Jpanel_SanPham;
    private javax.swing.JPanel Jpanel_TaiKhoan;
    private javax.swing.JPanel Jpanel_ThongKe;
    private javax.swing.JPanel Jpanel_TrangChu;
    private javax.swing.JPanel Jpanel_Users;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_BanHang;
    private javax.swing.JLabel lbl_DoiTra;
    private javax.swing.JLabel lbl_IconBanHang;
    private javax.swing.JLabel lbl_IconDoiTra;
    private javax.swing.JLabel lbl_IconHoaDon;
    private javax.swing.JLabel lbl_IconKhachHang;
    private javax.swing.JLabel lbl_IconKhuyenMai;
    private javax.swing.JLabel lbl_IconNhaCungCap;
    private javax.swing.JLabel lbl_IconNhanVien;
    private javax.swing.JLabel lbl_IconPhieuNhap;
    private javax.swing.JLabel lbl_IconSanPham;
    private javax.swing.JLabel lbl_IconTaiKhoan;
    private javax.swing.JLabel lbl_IconThongKe;
    private javax.swing.JLabel lbl_IconTrangChu;
    private javax.swing.JLabel lbl_KhachHang;
    private javax.swing.JLabel lbl_KhuyenMai;
    private javax.swing.JLabel lbl_NhaCungCap;
    private javax.swing.JLabel lbl_NhanVien;
    private javax.swing.JLabel lbl_PhieuNhap;
    private javax.swing.JLabel lbl_SanPham;
    private javax.swing.JLabel lbl_Settings;
    private javax.swing.JLabel lbl_TaiKhoan;
    private javax.swing.JLabel lbl_ThongKe;
    private javax.swing.JLabel lbl_TrangChu;
    private javax.swing.JLabel lbl_Users;
    private javax.swing.JPanel menu_Settings;
    // End of variables declaration//GEN-END:variables
}
