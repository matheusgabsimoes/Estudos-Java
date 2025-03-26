package NivelAvancado.Streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ninja> ninjasList = new ArrayList<>();

        ninjasList.add(new Ninja("Naruto", 14, "Konoha"));
        ninjasList.add(new Ninja("Sasuke", 15, "Konoha"));
        ninjasList.add(new Ninja("Boruto", 8, "Konoha"));
        ninjasList.add(new Ninja("Kakashi", 30, "Konoha"));
        ninjasList.add(new Ninja("Sakura", 13, "Konoha"));
        ninjasList.add(new Ninja("Gaara", 14, "Suna"));

        System.out.println("================== COMPARE/ORDENAR ===================");

        // Ordenação de dados
        ninjasList.stream()
                .sorted((n1, n2) -> CharSequence.compare(n1.getNome(), n2.getNome()) )
                .forEach(System.out::println);

        System.out.println("================== FILTER ===================");

        // Filtragem de dados
        ninjasList.stream()
                .filter(ninja -> ninja.getVila().equals("Suna"))
                .forEach(System.out::println);

        System.out.println("================ MAP STRING==================");

        // MAP = Mapeando o atributo
        ninjasList.stream()
                .map(Ninja::getNome)
                .forEach(System.out::println);

        System.out.println("================ MAP INTEGER==================");

        ninjasList.stream()
                .map(Ninja::getIdade)
                .forEach(System.out::println);

        Ninja ninjaMaisVelho = ninjasList.stream()
                .max((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);

        System.out.println("================ MAX ==================");
        System.out.println(ninjaMaisVelho);
    }
}
