package ListaTarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class Verificador{
    Scanner input = new Scanner(System.in);
     int verificando(ArrayList<String> lista, boolean tipo){
         while(true) {
             if(tipo == true) {System.out.println("Qual Tarefa você concluiu: ");}
             else{System.out.println("Qual tarefa você deseja remover?: ");}

             int opcao = input.nextInt();
             if (opcao > lista.size() || opcao < 0) {
                 System.out.print("Opçõa inválida tente novamente: ");
                 continue;
             }
             else{
                 System.out.println("Tarefa concluida com Sucesso!!!");
                 return opcao;
             }
         }
    }
}
