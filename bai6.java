
package lab1;
import java.util.Scanner;

public class bai6 {
    public static void main(String[]args){
            Scanner Tinh = new Scanner(System.in);
            double a,b,c;
            System.out.print("a =");
            a = Tinh.nextDouble();
            System.out.print("b = ");
            b = Tinh.nextDouble();
            System.out.print("c =");
            c = Tinh.nextDouble();
            if(a>0&&b>0&&c>0&&(a+b>c)&&(a+c>b)&&(b+c>a)){
                System.out.print("Tam giac hop le"); 
    }else{
    System.out.print("Tam giac khong hop le");
}
}
}