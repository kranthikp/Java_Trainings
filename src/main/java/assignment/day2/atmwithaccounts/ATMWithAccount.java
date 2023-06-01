package assignment.day2.atmwithaccounts;

import java.util.Scanner;

public class ATMWithAccount {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to the ATM Simulator");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Created Account");
                    break;
                case 2:
                    System.out.print("Logged in");
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println();

        } while (choice != 5);

        scanner.close();
    }
}
