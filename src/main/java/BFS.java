package main.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public static void bfs(Grafo grafo, int inicio) {
        // El método recibe como parámetros un objeto Grafo y un entero que representa el vértice de inicio del recorrido.

        // Se crea un arreglo de booleanos que va a llegar registro de los visitados
        boolean[] visitado = new boolean[grafo.getNumVertices()];
        // Se crea una cola para almacenar los vértices a visitar
        Queue<Integer> cola = new LinkedList<>();
        // Se crea una lista para almacenar los vértices visitados en el orden en que fueron encontrados.
        List<Integer> recorrido = new ArrayList<>();

        // Se marca el vértice de inicio como visitado y se agrega a la cola.
        visitado[inicio] = true;
        cola.offer(inicio);

        // Mientras la cola no esté vacía, se extrae el primer vértice de la cola y se agrega a la lista de recorrido.
        while (!cola.isEmpty()) {
            int vertice = cola.poll();
            recorrido.add(vertice);

            // Se recorren todas las aristas del grafo para buscar los vecinos del vértice actual.
            for (Arista arista : grafo.getAristas()) {
                // Si la arista parte del vértice actual y su destino no fue visitado, se marca como visitado y se agrega a la cola.
                if (arista.getOrigen() == vertice && !visitado[arista.getDestino()]) {
                    visitado[arista.getDestino()] = true;
                    cola.offer(arista.getDestino());
                }
                // Si la arista llega al vértice actual y su origen no fue visitado, se marca como visitado y se agrega a la cola.
                else if (arista.getDestino() == vertice && !visitado[arista.getOrigen()]) {
                    visitado[arista.getOrigen()] = true;
                    cola.offer(arista.getOrigen());
                }
            }
        }

        // Al terminar el recorrido, se imprime la lista de recorrido.
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
