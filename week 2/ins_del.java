import java.util.Scanner;

class ins_del
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int i, n, e, p;


		System.out.println("Enter the size of the array: ");
		n=sc.nextInt();
		int a[]=new int[n+1];
		System.out.println("Enter the elements: ");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();


		//Inserting an element
		System.out.println("Enter the element to be inserted and its position: ");
		e=sc.nextInt();
		p=sc.nextInt();
		for(i=n;i>=p;i--)
			a[i]=a[i-1];
		a[p-1]=e;
		n++;
		System.out.println("Array after Insertion: ");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");


		//Deleting an element
		System.out.println("\nEnter the position of the element to be deleted: ");
		p=sc.nextInt();
		for(i=p-1;i<n-1;i++)
			a[i]=a[i+1];
		n--;
		System.out.println("Array after Deletion: ");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}