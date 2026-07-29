package banking_system_v1;

import java.util.Scanner;

public class Main {
	
	
	
	public static void deposit(Bank bank,Scanner sc) {
		System.out.println("Enter Account Number and ammount to deposit: ");
		int number = sc.nextInt();
		double amount = sc.nextDouble();
		try {
			bank.deposit(number,amount);
			System.out.println("Deposit successful");
		}
		catch (AccountNotFoundException |
			       NegativeAmountException  e) {
			System.out.println(e.getMessage());
		}
	}
	public static void withdraw(Bank bank,Scanner sc) {
		System.out.println("Enter Account Number and ammount to withdraw: ");
		int number = sc.nextInt();
		double amount = sc.nextDouble();
		try {
			bank.withdraw(number,amount);
			System.out.println("Withdraw Successful");
		}
		catch (AccountNotFoundException |
			       NegativeAmountException |
			       InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void transferMoney(Bank bank,Scanner sc) {
		System.out.println("Enter sender account number ");
		int senderNumber = sc.nextInt();
		System.out.println("Enter receiver account number ");
		int receiverNumber = sc.nextInt();
		System.out.print("Enter amount to transfer: ");
		double amount = sc.nextDouble();
		try {
			bank.transferMoney(senderNumber,receiverNumber,amount);
			System.out.println("Transfer Successful");
		}
		catch (AccountNotFoundException |
				       NegativeAmountException |
				       InsufficientFundsException e) {
				System.out.println(e.getMessage());
			}
	}
	public static void checkBalance(Bank bank,Scanner sc) {
		System.out.println("Enter account number ");
		int accountNumber = sc.nextInt();
		
		try {
			double balance = bank.getBalance(accountNumber);
			System.out.println("Balance in account "+ accountNumber + " is " + balance);
		}
		catch(AccountNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
		
	public static void main(String[] args) {
			Bank bank = new Bank();
			Scanner sc = new Scanner(System.in);
			
			do {
				System.out.println("------------   Menu -------------");
				System.out.println("1. Deposit ");
				System.out.println("2. Withdraw ");
				System.out.println("3. Transfer Money ");
				System.out.println("4. Check Balance ");
				System.out.println("5. Display All Accounts ");
				System.out.println("6. Exit ");
				System.out.println();
				System.out.print("Press the choice number :");
				int choice = sc.nextInt();
				switch(choice) {
				
				case 1:
					deposit(bank,sc);
					break;
				case 2: 
					withdraw(bank,sc);
					break;
				case 3: 
					transferMoney(bank,sc);
					break;
				case 4: 
					checkBalance(bank,sc);
					break;
				case 5: 
					bank.displayAllAccounts();
					break;
				case 6:
					sc.close();
					System.exit(0);
					break;
				}
			} while(true);
				
	
	}
}
