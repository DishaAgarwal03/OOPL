package myPackages.p1;
import java.util.*;
public class Maximum
{
    public static int max(int a, int b, int c)
    {
        return a>b?a>c?a:c:b>c?b:c;
    }

    public static double max(double a, double b, double c)
    {
        return a>b?a>c?a:c:b>c?b:c;
    }

    public static int max(int a[])
    {
        int l=a[0];
        for(int i=1; i<a.length; i++)
            if(a[i]>l)
                l=a[i];
        return l;
    }

    public static int max(int[][] a)
    {
        int l=a[0][0];
        for(int i=0; i<a.length; i++)
            for(int j=0; j<a[i].length; j++)
                if(a[i][j]>l)
                    l=a[i][j];
        return l;
    }
}