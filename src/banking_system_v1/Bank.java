package banking_system_v1;
import java.util.ArrayList;

class NegativeAmountException extends Exception {
	NegativeAmountException(String message) {
		super(message);
	}
}
class AccountNotFoundException extends Exception {
	AccountNotFoundException(String message) {
		super(message);
	}
}

class InsufficientFundsException extends Exception {
	InsufficientFundsException(String message) {
		super(message);
	}
}


public class Bank {
	ArrayList<BankAccount> accounts = new ArrayList<>();
	
	private BankAccount findAccount(int accountNumber) throws AccountNotFoundException{
		for(BankAccount account :accounts) {
			if(account.numberid == accountNumber) {
				return account;
			}
		}
		throw new AccountNotFoundException("Account not found");
	}
	
	Bank(){
		accounts.add(new BankAccount("Aditya"));
		accounts.add(new BankAccount("Rahul"));
		accounts.add(new BankAccount("Priya"));
		}
	
	final void deposit(int accountNumber,double amount) throws  NegativeAmountException,AccountNotFoundException{
		if(amount <= 0) {
			throw new NegativeAmountException("Deposit amount can't be -ver");
		}
		BankAccount account = findAccount(accountNumber);
		account.deposit(amount);
	}
	
	final void withdraw(int accountNumber,double amount) throws NegativeAmountException,AccountNotFoundException,
	InsufficientFundsException{
		if(amount <= 0) {
			throw new NegativeAmountException("Deposit amount can't be -ve");
		}
		BankAccount account = findAccount(accountNumber);
		account.withdraw(amount);
	}
	
	final void transferMoney(int senderNumber,int receiverNumber,double amount) throws NegativeAmountException,AccountNotFoundException,
	InsufficientFundsException{
		if(amount <= 0) {
			throw new NegativeAmountException("Deposit amount can't be -ver");
		}
		withdraw(senderNumber,amount);
		deposit(receiverNumber, amount);
	}
	
	final double getBalance(int accountNumber) throws AccountNotFoundException{

		BankAccount account = findAccount(accountNumber);
		return account.getBalance();
	}
	
	final void displayAllAccounts() {
		System.out.println(" Account No.  |  Holder Name | Balance  " );
		for(BankAccount account : this.accounts) {
			System.out.printf("   %d     |    %s  |  %.2f  \n",account.numberid,account.getName(),account.getBalance());
		}
		System.out.println();
		System.out.println();
	}
}
