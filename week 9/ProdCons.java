class Q3
{
    int n;
    boolean val=false;
    synchronized int get()
    {
        while(!val)
            try {
                wait();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        System.out.println("Consumed "+n);
        val=false;
        notify();
        return n;
    }

    synchronized void put(int n)
    {
        while(val)
            try {
                wait();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        this.n=n;
        val=true;
        System.out.println("Produced "+n);
        notify();
    }
}

class Producer implements Runnable
{
    Q3 q;
    Producer(Q3 q)
    {
        this.q=q;
        new Thread(this,"Producer").start();
    }
    public void run() 
    {
        int i=0;
        while(true)
            q.put(i++);
    }
}

class Consumer implements Runnable
{
    Q3 q;
    Consumer(Q3 q)
    {
        this.q=q;
        new Thread(this,"Consumer").start();
    }
    public void run() 
    {
        while(true)
            q.get();
    }
}

class ProdCons
{
    public static void main(String args[]) 
    {
        Q3 q= new Q3();
        new Producer(q);
        new Consumer(q);
    }
}