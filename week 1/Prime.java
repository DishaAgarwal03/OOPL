import java.util.Scanner;
class Prime{
    public static int isPrime(int a)
    {
        int i;
        if (a==1)
            return 0;
        for(i=2;i<a;i++)
            if (a%i==0)
                return 0;  
        return 1;
    }

    public static void main(String args[]) 
    {
        int n,c=1,k=2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of 'n': ");
        n=sc.nextInt();
        System.out.println("The first "+n+" prime numbers are:");
        while(c<=n)
        {
            if (isPrime(k)==1)
            {
                System.out.println(k);
                c++;
            }
            k++;
        }
    }   
}