package entity;

public enum TinhTrangNhanVien {
	DANGLAMVIEC, NGHIVIEC, NGHIPHEP;
	
	@Override
    public String toString() {
        switch (this) {
            case DANGLAMVIEC:
                return "Đang làm việc";
            case NGHIVIEC:
                return "Nghỉ việc";
            default:
                return "Nghỉ phép";
        }
    }
}
