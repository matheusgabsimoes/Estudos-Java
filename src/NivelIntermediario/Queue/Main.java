package NivelIntermediario.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //FIFO First In First Out
        Queue<String> ninjasQueue = new LinkedList<>();

        //Add na queue
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        System.out.println("Ninjas da fila: " + ninjasQueue);

        //Mostrar o primeiro da queue
        System.out.println("Primeiro da fila: " + ninjasQueue.peek());

        //Tirar da fila
        ninjasQueue.poll();
        System.out.println("Ninjas da fila: " + ninjasQueue);

        ninjasQueue.poll();
        if (ninjasQueue.isEmpty()) {
            System.out.println("Fila está vazia");
        }
    }

}
