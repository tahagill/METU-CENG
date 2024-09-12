import java.util.Scanner;

/**
 * This class prompts the user for a positive integer and displays a diamond pattern using asterisks.
 */
public class DiamondPattern {

  /**
   * Main method to prompt the user for input and print the diamond pattern.
   * 
   * @param args Command line arguments (unused)
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    
    int sideLength = getValidSideLength(scanner);
    if (sideLength == -1) {
      System.out.println("Invalid input. Please enter a positive integer.");
      return;
    }

    
    printDiamond(sideLength);
  }

  /**
   * Prompts the user for a positive integer side length and validates the input.
   * 
   * @param scanner The scanner object to read input from.
   * @return The valid positive integer side length entered by the user, or -1 if input is invalid.
   */
  public static int getValidSideLength(Scanner scanner) {
    System.out.print("Enter the side length of the diamond (positive integer): ");
    if (scanner.hasNextInt()) {
      int sideLength = scanner.nextInt();
      if (sideLength > 0) {
        return sideLength;
      }
    }
    return -1;
  }

  /**
   * Prints a diamond pattern using asterisks based on the provided side length.
   * 
   * @param sideLength The side length of the diamond.
   */
  public static void printDiamond(int sideLength) {
    
    for (int i = 1; i <= sideLength; i++) {
      printSpaces(sideLength - i);
      printAsterisks(2 * i - 1);
      System.out.println();
    }

    
    for (int i = sideLength - 1; i > 0; i--) {
      printSpaces(sideLength - i);
      printAsterisks(2 * i - 1);
      System.out.println();
    }
  }

  /**
   * Prints a specific number of spaces.
   * 
   * @param numSpaces The number of spaces to print.
   */
  public static void printSpaces(int numSpaces) {
    for (int i = 0; i < numSpaces; i++) {
      System.out.print(" ");
    }
  }

  /**
   * Prints a specific number of asterisks.
   * 
   * @param numAsterisks The number of asterisks to print.
   */
  public static void printAsterisks(int numAsterisks) {
    for (int i = 0; i < numAsterisks; i++) {
      System.out.print("*");
    }
  }
}
