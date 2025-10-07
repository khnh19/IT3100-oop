package p3;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public static final double LUONG_MAX = 50000000.0;

    public NhanVien() {
        this.tenNhanVien = "";
        this.luongCoBan = 0.0;
        this.heSoLuong = 1.0;
    }

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public boolean tangLuong(double tangThem) {
        double heSoMoi = this.heSoLuong + tangThem;
        double luongMoi = this.luongCoBan * heSoMoi;

        if (luongMoi > LUONG_MAX) {
            System.out.println("Khong the tang luong. Vuot qua luong toi da cho phep.");
            return false;
        } else {
            this.heSoLuong = heSoMoi;
            return true;
        }
    }

    public void inTTin() {
        System.out.println("Ten nhan vien: " + tenNhanVien);
        System.out.println("Luong co ban: " + luongCoBan);
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Luong: " + tinhLuong());
    }
}