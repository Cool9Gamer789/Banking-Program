import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Declare variables
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            // Display menu
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. EXIT");
            System.out.println("***************");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            if (choice == 1) {
                showBalance(balance);
            }
            else if (choice == 2) {
                balance = balance + deposit();
            }
            else if (choice == 3) {
                balance = balance - withdraw(balance);
            }
            else if (choice == 4) {
                System.out.print("Thank you for using!");
                isRunning = false;
            }
            else {
                System.out.print("INVALID CHOICE");
                isRunning = false;
            }
        }

        // Exit
        scanner.close();
    }


    static void showBalance(double balance) {
        System.out.println("$" + balance);
    }

    static double deposit() {
        double amount;

        System.out.print("Enter an amount to deposit: ");
        amount = scanner.nextDouble();

        // Verify amount of number
        if (amount < 0) {
            System.out.println("Amount can't be negative");
            // All if statements must have return
            return 0;
        }
        else {
            return amount;
        }
    }

    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter an amount to withdraw: ");
        amount = scanner.nextDouble();

        // Verify amount of number
        if (amount < 0 || balance < amount) {
            System.out.println("Invalid withdraw");
            // All if statements must have return
            return 0;
        }
        else {
            return amount;
        }
    }
}







