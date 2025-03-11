package NivelIntermediario.Heranca_Multipla;

public abstract class Ninja implements HabilidadeEspecial {

    String nome;
    String idade;
    String aldeia;

    public Ninja() {
    }

    // Super class
    public Ninja(String nome, String idade, String aldeia, String habilidadeEspecial) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public void printNinja() {
        System.out.println("Nome: " + nome +
                            " \nIdade: " + idade +
                            " anos \nVive na aldeia da(o/e): " + aldeia);
    }
}
