import javax.swing.JFrame;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Press 1 for Question 1");
        System.out.println("Press 2 for Question 2");
        System.out.println("Press 3 for Question 3");
        System.out.println("Press 4 for Question 4");
        System.out.println("Press 0 for exit.");

        Scanner choice = new Scanner(System.in);
        int question; // variable for menu

        do {
            question = choice.nextInt();
            switch (question) {
                case 1:
                    BankAccount savings = new BankAccount(1000, 3);
                    savings.setTransactionFee(1.00);

                    savings.deposit(100);
                    savings.withdraw(10);
                    savings.withdraw(30);
                    savings.withdraw(27.25);
                    savings.deposit(30);
                    savings.deposit(12);

                    savings.deductMonthlyCharge();

                    double balance = savings.getBalance();

                    System.out.print("Balance: ");
                    System.out.println(balance);
                    System.out.println("Expected: 1071.75");

                    savings.withdraw(20);
                    savings.deposit(20);
                    savings.deposit(20);
                    savings.deductMonthlyCharge();

                    balance = savings.getBalance();

                    System.out.print("Balance: ");
                    System.out.println(balance);
                    System.out.println("Expected: 1091.75");

                    savings.deposit(10);
                    savings.withdraw(20);
                    savings.deposit(20);
                    savings.deposit(20);
                    savings.deductMonthlyCharge();

                    balance = savings.getBalance();

                    System.out.print("Balance: ");
                    System.out.println(balance);
                    System.out.println("Expected: 1120.75");

                    break;

                case 2:
                    Student student = new Student("Ali");
                    student.addQuiz(90);
                    student.addQuiz(85);
                    student.addQuiz(95);
                    int totalScore = student.getTotalScore();
                    double averageScore = student.getAverageScore();
                    System.out.println("Total Score: " + totalScore);
                    System.out.println("Average Score: " + averageScore);
                    break;

                case 3:
                    RoachPopulation roach = new RoachPopulation(50);
                    roach.breed();
                    roach.breed();
                    roach.spray(25);
                    int roachCount = roach.getRoaches();
                    System.out.println("Roach Count: " + roachCount);
                    break;

                case 4:
                    JFrame frame = new JFrame();
                    frame.setSize(1000, 600);
                    frame.setTitle("The Pitch");

                    SoccerPitch pitch = new SoccerPitch();
                    frame.add(pitch);
                    frame.setVisible(true);
                    break;

            }

        } while (question != 0);

        choice.close(); // Close the scanner
    }
}
