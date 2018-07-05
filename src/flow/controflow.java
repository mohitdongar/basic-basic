/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class controflow {
     public static void main(String[] args) {
    Scanner ob =new Scanner(System.in);
    System.out.println("enter a");
         int a = ob.nextInt();
          System.out.println("enter b");
         int b = ob.nextInt();
         if(a==b){
             System.out.print("both are equ");
             
          
         }
         else
             
             System.out.print("both are not equ");
    
}
}