package lab1;
import java.util.Scanner;
public class BAI8 {
     public static void main(String[]args) {
     int h;
               Scanner Timsodauvacuoi=new Scanner(System.in);
                System.out.print("nhap so n: "); 
                h=Timsodauvacuoi.nextInt();
                int sodau=h;
                while(sodau>=10)
                {
                     sodau=h/10;
                 }
               int socuoi=h%10; 
        System.out.println("so dau la: "+sodau);
        System.out.println("so cuoi la: "+socuoi);
     }
}
