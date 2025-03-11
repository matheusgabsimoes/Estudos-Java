package NivelIntermediario.Polimorfismo_Abstracao_Superclass;

public abstract class Ninja implements HabilidadeEspecial{

    String nome;
    String idade;
    String aldeia;
    String habilidade;

    public Ninja() {
    }

    // Super class
    public Ninja(String nome, String idade, String aldeia, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.habilidade = habilidade;
    }

    //Metodo geral
    public void habilidadeNinja() {
        System.out.println("Meu nome é " + nome + " e minha habilidade é " + habilidade);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Minha habilidade especial é ");
    }
}
