import java.util.Scanner;

public class SumCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the two numbers
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Calculate the sum using the static method
        int sum = calculateSum(firstNumber, secondNumber);

        // Display the result
        System.out.println("The sum of all numbers between " + firstNumber + " and " + secondNumber + " is: " + sum);

        // Close the scanner
        scanner.close();
    }

    // Static method to calculate the sum of numbers between two given numbers
    public static int calculateSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
