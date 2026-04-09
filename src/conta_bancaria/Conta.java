package conta_bancaria;

public class Conta {
	private int accountNumber;
	private String accountOwner;
	private double deposit;

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

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
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
