public class main{
  public static void main(String[] args){
    SR_Person person_1 = new SR_Person();
    person_1.name = "Nico";
    person_1.age = 57;

    // Access Instance Variable of SR_Person
    person_1.discount = "Yes";

    System.out.println(person_1.name);
    System.out.println(person_1.age);
    System.out.println(person_1.discount);
  }
}
