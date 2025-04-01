package lab1;
import java.util.Scanner;
public class bai2{
    public static void main(String[]args){
        double a,b;
        Scanner Tinh = new Scanner(System.in);
        System.out.print("a=");
        a= Tinh.nextDouble();
        System.out.print("b=");
        b = Tinh.nextDouble();
        double S = a*b;
        System.out.print("dien tich la"+S);
    }
}