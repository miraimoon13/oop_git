/*
xác định quý trong năm
 */
package decision;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        
        switch(m){
            case 1,2,3:
                System.out.println("Tháng "+m+" thuộc quý I");
                break;
            case 4,5,6:
                System.out.println("Tháng "+m+" thuộc quý II");
                break;
            case 7,8,9:
                System.out.println("Tháng "+m+" thuộc quý III");
                break;
            case 10,11,12:
                System.out.println("Tháng "+m+" thuộc quý IV");
                break;
            default:
                System.out.println("Trong năm không có tháng "+m);
        }
    }
}
