import java.util.Scanner;
class SumOfDigits{
    public static int sum(int a)
    {
        int s=0;
        while(a!=0)
        {
            s=s+a%10;
            a=a/10;
        }  
        return s;
    }

    public static void main(String args[]) 
    {
        int n,s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        s=sum(n);
        System.out.println("The sum of the digits of "+n+" is "+s);
    }   
}