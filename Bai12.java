
package lab1;
import java.util.Scanner;
public class Bai12 {
   public static void main(String[]args){
       int n;
       Scanner dn = new Scanner(System.in);
       System.out.print("nhap n ");
       n = dn.nextInt();
       int sodao =0;
       int doixung = n;
       while(n!=0){
    sodao=sodao*10+n%10;
    n=n/10;
       }
       if(doixung == sodao){
           System.out.print("n la so doi xung");
       }else
       {
           System.out.print("n khong phai so doi xung");
       }
   }
}
