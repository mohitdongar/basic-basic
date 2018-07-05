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
public class printtablefrom2to9 {
    public static void main(String[] args) {
        int x,y,n;
        for(x=2;x<10;x++)
            for(y=1;y<11;y++)
                System.out.println(x+" x " +y+ " = "+(x*y) );
    }
    
}
