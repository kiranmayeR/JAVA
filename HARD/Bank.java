import java.util.*;
class Bank{
	public static void main(String args[]){
		String An="12345678";
		String Ah="Pranaou";
		Scanner sc = new Scanner(System.in);
		String type = sc.nextLine();
		int depamount=sc.nextInt();
		int balance=1000;
		balance = balance+depamount;
		System.out.println("balance: "+balance);
		int withdraw=sc.nextInt();
		balance= balance-withdraw;
		System.out.println("balance: "+balance);
	}
}
import java.util.Scanner;

class BankAccount {
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private double balance;

    // Constructor to initialize balance
    public BankAccount() {
        this.balance = 10000; // Assume initial balance is 10000
    }

    // Method to read account details
    public void readAccountDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        this.accountNumber = scanner.nextLine();

        System.out.print("Enter depositor name: ");
        this.depositorName = scanner.nextLine();

        System.out.print("Enter account type (Savings/Current): ");
        this.accountType = scanner.nextLine();
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 500) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid transaction. Withdraw failed. Minimum balance must be Rs.500.00");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Main method to demonstrate the class functionality
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.readAccountDetails();
        account.displayBalance();

        account.deposit(2000);
        account.displayBalance();

        account.withdraw(7000);
        account.displayBalance();

        account.withdraw(3000);
        account.displayBalance();
    }
}
