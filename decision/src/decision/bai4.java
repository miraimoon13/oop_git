// giá trị tuyệt đối
package decision;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.printf("\n|a| =" + Math.abs(a));
        System.out.printf("\n|b| =" + Math.abs(b));
        System.out.printf("\n|c| =" + Math.abs(c));

    }
}
