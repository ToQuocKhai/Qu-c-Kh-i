package btap8;
import java.util.Scanner;
public class Hinhvuong extends Hinhchunhat {
    public Hinhvuong() {
        ten = "Hình vuông";
    }
    public void nhapCanh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh: ");
        dai = rong = sc.nextFloat();
    }
    @Override
    public void nhapThongTin() {
        nhapCanh();
    }
}