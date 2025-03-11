package NivelIntermediario.Heranca_Multipla;

public class Uchiha extends Ninja implements SharinganInterface {

    String habilidadeEspecial;

    public Uchiha() {
        super();
    }

    @Override
    public void sharingan() {
        System.out.println("Tem Sharingan");
    }

    // Construtor seguindo a super class
    public Uchiha(String nome, String idade, String aldeia, String habilidadeEspecial) {
        super(nome, idade, aldeia, habilidadeEspecial);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public void habilidadeEspecial() {
        System.out.println("Habilidade especial: " + habilidadeEspecial);
    }
}
