/**
 * Problem: Model a bank account with an account number, holder name, balance,
 * deposit and withdrawal operations, and balance lookup.
 */
package banking_system_v1;

/** Represents one account managed by the sample banking system. */
public class BankAccount {
	private String name;
	private double balance=500;
	int numberid;
	static int idcounter = 101;
	/** Creates an account for {@code name} with the sample opening balance. */
	BankAccount(String name) {
		this.name = name;
		this.numberid = idcounter;
		idcounter++;
	}
	/** Returns the account holder's name. */
	String getName() {
		return this.name;
	}

	/** Adds {@code amount} to the account balance. */
	void deposit(double amount) {
		this.balance+=amount;
	}
	/** Subtracts {@code amount}, or rejects it when funds are insufficient. */
	void withdraw(double amount) throws InsufficientFundsException  {
		if(this.balance < amount) {
			System.out.println(this.balance );
			throw new InsufficientFundsException("Insufficient Balance");
		}
		this.balance-=amount;
	}
	/** Returns the current account balance. */
	double getBalance() {
		return this.balance;
	}
}
