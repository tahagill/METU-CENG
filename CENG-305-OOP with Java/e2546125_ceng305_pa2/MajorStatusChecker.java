import java.util.Scanner;

/**
 * This class prompts the user for two characters and displays the major and student status.
 */
public class MajorStatusChecker {

    /**
     * Main method to prompt the user for input and display major and status.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two characters (Major and Status): ");
        String input = scanner.nextLine();
        scanner.close();

        if (input.length() != 2) {
            System.out.println("Error: Please enter exactly two characters.");
            return;
        }

        char major = input.charAt(0);
        char status = input.charAt(1);

        if (!"MCI".contains(String.valueOf(major))) {
            System.out.println("Error: Invalid major character. Please use M, C, or I.");
            return;
        }

        if (!"1234".contains(String.valueOf(status))) {
            System.out.println("Error: Invalid status character. Please use 1, 2, 3, or 4.");
            return;
        }

        String majorDesc;
        switch (major) {
            case 'M':
                majorDesc = "Mathematics";
                break;
            case 'C':
                majorDesc = "Computer Science";
                break;
            case 'I':
                majorDesc = "Information Technology";
                break;
            default:
                majorDesc = "SUIIIII"; 
        }

        String statusDesc;
        switch (status) {
            case '1':
                statusDesc = "Freshman";
                break;
            case '2':
                statusDesc = "Sophomore";
                break;
            case '3':
                statusDesc = "Junior";
                break;
            case '4':
                statusDesc = "Senior";
                break;
            default:
                statusDesc = "SUIIIII"; 
        }

        System.out.println("Major: " + majorDesc);
        System.out.println("Status: " + statusDesc);
    }
}
