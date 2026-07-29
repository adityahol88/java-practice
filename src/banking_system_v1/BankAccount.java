package banking_system_v1;

public class BankAccount {
	private String name;
	private double balance=500;
	int numberid;
	static int idcounter = 101;
	BankAccount(String name) {
		this.name = name;
		this.numberid = idcounter;
		idcounter++;
	}
	String getName() {
		return this.name;
	}

	void deposit(double amount) {
		this.balance+=amount;
	}
	void withdraw(double amount) throws InsufficientFundsException  {
		if(this.balance < amount) {
			System.out.println(this.balance );
			throw new InsufficientFundsException("Insufficient Balance");
		}
		this.balance-=amount;
	}
	double getBalance() {
		return this.balance;
	}
}
