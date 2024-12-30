import java.util.Scanner;

public class Main {

    public static int countFactors(int n) {
        int i = 1;
        int count = 0;
        while (i <= n){
            if (n % i == 0) {
                count += 1;
            }
            i += 1;
        }
        return count;
    }

    public static boolean isPrime(int n) {
        return countFactors(n) == 2;
    }

    public static int countPrime(int n) {
        int prime = 2;
        int count = 0;
        while (prime <= n) {
            if (isPrime(prime)) {
                count ++;
            }

            prime += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrime(10));
        // Create accounts using default constructor and parameterized constructor
        BankAccount account1 = new BankAccount();
        System.out.println(account1);

        BankAccount account2 = new BankAccount("John Smith", 1000.0);
        System.out.println(account2);

        // Deposit into account1
        account1.deposit(500.0);
        System.out.println("Account Holder: " + account1.name + ", Deposited 500.0 into account.");
        System.out.println(account1);

        // Withdraw from account2
        account2.withdraw(200.0);
        System.out.println("Account Holder: " + account2.name + ", Withdrawn 200.0 from account.");
        System.out.println(account2);

        // Attempt to withdraw more than balance
        account2.withdraw(1000.0);
        System.out.println(account2);

        // Display total number of accounts
        System.out.println("BankAccount number: " + BankAccount.getAccountCount());
    }
}