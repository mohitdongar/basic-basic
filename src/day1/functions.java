/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author Admin
 */
public class functions {
    public static void main(String[] args) {
        display();
        calculation(1, 2);
        int x=call(4);
        System.out.println("the value of x is "+x);
        String y=compare(-5);
        System.out.println(y);
    }
    
    public static void display() {
        System.out.println("display function");
    }
    public static void calculation(int a, int b) {
        System.out.println(a+b);
    }
    
    public static int call(int a) {
//       int a;
        return a*a;
        
    }
    public static String compare(int a) {
        if(a>0)
        return "num is +ive";
        else
        return "num is -ve";
    }
}
