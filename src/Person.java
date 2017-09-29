/**
 * Created by bchiang on 9/29/17.
 */

import java.io.ObjectStreamException;
import java.io.Serializable;

class Person implements Serializable{
  protected String name;
  protected int age;

  Person() {
    this("John",1);
  }

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  private void readObjectNoData() throws ObjectStreamException {
    name = "Johnson";
    age = 100;
  }
}
