
package oop;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        
        String st = String.format(("%"+d1+"."+d2+"f"),a);
        String st1 = String.format(("%"+d1+"."+d2+"f"),b);
        String st2 = String.format(("%"+d1+"."+d2+"f"),(a+b));
        String st3 = String.format(("%"+d1+"."+d2+"f"),(a-b));
        String st4 = String.format(("%"+d1+"."+d2+"f"),(a*b));
        String st5 = String.format(("%"+d1+"."+d2+"f"),(a/b));



        
        System.out.printf("("+st+")+("+st1+")+ = "+ st2 +"\n");
        System.out.printf("("+st+")-("+st1+")+ = "+ st3 +"\n");
        System.out.printf("("+st+")*("+st1+")+ = "+ st4 +"\n");
        System.out.printf("("+st+")/("+st1+")+ = "+ st5 +"\n");

    }
}
