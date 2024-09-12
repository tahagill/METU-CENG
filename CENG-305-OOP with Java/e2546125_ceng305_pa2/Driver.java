import javax.swing.JOptionPane;
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
                    CharacterTypeChecker.checkCharacter();
                    break;

                case 2:
                    MajorStatusChecker.main(null);
                    break;

                case 3:
                    String number = JOptionPane.showInputDialog("Enter the side length of the diamond: ");
                    int num = Integer.parseInt(number);
                    DiamondPattern.printDiamond(num);
                    break;

                case 4:
                    PrimeNumbers.main(null);
                    break;
            }

        } while (question != 0);
        
        choice.close(); // Close the scanner to release resources
    }
}
