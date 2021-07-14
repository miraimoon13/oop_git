//kiểm tra âm dương
package decision;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double x = sc.nextDouble();
        if( x>0){
             System.out.printf("%.3f là số dương",x);
            
        }else{
            System.out.printf("%.3f là số âm",x);
        }
    }
}
