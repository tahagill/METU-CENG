import java.util.ArrayList;

/**
 * This class represents a Student, which is a subclass of Person. Each student has a student number and entrance year.
 * 
 * @version 1.0
 * @see Person
 * @see Course
 * @see Instructor
 * @see ArrayList
 * @author Taha Ahmad
 */
public class Student extends Person {
    
    /** The student's unique student number */
    protected int studentNo;
    
    /** The year the student entered the institution */
    private int entranceYear;

    /** The list of all students */
    public static ArrayList<Student> studentList = new ArrayList<>();

    /**
     * Constructor for the Student class.
     * 
     * @param studentNo The student's unique student number.
     * @param nameSurname The student's full name.
     * @param entranceYear The year the student entered the institution.
     */
    public Student(int studentNo, String nameSurname, int entranceYear) {
        super(nameSurname); 
        this.studentNo = studentNo;
        this.entranceYear = entranceYear;
        studentList.add(this);
    }

    /**
     * Constructor for the Student class with age.
     * 
     * @param studentNo The student's unique student number.
     * @param nameSurname The student's full name.
     * @param age The student's age.
     * @param entranceYear The year the student entered the institution.
     */
    public Student(int studentNo, String nameSurname, int age, int entranceYear) {
        super(nameSurname, age); 
        this.studentNo = studentNo;
        this.entranceYear = entranceYear;
        studentList.add(this);
    }

    /**
     * Prints the student's information.
     */
    public void getStudentInfo() {
        System.out.println("Student No: " + studentNo);
        System.out.println("Name: " + nameSurname);
        System.out.println("Entrance Year: " + entranceYear);
    }

    /**
     * Prints the list of all students.
     */
    public static void getStudents() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    /**
     * Checks if a student exists by their student number.
     * 
     * @param studentNo The student number to check.
     * @return true if the student exists, false otherwise.
     */
    public static boolean studentExists(int studentNo) {
        for (Student student : studentList) {
            if (student.getStudentNo() == studentNo) {
                return true;
            }
        }
        return false;
    }

    /**
     * Removes a student by their student number.
     * 
     * @param studentNo The student number of the student to be removed.
     */
    public static void removeStudent(int studentNo) {
        studentList.removeIf(student -> student.getStudentNo() == studentNo);
    }

    /**
     * Returns a string representation of the student.
     * 
     * @return A string containing the student's number, name, and entrance year.
     */
    @Override
    public String toString() {
        return "Student No: " + studentNo + ", Name: " + nameSurname + ", Entrance Year: " + entranceYear;
    }

    /**
     * Getter method for the student's unique student number.
     * 
     * @return The student's unique student number.
     */
    public int getStudentNo() {
        return studentNo;
    }

    /**
     * Getter method for the student's full name.
     * 
     * @return The student's full name.
     */
    public String getName() {
        return nameSurname;
    }

    /**
     * Getter method for the student's entrance year.
     * 
     * @return The student's entrance year.
     */
    public int getEntranceYear() {
        return entranceYear;
    }
}
