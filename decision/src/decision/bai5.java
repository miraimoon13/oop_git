// so sánh 2 số
package decision;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String result = ( a > b) ? a+" > "+b : (a < b) ? a+" < "+b : a+" = "+b;
        System.out.println(result);
    }
}
