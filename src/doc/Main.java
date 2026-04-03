package doc;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, idade;

        System.out.print("Digite o nome do Usuário: ");
        nome = input.nextLine();
        System.out.print("Digite a Idade do Usuário: ");
        idade = input.nextLine();

        Documento contrato = new Documento(
                nome,
                idade,
                "User.pdf"
        );


        Impressora impressora = new Impressora();

        contrato.abrir();

        impressora.adicionar(contrato);

        impressora.imprimirTudo();
    }
}
