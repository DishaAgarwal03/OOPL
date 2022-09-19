import java.util.Scanner;
class Time
{
    int hrs, min, sec;
    Scanner sc=new Scanner(System.in);

    void assign()
    {
        System.out.print("Enter the hours, minutes and seconds: ");
        hrs=sc.nextInt();
        min=sc.nextInt();
        sec=sc.nextInt();
    }

    void display()
    {
        System.out.print(hrs+":"+min+":"+sec);
    }

    static Time add(Time A, Time B)
    {
        Time res=new Time();
        res.hrs=A.hrs+B.hrs;
        res.min=A.min+B.min;
        res.sec=A.sec+B.sec;

        if(res.sec>59)
        {
            res.min+=res.sec/60;
            res.sec%=60;
        }
        if(res.min>59)
        {
            res.hrs+=res.min/60;
            res.min%=60;
        }
        if(res.hrs>23)
        {
            res.hrs%=24;
        }
        return res;
    }

    static Time subtract(Time A, Time B)
    {
        Time res=new Time();
        res.hrs=A.hrs-B.hrs;
        res.min=A.min-B.min;
        res.sec=A.sec-B.sec;

        if(res.sec<0)
        {
            res.min--;
            res.sec+=60;
        }
        if(res.min<0)
        {
            res.hrs--;
            res.min+=60;
        }
        if(res.hrs<0)
        {
            res.hrs+=24;
        }
        return res;
    }

    static void compare(Time A, Time B)
    {
        int l;
        if (A.hrs>B.hrs)
            l=1;
        else if (A.hrs<B.hrs)
            l=2;
        else
        {
            if (A.min>B.min)
                l=1;
            else if (A.min<B.min)
                l=2;
            else
            {
                if (A.sec>B.sec)
                    l=1;
                else if (A.sec<B.sec)
                    l=2; 
                else 
                    l=0; 
            }
        }
        if (l==1)
        {
            A.display();
            System.out.print(" is greater than ");
            B.display();
        }
        else if (l==2)
        {
            A.display();
            System.out.print(" is smaller than ");
            B.display();
        }
        else
            System.out.print("Both times are equal");
    }


    public static void main(String args[])
    {
        Time A=new Time();
        Time B=new Time();
        Time res=new Time();        
        A.assign();
        B.assign();

        System.out.println("\n\nThe Times entered are: ");
        A.display();
        System.out.println();
        B.display();

        System.out.println("\n");
        compare(A,B);

        System.out.println("\n\nAdding them: ");
        res=add(A,B);
        res.display();

        System.out.println("\n\nDifference between them: ");
        res=subtract(A,B);
        res.display();

    }
}