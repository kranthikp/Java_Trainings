package assignment.day2.atmwithaccounts;

public class Account {

    private int accountNumber;
    private int pin;
    private double balance;

    public Account(int accountNumber, int pin, double balance){
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public int getAccount(){
        return accountNumber;
    }
    public int setAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getPin(){
        return pin;
    }
    public int setPin(int pin){
        this.pin = pin;
    }
    public int setBalance(int pin){
        this.balance = balance;
    }
    // create new account

    // login to existing account

    // manage multiple accounts simultaneously

    //pin authentication
}
