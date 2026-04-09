package conta_bancaria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choose, owner;
		int acNumber;
		double deposit;
		Conta account = null;

		System.out.print("Número da conta: ");
		acNumber = input.nextInt();
		input.nextLine();
		System.out.print("Nome do Títular da Conta: ");
		owner = input.nextLine();

		do {
			System.out.print("Tem um deposito inicial?[y/n]: ");
			choose = input.nextLine().toLowerCase();
			if (choose.contains("y")) {
				System.out.print("Digite o Valor do deposito inicial: R$");
				double InitialDeposit = input.nextDouble();
				input.nextLine();
				account = new Conta(acNumber, owner, InitialDeposit);

			} else if (choose.contains("n")) {
				System.out.print("");
				account = new Conta(acNumber, owner);

			} else {
				System.out.println("Opção inválida!!!");
			}
		} while (!choose.contains("y") && !choose.contains("n"));

		System.out.println("Dados da Conta: ");
		System.out.println(account.toString());

		System.out.print("Digite o Valor a ser depositado: R$");
		account.addDeposit(input.nextDouble());
		input.nextLine();

		System.out.println("Dados da conta atualizados: ");
		System.out.println(account.toString());

		System.out.print("Digite o valor a ser retirado: R$");
		account.withDraw(input.nextDouble());

		System.out.println("Dados da Conta Atualizados:");
		System.out.println(account.toString());
		input.close();

	}

}
