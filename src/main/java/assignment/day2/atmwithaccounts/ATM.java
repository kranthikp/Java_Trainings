package assignment.day2.atmwithaccounts;

class ATM {
    private double balance;

    public ATM() {
        balance = 0;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        }
    }
}
