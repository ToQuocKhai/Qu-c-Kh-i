package baitap;
import java.util.Scanner;

public class Hinhtron extends Hinhhoc {
    public float banKinh;

    public Hinhtron() {
        Ten = "Hình Tròn";
    }

    public void nhapBanKinh() {
        System.out.print("Nhập bán kính: ");
        Scanner scanner = new Scanner(System.in);
        banKinh = scanner.nextFloat();
    }

    public void tinhChuVi() {
        Chuvi = 2 * PI * banKinh;
    }

    public void tinhDienTich() {
        Dientich = PI * banKinh * banKinh;
    }
}
