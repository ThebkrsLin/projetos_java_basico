package ListaTarefas;

import java.util.ArrayList;

public class Status {
	ArrayList<Boolean> tarefasFeitas = new ArrayList<>();

	void getLista(ArrayList<String> tarefas, ArrayList<Boolean> tarefasFeitas) {
		int indice = 0;
		for (String tasks : tarefas) {
			System.out.print((indice + 1) + " - " + tasks + " ");
			if (tarefasFeitas.get(indice) == true) {
				System.out.println("[V]");
			} else {
				System.out.println("[X]");
			}
			System.out.println();
			indice++;
		}
	}
}
