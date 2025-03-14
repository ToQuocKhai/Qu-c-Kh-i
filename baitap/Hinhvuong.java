package baitap;
import java.util.Scanner;

public class Hinhvuong extends Hinhchunhat {
  
    public Hinhvuong() {
        Ten = "Hình Vuông";
    }

    public void nhapCanh() {
        System.out.print("Nhập cạnh: ");
        Scanner scanner = new Scanner(System.in);
        chieuDai = chieuRong = scanner.nextFloat();
    }
}
