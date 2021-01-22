package secao09_exercicioFixacao;

public class Account {

	// atributos
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	// construtores
	
	public Account (int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public Account (int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}
	
	// métodos
	public void deposit(double deposit) {
		this.balance += deposit;
	}

	public void withdraw(double withdraw) {
		this.balance -= withdraw + 5.0;
	}
	
	// getters e setters
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public double getBalance() {
		return balance;
	}

	// toString
	@Override
	public String toString() {
		return "Account " 
				+ accountNumber 
				+ ", Holder: "
				+ accountHolder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
