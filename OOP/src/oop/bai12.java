// căn bậc 2
package oop;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.printf("%.4f",Math.sqrt(Math.abs(x)));
    }
}
