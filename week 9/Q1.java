class Mult extends Thread
{
    int n;
    Mult(int n)
    {
        super("Demo thread "+n);
        System.out.println("Thread: "+this);
        this.n=n;
        start();
    }

    public void run()
    {
        try
        {
            for(int i=1; i<=10; i++)
            {
                System.out.println(n+"*"+i+" = "+(n*i));
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        { System.out.println("Thread interrupted"); }

        System.out.println("Table of "+n+" completed");
    }
}

class Q1 
{
    public static void main(String args[]) 
    {
        Mult m1=new Mult(5);
        Mult m2=new Mult(7);
    }
}

