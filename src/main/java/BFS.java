package main.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public static void bfs(Grafo grafo, int inicio) {
        boolean[] visitado = new boolean[grafo.getNumVertices()];
        Queue<Integer> cola = new LinkedList<>();
        List<Integer> recorrido = new ArrayList<>();

        visitado[inicio] = true;
        cola.offer(inicio);

        while (!cola.isEmpty()) {
            int vertice = cola.poll();
            recorrido.add(vertice);

            for (Arista arista : grafo.getAristas()) {
                if (arista.getOrigen() == vertice && !visitado[arista.getDestino()]) {
                    visitado[arista.getDestino()] = true;
                    cola.offer(arista.getDestino());
                } else if (arista.getDestino() == vertice && !visitado[arista.getOrigen()]) {
                    visitado[arista.getOrigen()] = true;
                    cola.offer(arista.getOrigen());
                }
            }
        }

        System.out.print("Recorrido BFS desde " + inicio + ": ");
        for (int vertice : recorrido) {
            System.out.print(vertice + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Grafo grafo = new Grafo(9);
        grafo.agregarArista(1, 3, 1);
        grafo.agregarArista(1, 2, 1);
        grafo.agregarArista(2, 4, 1);
        grafo.agregarArista(3, 5, 1);
        grafo.agregarArista(3, 7, 1);
        grafo.agregarArista(5, 7, 1);
        grafo.agregarArista(5, 8, 1);
        grafo.agregarArista(7, 8, 1);
        grafo.agregarArista(7, 6, 1);
        grafo.agregarArista(8, 6, 1);
        bfs(grafo, 1);
    }
}
