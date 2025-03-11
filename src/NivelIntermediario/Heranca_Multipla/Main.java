package NivelIntermediario.Heranca_Multipla;

public class Main {
    public static void main(String[] args) {

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";

        // Construtor seguindo a super class
        Uchiha Itachi = new Uchiha("Itachi Uchiha", "20", "Folha", "Amaterasu");
        Itachi.printNinja();
        Itachi.sharingan();
        Itachi.habilidadeEspecial();

        Hatake Kakashi = new Hatake("Kakashi Hatake", "40", "Folha", "teste", true);
        Kakashi.printNinja();
        Kakashi.sharingan();
        Kakashi.habilidadeEspecial();
        Kakashi.esquadraoAnbu();
    }

}
