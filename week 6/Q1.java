import java.util.*;

class Person
{
    private String name, dob;
    Person(String n, String d)
    {
        name=n;
        dob=d;
    }
    String get_name()
        {return name;}
    String get_dob()
        {return dob;}
}

class College_Graduate extends Person
{
    static Scanner sc= new Scanner(System.in);
    private float gpa;
    private int year;
    
    College_Graduate(float g, int y)
    {
        super(sc.nextLine(), sc.nextLine());
        gpa=g;
        year=y;
    }
    float get_gpa()
        {return gpa;}
    int get_year()
        {return year;}
}

class Q1
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter GPA, Year of Graduation, Name and Date of Birth: ");
        College_Graduate cg = new College_Graduate(sc.nextFloat(), sc.nextInt());
        System.out.println("\nName: "+cg.get_name()+"\nDate of Birth: "+cg.get_dob()+"\nGPA: "+cg.get_gpa()+"\nYear of Graduation: "+cg.get_year());
    }
}