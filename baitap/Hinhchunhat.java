package baitap;
import java.util.Scanner;

public class Hinhchunhat extends Hinhhoc {
    public float chieuDai;
    public float chieuRong;

    public Hinhchunhat() {
        Ten = "Hình Chữ Nhật";
    }

    public void nhapChieuDai() {
        System.out.print("Nhập chiều dài: ");
        Scanner scanner = new Scanner(System.in);
        chieuDai = scanner.nextFloat();
    }

    public void nhapChieuRong() {
        System.out.print("Nhập chiều rộng: ");
        Scanner scanner = new Scanner(System.in);
        chieuRong = scanner.nextFloat();
    }

    public void tinhChuvi() {
        Chuvi = 2 * (chieuDai + chieuRong);
    }
    public void tinhDientich() {
        Dientich = chieuDai * chieuRong;
    }
}
