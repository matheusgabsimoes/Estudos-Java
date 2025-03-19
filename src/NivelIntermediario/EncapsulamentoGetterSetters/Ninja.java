package NivelIntermediario.EncapsulamentoGetterSetters;

public abstract class Ninja implements HabilidadeEspecial {

    private String nome;
    private int idade;
    private String aldeia;

    public Ninja() {
    }

    // Super class
    public Ninja(String nome, int idade, String aldeia, String habilidadeEspecial) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    //Getters e setters do encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }
}
