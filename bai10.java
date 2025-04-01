
package lab1;
import java.util.Scanner;
public class bai10 {
    public static void main(String[]args){
        int n;
        Scanner dem = new Scanner(System.in);
        System.out.print("nhap n ");
        n = dem.nextInt();
        int count = 0;
        while(n!=0){
        count++;
        n = n/10;
    }
        System.out.print("co"+count+"so");
    }
    
}
