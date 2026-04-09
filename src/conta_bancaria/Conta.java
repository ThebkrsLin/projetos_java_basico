package conta_bancaria;

public class Conta {
	private int accountNumber;
	private String accountOwner;
	private double deposit;

	public Conta(int accountNumber, String accountOwner) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
	}

	public Conta(int accountNumber, String accountOwner, double initialdeposit) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		deposit(initialdeposit);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public void deposit(double deposit) {
		this.deposit = deposit;
	}

	public void addDeposit(double deposit) {
		this.deposit += deposit;
	}

	public void withDraw(double deposit) {
		this.deposit -= deposit + 5;
	}

	@Override
	public String toString() {
		return "Número da Conta: " + accountNumber + ", Titular da Conta: " + accountOwner + ", Saldo: R$" + deposit
				+ "";
	}

}
