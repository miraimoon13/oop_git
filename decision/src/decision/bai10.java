/*
 giải phương trình bậc 2
 */
package decision;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if(a == 0){
            if( b==0 && c != 0){
                System.out.println("PT vô nghiệm");
            }else if(b ==0 && c ==0){
                System.out.println("PT VSN");
            }else{
                System.out.printf("PT có 1 nghiệm \n x = %.5f", -c/b);
            }
        }else{
            double delta= b*b-4*a*c;
            if( delta < 0){
                System.out.println("PT vô nghiệm");
            }else if(delta == 0){
                System.out.printf("PT có nghiệm kép \n x1 = x2 = %.5f ", -b/(2*a));
            }else{
                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.printf("PT có 2 nghiệm phân biệt\n x1 = %.5f\n x2 = %.5f",x1,x2);
            }
        }
    }
}
