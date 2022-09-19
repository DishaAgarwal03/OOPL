import java.util.Scanner;
import java.lang.Math;
class armstrong{
    public static int isArmstrong(int n)
    {
        int s=0,a=n,d,c=0;
        while(a!=0)
        {
            c++;
            a=a/10;
        }
        a=n;
        while(a!=0)
        {
            d=a%10;
            s=s+(int)Math.pow(d,c);
            a=a/10;
        }  
        if(s==n)
            return 1;
        else 
            return 0;
    }

    public static void main(String args[]) 
    {
        int n,s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        if (isArmstrong(n)==1)
            System.out.println("It is a armstrong number");
        else
            System.out.println("It is not a armstrong number"); 
    }   
}
