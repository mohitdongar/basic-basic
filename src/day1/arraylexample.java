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
public class arraylexample {
    public static void main(String[] args) {
        int ar[]=new int[4];
        Scanner ob=new Scanner(System.in);
        int x;
        for(x=0;x<4;x++){
            System.out.println("enter data for array element");
            ar[x]=ob.nextInt();
        }
        System.out.println("array elements are");
        for(x=0;x<4;x++){
            System.out.println(ar[x]);
        }
    }
    
}
