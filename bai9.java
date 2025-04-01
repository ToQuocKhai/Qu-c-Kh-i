
package lab1;
import java.util.Scanner;
public class bai9 {
     public static void main(String[] args) {
     int n;
               Scanner Tinhtongvatich=new Scanner(System.in);
                System.out.print("nhap so n: "); 
                n=Tinhtongvatich.nextInt(); 
                int tong=0;
                int tich=1;
                while(n>0){
                   int tag = n%10;
                tong =tong +tag;
                tich=tich*tag;
                n=n/10;
     }    
        System.out.println("tong cac so la: "+tong);
        System.out.println("tich cua cac so la: "+tich);
     }
}
