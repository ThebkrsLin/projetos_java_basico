package ListaTarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> listaTarefas = new ArrayList<>();
		int opcao, opcao2;
		String tarefa;
		Status tarefas = new Status();
		Verificador verificador = new Verificador();

		do {
			System.out.println("    Tarefas");
			System.out.println("1 - Adicinar uma tarefa;");
			System.out.println("2 - Ver Tarefas");
			System.out.println("3 - Marcar Tarefa como concluido");
			System.out.println("4 - Remover uma tarefa");
			System.out.println("5 - Sair do Programa;");
			System.out.print("Digite a sua escolha: ");
			opcao = input.nextInt();
			input.nextLine();
			// Cases
			switch (opcao) {
			case 1: {
				System.out.print("Digite o nome da tarefa: ");
				tarefa = input.nextLine();
				listaTarefas.add(tarefa);
				if (listaTarefas.size() > 0) {
					System.out.println("Item Adicionado com sucesso");
				}
				tarefas.tarefasFeitas.add(false);
				System.out.println("Aperte ENTER para continuar!");
				input.nextLine();
				break;
			}

			case 2: {
				System.out.println("Lista completa de tarefas: ");
				if (listaTarefas.isEmpty()) {
					System.out.println("Não há nenhuma tarefa registrada!!!");
					input.nextLine();
				}
				tarefas.getLista(listaTarefas, tarefas.tarefasFeitas);
				System.out.println("Aperte ENTER para continuar: ");
				input.nextLine();
				break;
			}

			case 3: {
				while (true) {
					tarefas.getLista(listaTarefas, tarefas.tarefasFeitas);
					System.out.println("Qual Tarefa você concluiu: ");
					opcao2 = input.nextInt();
					if (opcao2 > listaTarefas.size() || opcao2 < 0) {
						System.out.println("Opção inválida, tente novamente!!!");
					} else {
						break;
					}
				}
				tarefas.tarefasFeitas.set(opcao2 - 1, true);
				System.out.println("Aperte ENTER para continuar: ");
				input.nextLine();
				break;

			}

			case 4: {
				while (true) {
					tarefas.getLista(listaTarefas, tarefas.tarefasFeitas);
					System.out.println("Qual Tarefa você deseja remover?: ");
					opcao2 = input.nextInt();
					if (opcao2 > listaTarefas.size() || opcao2 < 0) {
						System.out.println("Opção inválida, tente novamente!!!");
					} else {
						break;
					}
				}
				tarefas.tarefasFeitas.remove(opcao2 - 1);
				listaTarefas.remove(opcao2 - 1);
				System.out.println("Tarefa Removida Com Sucesso!");
				System.out.println("Aperte ENTER para continuar: ");
				input.nextLine();
				break;
			}

			case 5: {
				System.out.println("Saindo do sistema, volte sempre!!!");
				break;
			}

			default: {
				System.out.println("Opção inválida!, tente novamente!!");
				continue;
			}
			}
		} while (opcao != 5);
	}
}
