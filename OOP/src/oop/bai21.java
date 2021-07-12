// so sánh mà k so sánh
package oop;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int s= a-b;
        s=s>>31;
        System.out.println(-s);
        
    }
}
