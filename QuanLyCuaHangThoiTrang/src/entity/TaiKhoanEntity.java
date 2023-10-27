package entity;

public class TaiKhoanEntity {
	private String tenTaiKhoan, matKhau;

	public TaiKhoanEntity(String tenTaiKhoan, String matKhau) {
		super();
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
	}

	public TaiKhoanEntity() {
		super();
	}

	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}

	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	@Override
	public String toString() {
		return "TaiKhoanEntity [tenTaiKhoan=" + tenTaiKhoan + ", matKhau=" + matKhau + "]";
	}
	
	
}
