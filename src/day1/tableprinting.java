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
public class tableprinting {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a,n;
        System.out.println("enter num whose table u eant");
        n=ob.nextInt();
        for(a=10;a>0;a=a-1)
        {
            System.out.println(n+" X "+a +" = "+(a*n));
        }
    }
    
}
