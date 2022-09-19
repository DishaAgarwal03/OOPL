import java.util.*;
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

    static void sort_name(int n, Student[] s)
    {
        for (int i=0; i<n-1; i++)
            for (int j=0; j<n-i-1; j++)
                if ((s[j].name).compareTo(s[j+1].name)>1)
                {
                    Student t = s[j];
                    s[j] = s[j+1];
                    s[j+1] = t;
                }
    }

    static void sort_sem_CGPA(int n, Student[] s)  
    {
        for (int i=0; i<n-1; i++)
            for (int j=0; j<n-i-1; j++)
                    if ( (s[j].sem > s[j+1].sem) || ((s[j].sem == s[j+1].sem) && (s[j].cgpa > s[j+1].cgpa)) )
                    {
                        Student t = s[j];
                        s[j] = s[j+1];
                        s[j+1] = t;
                    } 
    }

    static void listch(Student[] s, int n)
    {
        System.out.print("\n\nEnter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("List of names starting with "+ch+": ");
        for(int i=0; i<n; i++)
        {
            if(s[i].name.charAt(0)==ch)
                System.out.println(s[i].name);
        }
    }

    static void liststr(Student[] s, int n)
    {
        System.out.print("\n\nEnter a substring: ");
        String str = sc.next();
        System.out.println("List of names containing "+str+": ");
        for(int i=0; i<n; i++)
        {
            if(s[i].name.indexOf(str)!=-1)
                System.out.println(s[i].name);
        }
    }

    static void initials(Student[] s, int n)   
    {
        int j, k;
        System.out.println("\n\nThe Formatted list of Names: ");
        for(int i=0; i<n; i++)
        {
            s[i].name = " " + s[i].name.trim();
            String t = s[i].name;
            s[i].name = "";
            int count = 0;
            for(j=0; j<t.length(); j++)
                if(t.charAt(j)==' ' && t.charAt(j+1)!=' ')
                    count++;
            for(j=0, k=0; k<count; j++)
                if(t.charAt(j)==' ' && t.charAt(j+1)!=' ')
                    {
                        s[i].name += Character.toUpperCase(t.charAt(j+1)) + ". ";
                        k++;
                    }
            s[i].name = s[i].name.substring(0,s[i].name.length()-2) + t.substring(j+1);
            System.out.println(s[i].name);
        }  
    }   
}

class one_new
{
    public static void main(String args[]) 
    {

        //Question 1
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.print("\nEnter the number of students: ");
        n = sc.nextInt();
        Student s[]= new Student[n];
        for(i=0; i<n; i++)
        {
            System.out.println("\nEnter the Name, Semester, GPA, CGPA, Year, Month and Date of joining of Student "+(i+1));
            sc.nextLine();
            s[i]= new Student( sc.nextLine(), sc.nextInt(), sc.nextDouble(), sc.nextDouble(), 
                               new GregorianCalendar(sc.nextInt(), sc.nextInt(), sc.nextInt()) );
        }

        for(i=0;i<n;i++)
            s[i].display();

        //Question 2
        System.out.println("\n\nEnter \n1 to sort by Name \n2 to sort by Semester and CGPA");
        int c = sc.nextInt();
        if (c == 1)
            Student.sort_name(n, s);
        else if (c == 2)
            Student.sort_sem_CGPA(n, s);
        else
            System.out.println("Invalid Input");

        System.out.println("\nModified Order: ");
        for(i=0;i<n;i++)
            System.out.print("\nName: "+s[i].name+"\tSemester: "+s[i].sem+"\tCGPA: "+s[i].cgpa);


        //Question 3
        Student.listch(s, n);
        Student.liststr(s, n);
        Student.initials(s, n);       
    }
}