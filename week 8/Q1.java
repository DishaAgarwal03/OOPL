import java.io.*;
import java.util.*;

class StackExceptions extends Exception
{
    private String msg;
    StackExceptions(String e)
    {msg=e;}
    String get()
    {return msg;}
}

class Stack
{
    Scanner sc=new Scanner(System.in);
    int top, n=5;
    int a[]=new int[n];

    void push() throws StackExceptions
    {
        try
        {
            if(top==n-1)
                throw new StackExceptions("Stack Overflow!");
            System.out.print("Enter an element: ");
            a[++top]=sc.nextInt();
            System.out.println("Element Pushed! ");
        }
        catch(StackExceptions err)
        {
            System.out.println(err.get());
        }
    }

    void pop() throws StackExceptions
    {
        try
        {
            if(top==-1)
                throw new StackExceptions("Stack Underflow!");
            System.out.println("Popped element is "+a[top--]);
        }
        catch(StackExceptions err)
        {
            System.out.println(err.get());
        }
    }

    void display()
    {
        for(int i=0;i<=top;i++)
            System.out.print(a[i]+"   ");
        System.out.println();
    }
}

class Q1 
{
    public static void main(String args[]) throws StackExceptions
    {
        Stack s= new Stack();
        Scanner sc = new Scanner(System.in);
        s.top=-1;
        int ch;
        do
        {
            System.out.println("Enter 1) To push 2) To Pop 3) To Display 4) To Exit");
            ch=sc.nextInt();
            if(ch==1) s.push();
            else if (ch==2) s.pop();
            else if (ch==3) s.display();
            else if (ch!=4) System.out.println("Invalid Choice!");
        }while(ch!=4);
    }
}