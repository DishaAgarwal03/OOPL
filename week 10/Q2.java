//non-static can call static
//static can't call non-static w/o object

class Gen<T>
{
    T ob
    Gen(T o)
    {
        ob=o;
    }

    void push(int n)
    {
        ob.(++top)=n;
    }

    void pop()
    {
        ob.(top--);
    }

    display()
    {

    }
}

class Employee
{
    int id[], top;
    Employee(int n)
    {
        id=new int[n];
        top=-1;
    }
}
class Student
{
    int id[], top;
    Student(int n)
    {
        id=new id[n];
        top=-1;
    }
}
class Q2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Gen<Student> st=new Gen<Student>(new Student(5));
        Gen<Employee> em=new Gen<Employee>(new Employee(5));
        st.push(1);
        st.push(2);
        st.display();
        st.pop();
        st.display();

        em.push(101);
        em.push(102);
        em.display();
        em.pop();
        em.display();
    }
}