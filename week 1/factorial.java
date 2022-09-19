import java.util.Scanner;
class factorial{
    public static int fact(int a)
    {
        int i,f=1;
        for(i=2;i<=a;i++)
            f=f*i;
        return f;
    }

    public static void main(String args[]) 
    {
        int n,r,ncr;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 'n' and 'r': ");
        n=sc.nextInt();
        r=sc.nextInt();

        ncr=fact(n)/(fact(r)*fact(n-r));
        System.out.println("The nCr value is "+ncr);
        
    }
    

}