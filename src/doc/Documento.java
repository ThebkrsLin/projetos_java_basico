package doc;

public class Documento extends Arquivo implements Imprimivel{
    private String file, idade;

    public Documento(String nome, String idade, String file){
        super(nome); // chama arquivo
        this.file = file;
        this.idade = idade;
    }

    @Override
    public void abrir(){
        System.out.println("Abrindo documento: "+ nome);
    }

    @Override
    public void imprimir() {
        System.out.println("=== IMPRESSÃO DO DOCUMENTO DO USUÁRIO ===");
        System.out.println("Nome do Arquivo: "+file);
        System.out.println("Nome do Usuário: " + nome);
        System.out.println("Idade: " +idade);
        System.out.println("==============================\n");
    }
}
