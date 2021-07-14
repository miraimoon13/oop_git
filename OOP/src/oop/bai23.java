// kiểm tra chia hết mà k so sánh
package oop;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = (a%b ==0) ? 1 : 0;
        System.out.println(result);
    }
}
