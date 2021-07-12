
package oop;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai3 {
    public static void main(String[] args){
        int x,y;
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhập vào 2 số tự nhiên x,y: ");;
        x = ip.nextInt();
        y = ip.nextInt();
        
        if( y<=x && x<1000 && y>0){
            System.out.println("Tổng x + y =" +(x+y));
            System.out.println("Hiệu x - y =" +(x-y));
        }
        else{
            System.out.println("Gía trị nhập vào không hợp lệ, Vui lòng nhâp lại");
        }
    }
}
