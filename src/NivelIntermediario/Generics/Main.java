package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {

        bolsaNinja<Object> bolsaNinja = new bolsaNinja<>();
        bolsaNinja.addItemNaBolsa(new Shuriken(3));

        bolsaNinja.exibirEquipamentos();
    }
}
