//tìm số lớn nhÁT trong 3 số
package decision;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result =  a > b ? (a > c ? a : c) :( b > c ? b :c);
        System.out.println(result);
        
    }
}
