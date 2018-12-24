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
