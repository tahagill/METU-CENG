import java.util.Scanner;
import javax.swing.JOptionPane;
public class Driver{
    
    public static void main(){
    
            
        Course ceng240 = new Course("Programming with Python for Engineers",5710240);
        Instructor instructor1 = new Instructor("Dennis Ritchie",76);
        Student student1 = new Student(2265547,"Bill Gates",2021);
        Student student2 = new Student(2245568,"Steve Jobs",2020);

        Course ceng305 = new Course("OBJECT ORIENTED PROGRAMMING WITH JAVA",5710305);
        Instructor instructor2 = new Instructor("Faruk Tokdemir",56);
        Student student3 = new Student(2265547,"Ahmet Atakan",2022);
        
        System.out.println("Student Automation Project (Enter the Choice)");
        System.out.println("*********************************************");
        
        int choice;
        int courseCode;
        int studentNo;
        Scanner scan = new Scanner(System.in);

        do{
            
            System.out.println("1. Courses List");
            System.out.println("2. Add/Remove Course");
            System.out.println("3. Course Students (<courseCode>)");
            System.out.println("4. Instructors List");
            System.out.println("5. Add/Remove Instructor");
            System.out.println("6. Students List");
            System.out.println("7. Add/Remove Student");
            System.out.println("8. Student Info (<studentNo>)");
            System.out.println("9. Add/Remove Student to/from the Course");
            System.out.println("Press 0 for exit.");
    
            System.out.println();
            choice = scan.nextInt();
            
            switch(choice){
                case 1:
                     Course.getCourses();
                break;
                
                case 2:
                    System.out.println("Add Course     : add # <courseCode> # <courseName>");
                    System.out.println("Add Course     : add # <courseCode> # <courseName> # <instructor ID>");
                    System.out.println("Remove Course  : remove # <courseCode>");
            
                    Scanner sc=new Scanner(System.in);
                    String command=sc.nextLine();
                    String[] operation = command.split("#");
                    
                    switch(operation[0].trim()){
                        case "add":
                            Course course;
                            if(operation.length==3)
                                course = new Course(operation[2].trim(),Integer.parseInt(operation[1].trim()));
            
                            if(operation.length==4)
                                course = new Course(operation[2].trim(),Integer.parseInt(operation[1].trim()),Instructor.instructorsList.get(Integer.parseInt(operation[3].trim())-1));
                        break;
                        
                        case "remove":
                            Course.removeCourse(Integer.parseInt(operation[1].trim()));
                        break;
                        
                        case "Q":
                        
                        break;

                    }
                    System.out.println();
                break;
                
                case 3:
                    System.out.println("Enter course code :");
                    courseCode = scan.nextInt();
                    for(int i=0; i<Course.courseList.size(); i++){
                        if(Course.courseList.get(i).courseCode == courseCode){
                            Course.courseList.get(i).getStudents();
                            break;
                        }
                    }
                break;
                
                case 4:
                    Instructor.getInstructors();
                break;
                
                case 5:
                    System.out.println("Add Instructor     : add # <nameSurname> # <age>");
                    System.out.println("Remove Instructor  : remove # <instructor ID>");
                    
                    Scanner addIns = new Scanner(System.in);
                    String command2 = addIns.nextLine();
                    String[] operation2 = command2.split("#");
                    
                    switch(operation2[0].trim()){
                        case "add":
                            Instructor instructor = new Instructor(operation2[1].trim(),Integer.parseInt(operation2[2].trim()));
                        break;
                        
                        case "remove":
                            Instructor.removeInstructor(Integer.parseInt(operation2[1].trim()));
                        break;
                    }
                    System.out.println();
                break;
                
                case 6:
                    Student.getStudents();
                break;
                
                case 7:
                    System.out.println("Add Student     : add # <student number> # <name surname> # <entrance year>");
                    System.out.println("Add Student     : add # <student number> # <name surname> # <age> # <entrance year>");
                    System.out.println("Remove Instructor  : remove # <instructor ID>");
                    
                    Scanner tara = new Scanner(System.in);
                    String command3 = tara.nextLine();
                    String[] operation3 = command3.split("#");

                    switch(operation3[0].trim()){
                        case "add":
                            Student student;
                            if(operation3.length==4)
                                student = new Student( Integer.parseInt(operation3[1].trim()) , operation3[2].trim() , Integer.parseInt(operation3[3].trim()) );
            
                            if(operation3.length==5)
                                student = new Student( Integer.parseInt(operation3[1].trim()) , operation3[2].trim() , Integer.parseInt(operation3[3].trim()), Integer.parseInt(operation3[4].trim()) );
                        break;
                        
                        case "remove":
                            Student.removeStudent(Integer.parseInt(operation3[1].trim()));
                        break;
                    }
                    System.out.println();
                break;
                
                case 8:
                    System.out.println("Enter student no :");
                    studentNo = scan.nextInt();
                    for(int i=0; i<Student.studentList.size(); i++){
                        if(Student.studentList.get(i).studentNo == studentNo){
                            Student.studentList.get(i).getStudentInfo();
                            break;
                        }
                    }
                break;
                
                case 9:
                    System.out.println("Add Student to the Course    : add # <student number> # <courseCode>");
                    System.out.println("Add Student from the Course     : remove # <student number> # <courseCode>");

                    Scanner scnnr = new Scanner(System.in);
                    String ln = scnnr.nextLine();
                    String[] islem = ln.split("#");

                    for(int j=0; j<Course.courseList.size(); j++){

                        if(Course.courseList.get(j).courseCode == Integer.parseInt(islem[2].trim())){

                            switch(islem[0].trim()){
                                case "add":
                                    Course.courseList.get(j).addStudent(Integer.parseInt(islem[1].trim()));
                                break;
                                case "remove":
                                    Course.courseList.get(j).dropStudent(Integer.parseInt(islem[1].trim()));
                                break;
                            }

                            break;
                        }
                    }

                    System.out.println();

                break;
                
            }

        }while(choice!=0);
        
        System.out.println("Automation Terminated...");
    }
    
}
