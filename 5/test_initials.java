import java.util.*;
class Student
{
    String name;
    static Scanner sc = new Scanner(System.in);

    Student( String n)
    {
        name = n; 
    }

    static void initials(Student[] s, int n)   
    {
        int j, k;
        System.out.println("\n\nThe Formatted list of Names are: ");
        for(int i=0; i<n; i++)
        {
            s[i].name = " " + s[i].name.trim();
            String t = s[i].name;
            s[i].name="";
            int count=0;
            for(j=0; j<t.length(); j++)
                if(t.charAt(j)==' ')
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

class test_initials
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
            System.out.println("\nEnter the Name of Student "+(i+1));
            sc.nextLine();
            s[i]= new Student( sc.nextLine() );
        }

        Student.initials(s, n);       
    }
}