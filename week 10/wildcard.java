/*bounded wildcard: some restriction
unbounded wildcard: no restriction*/
import java.util.*;
class wildcard{
    public static void main(String args[]) {
        ArrayList<Integer> list1= new ArrayList<Integer>(); //Array is a class, 
        list1.add(1);
        list1.add(2);
        ArrayList<Double> list2= new ArrayList<Double>();
        list2.add(1.0);
        list2.add(2.0);

        compares(list1,list2);
        System.out.println("*******************************");
        compares(list2,list1);
    }
    static void compares(ArrayList<? extends Number> list1, ArrayList<? extends Number> list2)        // Upperbounded wildcard .The lists can be either a Number or a subclass of Number
    {
        int f=0;
        Number temp1, temp2;
        for(int i=0;i<list1.size();i++)   //assuming both lists are of the same size
        {
            temp1=list1.get(i).doubleValue();
            temp2=list2.get(i).doubleValue();
            if(!(temp1.equals(temp2)))    //check if != works. see in what cases are equals used. temp1 and temp2 are objects
            {
                f=1; break;
            }
        }
        if (f==0)
            System.out.println("Lists are the same");
        else
            System.out.println("Lists are not the same");
    }
}