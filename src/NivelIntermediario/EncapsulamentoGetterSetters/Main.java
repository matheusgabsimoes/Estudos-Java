package NivelIntermediario.EncapsulamentoGetterSetters;

public class Main {
    public static void main(String[] args) {

        // Construtor seguindo a super class
        Uchiha Itachi = new Uchiha("Itachi", 20, "Folha", "Amaterasu");
        Itachi.setNome("Itachi Uchiha");
        System.out.println(Itachi.getNome());
        Itachi.sharingan();
        Itachi.habilidadeEspecial();

        System.out.println("-------------------------------------------------");

        // Construtor seguindo a super class
        Hatake Kakashi = new Hatake("Kakashi", 40, "Folha", "teste", true);
        Kakashi.setNome("Kakashi Hatake");
        System.out.println(Kakashi.getNome());
        Kakashi.sharingan();
        Kakashi.habilidadeEspecial();
        Kakashi.esquadraoAnbu();
    }

}
