import java.util.Scanner;

class add
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int r1, r2, c1, c2, i, j;

		System.out.print("Enter the number of rows and columns of matrix 1: ");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.print("Enter the number of rows and columns of matrix 2: ");
		r2=sc.nextInt();
		c2=sc.nextInt();

		if (r1!=r2 || c1!=c2)
			System.out.println("\nAddition not possible");
		else
		{
			int a[][]=new int[r1][c1];
			int b[][]=new int[r2][c2];
			int c[][]=new int[r2][c2];

			System.out.println("\nEnter the elements of matrix 1");
			for(i=0;i<r1;i++)
				for(j=0;j<c1;j++)
					a[i][j]=sc.nextInt();
			System.out.println("Enter the elements of matrix 2");
			for(i=0;i<r2;i++)
				for(j=0;j<c2;j++)
					b[i][j]=sc.nextInt();

			for(i=0;i<r2;i++)
				for(j=0;j<c2;j++)
					c[i][j]=a[i][j]+b[i][j];
		
			System.out.println("\nThe Resultant Matrix is: ");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
					System.out.print(c[i][j]+" ");
				System.out.println();
			}
		}
	}
}