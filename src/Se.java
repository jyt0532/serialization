/**
 * Created by bchiang on 9/29/17.
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Se {
  public static void main(String [] args) {
    Employee e = new Employee();

    try {
      FileOutputStream fileOut =
        new FileOutputStream("tmp.txt");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(e);
      out.close();
      fileOut.close();
      System.out.printf("Serialized data is saved in tmp.txt");
    }catch(IOException i) {
      i.printStackTrace();
    }
  }
}
