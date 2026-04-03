package doc;

import java.util.ArrayList;
import java.util.List;
public class Impressora {
    private List<Imprimivel> fila = new ArrayList<>();

    public void adicionar(Imprimivel item) {
        fila.add(item);
    }

    public void imprimirTudo() {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia.");
            return;
        }
        System.out.println("Imprimindo todos os arquivos...\n");
        for (Imprimivel i : fila) {
            i.imprimir();
        }
    }
}
