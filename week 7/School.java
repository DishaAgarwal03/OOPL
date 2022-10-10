package com.course.structure;
import java.util.*;
public class School extends Building
{
    Scanner sc = new Scanner(System.in);
    private int classr;
    private String gradelevel;
    public School()
    {
        super.set(sc.nextFloat(), sc.nextInt());
    }
    public void set(String g, int c)
    {
        classr=c;
        gradelevel=g;
    }
    public int get_classr()
        {return classr;}
    public String get_gradelevel()
        {return gradelevel;}
}