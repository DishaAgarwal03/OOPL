import java.util.*;
class four
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int c=1, l;
        String s;
        System.out.print("Enter a string: ");
        s=sc.next();
        l=s.length();
        for(int i=l-1; i>=0; i--)
        {
            if (c%3==0)
            {
                s=s.substring(0,i)+','+s.substring(i);
            }
            c++;
        }
        System.out.print("Answer: "+s);
    }
}