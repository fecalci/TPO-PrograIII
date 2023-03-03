package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Grafo {
    private final int numVertices;
    private final List<Arista> aristas;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        this.aristas = new ArrayList<>();
    }

    public int getNumVertices() {
        return numVertices;
    }

    public List<Arista> getAristas() {
        return aristas;
    }

    public void agregarArista(int origen, int destino, int costo) {
        Arista arista = new Arista(origen, destino, costo);
        aristas.add(arista);
    }

    public List<Arista> getAristasOrdenadasPorCosto() {
        List<Arista> aristasOrdenadas = new ArrayList<>(aristas);
        Collections.sort(aristasOrdenadas);
        return aristasOrdenadas;
    }

    public Grafo(int numVertices, List<Arista> aristas) {
        this.numVertices = numVertices;
        this.aristas = aristas;
    }
}

