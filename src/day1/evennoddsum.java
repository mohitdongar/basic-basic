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
public class evennoddsum {
    public static void main(String[] args) {
        int a=1,sum1=0,sum2=0;
        while(a<7){
            if(a%2==0) 
                sum1=sum1+a;
            else
                sum2=sum2+a;
            a=a+1;
        
    }
        System.out.println("even "+sum1+ " odd "+sum2);
}
}
