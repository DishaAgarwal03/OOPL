import java.util.*;
class Q1
{
    T swap(T a)
    {
        int t=a[0];
        a[0]=a[1];
        a[1]=t;
    }

    T display(T a)
    {
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<T> arr = new ArrayList<T>();
        //T[] arr = new T[5]; CANNOT create generic array this way
        System.out.println("Enter 5 numbers: ");
        for(int i=0; i<5; i++)
            arr[i]=sc.nextInt();
        display(arr);
        swap(arr);   
        display(arr);
    }
}

