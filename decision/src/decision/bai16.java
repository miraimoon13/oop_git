/*
kiểm tra ngày hợp lệ
 */
package decision;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        
        switch(m){
            case  1,3,5,7,8,10,12:
                if(d <=31 && d > 0 && y > 0 ){
                    System.out.println(d +"/"+m+"/"+y+": hợp lệ");
                }else{
                    System.out.println(d +"/"+m+"/"+y+": không hợp lệ");
                }
                break;
            case 4,6,9,11:
                if(d <=30 && d > 0 && y > 0 ){
                    System.out.println(d +"/"+m+"/"+y+": hợp lệ");
                }else{
                    System.out.println(d +"/"+m+"/"+y+": không hợp lệ");
                }
                break;
            case 2:
                if( d > 0 && d <=29 && y % 4 ==0 && y % 100 != 0 || y % 400 ==0){
                    System.out.println(d +"/"+m+"/"+y+": hợp lệ");
                }else{
                    System.out.println(d +"/"+m+"/"+y+": không hợp lệ");
                }
                break;
            default:
                System.out.println(d +"/"+m+"/"+y+": không hợp lệ");
        }
        
    }
}
