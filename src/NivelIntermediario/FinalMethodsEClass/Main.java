package NivelIntermediario.FinalMethodsEClass;

public class Main {
    public static void main(String[] args) {

        // Construtor seguindo a super class
        Uchiha Itachi = new Uchiha("Itachi", "20", "Folha", "Sharingan", "Amaterasu");
        Itachi.habilidadeNinja();
        Itachi.habilidadeEspecial();
        // Metodo final
        Itachi.usarKunai();

        Akatsuki ItachiAkatsuki = new Akatsuki();
        ItachiAkatsuki.nome = "Itachi Uchiha";
        ItachiAkatsuki.akatsuki();

    }
}
