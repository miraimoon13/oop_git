/*
giải hệ pt bậc nhất 2 ẩn
 */
package decision;

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
        double e = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double f = sc.nextDouble();
        
        double D= a*d - c*b;
        double Dx= b*f - d*e;
        double Dy= a*f - c*e;

        if(D==0){
            if(Dx == 0 && Dy==0){
                System.out.println("PT vô số nghiệm");
            }else{
                System.out.println("PT vô nghiệm");
            }
        }else{
            System.out.printf("Hệ phương trình có nghiệm duy nhất \n x = %.5f \n y = %.5f",Dx/D,Dy/D);
        }
    }
}
