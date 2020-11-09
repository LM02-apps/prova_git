/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frazioni;

/**
 *
 * @author 4BIA
 */
public class MCD {
    
    public int a,b;
    
    public MCD(){
   
    }
    
    public int mcd(int a, int b)
    {  
        if (a == b)
            return a;
        else
   if (a > b)
       return mcd(a - b, b);
   else 
       return mcd(b, a);
    }
}