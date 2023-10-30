package entity;

public enum ChucVu {
	NHANVIEN, QUANLY;
	
	@Override
    public String toString() {
        switch (this) {
            case NHANVIEN:
                return "Nhân Viên";
            default:
                return "Quản Lý";
        }
    }
}
