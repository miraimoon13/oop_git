//phép toán trên số thực 1
package oop;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.printf("\na  " +"= %10.3f",a);
        System.out.printf("\nb  " +"= %10.3f",b);
        System.out.printf("\na+b" +"= %10.3f",(a+b));
        System.out.printf("\na-b" +"= %10.3f",(a-b));
        System.out.printf("\na*b" +"= %10.3f",(a*b));
        System.out.printf("\na/b" +"= %10.3f",(a/b));

    }
}
