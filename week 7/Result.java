//not completed
import java.util.*;
public class Student
{
    static int roll[], marks[];
    static Scanner sc = new Scanner(System.in);
    static void get_num(int n)
    {
        roll= new int[n];
        System.out.print("\nEnter the roll numbers: ");
        for(int i=0;i<n;i++)
            roll[i]=sc.nextInt();
    }
    static void put_num(int n)
    {
        System.out.print("\nThe roll numbers are: ");
        for(int i=0;i<n;i++)
            System.out.print(roll[i]+"  ");
    }
 
    static void get_marks(int n)
    {
        marks= new int[n];
        System.out.print("\nEnter the marks: ");
        for(int i=0;i<n;i++)
            marks[i]=sc.nextInt();
    }
    static void put_marks(int n)
    {
        System.out.print("\nThe marks are: ");
        for(int i=0;i<n;i++)
            System.out.print(marks[i]+"  ");
    }
}

interface Sports
{
    void put_Grade(int n);
}

class Result extends Student implements Sports
{
    public void put_Grade(int n)
    {
        char t;
        for(int i=0; i<n; i++)
            {
                t= (i%2==0)?'A':'B';
                System.out.print(t+"  ");
            }
    }
    public static void main(String args[]) 
    {

        
    }
}