import java.util.Scanner;
import java.lang.Math;
class Complex
{
    int re, im;
    
    Complex(int r, int i)
    {
        re=r;
        im=i;
    }

    Complex()
    {
        re=5;
        im=1;
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
}

class q1
{
    public static void main(String args[])
    {
        int real, imag;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the real and imaginary part of the first number:");
        real=sc.nextInt();
        imag=sc.nextInt();
        Complex c1=new Complex(real, imag);

        Complex c2=new Complex();

        System.out.print("\nFirst Complex number:");
        c1.display();
        System.out.print("Second Complex number:");
        c2.display();


        Complex a_res= Complex.add(c1,c2);
        System.out.print("\nResult after addition:");
        a_res.display();
        Complex s_res=Complex.subtract(c1,c2);
        System.out.print("Result after subtraction:");
        s_res.display();
    }
}
