package com.course.structure;
public class Building
{
    private float sqft;
    private int stories;
    public Building()
    {
        sqft=3000;
        stories=3;
    }
    public void set(float sf, int s)
    {
        sqft=sf;
        stories=s;
    }
    public float get_sqft()
        {return sqft;}
    public int get_stories()
        {return stories;}
}



