// kiểm tra cùng dấu
package decision;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        
        String result = ( a > 0 && b > 0 || a<0 && b < 0) ? "Cùng dấu" : "Trái dấu";
        System.out.println(result);
    }
}
