import java.util.*;
import com.course.structure.Building;
import com.course.structure.School;
import com.course.structure.House;
class Q1
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        Building B = new Building();
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