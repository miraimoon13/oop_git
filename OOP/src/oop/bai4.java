/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author VU NGUYET
 */
public class bai4 {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();
      
        if( b !=0){
            System.out.print("Sum = " +(a+b) +"\nSub = "+
                    (a-b) + "\nMul = "+ (a*b)+ "\nDiv = " +(a/b) + "\nMod = " +(a%b));
        }
    }
}
