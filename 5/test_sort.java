import java.util.*;
class Student
{
    int sem;
    String name;
    double cgpa;

    Student( String n, int s, double cg)
    {
        sem = s;
        name = n;
        cgpa = cg;
    }

    void display()
    {
        System.out.println("\n\nThe Details are: \nName: "+name+"\nSemester: "+sem+"\nCGPA: "+cgpa);
    }

    static void sort_sem_CGPA(int n, Student[] s)   //check
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
}

class test_sort
{
    public static void main(String args[]) 
    {

        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.print("Enter the number of students: ");
        n = sc.nextInt();
        Student s[]= new Student[n];
        for(i=0; i<n; i++)
        {
            System.out.println("\nEnter the Name, Semester, CGPA of Student "+(i+1));
            sc.nextLine();
            s[i]= new Student( sc.nextLine(), sc.nextInt(), sc.nextDouble() );
        }

        Student.sort_sem_CGPA(n, s);

        System.out.println("Modified Order: ");
        for(i=0; i<n; i++)
            s[i].display();
    }
}