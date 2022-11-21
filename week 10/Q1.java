import java.util.*;
class Q1
{
    public static <T> void swap(ArrayList<T> arr, int i, int j)
    {
        Collections.swap(arr, i, j);
    }

    public static <T> void display(ArrayList<T> arr)
    {
        System.out.println(arr);
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        //T[] arr = new T[5]; CANNOT create generic array this way
        System.out.println("Enter 5 numbers: ");
        for(int i=0; i<5; i++)
            arr.add(sc.nextInt());
        display(arr);
        swap(arr, 3,4);   
        display(arr);
    }
}

