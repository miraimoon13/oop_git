//kiểm tra chẵn lẻ
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
        
        String result = (a%2==0) ? a+" là số chẵn" : a +" là số lẻ";
        System.out.println(result);
    }
}
