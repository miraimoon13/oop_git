/*
 tính giá trị của hàm
 */
package decision;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        if( x >=5 ){
            double result = 2*x*x +5*x + 9;
            System.out.printf("f(%.3f) = %.3f",x,result);
        }
        else{
            double result = -2*x*x +4*x - 9;
            System.out.printf("f(%.3f) = %.3f",x,result);

        }
    }
}
