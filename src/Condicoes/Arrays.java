package Condicoes;

public class Arrays {
    public static void main(String[] args) {
        String [] ninja = new String[3];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
//        System.out.println(ninja[1]);

        // Redeclar ARRAY
        ninja = new String[2];
        ninja[0] = "Tobirama Senju";
        ninja[1] = "Minato Namikaze";
//        System.out.println(ninja[0]);

        // Usando for i loop para mostrar o ARRAY inteiro
        for (int i = 0; i < 2; i++) {
            System.out.println(ninja[i]);
        }
    }
}
