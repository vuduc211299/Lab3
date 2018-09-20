/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_tuan3;

/**
 *
 * @author VŨ ĐỨC
 */
public class Test_2_Methods {
    /* find ucln cua 2 so a va b */
    public static int gcd(int a, int b)
    {
        return (b == 0) ? a: gcd(b, a % b);
    }
    
    // Find finbonaci 
    
    public static int Fibonaci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        
        return n+Fibonaci(n-1);
    }
    
    public static void main(String [] args){
        System.out.print(Fibonaci(4));
        System.out.print("\n" + gcd(218,105));
    }
}
