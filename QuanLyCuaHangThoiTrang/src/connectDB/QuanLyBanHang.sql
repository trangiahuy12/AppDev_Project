USE [master]
GO
/****** Object:  Database [QuanLyBanHang]    Script Date: 10/27/2023 10:53:14 PM ******/
CREATE DATABASE [QuanLyBanHang]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QuanLyBanHang', FILENAME = N'D:\SQLServer\QuanLyBanHang\QuanLyBanHang.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'QuanLyBanHang_log', FILENAME = N'D:\SQLServer\QuanLyBanHang\QuanLyBanHang_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [QuanLyBanHang] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QuanLyBanHang].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QuanLyBanHang] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET ARITHABORT OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QuanLyBanHang] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QuanLyBanHang] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QuanLyBanHang] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QuanLyBanHang] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET RECOVERY FULL 
GO
ALTER DATABASE [QuanLyBanHang] SET  MULTI_USER 
GO
ALTER DATABASE [QuanLyBanHang] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QuanLyBanHang] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QuanLyBanHang] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [QuanLyBanHang] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [QuanLyBanHang] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'QuanLyBanHang', N'ON'
GO
ALTER DATABASE [QuanLyBanHang] SET QUERY_STORE = OFF
GO
USE [QuanLyBanHang]
GO
/****** Object:  Table [dbo].[ChatLieu]    Script Date: 10/27/2023 10:53:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChatLieu](
	[maChatLieu] [nvarchar](50) NOT NULL,
	[tenChatLieu] [nvarchar](50) NOT NULL,
	[xuatXu] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_ChatLieu] PRIMARY KEY CLUSTERED 
(
	[maChatLieu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 10/27/2023 10:53:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[maCTHD] [nvarchar](50) NOT NULL,
	[maSP] [nvarchar](50) NOT NULL,
	[maHD] [nvarchar](50) NOT NULL,
	[soLuong] [int] NOT NULL,
	[giaBan] [real] NOT NULL,
	[thanhTien] [real] NOT NULL,
 CONSTRAINT [PK_ChiTietHoaDon_1] PRIMARY KEY CLUSTERED 
(
	[maCTHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChuongTrinhKhuyenMai]    Script Date: 10/27/2023 10:53:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChuongTrinhKhuyenMai](
	[maCTKM] [nvarchar](50) NOT NULL,
	[tenCTKM] [nvarchar](255) NULL,
	[soTienToiThieu] [real] NOT NULL,
	[giamGia] [int] NOT NULL,
	[ngayBatDau] [datetime] NOT NULL,
	[ngayKetThuc] [datetime] NOT NULL,
 CONSTRAINT [PK_ChuongTrinhKhuyenMai] PRIMARY KEY CLUSTERED 
(
	[maCTKM] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DanhMucSanPham]    Script Date: 10/27/2023 10:53:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DanhMucSanPham](
	[maDanhMuc] [nvarchar](50) NOT NULL,
	[tenDanhMuc] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_DanhMucSanPham] PRIMARY KEY CLUSTERED 
(
	[maDanhMuc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DonYeuCauDoiTra]    Script Date: 10/27/2023 10:53:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DonYeuCauDoiTra](
	[maDYCDT] [nvarchar](50) NOT NULL,
	[maCTHD] [nvarchar](50) NOT NULL,
	[maNV] [nvarchar](50) NOT NULL,
	[thoiGianDoiTra] [datetime] NOT NULL,
	[hinhThucDoiTra] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_DonYeuCauDoiTra] PRIMARY KEY CLUSTERED 
(
	[maDYCDT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 10/27/2023 10:53:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[maHD] [nvarchar](50) NOT NULL,
	[maKH] [nvarchar](50) NOT NULL,
	[maNV] [nvarchar](50) NOT NULL,
	[maCTKM] [nvarchar](50) NULL,
	[ngayLapHD] [datetime] NOT NULL,
	[thueVAT] [int] NOT NULL,
	[tongTien] [real] NOT NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[maHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 10/27/2023 10:53:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[maKH] [nvarchar](50) NOT NULL,
	[hoTen] [nvarchar](50) NULL,
	[gioiTinh] [char](5) NULL,
	[soDienThoai] [nchar](10) NOT NULL,
	[diaChi] [nvarchar](50) NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[maKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MatHangNhap]    Script Date: 10/27/2023 10:53:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MatHangNhap](
	[maNCC] [nvarchar](50) NOT NULL,
	[maSP] [nvarchar](50) NOT NULL,
	[soLuongNhap] [int] NOT NULL,
	[ngayNhap] [datetime] NOT NULL,
 CONSTRAINT [PK_MatHangNhap] PRIMARY KEY CLUSTERED 
(
	[maNCC] ASC,
	[maSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 10/27/2023 10:53:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[maNCC] [nvarchar](50) NOT NULL,
	[tenNCC] [nvarchar](50) NULL,
	[soDienThoai] [nchar](10) NULL,
	[diaChi] [nvarchar](50) NULL,
	[tinhTrang] [nvarchar](50) NULL,
 CONSTRAINT [PK_NhaCungCap] PRIMARY KEY CLUSTERED 
(
	[maNCC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 10/27/2023 10:53:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[maNV] [nvarchar](50) NOT NULL,
	[hoTen] [nvarchar](50) NOT NULL,
	[gioiTinh] [char](5) NOT NULL,
	[ngaySinh] [datetime] NOT NULL,
	[email] [nvarchar](50) NOT NULL,
	[soDienThoai] [nchar](10) NOT NULL,
	[diaChi] [nvarchar](50) NULL,
	[chucVu] [nvarchar](50) NOT NULL,
	[tinhTrang] [nvarchar](50) NOT NULL,
	[caLamViec] [nchar](10) NOT NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[maNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 10/27/2023 10:53:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[maSP] [nvarchar](50) NOT NULL,
	[tenSP] [nvarchar](50) NOT NULL,
	[imgUrl] [nvarchar](50) NULL,
	[kichThuoc] [char](3) NOT NULL,
	[mauSac] [char](5) NOT NULL,
	[donGia] [real] NOT NULL,
	[soLuongTonKho] [int] NULL,
	[tinhTrang] [nvarchar](50) NOT NULL,
	[maChatLieu] [nvarchar](50) NOT NULL,
	[maThuongHieu] [nvarchar](50) NOT NULL,
	[maDanhMuc] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_SanPham] PRIMARY KEY CLUSTERED 
(
	[maSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 10/27/2023 10:53:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[tenTaiKhoan] [nchar](10) NOT NULL,
	[matKhau] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_TaiKhoan] PRIMARY KEY CLUSTERED 
(
	[tenTaiKhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ThuongHieu]    Script Date: 10/27/2023 10:53:14 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThuongHieu](
	[maThuongHieu] [nvarchar](50) NOT NULL,
	[tenThuongHieu] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_ThuongHieu] PRIMARY KEY CLUSTERED 
(
	[maThuongHieu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ChatLieu] ([maChatLieu], [tenChatLieu], [xuatXu]) VALUES (N'CL27102301', N'Polyester', N'Việt Nam')
INSERT [dbo].[ChatLieu] ([maChatLieu], [tenChatLieu], [xuatXu]) VALUES (N'CL27102302', N'Cotton', N'Việt Nam')
INSERT [dbo].[ChatLieu] ([maChatLieu], [tenChatLieu], [xuatXu]) VALUES (N'CL27102303', N'Flannel', N'Thái Lan')
INSERT [dbo].[ChatLieu] ([maChatLieu], [tenChatLieu], [xuatXu]) VALUES (N'CL27102304', N'
Acrylic', N'Thái Lan')
GO
INSERT [dbo].[ChuongTrinhKhuyenMai] ([maCTKM], [tenCTKM], [soTienToiThieu], [giamGia], [ngayBatDau], [ngayKetThuc]) VALUES (N'CTKM2710231', N'Chương trình giảm giá 10% cho các hoá đơn trên 500K từ ngày 27/10/2023 đến ngày 30/11/2023', 500000, 10, CAST(N'2023-10-27T00:00:00.000' AS DateTime), CAST(N'2023-11-30T00:00:00.000' AS DateTime))
INSERT [dbo].[ChuongTrinhKhuyenMai] ([maCTKM], [tenCTKM], [soTienToiThieu], [giamGia], [ngayBatDau], [ngayKetThuc]) VALUES (N'CTKM2710232', N'Chương trình giảm giá 20% cho các hoá đơn trên 800K từ ngày 30/11/2023 đến ngày 30/12/2023', 800000, 20, CAST(N'2023-11-30T00:00:00.000' AS DateTime), CAST(N'2023-12-30T00:00:00.000' AS DateTime))
INSERT [dbo].[ChuongTrinhKhuyenMai] ([maCTKM], [tenCTKM], [soTienToiThieu], [giamGia], [ngayBatDau], [ngayKetThuc]) VALUES (N'CTKM2710233', N'Chương trình giảm giá 25% cho các hoá đơn trên 1000K từ ngày 27/11/2023 đến ngày 30/12/2023', 1000000, 25, CAST(N'2023-11-27T00:00:00.000' AS DateTime), CAST(N'2023-12-30T00:00:00.000' AS DateTime))
GO
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102301', N'Áo Thun Nam')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102302', N'Áo Sơ Mi Nam')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102303', N'Áo Khoác Nam')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102304', N'Áo Vest Nam')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102305', N'Áo Hoodie Nam')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102306', N'Áo Thun Nữ')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102307', N'Áo Sơ Mi Nữ')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102308', N'Áo Khoác Nữ')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102309', N'Áo Vest Nữ')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102310', N'Áo Hoodie Nữ')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102311', N'Thắt Lưng')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102312', N'Vớ')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102313', N'Nón')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102314', N'Giày')
GO
INSERT [dbo].[KhachHang] ([maKH], [hoTen], [gioiTinh], [soDienThoai], [diaChi]) VALUES (N'KH271023001', N'Trần Văn Tú', N'Nam  ', N'0908070605', N'Quận Hai Bà Trưng, Hà Nội')
INSERT [dbo].[KhachHang] ([maKH], [hoTen], [gioiTinh], [soDienThoai], [diaChi]) VALUES (N'KH27102302', N'Nguyễn Thị Thuỳ Trang', N'N?   ', N'0301020405', N'Châu Đốc, An Giang')
GO
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [soDienThoai], [diaChi], [tinhTrang]) VALUES (N'NCC27102301', N'Elise', N'1234567890', N'Quận Gò Vấp, TPHCM', N'Đang nhập')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [soDienThoai], [diaChi], [tinhTrang]) VALUES (N'NCC27102302', N'Vascara', N'1234567890', N'Quận 1, TPHCM', N'Đang nhập')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [soDienThoai], [diaChi], [tinhTrang]) VALUES (N'NCC27102303', N'IVY Moda', N'1234567890', N'Gò Công, Tiền Giang', N'Đang nhập')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [soDienThoai], [diaChi], [tinhTrang]) VALUES (N'NCC27102304', N'HNOSS', N'1234567890', N'Sa Đéc, Đồng Tháp', N'Đang nhập')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [soDienThoai], [diaChi], [tinhTrang]) VALUES (N'NCC27102305', N'FM Style', N'1234567890', N'Quận Tân Bình, TPHCM', N'Đang nhập')
GO
INSERT [dbo].[NhanVien] ([maNV], [hoTen], [gioiTinh], [ngaySinh], [email], [soDienThoai], [diaChi], [chucVu], [tinhTrang], [caLamViec]) VALUES (N'NV27102301', N'Nguyễn Huy Hoàng', N'Nam  ', CAST(N'2003-12-01T00:00:00.000' AS DateTime), N'hoang12@gmail.com', N'0123456789', N'Quận Gò Vấp, TPHCM', N'Nhân viên', N'Đang làm việc', N'Ca 1      ')
INSERT [dbo].[NhanVien] ([maNV], [hoTen], [gioiTinh], [ngaySinh], [email], [soDienThoai], [diaChi], [chucVu], [tinhTrang], [caLamViec]) VALUES (N'NV27102302', N'Trần Gia Huy', N'Nam  ', CAST(N'2003-10-28T00:00:00.000' AS DateTime), N'huy10@gmail.com', N'0312456789', N'Quận Thủ Đức, TPHCM', N'Nhân viên', N'Đang làm việc', N'Ca 2      ')
INSERT [dbo].[NhanVien] ([maNV], [hoTen], [gioiTinh], [ngaySinh], [email], [soDienThoai], [diaChi], [chucVu], [tinhTrang], [caLamViec]) VALUES (N'NV27102303', N'Đinh Nguyên Chung', N'Nam  ', CAST(N'2003-12-30T00:00:00.000' AS DateTime), N'chung18@gmail.com', N'0912345678', N'Quận Long Biên, Hà Nội', N'Nhân viên', N'Đang làm việc', N'Ca 1      ')
INSERT [dbo].[NhanVien] ([maNV], [hoTen], [gioiTinh], [ngaySinh], [email], [soDienThoai], [diaChi], [chucVu], [tinhTrang], [caLamViec]) VALUES (N'NV27102304', N'Trần Hiển Vinh', N'Nam  ', CAST(N'2003-12-02T00:00:00.000' AS DateTime), N'vinh02@gmail.com', N'071235689 ', N'Cam Ranh, Khánh Hoà', N'Nhân viên', N'Đang làm việc', N'Ca 2      ')
INSERT [dbo].[NhanVien] ([maNV], [hoTen], [gioiTinh], [ngaySinh], [email], [soDienThoai], [diaChi], [chucVu], [tinhTrang], [caLamViec]) VALUES (N'NV27102305', N'Đỗ Chí Tường', N'N?   ', CAST(N'2003-10-27T00:00:00.000' AS DateTime), N'tuong27@gmail.com', N'1234567890', N'Tuy Hoà, Phú Yên', N'Quản lý', N'Đang làm việc', N'Ca 1      ')
GO
INSERT [dbo].[SanPham] ([maSP], [tenSP], [imgUrl], [kichThuoc], [mauSac], [donGia], [soLuongTonKho], [tinhTrang], [maChatLieu], [maThuongHieu], [maDanhMuc]) VALUES (N'SP2710230001', N'Áo tay ngắn hoạ tiết thêu', NULL, N'XS ', N'Ðen  ', 589000, 10, N'Đang bán', N'CL27102301', N'TH27102301', N'DM27102301')
INSERT [dbo].[SanPham] ([maSP], [tenSP], [imgUrl], [kichThuoc], [mauSac], [donGia], [soLuongTonKho], [tinhTrang], [maChatLieu], [maThuongHieu], [maDanhMuc]) VALUES (N'SP2710230002', N'
Áo tay ngắn hoạ tiết thêu', NULL, N'XS ', N'Tr?ng', 589000, 10, N'Đang bán', N'CL27102301', N'TH27102301', N'DM27102301')
INSERT [dbo].[SanPham] ([maSP], [tenSP], [imgUrl], [kichThuoc], [mauSac], [donGia], [soLuongTonKho], [tinhTrang], [maChatLieu], [maThuongHieu], [maDanhMuc]) VALUES (N'SP2710230003', N'
Áo tay ngắn hoạ tiết thêu', NULL, N'XS ', N'Xám  ', 589000, 10, N'Đang bán', N'CL27102301', N'TH27102301', N'DM27102301')
INSERT [dbo].[SanPham] ([maSP], [tenSP], [imgUrl], [kichThuoc], [mauSac], [donGia], [soLuongTonKho], [tinhTrang], [maChatLieu], [maThuongHieu], [maDanhMuc]) VALUES (N'SP2710230004', N'
Áo tay ngắn hoạ tiết thêu', NULL, N'S  ', N'Ðen  ', 589000, 10, N'Đang bán', N'CL27102301', N'TH27102301', N'DM27102301')
INSERT [dbo].[SanPham] ([maSP], [tenSP], [imgUrl], [kichThuoc], [mauSac], [donGia], [soLuongTonKho], [tinhTrang], [maChatLieu], [maThuongHieu], [maDanhMuc]) VALUES (N'SP2710230005', N'
Áo tay ngắn hoạ tiết thêu', NULL, N'S  ', N'Tr?ng', 589000, 10, N'Đang bán', N'CL27102301', N'TH27102301', N'DM27102301')
INSERT [dbo].[SanPham] ([maSP], [tenSP], [imgUrl], [kichThuoc], [mauSac], [donGia], [soLuongTonKho], [tinhTrang], [maChatLieu], [maThuongHieu], [maDanhMuc]) VALUES (N'SP2710230006', N'
Áo tay ngắn hoạ tiết thêu', NULL, N'S  ', N'Xám  ', 589000, 10, N'Đang bán', N'CL27102301', N'TH27102301', N'DM27102301')
INSERT [dbo].[SanPham] ([maSP], [tenSP], [imgUrl], [kichThuoc], [mauSac], [donGia], [soLuongTonKho], [tinhTrang], [maChatLieu], [maThuongHieu], [maDanhMuc]) VALUES (N'SP2710230007', N'
Áo tay ngắn hoạ tiết thêu', NULL, N'M  ', N'Ðen  ', 5889000, 10, N'Đang bán', N'CL27102301', N'TH27102301', N'DM27102301')
INSERT [dbo].[SanPham] ([maSP], [tenSP], [imgUrl], [kichThuoc], [mauSac], [donGia], [soLuongTonKho], [tinhTrang], [maChatLieu], [maThuongHieu], [maDanhMuc]) VALUES (N'SP2710230008', N'
Áo tay ngắn hoạ tiết thêu', NULL, N'M  ', N'Tr?ng', 5890000, 10, N'Đang bán', N'CL27102301', N'TH27102301', N'DM27102301')
INSERT [dbo].[SanPham] ([maSP], [tenSP], [imgUrl], [kichThuoc], [mauSac], [donGia], [soLuongTonKho], [tinhTrang], [maChatLieu], [maThuongHieu], [maDanhMuc]) VALUES (N'SP2710230009', N'
Áo tay ngắn hoạ tiết thêu', NULL, N'M  ', N'Xám  ', 5890000, 10, N'Đang bán', N'CL27102301', N'TH27102301', N'DM27102301')
GO
INSERT [dbo].[TaiKhoan] ([tenTaiKhoan], [matKhau]) VALUES (N'0123456789', N'hoang01122003')
INSERT [dbo].[TaiKhoan] ([tenTaiKhoan], [matKhau]) VALUES (N'0312456789', N'huy28102003')
INSERT [dbo].[TaiKhoan] ([tenTaiKhoan], [matKhau]) VALUES (N'071235689 ', N'vinh02122003')
INSERT [dbo].[TaiKhoan] ([tenTaiKhoan], [matKhau]) VALUES (N'0912345678', N'chung30122003')
INSERT [dbo].[TaiKhoan] ([tenTaiKhoan], [matKhau]) VALUES (N'1234567890', N'tuong27102003')
GO
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102301', N'Routine')
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102302', N'SSStutter')
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102303', N'Adam Store')
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102304', N'Owen')
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102305', N'Việt Tiến')
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102306', N'HNOSS')
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102307', N'Elise')
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102308', N'FM Style')
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102309', N'IVY Moda')
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102310', N'Vascara')
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_HoaDon] FOREIGN KEY([maHD])
REFERENCES [dbo].[HoaDon] ([maHD])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_HoaDon]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_SanPham] FOREIGN KEY([maSP])
REFERENCES [dbo].[SanPham] ([maSP])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_SanPham]
GO
ALTER TABLE [dbo].[DonYeuCauDoiTra]  WITH CHECK ADD  CONSTRAINT [FK_DonYeuCauDoiTra_ChiTietHoaDon] FOREIGN KEY([maCTHD])
REFERENCES [dbo].[ChiTietHoaDon] ([maCTHD])
GO
ALTER TABLE [dbo].[DonYeuCauDoiTra] CHECK CONSTRAINT [FK_DonYeuCauDoiTra_ChiTietHoaDon]
GO
ALTER TABLE [dbo].[DonYeuCauDoiTra]  WITH CHECK ADD  CONSTRAINT [FK_DonYeuCauDoiTra_NhanVien] FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVien] ([maNV])
GO
ALTER TABLE [dbo].[DonYeuCauDoiTra] CHECK CONSTRAINT [FK_DonYeuCauDoiTra_NhanVien]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_ChuongTrinhKhuyenMai] FOREIGN KEY([maCTKM])
REFERENCES [dbo].[ChuongTrinhKhuyenMai] ([maCTKM])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_ChuongTrinhKhuyenMai]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([maKH])
REFERENCES [dbo].[KhachHang] ([maKH])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVien] ([maNV])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[MatHangNhap]  WITH CHECK ADD  CONSTRAINT [FK_MatHangNhap_NhaCungCap] FOREIGN KEY([maNCC])
REFERENCES [dbo].[NhaCungCap] ([maNCC])
GO
ALTER TABLE [dbo].[MatHangNhap] CHECK CONSTRAINT [FK_MatHangNhap_NhaCungCap]
GO
ALTER TABLE [dbo].[MatHangNhap]  WITH CHECK ADD  CONSTRAINT [FK_MatHangNhap_SanPham] FOREIGN KEY([maSP])
REFERENCES [dbo].[SanPham] ([maSP])
GO
ALTER TABLE [dbo].[MatHangNhap] CHECK CONSTRAINT [FK_MatHangNhap_SanPham]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_TaiKhoan] FOREIGN KEY([soDienThoai])
REFERENCES [dbo].[TaiKhoan] ([tenTaiKhoan])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_TaiKhoan]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_ChatLieu] FOREIGN KEY([maChatLieu])
REFERENCES [dbo].[ChatLieu] ([maChatLieu])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_ChatLieu]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_DanhMucSanPham] FOREIGN KEY([maDanhMuc])
REFERENCES [dbo].[DanhMucSanPham] ([maDanhMuc])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_DanhMucSanPham]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_ThuongHieu] FOREIGN KEY([maThuongHieu])
REFERENCES [dbo].[ThuongHieu] ([maThuongHieu])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_ThuongHieu]
GO
USE [master]
GO
ALTER DATABASE [QuanLyBanHang] SET  READ_WRITE 
GO
