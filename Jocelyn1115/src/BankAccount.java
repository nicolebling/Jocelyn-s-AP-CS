public class BankAccount {
    public String name;              // Account holder's name (public)
    private int accountNumber;       // Unique account number (private)
    private double balance;          // Account balance (private)
    private static int accountCount = 0; // Static variable to track number of accounts

    // Default constructor: Initializes default values
    public BankAccount() {
        this.name = "";
        this.accountNumber = ++accountCount; // Unique account number auto-generated
        this.balance = 0.0;
    }

    // Constructor with parameters
    public BankAccount(String name, double balance) {
        this.name = name;
        this.accountNumber = ++accountCount; // Unique account number auto-generated
        this.balance = balance;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds.");
        } else {
            this.balance -= amount;
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Method to return the number of BankAccount objects created
    public static int getAccountCount() {
        return accountCount;
    }

    // Override toString method
    public String toString() {
        return "Account Holder: " + this.name + ", Account Number: " + this.accountNumber + ", Balance: " + this.balance;
    }

    // Main method for testing the class

}