/**
 * Created by bchiang on 9/29/17.
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class De {
  public static void main(String [] args) {
    Employee e = null;
    try {
      FileInputStream fileIn = new FileInputStream("tmp.txt");
      ObjectInputStream in = new ObjectInputStream(fileIn);
      e = (Employee) in.readObject();
      in.close();
      fileIn.close();
    }catch(IOException i) {
      i.printStackTrace();
      System.out.println("IOException");
      return;
    }catch(ClassNotFoundException c) {
      System.out.println("Employee class not found");
      c.printStackTrace();
      return;
    }

    System.out.println("Deserialized Employee...");
    System.out.println("Name: " + e.name);
    System.out.println("Address: " + e.address);
    System.out.println("Age: " + e.age);
  }
}

