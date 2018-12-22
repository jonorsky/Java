import java.util.ArrayList;
import java.util.List;

public class Main{

  public static void print(ArrayList<Integer> arr){
    for(Integer value: arr){
      System.out.println(value);
    }
  }

  public static void main(String[] args){
    // template classes = ArrayList<>
    // we can put primitive type in ArrayList
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(10);
    numbers.add(100);
    numbers.add(40);

    for(int i=0; i<numbers.size(); i++)
      System.out.println(numbers.get(i));

    System.out.println();

    // Delete last element - reasonably fast
    numbers.remove(numbers.size()-1);
    print(numbers);

    // Delete first element - very slow, even middle of the list
    numbers.remove(0);

    // Solution is LinkedList

    System.out.println();
    print(numbers);

    List<String> values = new ArrayList<String>();

    // LinkedList consumed more memory than arraylist: Pros and cons
  }
}
