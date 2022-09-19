import java.util.Scanner;
import static java.lang.Math.sqrt;
class roots{
    
    public static void main(String args[]) 
    {
        int a,b,c,d,k;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the values of 'a', 'b' and 'c': ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=b*b-4*a*c;

        if(d>0) k=1;
        else if(d==0) k=2;
        else k=3;

        switch(k)
        {
            case 1:
            double r1,r2;
            r1=(-b+sqrt(d))/(2*a);
            r2=(-b-sqrt(d))/(2*a);
            System.out.printf("The roots are: %.2f and %.2f %n",r1,r2);
            break;

            case 2:
            double r;
            r=-b/(2*a);
            System.out.println("The roots are same and equal to: "+r);
            break;

            default:
            double re,im;
            d=d*-1;
            re=-b/(2*a);
            im=sqrt(d)/(2*a);
            System.out.printf("The roots are: %.2f+%.2fi and %.2f-%.2fi %n",re,im,re,im);
            break;
        }
        
    }
    

}
