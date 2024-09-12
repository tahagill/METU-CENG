import java.util.Scanner;

/**
 * This program prompts the user for a positive integer and displays prime numbers up to that integer.
 */
public class PrimeNumbers {

    /**
     * Main method to run the program and prompt the user for input.
     *
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive integer: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println("\"" + input + "\" is not a valid integer. Please enter a positive integer.");
            }
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Please enter a positive integer.");
            }
        } while (number <= 0);

        scanner.close();
        System.out.println("Prime numbers up to " + number + " are:");
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * Checks if a given number is prime.
     *
     * @param num The number to check for primality.
     * @return True if the number is prime, false otherwise.
     */
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
