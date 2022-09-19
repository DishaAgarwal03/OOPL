import java.util.Scanner;
import java.lang.Math;
class Complex
{
    int re, im;
    void assign()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real and imaginary part of the complex number:");
        re=sc.nextInt();
        im=sc.nextInt();
    }

    void display()
    {
        if (im>=0)
            System.out.println("  "+re+"+i"+im);
        else
            System.out.println("  "+re+"-i"+Math.abs(im));

    }

    static Complex add(Complex n1, Complex n2)
    {
        Complex res= new Complex();
        res.re=n1.re+n2.re;
        res.im=n1.im+n2.im;
        return res;
    }

    static Complex subtract(Complex n1, Complex n2)
    {
        Complex res= new Complex();
        res.re=n1.re-n2.re;
        res.im=n1.im-n2.im;
        return res;
    }

    public static void main(String args[])
    {
        Complex c1=new Complex();
        Complex c2=new Complex();

        c1.assign();
        c2.assign();

        System.out.print("\nFirst Complex number:");
        c1.display();
        System.out.print("Second Complex number:");
        c2.display();


        Complex a_res=add(c1,c2);
        System.out.print("\nResult after addition:");
        a_res.display();
        Complex s_res=subtract(c1,c2);
        System.out.print("Result after subtraction:");
        s_res.display();

    }
}