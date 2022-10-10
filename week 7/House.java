package com.course.structure;
import java.util.*;
public class House extends Building
{
    Scanner sc = new Scanner(System.in);
    private int bedr, bathr;
    public House()
    {
        super.set(sc.nextFloat(), sc.nextInt());
    }
    public void set(int be, int ba)
    {
        bedr=be;
        bathr=ba;
    }
    public int get_bedr()
        {return bedr;}
    public int get_bathr()
        {return bathr;}
}