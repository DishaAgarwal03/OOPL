//Sample program for generics

class sample<T> //T is parameterized type. This is a generic class.
{
    T a;
    T b;
    sample(T a, T b)
    {
        this.a=a;
        this.b=b;
    }
    void display()
    {
        System.out.println("A and B are: "+a+b);
    }
}

class Generics
{
    public static void main(String args[]) 
    {
        sample<Integer> s1 = new sample<Integer>(4,5);
        s1.display();
        sample<Double> s2 = new sample<Double>(2.5, 5.4);
        s2.display();   
    }
}
/*generic method:

T method_name(T parameter1, T parameter2)
{}

*/

//wildcard: ?
