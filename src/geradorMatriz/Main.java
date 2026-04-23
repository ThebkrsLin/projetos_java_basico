package geradorMatriz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int addL = 0;
		int addC = 0;

		while (true) {
			try {
				System.out.print("Digite a quantidade de linhas da matriz: ");
				addL = input.nextInt();
				System.out.print("Digite a quantidade de colunas da matriz: ");
				addC = input.nextInt();
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

		System.out.println("Lines: " + addL + "Coluns: " + addC);
		for (int l = 0; l < addL; l++) {
			for (int c = 0; c < addC; c++) {
				System.out.print("Digite o Valor na posição [ " + (l + 1) + ", " + (c + 1) + " ]: ");
				matrix[l][c] = input.nextInt();
				// input.nextInt();
			}
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
