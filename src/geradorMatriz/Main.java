package geradorMatriz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int addL = 0;
		int addC = 0;

		while (true) {
			try {
				System.out.print("Digite a quantidade de linhas da matriz: ");
				addL = input.nextInt();
				System.out.print("Digite a quantidade de colunas da matriz: ");
				addC = input.nextInt();
				input.nextLine();
				if (addC < 0 || addL < 0) {
					System.out
							.println("Os valores das linhas e das colunas tem que ser maior que 0, tente novamente!!");
					continue;
				}

				break;
			} catch (InputMismatchException e) {
				System.out.println("O Valor tem quer um número inteiro, tente novamente!!!");
				input.next();
			}
		}

		int[][] matrix = new int[addL][addC];

		while (true) {
			System.out.println("Quer Gerar os valores da matrix Automaticamente?[S/N]: ");
			String choose = input.nextLine();
			// input.nextLine();

			if (choose.toUpperCase().equalsIgnoreCase("S")) {
				for (int l = 0; l < addL; l++) {
					for (int c = 0; c < addC; c++) {
						matrix[l][c] = random.nextInt(100);
					}
				}
			}

			else if (choose.toUpperCase().equalsIgnoreCase("N")) {
				for (int l = 0; l < addL; l++) {
					for (int c = 0; c < addC; c++) {
						System.out.print("Digite o Valor na posição [ " + (l + 1) + ", " + (c + 1) + " ]: ");
						matrix[l][c] = input.nextInt();
					}
				}
			}

			else {
				System.out.println("Opção Inválida, tente novamente!!!!");
				continue;
			}
			break;
		}

		for (int line = 0; line < addL; line++) {
			System.out.print("[ ");
			for (int colun = 0; colun < addC; colun++) {
				System.out.print(matrix[line][colun] + " ");
			}
			System.out.println(" ]");
		}

	}
}
