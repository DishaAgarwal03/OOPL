import java.util.*;
import myPackages.p1.Maximum;
public class Q2
{
    public static void main(String args[]) 
    {
        int i, j, n, r, c, l;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        l = Maximum.max(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.print("Maximum is "+l+"\nEnter three floating point numbers: ");
        
        double la = Maximum.max(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.print("Maximum is "+la+"\nEnter the size of the array: ");
        
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the elements: ");
        for(i=0; i<n; i++)
            a[i]=sc.nextInt();
        l = Maximum.max(a);
        System.out.print("Maximum is "+l+"\nEnter the number of rows and columns of the matrix: ");
        
        r = sc.nextInt();
        c = sc.nextInt();
        int ar[][] = new int[r][c];
        System.out.print("Enter the elements: ");
        for(i=0; i<r; i++)
            for(j=0; j<c; j++)
                ar[i][j]=sc.nextInt();
        l = Maximum.max(ar);
        System.out.println("Maximum is "+l);
    }
}