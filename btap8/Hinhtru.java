package btap8;
import java.util.Scanner;
public class Hinhtru extends Hinhtron {
    private float chieucao;
    public Hinhtru() {
        ten = "hình trụ";
    }
    public void nhapChieucao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều cao: ");
        chieucao = sc.nextFloat();
    }
    @Override
    public void nhapThongTin() {
        nhapBankinh();
        nhapChieucao();
    }
    @Override
    public void tinhThetich() {
        thetich = pi * bankinh * bankinh * chieucao;
    }
}
