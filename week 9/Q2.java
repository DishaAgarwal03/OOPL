class Mat implements Runnable
{
    String name;
    Thread t;
    int c, sum=0;
    static r=-1;

    Mat(String n, int c)
    {
        r++;
        this.c=c;
        name=n;
        t= new Thread(this, name);
        System.out.println("Neww thread: "+t);
        t.start();
    }

    public void run()
    {
        try
        {
            for(int i=0; i<c;i++)
            {
                sum+=a[r][i];
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(name+" Interrupted!");
        }
        System.out.println(name+" exiting!");
    }
}

class Q2
{
    public static void main(String args[]) 
    {
          
        
    }
}