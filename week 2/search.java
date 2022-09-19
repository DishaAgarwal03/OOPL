import java.util.Scanner;

class search
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int i, n, c, f=0;

		System.out.print("Enter the size of the array: ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements: ");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		System.out.print("Enter the element to be searched: ");
		c=sc.nextInt();

		for(i=0;i<n;i++)
		{
			if (a[i]==c)
			{
				System.out.println(c+" is present at position "+(i+1));
				f=1;
			}
		}
		if(f==0)
			System.out.println(c+" is not present in the array.");
	}
}