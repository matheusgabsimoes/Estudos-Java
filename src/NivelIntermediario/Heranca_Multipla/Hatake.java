package NivelIntermediario.Heranca_Multipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface{

    String habilidadeEspecial;
    boolean anbuOuNao;

    public Hatake() {
    }

    // Super class
    public Hatake(String nome, String idade, String aldeia, String habilidadeEspecial, boolean anbuOuNao) {
        super(nome, idade, aldeia, habilidadeEspecial);
        this.habilidadeEspecial = habilidadeEspecial;
        this.anbuOuNao = anbuOuNao;
    }

    // Metodo da interface
    @Override
    public void sharingan() {
        System.out.println("Tem Sharingan");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

    @Override
    public boolean fazParteDosAnbu() {
        return anbuOuNao;
    }
}
