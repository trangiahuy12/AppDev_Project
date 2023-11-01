package entity;

public enum ChucVuEnum {
	NHANVIEN, QUANLY;
	
	@Override
    public String toString() {
            return switch (this) {
                case NHANVIEN -> "Nhân Viên";
                default -> "Quản Lý";
            };
    }
}
