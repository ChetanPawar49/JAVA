public class Slip8A extends Thread { 
    String str; 
    int n; 
    
    Slip8A(String str, int n)
    { 
        this.str = str; 
        this.n = n; 
    } 
    
    public void run()
    { 
        try
        { 
            for (int i = 0; i < n; i++)
            { 
                System.out.println(getName() + " : " + str); 
            } 
        } catch (Exception e)
        { 
            e.printStackTrace(); 
        } 
    } 
    public static void main(String[] args) 
    { 
        Slip8A t1 = new Slip8A("COVID19", 10); 
        Slip8A t2 = new Slip8A("LOCKDOWN2020", 20); 
        Slip8A t3 = new Slip8A("VACCINATED", 30); 
        t1.start(); 
        t2.start(); 
        t3.start(); 
    } 
}    