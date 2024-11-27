package NivelFacil;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        int quantidadeChakra = 0;
        int maximoChakra = 20;

        // While loop
//        while (quantidadeChakra < maximoChakra) {
//            quantidadeChakra++;
//            System.out.println("O ninja aumenteu seu chakra para: " + quantidadeChakra);
//        }

        // For i loop
        for (int i = 0; i <= maximoChakra; i++) {
            System.out.println("O ninja aumentou seu chakra para: " + i);
            if (i == maximoChakra) {
                System.out.println("\n" + "O ninja chegou no seu limite de chakra: " + i);
            }
        }
    }
}