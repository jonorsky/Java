import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main{
  public static void main(String[] args){

    // HashSet does not retain order.
    // only stores unique element
    //Set<String> set1 = new HashSet<String>();

    // LinkedHashSet remembers the order we added items in
    // Set<String> set1 = new LinkedHashSet<String>();

    // TreeSet sorts in natural order/dictionary
    Set<String> set1 = new TreeSet<String>();


    set1.add("dog");
    set1.add("cat");
    set1.add("mouse");
    set1.add("snake");
    set1.add("bear");

    // Adding duplicate items does nothing.
    set1. add("mouse");

    System.out.println(set1);

    /////////// Iteration //////////
    for(String element: set1){
      System.out.println(element);
    }


    // Intersection
    Set<String> set2 = new TreeSet<String>();
    set2.add("dog");
    set2.add("cat");
    set2.add("giraffe");
    set2.add("monkey");
    set2.add("ant");

    Set<String> intersection = new HashSet<String>(set1);
    System.out.println(intersection);

    // Intersection between 2 sets
    intersection.retainAll(set2);
    System.out.println(intersection);

    Set<String> difference = new HashSet<String>(set1);
    difference .removeAll(set2);
    System.out.println(difference);
  }
}
