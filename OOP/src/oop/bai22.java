//kiểm tra chẵn lẻ mà không so sánh
package oop;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai22 {
    public static  void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int result =(a%2==0) ? 1 : 0;
        System.out.println(result);
    }
}
