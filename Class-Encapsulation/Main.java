class Plant{
  // Data must be public, if the data needs to be access in subclass then make
  // it protected, and then all instance data must be private except constant
  // Keep everything hidden in a class, to avoid cross access class to other
  // class.

  // Encapsulation, Hide class and only provide public API Call

  public static final int ID = 7; // Class Variable = because its final
  private String name;

  // By providing only a setter or getter method, you can make the class read-only or write-only.
  // Getter
  public String getName(){
    return this.name;
  }

  //It provides you the control over the data. Suppose you want to set the value of
  // id which should be greater than 100 only, you can write the logic inside the setter method.
  // You can write the logic not to store the negative numbers in the setter methods.
  // Setter
  private boolean isUpperCase(char ch){
    return ch >= 'A' && ch <= 'Z';
  }

  private boolean processName(String name){
    boolean check = true; // Local Variable
    for(int i=0; i<name.length();i++){
      /* Debug: */
      System.out.print(isUpperCase(name.charAt(i)));
      System.out.println(" = " + name.charAt(i));
      if(isUpperCase(name.charAt(i))){
        check = false;
        break;
      }
    }
    return check;
  }

  public void setName(String name){
    boolean check = processName(name);
    if(check)
      this.name = name;
  }
}

public class Main{
  /*  If the Parameter of the redlips object consist of any Uppercase Letter
   *  then it will input null as the setter gets
   */
  public static void main(String[] args){
      Plant redlips = new Plant();
      /* Change the parameter 'redlips' */
      redlips.setName("red lips");

      System.out.println("\nResult:");
      System.out.println(redlips.getName());
  }
}
