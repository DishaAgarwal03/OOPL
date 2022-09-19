import java.util.Scanner;

class sort
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int i, j, n, t;


		System.out.println("Enter the size of the array: ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements: ");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();


		//Sorting in ascending order
		for(i=0;i<n-1;i++)
			for(j=0;j<n-i-1;j++)
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
		System.out.println("\nArray in Ascending Order:");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");


		//Sorting in descending order
		for(i=0;i<n-1;i++)
			for(j=0;j<n-i-1;j++)
				if(a[j]<a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
		System.out.println("\n\nArray in Descending Order:");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	    System.out.println();
	}
}