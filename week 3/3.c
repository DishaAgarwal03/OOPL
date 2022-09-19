3a#include <stdio.h>
void swap(int *a,int *b)
{
	int temp =*a;
	*a=*b;
	*b=temp;
}
int main()
{
	int *p,a,b;
	printf("Enter 2 numbers");
	scanf("%d %d",&a,&b);
	swap(&a,&b);
	printf("Swapped numbers are %d %d",a,b);
	return 0;
}
3b#include<stdio.h>
int* smaller(int *a,int *b)
{
	if(*b>*a)
	return a;
	else
	return b;
}
int main()
{
	int a,b;
	int *p;
	printf("Enter 2 numbers");
	SCANF("%d %d",&a,&b);
	p=smaller(&a,&b);
	printf("Smaller elemet is %d",*p);
}
3c#include<stdio.h>
int main()
{
	int a,int *p;
	printf("Enter a number");
	scanf("%d",&a);
	p=&a;
	printf("Value at %p is %d",p,*p);
	printf("Address of pointer is %p",&p);
}