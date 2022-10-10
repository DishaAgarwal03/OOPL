import java.util.*;

interface Series
{
    int get_next(int a);
    void reset(int[] a, int n);
    void set_start(int[] a);
}

class ByTwos implements Series
{
    public void set_start(int a[])
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first element: ");
        a[0]= sc.nextInt(); 
    }

    public int get_next(int a)
    { return a+2; }

    public void reset(int a[], int  n)
    {
        set_start(a);
        for(int i=1;i<n;i++)
            a[i]=get_next(a[i-1]); 
    }
}

class Q3
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        ByTwos B = new ByTwos();
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        B.reset(a, n);
        for(int i=0; i<n; i++)
            System.out.print(a[i]+"  ");
        System.out.println();
    }

}