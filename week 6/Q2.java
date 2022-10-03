import java.util.*;

class Building
{
    private float sqft;
    private int stories;
    void set(float sf, int s)
    {
        sqft=sf;
        stories=s;
    }
    float get_sqft()
        {return sqft;}
    int get_stories()
        {return stories;}
}

class House extends Building
{
    Scanner sc = new Scanner(System.in);
    private int bedr, bathr;
    House()
    {
        super.set(sc.nextFloat(), sc.nextInt());
    }
    void set(int be, int ba)
    {
        bedr=be;
        bathr=ba;
    }
    int get_bedr()
        {return bedr;}
    int get_bathr()
        {return bathr;}
}

class School extends Building
{
    Scanner sc = new Scanner(System.in);
    private int classr;
    private String gradelevel;
    School()
    {
        super.set(sc.nextFloat(), sc.nextInt());
    }
    void set(String g, int c)
    {
        classr=c;
        gradelevel=g;
    }
    int get_classr()
        {return classr;}
    String get_gradelevel()
        {return gradelevel;}
}

class Q2
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter House details(Square feet, Stories, Number of Bedrooms and Bathrooms)");
        House H = new House();
        H.set(sc.nextInt(), sc.nextInt());
        System.out.println("Enter School details(Square feet, Stories, Gradelevel and Number of Classrooms)");
        School S = new School();
        sc.nextLine();
        S.set(sc.nextLine(), sc.nextInt());

        System.out.println("\nHouse Details are: \nSquare feet: "+H.get_sqft()+"\nStories: "+H.get_stories()+"\nBedrooms: "+H.get_bedr()+"\nBathrooms: "+H.get_bathr());
        System.out.println("\nSchool Details are: \nSquare feet: "+S.get_sqft()+"\nStories: "+S.get_stories()+"\nClassrooms: "+S.get_classr()+"\nGradelevel: "+S.get_gradelevel());
        
    }
}