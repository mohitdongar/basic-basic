/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class evenodd {
    public static void main(String[] args) {
//        int a,b;
        Scanner ob =new Scanner(System.in);
    System.out.println("enter a");
         int a = ob.nextInt();
//          System.out.println("enter b");
//         int b = ob.nextInt();
         if(a%2==0){
             System.out.println("its even");
         } else {
             System.out.println("its odd");
         }
    }
    
}
