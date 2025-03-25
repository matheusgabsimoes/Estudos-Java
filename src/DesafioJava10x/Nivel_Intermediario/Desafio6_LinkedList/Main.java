package DesafioJava10x.Nivel_Intermediario.Desafio6_LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Ninja> listaDeNinjas = new LinkedList<Ninja>();

        listaDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listaDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listaDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Temari", 18, "Areia"));

        System.out.println("\n===============================\n");
        System.out.println("Lista de ninjas:");
        for (Ninja ninja : listaDeNinjas) {
            System.out.println(ninja);
        }

        listaDeNinjas.addFirst(new Ninja("Boruto", 10, "Konoha"));
        System.out.println("\n===============================\n");
        System.out.println("Lista de ninjas atualizada, adicionando o Boruto:");
        for (Ninja ninja : listaDeNinjas) {
            System.out.println(ninja);
        }

        listaDeNinjas.removeFirst();
        System.out.println("\n===============================\n");
        System.out.println("Lista de ninjas atualizada, removendo o Boruto:");
        for (Ninja ninja : listaDeNinjas) {
            System.out.println(ninja);
        }

        System.out.println("\n===============================\n");
        System.out.println("Listando o ninja do index 3 da lista:");
        System.out.println(listaDeNinjas.get(3));
    }
}
