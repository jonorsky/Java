import java.util.ArrayList;

class Animal{
  public static final String owner = "Nico";
  private String name;
  private int age;
  private String status;

  public void setName(String name){
    this.name = name;
  }

  public void setAge(int age){
    this.age = age;
  }

  public void setStatus(String status){
    this.status = status;
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public String getStatus(){
    return this.status;
  }
}

public class Main{
  public static void main(String[] args){
    ArrayList<Animal> kingdom = new ArrayList<>();
    Animal temp = new Animal();
    temp.setName("Nico");
    temp.setAge(17);
    temp.setStatus("Happy");

    kingdom.add(temp);
    System.out.println(kingdom.get(0).getName());
    System.out.println(kingdom.get(0).getAge());
    System.out.println(kingdom.get(0).getStatus());
  }
}
