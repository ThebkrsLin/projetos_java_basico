package PedraPapeltesoura;

import java.util.Scanner;

public class Principal{

    public static void main(String[] args){
        String[] objetos = {"Pedra", "Papel", "Tesoura"};
        CPU cpu = new CPU();
        int playerEscolha, cpuEscolha;
        int pontosJogador = 0, pontosCpu = 0;
        String Sair = "";
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Jogo de Pedra Papel e Tesoura");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");
            System.out.print("qual você escolhe?: ");
            playerEscolha = input.nextInt();

            if(playerEscolha < 1 || playerEscolha > 3){
                System.out.println("Opção Inválida, tente novamente!!!");
                continue;
            }
            cpuEscolha = cpu.escholha();
            System.out.println("Você escolheu "+objetos[playerEscolha-1]+" e a CPU "+objetos[cpuEscolha-1]);

            if(playerEscolha != cpuEscolha){
                if(playerEscolha == 1 && cpuEscolha == 3
                        || playerEscolha == 2 && cpuEscolha == 1
                        || playerEscolha == 3 && cpuEscolha == 2
                )
                {
                    pontosJogador++;
                    System.out.println("Você Venceu!!!");
                }
                else{
                    pontosCpu++;
                    System.out.println("Você Perdeu!!!");
                }
            }

            else{
                System.out.println("Empate!!!!");
            }

            System.out.print("Você quer continuar?[s/n]: ");
            input.nextLine();
            Sair = input.nextLine();
        }while(Sair.equalsIgnoreCase("s") || Sair.isEmpty());

        System.out.println("Placar Final: ");
        System.out.println("Jogador "+ pontosJogador+" x "+pontosCpu+" CPU");
    }
}
