import java.util.Scanner;
class Mixer
{
    int arr[]=new int[100];
    int len;
    Scanner sc=new Scanner(System.in);

    void accept()
    {
        System.out.print("\nEnter the length of the array: ");
        len=sc.nextInt();
        System.out.print("Enter the elements in ascending order: ");
        for(int i=0;i<len;i++)
            arr[i]=sc.nextInt();
    }

    void display()
    {
        for (int i=0;i<len;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    static Mixer mix(Mixer A, Mixer B)
    {
        Mixer res=new Mixer();
        res.len=A.len+B.len;
        for(int i=0;i<A.len;i++)
            res.arr[i]=A.arr[i];
        for(int i=A.len;i<A.len+B.len;i++)
            res.arr[i]=B.arr[i-A.len];
        return res;
    }
}

class q3
{
    public static void main(String args[])
    {
       Mixer A=new Mixer();
       A.accept();
       Mixer B=new Mixer();
       B.accept();

       System.out.print("\nFirst array: ");
       A.display();
       System.out.print("Second array: ");
       B.display();

       Mixer res=Mixer.mix(A,B);
       System.out.print("Resultant array: ");
       res.display(); 
    }
}