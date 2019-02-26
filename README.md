# Java Core
![](https://www.wesrch.com/userfiles/write_for_us/featured(1).jpg)

## A Hello World Program

```
public class Main{
  public static void main(String[] args){
    System.out.println("Hello World!");
  }
}
```

## Variables

```
public class Main{
  public static void main(String[] args){
    int x;
    short y;
    long ll;

    double z;
    float z1;

    char ch='A';
    boolean flag=true;

    byte bty=127;

    System.out.println(flag);
  }
}
```

##  String
```
public class Main{
  public static void main(String[] args){
    String str = "Hello ";
    String str1 = "World!";

    int x = 5;
    System.out.println(str + str1 + " "  + x);
  }
}
```

## Loop
```
public class Main{
  public static void main(String[] args){

  // While Loop
  int i=0;
  while(i<5){
    System.out.println(i);
    i++;
  }

  // For Loop
  for(int j=0; j<5; j++){
    System.out.println(j);
  }

  // do while Loop
  int k=0;
  do{
    System.out.println(k);
    k++;
  }while(k<5);

  }
}
```
## if, if else, else statement
```
public class Main{
  public static void main(String[] args){

  int x = 4;
  if(x==5)
    System.out.println("Hello World");
  else if(x==6)
    System.out.println("Damn");
  else
    System.out.println("Nah");

  }
}
```

## Getting User Input
  * Import library 'import java.util.Scanner'
  * Add object 'Scanner input = new Scanner(System.in);'

```
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String line = input.nextLine();
    char gender = input.next().charAt(0);
    int age = input.nextInt();
    long number = input.nextLong();
    double gpa = input.nextDouble();

    System.out.println(line);
    System.out.println(gender);
    System.out.println(age);
    System.out.println(number);
    System.out.println(gpa);
  }
}
```

## Switch case

```
public class Main{
  public static void main(String[] args){
    String str = "start";

    switch(str){
      case "start":
        System.out.println("Starting..");
        break;
      case "stop":
        System.out.println("Stopping..");
        break;

      default:
        System.out.println("Cannot Recognize");
    }
  }
}
```

## Arrays
Key points to remember when using arrays
When working with arrays remember:
* Array indexes start at 0
* Indexes have to be integers
* An array can hold primitive data types or objects
* Arrays provide constant time random access which is an efficient way of
accessing data
* Arrays provide good locality of reference
* Arrays are more difficult to insert or remove elements than other
data structures
* An index to an invalid element is possible

```
public class Main{
  public static void main(String[] args){
    int pivot = 5;
    int[] arr = new int[pivot];
    for(int i=0; i<pivot; i++){
      arr[i]=i*2;
    }
    for(int i=0; i<pivot; i++){
      System.out.println(arr[i]);
    }
  }
}
```

## Arrays of String

```
public class Main{
  public static void main(String[] args){
    String[] arr = {"Apple","Banana","Pear"};
    for(String temp:arr){
      System.out.println(temp);
    }
    for(int i=0; i<3; i++){
      System.out.println(arr[i]);
    }
  }
}
```

## Multi-Dimensional Array

```
public class Main{
  public static void main(String[] args){
    int[][] grid = {
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };

    for(int i=0; i<grid.length;i++){
      for(int j=0; j<grid[i].length; j++){
        System.out.print(grid[i][j]+ " ");
      }
      System.out.println();
    }
  }
}
```

## Class and Objects
```
class Person{
  // Instance Variables (Data or States)
  String name;
  int age;

  void say(){
    System.out.println("Hello!");
  }
}

public class Main{
  public static void main(String[] args){
    Person p1 = new Person();
    p1.name = "Nico";
    p1.age = 18;
    p1.say();
    System.out.println(p1.name);

    Person p2 = new Person();
    p2.name = "Jem";
    p2.age = 19;
    p2.say();
    System.out.println(p2.name);
  }
}
```

## Set and Getter
```
class Person{
  private int age;

  void setAge(int par){
    age = par;
  }

  int getAge(){
    return age;
  }
}

public class Main{
  public static void main(String[] args){
    Person p1 = new Person();
    p1.setAge(17);
    System.out.println(p1.getAge());
  }
}
```
## Constructor
```
class Person{
  String name;
  int age;

  // Constructor without parameter
  Person(){
    name = ":Default:";
    age = 0;
  }

  // Constructor with parameter
  Person(String name, int age){
    this.name = name;
    this.age = age;
  }
}

public class Main{
  public static void main(String[] args){
    Person p1 = new Person();
    System.out.println(p1.name);
    System.out.println(p1.age);

    Person p2 = new Person("Nico",17);
    System.out.println(p2.name);
    System.out.println(p2.age);
  }
}
```

## Static and Final

Title | Description
--- | ---
Primitive data declaration | The value assigned to the variable cannot be changed.
Reference variable | You cannot change the variable to reference a different variable. However, it may be possible to change the object the variable is referencing to.
Method | The method cannot be overridden.
Class | The class cannot be extended.

```
class Student{
    static String school = "Ateneo"; // static
    String name;
    String course;

    // Constructor with Parameter
    public Student(String name,String course){
      this.name = name;
      this.course = course;
    }
}

// Advantage of static variable is it makes program more memory efficient
// Example:
// If theres 1000 student objects, it will inherit all instance variable from
// its superclass and each instance variable will accumulate 1 block of memory
//  ** Static Variable will only use one block of memory that all objects
//  ** will use. If the Static Variable changed, all objects containing that
//  ** that Static Variable will also change.


public class Main{
  public static void main(String[] args){

    // Can change static value of the blueprint class 'Student'
    // before creating of student objects
    // Student.school = "STI";

    Student s1 = new Student("Nico","BSIT");
    Student s2 = new Student("Jem","BSIT");

    System.out.println(s1.name);
    System.out.println(s1.course);
    System.out.println(s1.school + "\n");

    System.out.println(s2.name);
    System.out.println(s2.course);
    System.out.println(s2.school);
  }
}
```
Final
  Java Final Keyword
    > Stop Value change
    > Stop Method Overriding
    > Stop Inheritance

```
class Student{
    public static final String school = "Ateneo"; // static final
    String name;
    String course;

    // Constructor with Parameter
    public Student(String name,String course){
      this.name = name;
      this.course = course;
    }
}

// Advantage of static variable is it makes program more memory efficient
// Example:
// If theres 1000 student objects, it will inherit all instance variable from
// its superclass and each instance variable will accumulate 1 block of memory
//  ** Static Variable will only use one block of memory that all objects
//  ** will use. If the Static Variable changed, all objects containing that
//  ** that Static Variable will also change.

// Static Variable and its Final = Cannot be change
// 1 block memory accumulated and it canno be change.

public class Main{
  public static void main(String[] args){

    // Can change static value of the blueprint class 'Student'
    // before creating of student objects
    Student.school = "CAM HIGH";

    Student s1 = new Student("Nico","BSIT");
    Student s2 = new Student("Jem","BSIT");

    System.out.println(s1.name);
    System.out.println(s1.course);
    System.out.println(s1.school + "\n");

    System.out.println(s2.name);
    System.out.println(s2.course);
    System.out.println(s2.school);
  }
}
```

Final - Method

```
class Student{
    public static final String school = "Ateneo"; // static
    String name;
    String course;

    final void class_info(){ // Making void into final, cannot be override
      System.out.println(name);
      System.out.println(course);
      System.out.println(school);
    }
}
```

```
class Senior extends Student{
  void class_info(){
    System.out.println("Im Senior!");
  }

  // Error! You cannot override final method from superclass
}
```
```
public class Main{
  public static void main(String[] args){
    Student s1 = new Student();
    Senior  s2 = new Senior();
    s1.name = "Nico";
    s1.course = "BSIT";

    System.out.println(s1.name);
    System.out.println(s1.course);

    s2.class_info();

  }
}
```
Final-Class

```
final class Student { // Making class into final, it cant be extends
    public static final String school = "Ateneo"; // static
    String name;
    String course;

    void class_info(){
      System.out.println(name);
      System.out.println(course);
      System.out.println(school);
    }
}

class Senior extends Student{
  void class_info(){
    System.out.println("Im Senior!");
  }
}

public class Main{
  public static void main(String[] args){
    Student s1 = new Student();
    s1.name = "Nico";
    s1.course = "BSIT";

    System.out.println(s1.name);
    System.out.println(s1.course);
  }
}
```

## To String

```
class Frog{

}

// Outputs detail of class
// Frog@4aa8f0b4
// Frog is classname + @ + address of the class but its hash unique identifer

public class Main{
  public static void main(String[] args){
      Frog frog1 = new Frog();
      System.out.println(frog1);
  }
}
```

StringBuilder = Efficient that concatinating Strings because when we concat
strings we're making another strings which inefficient.

```
class Frog{
  private String name;
  private int id;

  public Frog(int id,String name){
    this.id = id;
    this.name = name;
  }

  public String toString(){

    // Efficient 1:
    //return String.format("%4d: %s",id, name);

    // Efficient 2:
    StringBuilder sb = new StringBuilder();
    sb.append(id).append(": ").append(name);
    return sb.toString();
  }
}
```

Helpful for Debugging objects by looking its content

```
public class Main{
  public static void main(String[] args){
      Frog frog1 = new Frog(7,"Nico ");
      Frog frog2 = new Frog(8,"Jem ");

      System.out.println(frog1);
      System.out.println(frog2);
  }
}
```

## Inheritance

```
class Machine{
  public void start(){
    System.out.println("Machine Started..");
  }
  public void stop(){
    System.out.println("Machine Stop..");
  }
}
```
```
class Car extends Machine{

  // Overriding the start() function from Superclass Machine
  @Override  // <-- Annotation for overwrite
  public void start(){
    System.out.println("Car Started.. = from subclass");
    //super.start();
  }

  // @Override Annotation is making sure that the function is existing in
  // Superclass, if the method didnt exist in the superclass then it will
  // complaint because it cant find the function that it will override.

  public void wipeWindShield(){
    System.out.println("Wiping windshield");
  }
}
```

```
public class Main{
  public static void main(String[] args){
      Machine mach1 = new Machine();
      Car mach2 = new Car();

      mach1.start();
      mach1.stop();

      mach2.start();
  }
}
```

## Package

```
import p.Person;

public class Main{
  public static void main(String[] args){
    Person p1 = new Person();
    p1.name = "Nico";
    p1.age = 7;

    System.out.println(p1.name);
    System.out.println(p1.age);
  }
}
```

Run:
* Make Folder and Copy Person.java and Main.java
* cd to that folder and use this commands
* javac -d . Person.java
* javac Main.java
* java Main

> In the First statement, it creates package folder p with .class
> Second statement is to import the package + Class name

> **Execute**


Folder Content:
> mkdir 'test'
Fish.java
Main.java
Person.java
Info.java

```
/* File Name: Fish.java */
package ocean;

public class Fish{
  public String name;
  public int age;
  public String description;
}
```

```
/* File Name: Person.java */
// Java Package: javac -d . "file name"
// look for the "file name" it must have 'package com;'
// Run Package: java com.filename
package ocean;

public class Person{
  public String name;
  public int age;
}
```
```
/* File Name: Info.java */
package ocean.info;

public class Info{
  public static final String version = "1.5.0";
}
```
```
/* File Name: Main.java */

import ocean.Person;
import ocean.Fish;
import ocean.info.Info;

public class Main{
  public static void main(String[] args){
    Person p1 = new Person();
    p1.name = "Nico";
    p1.age = 7;

    System.out.println(p1.name);
    System.out.println(p1.age + "\n");

    Fish f1 = new Fish();
    f1.name = "Jem";
    f1.age = 17;
    f1.description = "Fish";

    System.out.println(f1.name);
    System.out.println(f1.age);
    System.out.println(f1.description);

    Info info1 = new Info();
    System.out.println("Version: " + info1.version);
  }
}
```
```
// Run:
// Make Folder and Copy Person.java and Main.java
// * cd to that folder and use this commands

javac -d . Person.java
javac -d . Fish.java
javac -d . Info.java
javac Main.java
java Main

// In ubuntu: ctrl + shift + v | to paste in CLI

// In the First statement, it creates package folder p with .class
// Second statement is to import the package + Class name
// Execute
```

## Interface

Interface is a blueprint of a class, to achieve abstraction. In short, it visualize
abstract methods and variables, it cannot have a method body.
Files:
> Info.java

>  Machine.java

>  Main.java

>  Person.java

```
public class Main{
  public static void main(String[] args){
    Machine mach1 = new Machine();
    mach1.start();

    Person person1 = new Person("Nico");
    person1.greet();

    mach1.showinfo();
    person1.showinfo();
  }
}
```
```
public interface Info{
  public void showinfo();
}
```
```
// Machine.java
// implements does is it forces to override all headers and methods specify
// into the interface file 'Info.java'

public class Machine implements Info{
  private int id = 7;

  public void start(){
    System.out.println("Running..");
  }

  @Override
  public void showinfo(){
    System.out.println("Machine ID is: " + id);
  }
}
```
```
public class Person implements Info{
  private String name;

  public Person(String name){
    this.name = name;
  }

  public void greet(){
    System.out.println("Hello There!");
  }

  @Override
  public void showinfo(){
    System.out.println("Person Name is: " + name);
  }
}
```

Modified: Multiple Inheritance in java by interface
> File: Machine.java
> implements does is it forces to override all headers and methods specify
> into the interface file 'Info.java'

```
public class Machine implements Info,Version{
  private int id = 7;

  public void start(){
    System.out.println("Running..");
  }

  @Override
  public void showinfo(){
    System.out.println("Machine ID is: " + id);
  }

  @Override
  public void showversion(){
    System.out.println("Version is: 12345");
  }
}
```

```
public interface Version{
  public void showversion();
}
```

## Public, Private, Protected

**Default** - If you don't use any modifier, it is treated as default bydefault. The default modifier is accessible only within package.

**Public** - is accessible everywhere. Widests scope among modifiers

**Private** - is accessible within a class.

**Protected** - accessible within a class, subclass.


## Polymorphism
Can have many forms. For example we want an array of foods with
different instance variables and methods. Polymorphism is good way to implement this
particular problem.
 
  Given:
    Superclass Food
    sub-class Tuna and Egg

    Food all[] = new Food[5];
    all[0] = new Tuna;
    all[1] = new Egg;

```
Files:
  Egg.java
  Food.java
  Tuna.java
  Main.java

```
```
public class Egg extends Food{
  Egg(){
    this.name = "Egg";
  }

}
```
```
public class Food{
  public String name;
}
```
```
public class Tuna extends Food{
  Tuna(){
    this.name = "Tuna";
  }
}
```
```
public class Main{
  public static void main(String[] args){
    final int limit = 5;
    Food poly[] = new Food[limit];
    poly[0] = new Egg();
    poly[1] = new Tuna();

    for(int i=0; i<2; i++){
      System.out.println(poly[i].name);
    }

  }
}
```

## Encapsulation and API Docs
```
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
```
```
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
```
## Casting Numerical Values
```
public class Main{
  public static void main(String[] args){

    byte byteValue = 20;
    short shortValue = 55; // Short Version of Int, which takes less memory, 32bytes
    int intValue = 888;
    long longValue = 23355;

    float floatValue = 8834.5f;
    double doubleValue = 32.4;

    intValue = (int)longValue;
    System.out.println(intValue);

    doubleValue = intValue;

    byteValue = (byte)128;
    System.out.println(byteValue);

  }
}
```
## Upcasting Downcasting

```
class Machine{
  public void start(){
    System.out.println("Machine Started..");
  }
}
```
```
class Camera extends Machine{
  @Override
  public void start(){
    System.out.println("Camera Started..");
  }

  public void snap(){
    System.out.println("Photo taken..");
  }
}
```
```
public class Main{
  public static void main(String[] args){
    Machine m1 = new Machine();
    Camera c1 = new Camera();

    m1.start();
    c1.start();
    c1.snap();

    // Upcasting:
    Machine m2 = c1; // Polymorphism | Upcasting
    m2.start();

    // Data Type Machine | All instance variables only in Machine since
    // the Data type that used is Machine
    // = m2 variable is Machine and the Machine has only have 1 method
    //   which is start(), so Machine Variable can only call start method

    // the type of Variable determines what method we can call
    // m2.snap(); <- Error
    System.out.println();
    // Downcasting:
    Machine m3 = new Camera();
    Camera c2 = (Camera)m3;
    c2.start();
    c2.snap();

  }
}
```

## Using Generics
```
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

class Animal{
  private String name;
  private int age;

  public void setName(String name){
    this.name = name;
  }

  public void setAge(int age){
    this.age = age;
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }
}

public class Main{
  public static void main(String[] args){
    /* Java 5 - Old Style */
    ArrayList list = new ArrayList();
    list.add("apple");
    list.add("banana");
    list.add("orange");

    String food = (String)list.get(1);

    System.out.println(food);

    /* Modern Style - Generic Class */
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Cat");
    strings.add("Dog");
    strings.add("Monkey");

    String animal = strings.get(1);
    System.out.println(animal);

    /* There can be more one type argument , Integer and String */
    HashMap<Integer,String> map = new HashMap<Integer,String>();
    /* Display content using Iterator*/
      map.put(12,"Nicos");

      Set set = map.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry it = (Map.Entry)iterator.next();
         System.out.print(it.getKey() + " ");
         System.out.println(it.getValue());
    }

    /* Java 7 Style */
    ArrayList<Animal> kingdom = new ArrayList<>();

    Animal nico = new Animal();
    nico.setName("Nico");
    nico.setAge(14);

    kingdom.add(nico);

    System.out.println(kingdom.get(0).getName());

  }
}
```

## Anonymous Class

```
class Machine {
  public void start(){
    System.out.println("Starting Machine...");
  }
}
```
```
interface Plant{
  public void grow();
}
```
```
public class Main{
  public static void main(String[] args){
    /* Anonymous Class - Class that doesnt have name
     * In bytecode, it generates Main$1.class and Main$2.class
     * Advantage:
     *  It can make interface class into an object within inline
     */
    Machine machine1 = new Machine(){
      @Override
        public void start(){
          System.out.println("Camera Snapping...");
        }
    };
    Machine machine2 = new Machine(){
      @Override
        public void start(){
          System.out.println("Phone Destroyed!");
        }
    };

    machine1.start();
    machine2.start();

    Plant plant1 = new Plant(){
      @Override
        public void grow(){
          System.out.println("Plant is growing..");
        }
    };

    plant1.grow();

  }
}
```

## Handling Exemption
```
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main{
  public static void main(String[] args){
    File file = new File("test.txt");

    try{
      FileReader fr = new FileReader(file);
    }catch (FileNotFoundException e){
      e.printStackTrace();
    }
  }
}
```

## Abstract Class
```
public class Main{
  public static void main(String[] args){
    Camera cam1 = new Camera();
    cam1.setId(5);

    Car car1 = new Car();
    car1.setId(4);

    // abstraction is a process of hiding the implementation details and showing
    // only functionality to the user. It hides internal details.
    // Example:
    //  Sending SMS but we dont know the internal process of sending SMS.

    // Abrtract class is mostly used to provide subclasses.

    // Machine mc = new Machine(); // <-- it will throw error since machine is an abstract class

    System.out.println(cam1.getId());
    System.out.println(car1.getId());
    System.out.println();
    cam1.run();
    //car1.run();
  }
}
```
```
public abstract class Machine{ // <-- Abstract Class
  private int id;

  public int getId(){
    return this.id;
  }

  public final void setId(int id){ // <-- final methods which will force the subclass not to change the body of the method
    this.id = id;
  }

  // Abstract Method =  abstract method doesn’t have body. Alternative? run(){}
  // Abstract Method forces to Override by the subclasses
  public abstract void run();
}
```
```
public class Camera extends Machine{
  @Override
  public void run(){
    System.out.println("Camera Snap..");
  }
}
```
```
public class Car extends Machine{
  @Override
  public void run(){
    System.out.println("Car Runs..");
  }
}
```
## The Equal Method
```
class Person{
  private int id;
  private String name;

  public Person(int id,String name){
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString(){
    return "Person [id=]" + id + ", name=" + name + "]";
  }

  public String getName(){
    return this.name;
  }

  @Override
  public boolean equals(Object obj){
    Person temp = (Person)obj;

    if(this.name==temp.name)
      return true;
    else
      return false;
  }
}

public class Main{
  public static void main(String[] args){
    Person p1 = new Person(1,"Nico");
    Person p2 = new Person(2,"Nico");

    // Using == in objects will check if the 1st comparison is also equal to its
    // object position.
    // p1 = p2 <-- it will return true, remove it then it returns false
    // System.out.println(p1==p2);

    // Overriding default .equals() function of java and
    // injects object instance variable comparison
    System.out.println(p1.equals(p2));
  }
}
```

## Inner class
```
public class Main{
  public static void main(String[] args){
    Robot rb = new Robot(1);
    rb.start();

    // Using Inner Class to Group the Class
    // Robot.Battery, Robot.CPU, Robot.Info
    Robot.Battery battery = new Robot.Battery();
    Robot.CPU cpu = new Robot.CPU();
    battery.charge();
    cpu.status();
  }
}
```
```
public class Robot{
  private int id;

  // Nested Class or Inner Class
  // Used to Group Different Parts
  // of the Blueprint or Class
  private class Brain{
    public void think(){
      System.out.println("Robot " + id + " is thinking..");
    }
  }

  // Static Class
  public static class Battery{
    public void charge(){
      System.out.println("Battery Charging..");
    }
  }

  // Static Class
  public static class CPU{
    public void status(){
      System.out.println("37 Degrees..");
    }
  }

  public Robot(int id){
    this.id = id;
  }

  public void start(){
    System.out.println("Starting robot " + id);
    Brain brain = new Brain();
    brain.think();

    final String name = "Ava";
    // Local Class
    class Temp{
      public void doSomething(){
        System.out.println("ID is: " + id);
        System.out.println("My name is " + name);
      }
    }
    Temp temp = new Temp();
    temp.doSomething();
  }

}
```

## Serialization
```
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
```
```
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

// Loading Functionality: Deserialization

public class ReadObjects {
  public static void main(String[] args){
    System.out.println("Reading Objects..");

    try(FileInputStream fi = new FileInputStream("people.bin")){
      ObjectInputStream os = new ObjectInputStream(fi);

      Person person1 = (Person)os.readObject();
      Person person2 = (Person)os.readObject();
      System.out.println(person1);
      System.out.println(person2);

      os.close();

    }catch (FileNotFoundException e){
      e.printStackTrace();
    }catch (IOException e){
      e.printStackTrace();
    }catch (ClassNotFoundException e){
      e.printStackTrace();
    }
  }
}
```
```
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;

// Writing Functionality: Serialization

public class WriteObjects{
  public static void main(String[] args){
      System.out.println("Writing Objects..");

      Person jem = new Person(1,"Jem");
      Person ed = new Person(2,"Ed");

      System.out.println(jem);
      System.out.println(ed);

      // Java 7 or later, try catch
      // Creating people.bin
      try(FileOutputStream fs = new FileOutputStream("people.bin")){
        ObjectOutputStream os = new ObjectOutputStream(fs);

        os.writeObject(jem);
        os.writeObject(ed);

        os.close();
      }catch (FileNotFoundException e){
        e.printStackTrace();
      }catch (IOException e){
        e.printStackTrace();
      }
  }
}
```
## Passing by Value
```
public class Main{

  // class type is non primitive type, a reference
  //   Primitive - 'Very Basic'
  //     > int,char,short,byte,float,long,double
  //   Non Primitive - which uses primitive data type as base
  //     > class, array, enum, etc.
  //
  //   Person person = new Person("Nico");
  //     > Person person - store address/reference
  //     > new Person("Nico") - allocating enough memory


  public static void main(String[] args){
    Main app = new Main();

    //============================================
    int value = 6;
    System.out.println("1. Value is: " + value);

    app.show(value);

    System.out.println("4. Value is: " + value);
    //============================================
    System.out.println();

    Person person = new Person("Nico");
    System.out.println("1. Person is: " + person);

    app.show(person);

    System.out.println("4. Person is: " + person);
  }

  // Passing by Value - just copying the passed value
  public void show(int value){
    System.out.println("2. Value is: " + value);

    value = 8;

    System.out.println("3. Value is: " + value);
  }

  // Passing by reference - just copying the address of person
  public void show(Person person){
    System.out.println("2. Person is: " + person);

    // change value of the first address passed
    person.setName("Jem");

    // set new address to person
    person = new Person("Mike");

    // change value of the second address in body
    person.setName("Ed");

    System.out.println("3. Person is: " + person);
  }
}
```
```
public class Person{
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  @Override
  public String toString(){
    return "Person [name = " + name + "]";
  }
}
```
