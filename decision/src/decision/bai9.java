//Giai pt bậc nhất
package decision;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = -b/a;
        if( a==0 && b!=0){
            System.out.println("PT vô nghiệm");
        }else if(a ==0 && b ==0){
            System.out.println("PT vô số nghiệm");
        }else{
            System.out.printf("PT có 1 nghiệm x = %.5f",x);
        }
    }
}
