
package lab1;
import java.util.Scanner;
public class bai3 {
    public static void main(String[]args){
        double f,c;
        Scanner doi = new Scanner(System.in);
        System.out.print("nhap do F");
        f = doi.nextDouble();
        c=(f-32)/1.8;
        System.out.print("do c"+c);
    }
}
