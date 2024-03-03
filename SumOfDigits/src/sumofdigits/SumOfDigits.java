
import java.util.Scanner;

public class SumOfDigits {
    
    public static int calculateSumOfDigits(int number) {
        int sum = 0;

        
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

      
        int sumOfDigits = calculateSumOfDigits(inputNumber);

       
        System.out.println("Sum of digits: " + sumOfDigits);

       
        scanner.close();
    }
}
