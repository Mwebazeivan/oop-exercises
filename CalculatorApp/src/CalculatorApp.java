import java.util.Scanner;

class Calculator {
    
    private double result;

    public Calculator() {
        result = 0.0;
    }

 
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

   
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero!");
            return Double.NaN; 
        }
    }

   
    public double getResult() {
        return result;
    }

    
    public void setResult(double result) {
        this.result = result;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Calculator myCalculator = new Calculator();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double sum = Calculator.add(num1, num2);
        double difference = Calculator.subtract(num1, num2);
        double product = Calculator.multiply(num1, num2);
        double quotient = Calculator.divide(num1, num2);

        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        
        myCalculator.setResult(sum);
        System.out.println("Result stored in the calculator: " + myCalculator.getResult());

        scanner.close();
    }
}
