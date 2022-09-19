import java.util.Scanner;
class Largest {
    public static int largest(int a, int b, int c)
    {
        if(a>b && a>c)
            return a;
        else if(b>a && b>c)
            return b;
        else
            return c;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a, b, c, l;
        System.out.print("Enter three numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        l=largest(a,b,c);
        System.out.println(l+" is the largest");

    }
    
}
