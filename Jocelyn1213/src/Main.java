public class Main {
    public static void main(String[] args) {
        //Call MyComplex class
        // Create MyComplex objects
        MyComplex num1 = new MyComplex(2, 3);
        MyComplex num2 = new MyComplex(4, 5);

        // Add num2 to num1
        num1.add(num2);
        System.out.println("Sum: " + num1); // Should print (6.0 + 8.0i)

        // Multiply num1 by num2
        num1 = new MyComplex(2, 3); // Reset num1 for correct multiplication
        num1.multiply(num2);
        System.out.println("Product: " + num1); // Should print (-7.0 + 22.0i)

        //Call BankAccount class
        BankAccount account1 = new BankAccount();
        System.out.println(account1);

        BankAccount account2 = new BankAccount("John Smith", 1000.0);
        System.out.println(account2);

        account1.deposit(500);
        System.out.println("Account Holder: " + account1.name + ", Deposited 500.0 into account.");
        System.out.println(account1);

        account2.withdraw(200);
        System.out.println("Account Holder: " + account2.name + ", Withdraw 200.0 to account.");
        System.out.println(account2); //800

        account2.withdraw(850);
        System.out.println(account2);

        System.out.println("Bank number: " + BankAccount.getAccountCount());

    }
}