package main.java;

public class Arista implements Comparable<Arista> {
    private final int origen;
    private final int destino;
    private final int costo;

    public Arista(int origen, int destino, int costo) {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
    }

    public int getOrigen() {
        return origen;
    }

    public int getDestino() {
        return destino;
    }

    public int getCosto() {
        return costo;
    }

    @Override
    public int compareTo(Arista otra) {
        return Integer.compare(this.costo, otra.costo);
    }
}

