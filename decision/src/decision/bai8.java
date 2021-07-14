//in ra thứ trong tuần
package decision;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai8 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        
        switch(a){
        case 2:
            System.out.println("Thứ Hai");
            break;
        case 3:
            System.out.println("Thứ Ba");
            break;
         case 4:
            System.out.println("Thứ Bốn");
            break;
        case 5:
            System.out.println("Thứ Năm");
            break;
         case 6:
            System.out.println("Thứ Sáu");
            break;
        case 7:
            System.out.println("Thứ Bảy");
            break;
        
        case 8:
            System.out.println("Chủ NHật");
            break;
        default:
            System.out.println("Thứ không hợp lệ");
        }
    }
   
}
