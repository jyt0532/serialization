/**
 * Created by bchiang on 9/29/17.
 */

import java.io.Serializable;


/**
 * Created by bchiang on 9/26/17.
 */

public class Employee extends Person implements Serializable {//v2
  protected String address ;
  static final long serialVersionUID = 1L;
  public Employee()
  {
    super();
    address ="N/A";
  }

  public Employee(String name , int age, String address)
  {
    super(name,age);
    this.address = address;
  }

}
/*
public class Employee implements Serializable { //v1
  public String name;
  public int age;
  protected String address;
  static final long serialVersionUID = 1L;

  public Employee()
  {
    name= "John";
    age = 1;
    address ="N/A";
  }

  public Employee(String name , int age, String address)
  {
    this.name = name;
    this.age = age;
    this.address = address;
  }
}
*/