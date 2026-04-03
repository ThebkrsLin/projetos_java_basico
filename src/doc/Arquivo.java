package doc;

public abstract class Arquivo{
    protected String nome;

    public Arquivo(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public abstract void abrir();
}
