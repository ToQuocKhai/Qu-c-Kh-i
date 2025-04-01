
package lab1;
import java.util.Scanner;

public class bai7 {
    public static void main (String[]args){
        double LY,HOA,SINH,TOAN,MAYTINH;
        Scanner Tinh = new Scanner(System.in);
        System.out.printf(" DIEM LY");
        LY = Tinh.nextDouble();
        System.out.printf("DIEM HOA");
        HOA = Tinh.nextDouble();
        System.out.printf("DIEM SINH");
        SINH = Tinh.nextDouble();
        System.out.printf("DIEM TOAN");
        TOAN = Tinh.nextDouble();
        System.out.printf("DIEM MAY TINH");
        MAYTINH = Tinh.nextDouble();
        double DTB =(LY+HOA+SINH+TOAN+MAYTINH)/5;
                if (DTB >= 9) {
                     System.out.print("hạng A ");
              }
                else if (DTB >= 8) {
            System.out.println("hạng B ");
        } 
                else if (DTB>= 7) {
         System.out.println("hạng C ");
        } 
                else if (DTB >= 6) {
         System.out.println("hạng D ");
        } 
                else if (DTB >= 4) {
         System.out.println("hạng E ");
        } 
                else {
           System.out.println("hạng F");
        }
     }
}
     
