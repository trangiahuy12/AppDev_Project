package entity;

public enum MauSac {
	TRANG, DEN, XAM;
	
	@Override
	public String toString() {
		switch(this) {
			case TRANG: return "Trắng";
			case DEN: return "Đen";
			case XAM: return "Xám";
		}
		return null;
	}
}
