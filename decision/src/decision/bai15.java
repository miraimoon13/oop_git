/*
 kiểm tra năm nhuận
 */
package decision;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        
        String res = (x % 4 ==0 && x % 100 != 0 || x % 400 ==0) ? "Năm "+x+" là năm nhuận" : "Năm "+x+" không là năm nhuận";
        System.out.println(res);
    }
}
