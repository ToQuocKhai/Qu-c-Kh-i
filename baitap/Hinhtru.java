package baitap;
import java.util.Scanner;

public class Hinhtru extends Hinhtron {
    public float chieuCao;

    public Hinhtru() {
        Ten = "Hình Trụ";
    }

    public void nhapChieuCao() {
        nhapBanKinh(); 
        System.out.print("Nhập chiều cao: ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }
    public void tinhTheTich() {
        tinhDienTich(); 
        Thetich = Dientich * chieuCao;
    }
}
