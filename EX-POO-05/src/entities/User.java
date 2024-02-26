package entities;

public class User {
	
	private double accountBalance; 
	private String accountNumber;
	private String holderName;
	final private double withDrawTax = 5.00f;
	
	
	public User(double accountBalance, String accountNumber, String holderName) {
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
		this.holderName = holderName;
	}

	
	public User(String accountNumber,String holderName) {
		this.holderName = holderName;
		this.accountNumber = accountNumber;
	}
	
	
	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String name) {
		this.holderName = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}


	public double getaAcountBalance() {
		return accountBalance;
	}

	
	public void deposit(double value) {
		this.accountBalance += value;
	}
	
	
	public void withdraw(double value) {
		value += withDrawTax;
		this.accountBalance -= value;
	}
	
	
	public String toString() {
		return "Account "
				+ getAccountNumber()
				+ ", Holder: "
				+ getHolderName()
				+ ", balance: $"
				+ String.format("%.2f", getaAcountBalance());
	}
	
	
}
