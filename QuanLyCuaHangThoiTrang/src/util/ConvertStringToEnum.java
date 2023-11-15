package util;

import entity.CaLamViecEnum;
import entity.ChucVuEnum;
import entity.GioiTinhEnum;
import entity.HinhThucDoiTraEnum;
import entity.KichThuocEnum;
import entity.MauSacEnum;
import entity.TinhTrangNCCEnum;
import entity.TinhTrangNVEnum;
import entity.TinhTrangSPEnum;


/**
 *
 * @author Nguyen Huy Hoang
 */
public class ConvertStringToEnum {
    public ConvertStringToEnum() {
        
    }
    
    public MauSacEnum MauSactoEnum(String mauSac) {
        if(mauSac.equals("Trắng")) {
            return MauSacEnum.TRANG;
        } 
        if(mauSac.equals("Đen")) {
            return MauSacEnum.DEN;
        } 
        if(mauSac.equals("Xám")) {
            return MauSacEnum.XAM;
        } 
        return MauSacEnum.TRANG;
    }
    
    public KichThuocEnum KichThuoctoEnum(String kichThuoc) {
        if(kichThuoc.equals("XS")) {
            return KichThuocEnum.XS;
        } 
        if(kichThuoc.equals("S")) {
            return KichThuocEnum.S;
        } 
        if(kichThuoc.equals("M")) {
            return KichThuocEnum.M;
        } 
        if(kichThuoc.equals("L")) {
            return KichThuocEnum.L;
        } 
        if(kichThuoc.equals("XL")) {
            return KichThuocEnum.XL;
        } 
        if(kichThuoc.equals("XXL")) {
            return KichThuocEnum.XXL;
        } 
        return KichThuocEnum.XS;
    }
    
    public GioiTinhEnum GioiTinhtoEnum(String gioiTinh) {
        if(gioiTinh.equals("Nam")) {
            return GioiTinhEnum.NAM;
        } 
        if(gioiTinh.equals("Nữ")) {
            return GioiTinhEnum.NU;
        } 
        if(gioiTinh.equals("Khác")) {
            return GioiTinhEnum.KHAC;
        } 
        return GioiTinhEnum.NAM;
    }
    
    public ChucVuEnum ChucVuToEnum(String chucVu) {
        if(chucVu.equals("Nhân viên")) {
            return ChucVuEnum.NHANVIEN;
        }
        if(chucVu.equals("Quản lý")) {
            return ChucVuEnum.QUANLY;
        }
        return ChucVuEnum.NHANVIEN;
    }
    
    public CaLamViecEnum CaLamViecToEnum(String caLamViec) {
        if(caLamViec.equals("Ca 1")) {
            return CaLamViecEnum.CA1;
        }
        if(caLamViec.equals("Ca 2")) {
            return CaLamViecEnum.CA2;
        }
        return CaLamViecEnum.CA1;
    }
    
    public TinhTrangNCCEnum TinhTrangNCCToEnum(String tinhTrangNCC) {
        if(tinhTrangNCC.equals("Đang nhập")) {
            return TinhTrangNCCEnum.DANGNHAP;
        }
        if(tinhTrangNCC.equals("Ngừng nhập")) {
            return TinhTrangNCCEnum.NGUNGNHAP;
        }
        return TinhTrangNCCEnum.DANGNHAP;
    }
    
    public TinhTrangNVEnum TinhTrangNVToEnum(String tinhTrangNV) {
        if(tinhTrangNV.equals("Đang làm việc")) {
            return TinhTrangNVEnum.DANGLAMVIEC;
        }
        if(tinhTrangNV.equals("Nghỉ việc")) {
            return TinhTrangNVEnum.NGHIVIEC;
        }
        if(tinhTrangNV.equals("Nghỉ phép")) {
            return TinhTrangNVEnum.NGHIPHEP;
        }
        return TinhTrangNVEnum.DANGLAMVIEC;
    }
    
    public TinhTrangSPEnum TinhTrangSPToEnum(String tinhTrangSP) {
        if(tinhTrangSP.equals("Đang bán")) {
            return TinhTrangSPEnum.DANGBAN;
        }
        if(tinhTrangSP.equals("Ca 2")) {
            return TinhTrangSPEnum.NGUNGBAN;
        }
        return TinhTrangSPEnum.DANGBAN;
    }
    
    public HinhThucDoiTraEnum HinhThucDTToEnum(String hinhThuc) {
        if(hinhThuc.equals("Hoàn trả")) {
            return HinhThucDoiTraEnum.HOANTRA;
        }
        if(hinhThuc.equals("Đổi sản phẩm khác")) {
            return HinhThucDoiTraEnum.DOISANPHAMKHAC;
        }
        return HinhThucDoiTraEnum.HOANTRA;
    }
}
