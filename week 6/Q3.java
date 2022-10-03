import java.util.*;

abstract class Figure
{
    abstract double area(int a, int b);
}

class Rectangle extends Figure
{
 double area(int a, int b)
    {return a*b;}
}

class Triangle extends Figure
{
 double area(int a, int b)
    {return 0.5*a*b;}
}

class Square extends Figure
{
 double area(int a, int b)
    {return a*a;}
}

class Q3
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Square s = new Square();
        Figure fr=r;
        Figure ft=t;
        Figure fs=s;
        System.out.println("Area of rectangle with given sides: "+fr.area(sc.nextInt(), sc.nextInt()));
        System.out.println("Area of triangle with given base and height: "+ft.area(sc.nextInt(), sc.nextInt()));
        System.out.println("Area of square with given side: "+fs.area(sc.nextInt(), sc.nextInt()));
    }
}