package NivelIntermediario.HashSet;


import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> aldeias = new HashSet<>();

        aldeias.add("Konoha");
        aldeias.add("Suna");
        aldeias.add("Kiri");
        aldeias.add("Konoha");

        System.out.println("Aldeias participantes:");
        for (String aldeia : aldeias) {
            System.out.println(aldeia);
        }

        System.out.println("Konoha está no torneio? " + aldeias.contains("Konoha"));

        // Removendo uma aldeia
        aldeias.remove("Kiri");
        System.out.println("Após remover Kiri: " + aldeias);
    }
}
