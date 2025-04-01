
package lab1;

import java.util.Scanner;
public class bai5 {
    public static void main(String[]args){
        Scanner Tinh = new Scanner(System.in);
        System.out.print(" a =");
        double a = Tinh.nextDouble();
        System.out.print(" b =");
        double b = Tinh.nextDouble();
        System.out.print(" c =");
        double c = Tinh.nextDouble();
        double min = Math.min(a,Math.min(b,c));
        System.out.print("gia tri nho nhat la "+min);
    }
    
}
