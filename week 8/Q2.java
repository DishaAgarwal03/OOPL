import java.io.*;
import java.util.*;

class DateExceptions extends Exception
{
    private String msg;
    DateExceptions(String e)
    {msg=e;}
    String get()
    {return msg;}
}

class CurrentDate
{
    Scanner sc=new Scanner(System.in);
    int day, month, year;

    void createDate() throws DateExceptions
    {
        System.out.print("\nEnter date, month and year: ");
        day=sc.nextInt();
        month=sc.nextInt();
        year=sc.nextInt();
    }  
}

class Q2 
{
    public static void main(String args[]) throws DateExceptions
    {
        int f=0;
        DateExceptions DAY= new DateExceptions("Invalid Date!");
        DateExceptions MONTH= new DateExceptions("Invalid month!");
        
        CurrentDate c= new CurrentDate();
        c.createDate();
        int d,m,y;
        d=c.day; m=c.month; y=c.year;
        try
        {
            if(m>12||m<1) {f=1; throw MONTH;}
            else if(m==2 && (d<1||d>28)) throw DAY;
            else if((m==4||m==6||m==9||m==11) && (d<1||d>30)) throw DAY;
            else if((m==1||m==3||m==5||m==7||m==8||m==10||m==12) && (d<1||d>31)) throw DAY;
            else if(f==0) System.out.println(d+"/"+m+"/"+y);
        }
        catch(DateExceptions err1)
        {
            System.out.println(err1.get());
        }
        
    }
}