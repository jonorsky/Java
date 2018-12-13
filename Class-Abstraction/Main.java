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
