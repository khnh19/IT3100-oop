package p3;

public class TestNhanVien {
    public static void main(String[] args) {

        System.out.println("1. Test NhanVien class:");
        NhanVien nv1 = new NhanVien();
        System.out.println("Default employee:");
        nv1.inTTin();

        System.out.println();

        NhanVien nv2 = new NhanVien("Nguyen Van A", 5000000, 2.5);
        System.out.println("Employee with values:");
        nv2.inTTin();

        System.out.println();

        System.out.println("2. Test getters and setters:");
        nv1.setTenNhanVien("Tran Thi B");
        nv1.setLuongCoBan(4000000);
        nv1.setHeSoLuong(3.0);
        System.out.println("After setting values:");
        nv1.inTTin();

        System.out.println();

        System.out.println("3. Test tangLuong method:");
        System.out.println("Current salary: " + nv2.tinhLuong());

        boolean result1 = nv2.tangLuong(1.0);
        System.out.println("Increase by 1.0 - Success: " + result1);
        if (result1) {
            System.out.println("New salary: " + nv2.tinhLuong());
        }

        System.out.println();

        boolean result2 = nv2.tangLuong(10.0);
        System.out.println("Increase by 10.0 - Success: " + result2);
        if (result2) {
            System.out.println("New salary: " + nv2.tinhLuong());
        } else {
            System.out.println("Current salary unchanged: " + nv2.tinhLuong());
        }
    }
}