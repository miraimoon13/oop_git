// làm tròn số đến phần thập phân
package oop;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        x = Math.round(x *10);
        x = x/10;
        x = Math.pow(x, 2);
        System.out.printf("%.2f",x);
    }
}
