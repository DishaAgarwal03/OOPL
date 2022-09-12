import java.util.Scanner;
class Stack
{
int[] arr1;
int tos;
void initialize(int size)
{
tos=-1;
arr1 = new int[size];
for(int i=0;i<size;i++)
arr1[i]=0;
}
void push(int ele)
{
if(tos==arr1.length-1)
{
System.out.println("Stack overflow!! Cannot push.");
}
else
{
tos++;
arr1[tos]=ele;
}
}
int pop()
{
int retele=-1;
if(tos==-1)
{
System.out.println("Stack underflow!! Cannot pop.");
}
else
{
retele = arr1[tos];
arr1[tos]=0;
tos--;
}
return retele;
}

void display()
{
System.out.print("The array contents is: ");
for(int i=0;i<arr1.length;i++)
{
System.out.print(arr1[i]+" ");
}
}
}

class Lab3ex4
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
Stack s = new Stack();
s.initialize(10);
int choice;
int temp;
do
{
System.out.println("Enter the choice: 1. Push  2. Pop");
choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter the element to push");
temp=sc.nextInt();
s.push(temp);
s.display();
break;
case 2:
int temp1=s.pop();
System.out.println("The popped element is: "+temp1);
s.display();
break;
//case 3:
//exit(0);
}
System.out.println("1. continue 2. Exit");
choice=sc.nextInt();
}while(choice!=2);
}
}