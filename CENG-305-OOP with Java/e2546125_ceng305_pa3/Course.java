import java.util.ArrayList;

/**
 * This class represents a Course. It can have an optional instructor assigned and a list of enrolled students.
 * 
 * @version 1.0
 * @see Instructor
 * @see Student
 * @author Taha Ahmad
 */
public class Course {
    
    /** The name of the course */
    private String courseName;
    
    /** The unique code for the course */
    protected int courseCode;
    
    /** The instructor for the course */
    private Instructor instructor; 
    
    /** The list of students enrolled in the course */
    protected ArrayList<Student> courseParticipants = new ArrayList<Student>(); 
    
    /** The number of students enrolled in the course */
    int numberOfStudents;
    
    /** The list of all courses */
    public static ArrayList<Course> courseList = new ArrayList<Course>();

    /**
     * Constructor for the Course class.
     * 
     * @param courseName The name of the course.
     * @param courseCode The unique code for the course.
     */
    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.numberOfStudents = 0;
        courseList.add(this);
    }

    /**
     * Constructor for the Course class with an instructor.
     * 
     * @param courseName The name of the course.
     * @param courseCode The unique code for the course.
     * @param instructor The instructor for the course.
     */
    public Course(String courseName, int courseCode, Instructor instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
        this.numberOfStudents = 0;
        courseList.add(this);
    }

    /**
     * Getter method for the course name.
     * 
     * @return The name of the course.
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Getter method for the course code.
     * 
     * @return The unique code for the course.
     */
    public int getCourseCode() {
        return courseCode;
    }

    /**
     * Assigns an instructor to the course.
     * 
     * @param instructor The instructor to be assigned.
     */
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    /**
     * Adds a student to the course list by student number.
     * 
     * @param studentNo The student number of the student to be added.
     */
    public void addStudent(int studentNo) {
        for (Student student : Student.studentList) {
            if (student.getStudentNo() == studentNo) {
                courseParticipants.add(student);
                this.numberOfStudents++;
                return;
            }
        }
        System.out.println("Student with student number " + studentNo + " not found.");
    }

    /**
     * Removes a student from the course list by student number.
     * 
     * @param studentNo The student number of the student to be removed.
     */
    public void dropStudent(int studentNo) {
        for (Student student : courseParticipants) {
            if (student.getStudentNo() == studentNo) {
                courseParticipants.remove(student);
                this.numberOfStudents--;
                return;
            }
        }
        System.out.println("Student with student number " + studentNo + " not found in the course.");
    }

    /**
     * Retrieves and prints the list of students enrolled in the course.
     */
    public void getStudents() {
        if (numberOfStudents != 0) {
            for (Student student : courseParticipants) {
                System.out.println(student);
            }
        }
    }

    /**
     * Retrieves and prints the list of all courses.
     */
    public static void getCourses() {
        for (Course course : courseList) {
            System.out.println(course);
        }
    }

    /**
     * Removes a course by course code.
     * 
     * @param courseCode The course code of the course to be removed.
     */
    public static void removeCourse(int courseCode) {
        courseList.removeIf(course -> course.getCourseCode() == courseCode);
    }

    /**
     * Returns a string representation of the course.
     * 
     * @return A string containing the course name, course code, instructor, and enrolled students.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course Name: ").append(courseName).append("\n");
        sb.append("Course Code: ").append(courseCode).append("\n");
        if (instructor != null) {
            sb.append("Instructor: ").append(instructor).append("\n");
        }
        if (numberOfStudents != 0) {
            sb.append("Enrolled Students:\n");
            for (Student student : courseParticipants) {
                sb.append(student).append("\n");
            }
        }
        return sb.toString();
    }
}
