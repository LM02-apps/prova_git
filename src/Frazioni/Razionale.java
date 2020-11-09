package Frazioni;

/**
 *
 * @author 4BIA
 */
public class Razionale {
    
    //variabili
    private int num;
    private int den;
    
    //costruttori
    public Razionale()
    { 
        num=0;
        den=1;
    }
    public Razionale(int num)
    {
        this.num=num;
        den=1;
    }
    public Razionale(int num, int den)throws ArithmeticException
    {
        if(den==0)
        {
            throw new ArithmeticException("denominatore non valido");
        }
        this.num=num;
        this.den=den;
    }
   
    public int getden()
    {
       return den;
    }
    
    public int getnum()
    {
       return num;
    }
    
    public void setden (int den, int num)throws ArithmeticException
    {
        if(den==0)
        {
            throw new ArithmeticException("denominatore non valido");
        }
       this.num=num;
       this.den=den;
    }
    
    public void riduci()
    {
       MCD frazione= new MCD();
       int divisore=frazione.mcd(num,den);
       int nuovonum=num/divisore;
       int nuovoden=den/divisore;
       num=nuovonum;
       den=nuovoden;
       //System.out.println("la nuova frazione è "+nuovofraz);
    }
    
    public Razionale somma(Razionale x)
    {
        MCM frazione=new MCM();
        int multiplo=frazione.mcm(den,x.getden());
        int nuovoden=multiplo;
        int nuovonum=multiplo/den*num+multiplo/x.getden()*x.getnum();
        Razionale rissomma=new Razionale(nuovonum,nuovoden);
        return rissomma;
    }
    public Razionale differenza(Razionale x)
    {
        MCM frazione=new MCM();
        int multiplo=frazione.mcm(den,x.getden());
        int nuovoden=multiplo;
        int nuovonum=multiplo/den*num-multiplo/x.getden()*x.getnum();
        Razionale risdifferenza=new Razionale(nuovonum,nuovoden);
        return risdifferenza;
    }
    
    public Razionale prodotto(Razionale x)
    {
        
        int nuovoden=den*x.getden();
        int nuovonum=num*x.getnum();
        Razionale risprodotto=new Razionale(nuovonum,nuovoden);
        return risprodotto;
    }    

    public Razionale quoziente(Razionale x)
    {
        int num2=x.getden();
        int den2=x.getnum();
        
        int nuovoden=den*den2;
        int nuovonum=num*num2;
        Razionale risquoziente=new Razionale(nuovonum,nuovoden);
        return risquoziente;
    }
    
    public void reciproco()
    {
       int valore=den;
       den=num;
       num=valore;
    }
    
    public int isZero()
    {
     int controllo=num;
     int ris;
     if (controllo==0)
     {
         ris=0;
     }
     else
     {
         ris=1;
     }
     return ris;
    }
    public int isPositive()
    {
     int controllo=num;
     int ris;
     if (controllo>0)
     {
         ris=1;
     }
     else
     {
         ris=0;
     }
     return ris;
    }   
    
    public int confronto(Razionale x)
    {
        
        int ritorno;
        int num2=x.getden();
        int den2=x.getnum();

        if (num==num2 && den==den2)
        {
            ritorno=0;
            
        }
        else if (num>num2 && den>den2)
        {
            ritorno=-1;
            
        }
        else if (num<num2 && den<den2)
        {
            ritorno=1;
        }   
        return ritorno;
            
    }
    
    
    
}