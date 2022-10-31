import java.util.*;

class MyExceptions extends Exception
{
    private String msg;
    MyExceptions(String e)
    {msg=e;}
    String get()
    {return msg;}
}

class Student
{
    int sem;
    int reg_no;
    String name;
    double gpa, cgpa;
    GregorianCalendar doj;
    static int c=0;
    static Scanner sc = new Scanner(System.in);

    Student( String n, int s, double g, double cg, GregorianCalendar d) 
    {
        sem = s;
        name = n;
        gpa = g;
        cgpa = cg;
        doj = d;
        c++;
        int y = (doj.get(Calendar.YEAR))%100;
        reg_no = Integer.parseInt(String.format("%02d",y)+ String.format("%02d",c)); 
    }

    Student() 
    {
        sem = 3;
        name = "Disha Agarwal";
        gpa = 9.95;
        cgpa = 9.84;
        doj = new GregorianCalendar();
        c++;
        reg_no = Integer.parseInt("21"+String.format("%02d",c));
    }
    
    void display()
    {
        String join = ""+doj.get(Calendar.DATE)+"/"+doj.get(Calendar.MONTH)+"/"+doj.get(Calendar.YEAR); 
        System.out.println("\n\nThe Details are: \nRegistration Number: "+String.format("%04d",reg_no)+"\nName: "+name+
        "\nSemester: "+sem+"\nGPA: "+gpa+"\nCGPA: "+cgpa+"\nDate of Joining: "+join);
    }
}

class one_new
{
    public static void main(String args[]) throws MyExceptions
    {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.print("\nEnter the number of students: ");
        n = sc.nextInt();
        Student s[]= new Student[n];
        try
        {
            for(i=0; i<n; i++)
            {
                if(Student.c==25)
                        throw new MyExceptions("\n\n Seats Filled! No more students can register!");
                System.out.println("\nEnter the Name, Semester, GPA, CGPA, Year, Month and Date of joining of Student "+(i+1));
                sc.nextLine();
                s[i]= new Student( sc.nextLine(), sc.nextInt(), sc.nextDouble(), sc.nextDouble(), 
                                   new GregorianCalendar(sc.nextInt(), sc.nextInt(), sc.nextInt()) );
            }
            for(i=0;i<n;i++)
                s[i].display();
        }
        catch(MyExceptions err)
        {
            System.out.println(err.get());
            for(i=0;i<25;i++)
                s[i].display();
        }
        
             
    }
}