/**
 * This class represents a person. It serves as a base class for both Instructor and Student.
 * 
 * @version 1.0
 * @see Instructor
 * @see Student
 * @author Taha Ahmad
 */
public class Person {
  
  /** The person's full name */
  protected String nameSurname;
  
  /** The person's age */
  protected int age;

  /**
   * Constructor for the Person class.
   * 
   * @param nameSurname The person's full name.
   * @param age The person's age.
   */
  public Person(String nameSurname, int age) {
    this.nameSurname = nameSurname;
    this.age = age;
  }

  /**
   * Constructor for the Person class without age.
   * 
   * @param nameSurname The person's full name.
   */
  public Person(String nameSurname) {
    this.nameSurname = nameSurname;
  }
  
  /**
   * Getter method for the person's full name.
   * 
   * @return The person's full name.
   */
  public String getFullName() {
    return nameSurname;
  }

  /**
   * Returns a string representation of the person.
   * 
   * @return A string containing the person's full name.
   */
  @Override
  public String toString() {
    return "Name: " + getFullName(); 
  }
}
