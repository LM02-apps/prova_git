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
public class prog1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Razionale uno=new Razionale(1,5); //frazione 1
        Razionale due=new Razionale(2,7); // frazione 2
        //  Razionale tre=new Razionale(3,0);
        Razionale tre=new Razionale(4,20); //riduzione
        Razionale quattro=new Razionale(); //somma
        
        Razionale cinque=new Razionale(); //differenza
        Razionale sei=new Razionale();//prodotto
        Razionale sette=new Razionale();//quoziente
        Razionale otto=new Razionale (3,5); //reciproco
        Razionale nove= new Razionale (0,5); //isZero
        Razionale dieci= new Razionale (6,2); //isPositive
        Razionale undici= new Razionale (1,7); //confronto
        Razionale dodici=new Razionale (6,7);
        
        
        System.out.println("la frazione e:"+tre.getnum()+"/"+tre.getden());
        tre.riduci();
        System.out.println("la riduzione e:"+tre.getnum()+"/"+tre.getden());
        
        quattro=uno.somma(due);
        System.out.println("la somma e:"+quattro.getnum()+"/"+quattro.getden());
       
        cinque=uno.differenza(due);
        System.out.println("la differenza e:"+cinque.getnum()+"/"+cinque.getden());
        
        sei=uno.prodotto(due);
        System.out.println("il prodotto e:"+sei.getnum()+"/"+sei.getden());
        
        sette=uno.quoziente(due);
        System.out.println("il quoziente e:"+sette.getnum()+"/"+sette.getden());
       
        
        System.out.println("la frazione e:"+otto.getnum()+"/"+otto.getden());
        otto.reciproco();
        System.out.println("il reciproco della frazione e:"+otto.getnum()+"/"+otto.getden());
        
        
        if (nove.isZero()==0)
        {
            System.out.println("il numeratore e' pari a 0");
        }
        
        if (dieci.isPositive()>0)
        {
            System.out.println("il numeratore e' maggiore di 0");
        }
        
        if (undici.confronto(dodici)==0)
        {
            System.out.println("Le frazioni sono uguali");
        }
        else if (undici.confronto(dodici)==-1)
        {
            System.out.println("La prima frazione e' minore della seconda");
        }
        else if (undici.confronto(dodici)==1)
        {
            System.out.println("La prima frazione e' maggiore della seconda");
        }
        
    }
    
}