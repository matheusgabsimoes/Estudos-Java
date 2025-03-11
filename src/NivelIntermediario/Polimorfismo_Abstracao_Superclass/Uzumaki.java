package NivelIntermediario.Polimorfismo_Abstracao_Superclass;

public class Uzumaki extends Ninja {

    String habilidadeEspecial = "Modo Sábio";

    public Uzumaki() {
        super();
    }

    // Construtor seguindo a super class
    public Uzumaki(String nome, String idade, String aldeia, String habilidade, String habilidadeEspecial) {
        super(nome, idade, aldeia, habilidade);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public void habilidadeEspecial() {
        System.out.println("Minha habilidade especial é " + habilidadeEspecial);
    }
}
