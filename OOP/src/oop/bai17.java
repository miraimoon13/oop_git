//chữ thường thành hoa
package oop;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        System.out.println(Character.toUpperCase(a));
    }
}
