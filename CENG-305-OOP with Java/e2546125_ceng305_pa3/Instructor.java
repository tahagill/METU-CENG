import java.util.ArrayList;

/**
 * This class represents an Instructor. It inherits attributes from the Person class.
 * 
 * @version 1.0
 * @see Person
 * @see Course
 * @see ArrayList
 * @author Taha Ahmad
 */
public class Instructor extends Person {

    /** The instructor's age */
    private int age;

    /** The list of all instructors */
    public static ArrayList<Instructor> instructorsList = new ArrayList<Instructor>();

    /**
     * Constructor for the Instructor class.
     * 
     * @param nameSurname The instructor's full name.
     * @param age The instructor's age.
     */
    public Instructor(String nameSurname, int age) {
        super(nameSurname, age); 
        this.age = age;
        instructorsList.add(this);
    }

    /**
     * Getter method for the instructor's age.
     * 
     * @return The instructor's age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Retrieves and prints the list of all instructors.
     */
    public static void getInstructors() {
        for (Instructor instructor : instructorsList) {
            System.out.println(instructor);
        }
    }

    /**
     * Removes an instructor from the list by index.
     * 
     * @param index The index of the instructor to be removed.
     */
    public static void removeInstructor(int index) {
        if (index >= 0 && index < instructorsList.size()) {
            instructorsList.remove(index);
        }
    }

    /**
     * Returns a string representation of the instructor.
     * 
     * @return A string containing the instructor's name and age.
     */
    @Override
    public String toString() {
        return "Instructor: " + getFullName() + (age > 0 ? ", Age: " + age : "");
    }
}
