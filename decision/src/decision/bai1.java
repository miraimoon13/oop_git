//so sánh 3 số 
package decision;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a ? a :(b ? b :c);
    }
}
