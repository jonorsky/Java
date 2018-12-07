public class Car extends Machine{
  @Override
  public void start(){
    System.out.println("Car started!");
  }
  public void show_info(){
    System.out.println("Engine Type: " + machine_type);
  }
}
