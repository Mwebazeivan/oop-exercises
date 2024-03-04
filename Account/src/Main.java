import java.util.Scanner;

class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        }
    }
}

class ATM {
    private static String location = "Main Street";
    private static double maxWithdrawalLimit = 500.0;

    public static void withdraw(Account account, double amount) {
        if (amount > maxWithdrawalLimit) {
            System.out.println("Withdrawal amount exceeds the maximum limit!");
        } else {
            account.withdraw(amount);
        }
    }

    public static void displayMenu() {
        System.out.println("Welcome to ATM at " + location);
        System.out.println("1. Withdraw");
        System.out.println("2. Exit");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize account with balance 1000
        Account account = new Account(1000.0);

        while (true) {
            ATM.displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    ATM.withdraw(account, amount);
                    break;
                case 2:
                    System.out.println("Exiting ATM. Thank you for using our services!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
