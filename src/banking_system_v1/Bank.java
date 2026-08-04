/**
 * Problem: Implement a simple bank that supports deposits, withdrawals,
 * transfers, balance lookup, and displaying all accounts while reporting
 * invalid amounts, unknown accounts, and insufficient funds with exceptions.
 */
package banking_system_v1;
import java.util.ArrayList;

/** Indicates that a transaction amount is not positive. */
class NegativeAmountException extends Exception {
	/** Creates an exception with the supplied message. */
	NegativeAmountException(String message) {
		super(message);
	}
}
/** Indicates that an account number is not present in the bank. */
class AccountNotFoundException extends Exception {
	/** Creates an exception with the supplied message. */
	AccountNotFoundException(String message) {
		super(message);
	}
}

/** Indicates that an account cannot cover a withdrawal. */
class InsufficientFundsException extends Exception {
	/** Creates an exception with the supplied message. */
	InsufficientFundsException(String message) {
		super(message);
	}
}


/** Manages the accounts and operations of the sample bank. */
public class Bank {
	ArrayList<BankAccount> accounts = new ArrayList<>();
	
	/** Finds an account by number or throws {@link AccountNotFoundException}. */
	private BankAccount findAccount(int accountNumber) throws AccountNotFoundException{
		for(BankAccount account :accounts) {
			if(account.numberid == accountNumber) {
				return account;
			}
		}
		throw new AccountNotFoundException("Account not found");
	}
	
	/** Creates the sample bank with three initial accounts. */
	Bank(){
		accounts.add(new BankAccount("Aditya"));
		accounts.add(new BankAccount("Rahul"));
		accounts.add(new BankAccount("Priya"));
		}
	
	/** Deposits a positive amount into the specified account. */
	final void deposit(int accountNumber,double amount) throws  NegativeAmountException,AccountNotFoundException{
		if(amount <= 0) {
			throw new NegativeAmountException("Deposit amount can't be -ver");
		}
		BankAccount account = findAccount(accountNumber);
		account.deposit(amount);
	}
	
	/** Withdraws a positive amount from the specified account. */
	final void withdraw(int accountNumber,double amount) throws NegativeAmountException,AccountNotFoundException,
	InsufficientFundsException{
		if(amount <= 0) {
			throw new NegativeAmountException("Deposit amount can't be -ve");
		}
		BankAccount account = findAccount(accountNumber);
		account.withdraw(amount);
	}
	
	/** Transfers a positive amount from one account to another. */
	final void transferMoney(int senderNumber,int receiverNumber,double amount) throws NegativeAmountException,AccountNotFoundException,
	InsufficientFundsException{
		if(amount <= 0) {
			throw new NegativeAmountException("Deposit amount can't be -ver");
		}
		withdraw(senderNumber,amount);
		deposit(receiverNumber, amount);
	}
	
	/** Returns the balance of the specified account. */
	final double getBalance(int accountNumber) throws AccountNotFoundException{

		BankAccount account = findAccount(accountNumber);
		return account.getBalance();
	}
	
	/** Prints the number, holder, and balance for every account. */
	final void displayAllAccounts() {
		System.out.println(" Account No.  |  Holder Name | Balance  " );
		for(BankAccount account : this.accounts) {
			System.out.printf("   %d     |    %s  |  %.2f  \n",account.numberid,account.getName(),account.getBalance());
		}
		System.out.println();
		System.out.println();
	}
}
