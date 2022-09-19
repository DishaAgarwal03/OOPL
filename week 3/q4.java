import java.util.Scanner;
class Stack
{
    int a[], tos;
    void initial(int n)
    {
        tos=-1;
        a=new int[n];
    }

    void display()
    {
        int i;
        for (i=0;i<=tos;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }

    void push()
    {
        if (tos>=a.length-1)
            System.out.println("Stack overflow!");
        else
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num=sc.nextInt();
            tos++;
            a[tos]=num;
            System.out.println("Array after Pushing:");
            display();
        }
    }

    public void pop()
    {
        if (tos<0)
            System.out.println("Stack underflow!");
        else
        {
            System.out.println("Array after Popping "+a[tos]+": ");
            tos--;
            display();
        }
    }
}

class q4
{

    public static void main(String args[])
    {
        int c,len;
        Stack one= new Stack();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        len=sc.nextInt();
        one.initial(len);

        while(true)
        {
            System.out.println("\nEnter \n1 to push \n2 to pop \n3 to display \n4 to exit");
            c=sc.nextInt();
            switch(c)
            {
                case 1: one.push();
                        break;
                case 2: one.pop();
                        break;
                case 3: System.out.println("Array: ");
                        one.display();
                        break;
                case 4: System.exit(0);
                        break;
                default:System.out.println("Invalid Input");
            }
        }
    }
}
