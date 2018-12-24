import java.io.Serializable;

// implements Serializable = to make the class Person serializable
public class Person implements Serializable{

  // serialVersionUID = checks to read exact class
  // Real Scenario:
  //  This file with this version cant be read by this program

  // Sample Usage:
  // 1 - Compile & Run writeObjects with serial = 323456789
  // 2 - Compile & Run readObjects = Can Read .bin
  // 3 - Change Class Serial into = 423456789
  // 4 - Compile & Run readObjects = ERROR! Cannot Read
  // 5 - Compile & Run writeObjects with serial = 423456789
  // 6 - Run readObjects = Can Read .bin

  private static final long serialVersionUID = 423456789;
  private int id;
  private String name;

  public Person(int id, String name){
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString(){
    return "Person [id= " + id + ",name=" + name + "]";
  }
}
