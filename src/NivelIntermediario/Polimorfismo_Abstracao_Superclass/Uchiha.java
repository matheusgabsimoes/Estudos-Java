package NivelIntermediario.Polimorfismo_Abstracao_Superclass;

public class Uchiha extends Ninja {

    String habilidadeEspecial = "Sharingan";

    public Uchiha() {
        super();
    }

    // Construtor seguindo a super class
    public Uchiha(String nome, String idade, String aldeia, String habilidade, String habilidadeEspecial) {
        super(nome, idade, aldeia, habilidade);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public void habilidadeEspecial() {
        System.out.println("Minha habilidade especial é " + habilidadeEspecial);
    }

    // Herança = Sobreescrever
    @Override
    public void habilidadeNinja() {
        System.out.println("Meu nome é " + nome + " e minha habilidade é " + habilidade);
    }
}
