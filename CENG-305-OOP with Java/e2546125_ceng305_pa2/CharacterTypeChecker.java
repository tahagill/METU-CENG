import java.util.Scanner;

/**
 * This class checks if the input character is a vowel or a consonant.
 */
public class CharacterTypeChecker {
    /**
     * This is the main method which makes use of checkCharacter method.
     * @param args 
     */
    public static void main(String[] args) {
        checkCharacter();
    }

    /**
     * This method checks if the input character is a vowel, consonant or invalid.
     */
    public static void checkCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a single character from the alphabet: ");
        String input = scanner.next();

        if (input.length() > 1) {
            System.out.println("Error: You have entered more than one character.");
        } else if (!Character.isLetter(input.charAt(0))) {
            System.out.println("Error: You have not entered a letter from the alphabet.");
        } else {
            char ch = Character.toLowerCase(input.charAt(0));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }
    }
}
