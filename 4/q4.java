import java.util.Scanner;
class Create
{
    static int c=0; 
    static void showCount()
    {
        c++;
        System.out.println(c+" object(s) created so far");
    }
}

class q4
{
    public static void main(String args[]) 
    {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            Create C= new Create(); 
            Create.showCount();
        }   
    }
}
