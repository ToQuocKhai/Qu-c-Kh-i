package lab1;
import java.util.Scanner;
public class bai4 {
      public static void main(String[] args) {
          Scanner kb=new Scanner (System.in);
          System.out.print("Nhap vào mot nam: ");
          int year =kb.nextInt();
          if((year%4==0&&year%100!=0)||(year%400==0)){
              System.out.println(year+"Là năm nhuận");
              
          } else {
              System.out.println(year+"Không phải là năm nhuận");
          }
      }
}