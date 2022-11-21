/*bounded wildcard: some restriction
unbounded wildcard: no restriction*/
import java.util.*;
class unbounded{
    public static void main(String args[]) {
        List<Integer> list1= Arrays.asList(1,2,3,4); //Array is a class, 
        print(list1);
        List<Double> list2= Arrays.asList(1.0,2.0,3.0,4.0);  
        print(list2);
        List<String> list3= Arrays.asList("abc","def"); //Array is a class, 
        print(list3);
    }
    static void print(List<?> list)        // Unbounded wildcard 
    {
        System.out.println("list is: "+list);
    }
}