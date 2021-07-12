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
public class bai5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Float a= sc.nextFloat();
        Float b= sc.nextFloat();
        int d1= sc.nextInt();
        int d2= sc.nextInt();
        String st = String.format("%"+d1+"."+d2+"f",(a/b));
       
        System.out.print(st);
    }
}
